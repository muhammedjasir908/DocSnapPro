package com.muhammedjasir.docsnappro.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.muhammedjasir.docsnappro.screens.AccountScreen
import com.muhammedjasir.docsnappro.screens.CreatePasswordScreen
import com.muhammedjasir.docsnappro.screens.ForgotPasswordScreen
import com.muhammedjasir.docsnappro.screens.HomeScreen
import com.muhammedjasir.docsnappro.screens.OTPValidationScreen
import com.muhammedjasir.docsnappro.screens.RecentFilesScreen
import com.muhammedjasir.docsnappro.screens.SignInScreen
import com.muhammedjasir.docsnappro.screens.SignUpScreen
import com.muhammedjasir.docsnappro.screens.ToolsScreen
import com.muhammedjasir.docsnappro.screens.WelcomeScreen
import com.muhammedjasir.docsnappro.ui.theme.Grey
import com.muhammedjasir.docsnappro.ui.theme.Navy

@Composable
fun AppNavigationGraph(navController: NavHostController){

    Scaffold(
        bottomBar = {
            AppBottomNav(navController = navController)
        }
    ) { paddingValues ->
        NavHost(navController = navController,
            startDestination = Screens.Welcome.route,
            modifier = Modifier.fillMaxSize().padding(bottom = paddingValues.calculateBottomPadding().minus(10.dp))){
            composable(Screens.Welcome.route){
                WelcomeScreen(navController = navController)
            }
            composable(Screens.SignIn.route){
                SignInScreen(navController = navController)
            }
            composable(Screens.SignUp.route){
                SignUpScreen(navController = navController)
            }
            composable(Screens.ForgotPassword.route){
                ForgotPasswordScreen(navController = navController)
            }
            composable(Screens.OTPValidation.route){
                OTPValidationScreen(navController = navController)
            }
            composable(Screens.CreatePassword.route){
                CreatePasswordScreen(navController = navController)
            }
            composable(Screens.Home.route){
                HomeScreen(navController)
            }
            composable(Screens.RecentFiles.route){
                RecentFilesScreen(navController)
            }
            composable(Screens.Tools.route){
                ToolsScreen(navController)
            }
            composable(Screens.Account.route){
                AccountScreen(navController)
            }
        }
    }
}

@Composable
fun AppBottomNav(navController: NavHostController){
    val bottomItems = listOf(
        Screens.Home,
        Screens.RecentFiles,
        Screens.Tools,
        Screens.Account
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    if(currentDestination?.route in bottomItems.map { item -> item.route })
    {
        NavigationBar(
            tonalElevation = 8.dp,
            modifier = Modifier,
            containerColor = Color.White
        ) {
            bottomItems.forEachIndexed { index, screens ->
                if (currentDestination != null) {
                    NavigationBarItem(
                        selected = currentDestination.hierarchy.any { it.route == screens.route },
                        onClick = { navController.navigate(screens.route){
                            popUpTo(navController.graph.findStartDestination().id){
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        } },
                        icon = { 
                            Icon(painterResource(screens.drawableId!!) ,
                                contentDescription = "",
                                modifier = Modifier
                                    .width(15.dp)
                                    .height(15.dp
                                    )
                            )
                        },
                        label = {
                            Text(text = stringResource(id = screens.resourceId!!),
                                color = if(currentDestination.hierarchy.any() {
                                    it.route == screens.route
                                    })
                                Navy else Grey,
                                textAlign = TextAlign.Start)
                            },
                        alwaysShowLabel = true,
                        colors = NavigationBarItemColors(
                            selectedIconColor = Navy,
                            unselectedIconColor = Grey,
                            disabledIconColor = Grey,
                            selectedIndicatorColor = Color.Transparent,
                            selectedTextColor = Navy,
                            unselectedTextColor = Grey,
                            disabledTextColor = Grey)
                        )
                }else{
                    Spacer(modifier = Modifier.width(0.dp))
                }
            }
        }
    }
}