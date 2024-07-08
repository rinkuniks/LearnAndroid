package com.example.learnandroid.ui

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.learnandroid.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSignUp = findViewById<TextView>(R.id.tv_sign_up).setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }
    }
}