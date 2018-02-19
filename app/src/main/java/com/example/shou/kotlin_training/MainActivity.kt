package com.example.shou.kotlin_training

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.shou.kotlin_training.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list: MutableList<RecycleItemViewModel> = ArrayList()
        list.add(RecycleItemViewModel(RecycleItemModel("test1")))
        list.add(RecycleItemViewModel(RecycleItemModel("test2")))
        list.add(RecycleItemViewModel(RecycleItemModel("test3")))
        list.add(RecycleItemViewModel(RecycleItemModel("test4")))
        list.add(RecycleItemViewModel(RecycleItemModel("test5")))
        list.add(RecycleItemViewModel(RecycleItemModel("test6")))

        val adapter = RecycleAdapter(list)
        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.mainRecyclerView.adapter = adapter
    }
}
