package com.example.bot_constructor.page

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bot_constructor.viewmodels.MainViewModel

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun PAGE_HOME(onNavigateToAuth: () -> Unit) {
    val viewModel = viewModel<MainViewModel>()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            viewModel.SignOut()
            onNavigateToAuth()
            Log.d("test", viewModel.auth.value.toString())
        }) {
            Text(text = "Выйти")
        }
    }
}