package com.example.learnandroid.Utils

import android.content.Context
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class KeyEncryptionAndDecryption(val context: Context) {

     fun encryptKey() {
        val keyName = "Nikhil"
        val bytes = keyName.encodeToByteArray()
        val file = File(context.filesDir, "secret.txt")
        if (!file.exists()){
            file.createNewFile()
        }
        val fos = FileOutputStream(file)
        KeyManager().encrypt(bytes = bytes, outputStream = fos)
    }

    fun decyptKey(): String{
        val file = File(context.filesDir, "secret.txt")
        return KeyManager().decrypt(inputStream = FileInputStream(file)).decodeToString()
    }

}