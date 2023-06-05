package com.example.bot_constructor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.bot_constructor.ui.theme.Bot_ConstructorTheme
import com.example.bot_constructor.utils.Constants
import com.example.bot_constructor.viewmodels.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bot_ConstructorTheme {
                val viewModel = viewModel<MainViewModel>()
                val auth by viewModel.auth.collectAsState()
                val navController: NavHostController = rememberNavController()
                SetupNavController(navNostController = navController)
            }
        }
    }
}
