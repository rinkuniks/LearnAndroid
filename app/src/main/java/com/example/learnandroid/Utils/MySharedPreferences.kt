package com.example.learnandroid.Utils

import android.content.Context

class MySharedPreferences(context : Context) {
    var prefrences = context.getSharedPreferences("SharedFile", Context.MODE_PRIVATE)
    var user :String?
        get() = prefrences.getString("username", null)
        set(value){
            prefrences.edit().putString("username", value).commit()
        }

    var password: String?
        get() = prefrences.getString("password", null)
        set(value) {
            prefrences.edit().putString("password", value).commit()
        }

    var isKeyAvailable :Boolean
        get() = prefrences.getBoolean("myKey", false)
        set(value){
                prefrences.edit().putBoolean("myKey", value).apply()
        }

}
