package com.anywhere.anywhereandroid.listFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anywhere.anywhereandroid.BuildConfig
import com.anywhere.anywhereandroid.api.Resource
import com.anywhere.anywhereandroid.model.MainObject
import com.anywhere.anywhereandroid.model.RelatedTopics
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ListViewModel @Inject constructor(
    private val repository: ListRepository
) : ViewModel() {
    private val TAG = "PostViewModel"
    val weatherList: MutableLiveData<Resource<MainObject>> =
        MutableLiveData<Resource<MainObject>>()
    val sharedData: MutableLiveData<RelatedTopics> = MutableLiveData()

    fun updateData(newData: RelatedTopics) {
        sharedData.value = newData
    }


    init {
        getListAboutWeather()
    }

    fun getListAboutWeather() = viewModelScope.launch {
        val encodedQuery =BuildConfig.endPoint
        weatherList.postValue(Resource.loading("loading", null))
        try {
            repository.getTempList(encodedQuery).let {
                if (it.isSuccessful) {
                    weatherList.postValue(Resource.success(it.body()))
                } else {
                    weatherList.postValue(Resource.error("Error code: ${it.code()}", null))
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            weatherList.postValue(Resource.error(e.message!!, null))
        }
    }
}