package com.abadzheva.distart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abadzheva.distart.R
import com.abadzheva.distart.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.keyboard.toString()
    }
}
