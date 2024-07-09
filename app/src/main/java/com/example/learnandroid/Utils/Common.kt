package com.example.learnandroid.Utils

import android.app.Dialog
import android.content.Context
import android.widget.TextView
import android.widget.Toast
import com.example.learnandroid.R
import com.google.android.material.button.MaterialButton

object Common {

    fun shortToastMessage(context: Context, msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun longToastMessage(context: Context, msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    fun customDialog(context: Context){
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.custom_dialog)
        val dialogTitle = dialog.findViewById<TextView>(R.id.tv_dialog_title)
        val dialogMsg = dialog.findViewById<TextView>(R.id.tv_dialog_msg)
        val btnOk = dialog.findViewById<MaterialButton>(R.id.btn_ok)
        val btnCancel = dialog.findViewById<MaterialButton>(R.id.btn_cancel)
        dialog.show()
    }
}