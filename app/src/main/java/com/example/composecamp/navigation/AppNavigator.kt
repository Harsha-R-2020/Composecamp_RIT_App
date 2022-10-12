package com.example.composecamp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composecamp.Screens.*

@Composable
fun AppNavigator(navHostController: NavHostController) {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = "Login1" ){

        composable("Login1"){
            Loginui1(navController,LocalContext.current)
        }
        composable("signup"){
            Loginui(navController,LocalContext.current)
        }
        composable("Dashboard"){
            AffirmationDashboard(navController)
        }
        composable("DeptDashboard"){
            AffirmationDDApp1()
        }
        composable("CSE"){
            AffirmationApp()
        }
        composable("Schedule"){
            AffirmationApp3()
        }
        composable("VisionMision"){
            AffirmationApp4()
        }
        composable("Announcement"){
            AffirmationApp5()
        }
    }


}