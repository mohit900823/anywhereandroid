package com.anywhere.anywhereandroid.listFragment

import com.anywhere.anywhereandroid.api.ApiService
import javax.inject.Inject

class ListRepository @Inject constructor(val apiService: ApiService) {

    suspend fun getTempList(query: String) =
        apiService.getCharacterList(query)
}