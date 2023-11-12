package com.example.textviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var myText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myText = findViewById(R.id.textEx)
        myText.setTextColor(Color.BLACK)
        myText.setText("This is an example")
        myText.setOnClickListener {
            myText.setTextColor(Color.WHITE)
            myText.setBackgroundColor(Color.BLACK)
        }
    }
}