package com.example.shou.kotlin_training

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.shou.kotlin_training.databinding.RecyclerItemBinding

class RecycleAdapter(private val list: ArrayList<RecycleItemModel>) : RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder>() {
    override fun onBindViewHolder(holder: RecycleViewHolder?, position: Int) {
        val model: RecycleItemModel = list[position]
        holder!!.binding.data = model
        holder.binding.executePendingBindings()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecycleViewHolder {
        val binding: RecyclerItemBinding = RecyclerItemBinding.inflate(
                parent!!.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater,
                parent,
                false)
        return RecycleViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class RecycleViewHolder(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)

}