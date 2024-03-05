package com.muhammedjasir.docsnappro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.muhammedjasir.docsnappro.navigation.AppNavigationGraph
import com.muhammedjasir.docsnappro.ui.theme.DocSnapProTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        installSplashScreen()
        WindowCompat.setDecorFitsSystemWindows(window,false)
        setContent {
            val navController = rememberNavController()
            DocSnapProTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    AppNavigationGraph(navController = navController)
                }
            }
        }
    }
}