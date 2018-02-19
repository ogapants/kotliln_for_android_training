package com.example.shou.kotlin_training

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.shou.kotlin_training.databinding.RecyclerItemBinding

class RecycleAdapter(private val list: MutableList<RecycleItemViewModel>) : RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder>() {
    override fun onBindViewHolder(holder: RecycleViewHolder?, position: Int) {
        val viewModel: RecycleItemViewModel = list[position]
        holder!!.binding.viewModel = viewModel
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecycleViewHolder {
        val binding: RecyclerItemBinding = RecyclerItemBinding.inflate(
                LayoutInflater.from(parent!!.context),
                parent,
                false)
        return RecycleViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class RecycleViewHolder(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)

}