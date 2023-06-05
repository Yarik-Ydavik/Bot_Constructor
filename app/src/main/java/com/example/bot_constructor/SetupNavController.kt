package com.example.bot_constructor

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bot_constructor.page.PAGE_Authorization
import com.example.bot_constructor.page.PAGE_HOME
import com.example.bot_constructor.utils.Constants

@Composable
fun SetupNavController(
    navNostController : NavHostController,
    startRoute : String = Constants.pageRoute.HOME_PAGE
){
    NavHost(
        navController = navNostController,
        startDestination = startRoute
    ){
        composable(route = Constants.pageRoute.AUTH_PAGE){
            PAGE_Authorization(
                onNavigateToHome = { navNostController.navigate(Constants.pageRoute.HOME_PAGE) }
            )
        }
        composable(route = Constants.pageRoute.HOME_PAGE){
            PAGE_HOME(
                onNavigateToAuth = { navNostController.navigate(Constants.pageRoute.AUTH_PAGE) }
            )
        }
    }
}