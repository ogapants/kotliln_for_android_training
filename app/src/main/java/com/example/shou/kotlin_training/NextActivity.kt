package com.example.shou.kotlin_training

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.shou.kotlin_training.databinding.ActivityNextBinding

fun createIntent(context: Context): Intent {
    return Intent(context, NextActivity::class.java)
}

class NextActivity : AppCompatActivity(), NextPresenter {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewModel = NextViewModel(this)
    }

    override fun onFinish() {
        finish()
    }
}
