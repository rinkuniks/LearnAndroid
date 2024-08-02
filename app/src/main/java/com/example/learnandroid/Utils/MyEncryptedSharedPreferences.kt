package com.example.learnandroid.Utils

import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import java.io.File

class MyEncryptedSharedPreferences(val context: Context) {

//        val masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)

    val encryptedPreferences =  EncryptedSharedPreferences.create(
        "encrypted_preferences_nik", // fileName
        KeyEncryptionAndDecryption(context).decyptKey(), // masterKeyAlias
        context, // context
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, // prefKeyEncryptionScheme
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM // prefvalueEncryptionScheme
    )

    var username : String?
        get() = encryptedPreferences.getString("username", null)
        set(value) {
            encryptedPreferences.edit().putString("username", value).apply()
        }


}
