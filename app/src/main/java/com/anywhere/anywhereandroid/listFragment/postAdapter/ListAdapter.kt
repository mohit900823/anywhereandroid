package com.anywhere.anywhereandroid.listFragment.postAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anywhere.anywhereandroid.base.BaseRecyclerViewAdapter
import com.anywhere.anywhereandroid.databinding.ItemTempBinding
import com.anywhere.anywhereandroid.model.RelatedTopics

class ListAdapter(detailList: List<RelatedTopics>, val callBack: CallBack) :
    BaseRecyclerViewAdapter<RelatedTopics, ListAdapter.TempItemViewHolder>(detailList.toMutableList()) {


    class TempItemViewHolder(val binding: ItemTempBinding, val callBack: CallBack) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(listItem: RelatedTopics) {
            binding.items = listItem.Text?.substringBefore("-")
            binding.cvItem.setOnClickListener { callBack.onItemClick(listItem) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TempItemViewHolder {
        val binding: ItemTempBinding = ItemTempBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TempItemViewHolder(binding, callBack);
    }


    override fun onBindViewHolder(holder: TempItemViewHolder, position: Int) {
        holder.bindData(mList[position])
    }

    override fun setData(list: List<RelatedTopics>) {
        mList.clear()
        mList.addAll(list)
    }

    interface CallBack {
        fun onItemClick(item:RelatedTopics)
    }
}