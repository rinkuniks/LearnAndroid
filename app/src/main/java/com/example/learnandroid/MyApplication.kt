package com.example.learnandroid

import android.app.Application
import android.content.SharedPreferences
import com.example.learnandroid.Utils.KeyEncryptionAndDecryption
import com.example.learnandroid.Utils.MySharedPreferences

class MyApplication: Application() {
    val keyEncAndDec = KeyEncryptionAndDecryption(this)

    override fun onCreate() {
        super.onCreate()
        val pref = MySharedPreferences(this)
        if (!pref.isKeyAvailable) keyEncAndDec.encryptKey()
    }
}