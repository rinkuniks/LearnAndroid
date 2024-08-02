package com.example.learnandroid.ui

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.example.learnandroid.R
import com.example.learnandroid.Utils.MyEncryptedSharedPreferences
import com.example.learnandroid.Utils.MySharedPreferences
import java.io.File

class MainActivity : AppCompatActivity() {

    var name: String? = "qwerty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSignUp = findViewById<TextView>(R.id.tv_sign_up).setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }

        val tvForgotPassword = findViewById<TextView>(R.id.tv_forgot_password).setOnClickListener {
            startActivity(Intent(this, ForgotPassword::class.java))
        }

        val sharedPreferences: MySharedPreferences = MySharedPreferences(this)
        val sharedPreference: MyEncryptedSharedPreferences = MyEncryptedSharedPreferences(this)

        sharedPreferences.user = "Nikhil"
        sharedPreference.username = "NikhilSingh"
        Log.d("======", sharedPreference.username.toString())
//        Log.d("======", name!!.toAppendNikhil())

    }



    fun String.toAppendNikhil() : String{
        return this+"Nikhil"
    }
}
