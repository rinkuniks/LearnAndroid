package com.example.learnandroid.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.learnandroid.models.LoginResponse
import java.util.regex.Pattern


class MainActivityViewModel: ViewModel() {
    var userName: MutableLiveData<String> = MutableLiveData("")
    var passCode: MutableLiveData<String> = MutableLiveData("")
    var loginresponse: MutableLiveData<LoginResponse> = MutableLiveData()

    fun validateUserData(email: String): Boolean{
        return validateEmail(email) && validatePassCode()
    }

    fun validateEmail(email:String): Boolean {
        val emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
        return Pattern.matches(emailRegex, email)
    }

    fun validatePassCode(): Boolean {
        return passCode.value?.isNotEmpty() == true && passCode.value!!.length >= 6
    }

    fun makeApiCall(){

    }
}