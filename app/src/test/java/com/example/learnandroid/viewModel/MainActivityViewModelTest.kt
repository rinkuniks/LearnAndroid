package com.example.learnandroid.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock

class MainActivityViewModelTest {
    @Mock
    private lateinit var viewModel: MainActivityViewModel
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setup(){
        viewModel = MainActivityViewModel()
        viewModel.userName = MutableLiveData()
        viewModel.passCode = MutableLiveData()
    }

    @Test
    fun validate_when_email_isNotValid(){
        viewModel.userName.value = "nikhil"
        val resultEmail = viewModel.validateEmail(viewModel.userName.value!!)
        Assert.assertEquals(false, resultEmail)
    }

    @Test
    fun validate_when_email_isValid(){
        viewModel.userName.value = "2826577@gmail.com"
        val resultEmail = viewModel.validateEmail(viewModel.userName.value!!)
        Assert.assertEquals(true, resultEmail)
    }

    @Test
    fun validate_when_passCode_isInvalid() {
        viewModel.passCode.value = "12345"
        val resultPassCode = viewModel.validatePassCode()
        Assert.assertEquals(false, resultPassCode)
    }

    @Test
    fun validate_when_passCode_isValid() {
        viewModel.passCode.value = "123456"
        val resultPassCode = viewModel.validatePassCode()
        Assert.assertEquals(true, resultPassCode)
    }
}
