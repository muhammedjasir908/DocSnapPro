package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.components.FilesCardComponent
import com.muhammedjasir.docsnappro.ui.theme.Navy
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont
import com.muhammedjasir.docsnappro.ui.theme.pinkGrey

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController){
    val toolsList: List<ToolsGridItem> = listOf(
        ToolsGridItem(id = 1, toolsText = R.string.scan_docs, image = R.drawable.scan_docs),
        ToolsGridItem(id = 2, toolsText = R.string.scan_image_to_text, image = R.drawable.id_maker),
        ToolsGridItem(id = 3, toolsText = R.string.pdf_to_image, image = R.drawable.scan_sign),
        ToolsGridItem(id = 4, toolsText = R.string.image_to_pdf, image = R.drawable.scan_book),
        ToolsGridItem(id = 5, toolsText = R.string.pdf_sign, image = R.drawable.translate_text),
        ToolsGridItem(id = 6, toolsText = R.string.pdf_watermark, image = R.drawable.scan_qr_code),
        ToolsGridItem(id = 5, toolsText = R.string.edit_pdf, image = R.drawable.translate_text),
        ToolsGridItem(id = 6, toolsText = R.string.scan_qr_code, image = R.drawable.scan_qr_code)
    ).toList()

    val recentFilesList: List<RecentFilesData> = listOf(
        RecentFilesData(id = 1, image = R.drawable.document_image, title = "Document - 1", date = "01-03-2024 12:00 PM"),
        RecentFilesData(id = 2, image = R.drawable.document_image, title = "Document - 2", date = "02-03-2024 12:00 PM"),
        RecentFilesData(id = 3, image = R.drawable.document_image, title = "Document - 3", date = "03-03-2024 12:00 PM"),
        RecentFilesData(id = 4, image = R.drawable.document_image, title = "Document - 4", date = "04-03-2024 12:00 PM"),
        RecentFilesData(id = 5, image = R.drawable.document_image, title = "Document - 5", date = "05-03-2024 12:00 PM")
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
        },
        floatingActionButton = {
            Row {
                FloatingActionButton(
                    modifier = Modifier.size(width = 50.dp, height = 50.dp),
                    shape = CircleShape,
                    containerColor = pinkGrey,
                    onClick = {  }) {
                    Icon(modifier = Modifier
                        .size(width = 40.dp, height = 40.dp)
                        .padding(5.dp),painter = painterResource(id = R.drawable.camera), contentDescription = "")
                }
                Spacer(modifier = Modifier.width(10.dp))
                FloatingActionButton(
                    modifier = Modifier.size(width = 50.dp, height = 50.dp),
                    shape = CircleShape,
                    containerColor = pinkGrey,
                    onClick = {  }) {
                    Icon(modifier = Modifier
                        .size(width = 40.dp, height = 40.dp)
                        .padding(5.dp), painter = painterResource(id = R.drawable.image), contentDescription = "")
                }
            }
        }
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Spacer(modifier = Modifier.height(10.dp))

            LazyVerticalGrid(
                modifier = Modifier.fillMaxWidth(),
                columns = GridCells.Fixed(4),
                contentPadding = PaddingValues(5.dp),
            ) {
                items(toolsList) { data ->
                    ToolsGridItemCard(data = data, navController = navController)
                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = stringResource(id = R.string.recent_files),
                    style = TextStyle(
                        fontFamily = comfortaaFont,
                        fontSize = 12.sp,
                    )
                )
                IconButton(
                    modifier = Modifier.size(15.dp),
                    colors = IconButtonDefaults.iconButtonColors(contentColor = Navy),
                    onClick = {  }) {
                    Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowForward, contentDescription = "")
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
                LazyColumn(
                    modifier = Modifier.background(Color.Transparent),
                ) {
                    items(recentFilesList) { data ->
                        FilesCardComponent(data, navController)
                    }
                }

        }
    }
}

class RecentFilesData(
    val id: Int,
    val image: Int,
    val title: String,
    val date:String
)

