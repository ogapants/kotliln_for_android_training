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

        val list: ArrayList<RecycleItemModel> = ArrayList()
        list.add(RecycleItemModel("test1"))
        list.add(RecycleItemModel("test2"))
        list.add(RecycleItemModel("test3"))
        list.add(RecycleItemModel("test4"))
        list.add(RecycleItemModel("test5"))
        list.add(RecycleItemModel("test6"))

        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RecycleAdapter(list)
        binding.mainRecyclerView.adapter = adapter
    }
}
