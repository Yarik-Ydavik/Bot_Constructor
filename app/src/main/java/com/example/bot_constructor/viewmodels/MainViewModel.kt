package com.example.bot_constructor.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.saveable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel(
    private val savedStateHandle: SavedStateHandle
) : ViewModel(){
    val auth = savedStateHandle.getStateFlow("auth",false)

    fun SignIn(){
        savedStateHandle["auth"] = true
    }
    fun SignOut(){
        savedStateHandle["auth"] = false

    }
}