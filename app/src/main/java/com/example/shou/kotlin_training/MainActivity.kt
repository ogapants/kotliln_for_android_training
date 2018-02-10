package com.example.shou.kotlin_training

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text)
        textView.text = getString(R.string.this_is_kotlin_training)

        val button: Button = findViewById(R.id.button)
        button.text = getString(R.string.next)
        button.setOnClickListener {
            startActivity(createIntent(this))
        }
    }

}
