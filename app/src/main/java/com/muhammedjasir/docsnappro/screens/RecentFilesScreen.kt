package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.components.FilesCardComponent
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecentFilesScreen(navController: NavHostController){

    val recentFilesList: List<RecentFilesData> = listOf(
        RecentFilesData(id = 1, image = R.drawable.document_image, title = "Document - 1", date = "01-03-2024 12:00 PM"),
        RecentFilesData(id = 2, image = R.drawable.document_image, title = "Document - 2", date = "02-03-2024 12:00 PM"),
        RecentFilesData(id = 3, image = R.drawable.document_image, title = "Document - 3", date = "03-03-2024 12:00 PM"),
        RecentFilesData(id = 4, image = R.drawable.document_image, title = "Document - 4", date = "04-03-2024 12:00 PM"),
        RecentFilesData(id = 5, image = R.drawable.document_image, title = "Document - 5", date = "05-03-2024 12:00 PM"),
        RecentFilesData(id = 6, image = R.drawable.document_image, title = "Document - 6", date = "06-03-2024 12:00 PM"),
        RecentFilesData(id = 7, image = R.drawable.document_image, title = "Document - 7", date = "07-03-2024 12:00 PM"),
        RecentFilesData(id = 8, image = R.drawable.document_image, title = "Document - 8", date = "08-03-2024 12:00 PM"),
        RecentFilesData(id = 9, image = R.drawable.document_image, title = "Document - 9", date = "09-03-2024 12:00 PM"),
        RecentFilesData(id = 10, image = R.drawable.document_image, title = "Document - 10", date = "10-03-2024 12:00 PM"),
        RecentFilesData(id = 11, image = R.drawable.document_image, title = "Document - 11", date = "11-03-2024 12:00 PM"),
        RecentFilesData(id = 12, image = R.drawable.document_image, title = "Document - 12", date = "12-03-2024 12:00 PM")
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp),
        topBar = {
            TopAppBar(title = {
                Text(text = stringResource(id = R.string.app_name), style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 12.sp,
                ),
                    modifier = Modifier.padding(horizontal = 10.dp)
                )
            })
        }
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn {
                items(recentFilesList){data ->
                    FilesCardComponent(data, navController)
                }
            }
        }
    }
}