package com.example.task05.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class About_appViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "info about app"
    }
    val text: LiveData<String> = _text
}