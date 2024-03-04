package com.muhammedjasir.docsnappro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.muhammedjasir.docsnappro.screens.HomeScreen

@Composable
fun AppNavigationGraph(){

    val navController = rememberNavController()

//    NavHost(navController = navController, startDestination = Screens.WelcomeScreen.route){
//        composable(Screens.WelcomeScreen.route){
//            WelcomeScreen(navController = navController)
//        }
//    }
//
//    NavHost(navController = navController, startDestination = Screens.SignUpScreen.route){
//        composable(Screens.SignUpScreen.route){
//            SignUpScreen(navController = navController)
//        }
//    }
//
//    NavHost(navController = navController, startDestination = Screens.SignInScreen.route){
//        composable(Screens.SignInScreen.route){
//            SignInScreen(navController = navController)
//        }
//    }

//    NavHost(navController = navController, startDestination = Screens.ForgotPasswordScreen.route){
//        composable(Screens.ForgotPasswordScreen.route){
//            ForgotPasswordScreen(navController = navController)
//        }
//    }

//    NavHost(navController = navController, startDestination = Screens.OTPValidationScreen.route){
//        composable(Screens.OTPValidationScreen.route){
//            OTPValidationScreen(navController = navController)
//        }
//    }

//    NavHost(navController = navController, startDestination = Screens.CreatePasswordScreen.route){
//        composable(Screens.CreatePasswordScreen.route){
//            CreatePasswordScreen(navController = navController)
//        }
//    }

    NavHost(navController = navController, startDestination = Screens.HomeScreen.route){
        composable(Screens.HomeScreen.route){
            HomeScreen(navController = navController)
        }
    }
}