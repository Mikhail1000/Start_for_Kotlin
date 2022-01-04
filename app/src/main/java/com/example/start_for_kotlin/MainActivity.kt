package com.example.start_for_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.start_for_kotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView_1)

        val buttonSettings: Button = findViewById(R.id.button_settings)
        buttonSettings.setOnClickListener {
            textView.text = "Click!"
        }
    }
}