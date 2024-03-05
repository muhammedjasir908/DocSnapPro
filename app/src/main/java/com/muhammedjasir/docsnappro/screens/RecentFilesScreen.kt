package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.muhammedjasir.docsnappro.components.FilesCardComponent

@Composable
fun RecentFilesScreen(navController: NavHostController){
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            FilesCardComponent()
            FilesCardComponent()
            FilesCardComponent()
            FilesCardComponent()
            FilesCardComponent()
        }
    }
}