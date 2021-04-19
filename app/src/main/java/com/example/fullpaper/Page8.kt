package com.example.fullpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page8)

        // get reference to button
        val previous_button = findViewById(R.id.previous_button) as Button
        previous_button.setOnClickListener {
            val intent = Intent(this, Page7::class.java).apply{
            }
            startActivity(intent)
        }

        // get reference to button
        val next_button = findViewById(R.id.next_button) as Button
        next_button.setOnClickListener {
            val intent = Intent(this, Page9::class.java).apply{
            }
            startActivity(intent)
        }

    }
}