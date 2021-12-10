package com.example.fullpaper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val previous_button = findViewById(R.id.previous_button) as Button
        previous_button.setOnClickListener {
            val intent = Intent(this, Page15::class.java).apply{
            }
            startActivity(intent)
        }

        // get reference to button
        val next_button = findViewById(R.id.next_button) as Button
        next_button.setOnClickListener {
            val intent = Intent(this, Page1::class.java).apply{
            }
            startActivity(intent)
        }

        // time & date
//        val simpleDateFormat = SimpleDateFormat("EEEE, MMMM d")
//        val currentDateToday: String = simpleDateFormat.format(Date())
//
//        val textViewDate = findViewById(R.id.date_today) as TextView
//        textViewDate.setText(currentDateToday)

    }
}