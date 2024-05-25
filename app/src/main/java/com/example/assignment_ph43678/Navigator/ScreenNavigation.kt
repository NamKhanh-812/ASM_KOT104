package com.example.assignment_ph43678.Navigator

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment_ph43678.Screens.Authen.LoginScreen
import com.example.assignment_ph43678.Screens.Screen
import com.example.assignment_ph43678.Screens.Authen.SignUpScreen
import com.example.assignment_ph43678.Screens.CartScreen
import com.example.assignment_ph43678.Screens.CheckOut
import com.example.assignment_ph43678.Screens.CongratScreen
import com.example.assignment_ph43678.Screens.DetailProduct
import com.example.assignment_ph43678.Screens.HomeScreen
import com.example.assignment_ph43678.Screens.WelcomeScreen

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.WelcomeScreen.route,
    ) {
        composable(Screen.WelcomeScreen.route) { WelcomeScreen(navController) }
        composable(Screen.LoginScreen.route) { LoginScreen(navController) }
        composable(Screen.SignUpScreen.route) { SignUpScreen(navController) }
        composable(Screen.HomeScreen.route) { HomeScreen(navController) }
        composable(Screen.DetailProduct.route) { DetailProduct(navController) }
        composable(Screen.CongratScreen.route) { CongratScreen(navController) }
        composable(Screen.CartScreen.route) { CartScreen(navController) }
        composable(Screen.CheckOut.route) { CheckOut(navController) }
    }
}