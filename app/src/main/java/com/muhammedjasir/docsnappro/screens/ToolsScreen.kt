package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont
import com.muhammedjasir.docsnappro.ui.theme.pinkGrey

@Composable
fun ToolsScreen(navController: NavHostController){
    val scanItemList: List<ToolsGridItem> = listOf(
        ToolsGridItem(id = 1, toolsText = R.string.scan_docs, image = R.drawable.scan_docs),
        ToolsGridItem(id = 2, toolsText = R.string.scan_photo, image = R.drawable.id_maker),
        ToolsGridItem(id = 4, toolsText = R.string.scan_image_to_text, image = R.drawable.scan_book),
        ToolsGridItem(id = 5, toolsText = R.string.scan_image_to_pdf, image = R.drawable.translate_text),
        ToolsGridItem(id = 6, toolsText = R.string.scan_image_to_word, image = R.drawable.scan_qr_code),
        ToolsGridItem(id = 3, toolsText = R.string.scan_image_to_excel, image = R.drawable.scan_sign),
        ToolsGridItem(id = 4, toolsText = R.string.scan_qr_code, image = R.drawable.scan_book)
    ).toList()

    val conversionItemList: List<ToolsGridItem> = listOf(
        ToolsGridItem(id = 1, toolsText = R.string.pdf_to_doc, image = R.drawable.pdf_to_doc),
        ToolsGridItem(id = 2, toolsText = R.string.pdf_to_excel, image = R.drawable.pdf_to_excel),
        ToolsGridItem(id = 3, toolsText = R.string.pdf_to_image, image = R.drawable.pdf_to_image),
        ToolsGridItem(id = 4, toolsText = R.string.doc_to_pdf, image = R.drawable.doc_to_pdf),
        ToolsGridItem(id = 5, toolsText = R.string.excel_to_pdf, image = R.drawable.excel_to_pdf),
        ToolsGridItem(id = 6, toolsText = R.string.image_to_pdf, image = R.drawable.watermark),
        ToolsGridItem(id = 4, toolsText = R.string.image_to_word, image = R.drawable.merge_pdf),
        ToolsGridItem(id = 5, toolsText = R.string.image_to_excel, image = R.drawable.split_pdf),
        ToolsGridItem(id = 6, toolsText = R.string.image_to_text, image = R.drawable.pdf_page_reorder)
    ).toList()

    val editItemList: List<ToolsGridItem> = listOf(
        ToolsGridItem(id = 1, toolsText = R.string.pdf_merge, image = R.drawable.pdf_to_doc),
        ToolsGridItem(id = 2, toolsText = R.string.split_tools, image = R.drawable.pdf_to_excel),
        ToolsGridItem(id = 3, toolsText = R.string.pdf_sign, image = R.drawable.pdf_to_image),
        ToolsGridItem(id = 4, toolsText = R.string.pdf_watermark, image = R.drawable.doc_to_pdf),
        ToolsGridItem(id = 5, toolsText = R.string.pdf_extract, image = R.drawable.excel_to_pdf),
        ToolsGridItem(id = 6, toolsText = R.string.pdf_page_reorder, image = R.drawable.watermark),
        ToolsGridItem(id = 4, toolsText = R.string.pdf_password, image = R.drawable.merge_pdf),
        ToolsGridItem(id = 5, toolsText = R.string.pdf_unlock, image = R.drawable.split_pdf),
        ToolsGridItem(id = 6, toolsText = R.string.rotate_pdf, image = R.drawable.pdf_page_reorder),
        ToolsGridItem(id = 4, toolsText = R.string.edit_pdf, image = R.drawable.merge_pdf),
        ToolsGridItem(id = 5, toolsText = R.string.edit_word, image = R.drawable.split_pdf),
        ToolsGridItem(id = 6, toolsText = R.string.edit_excel, image = R.drawable.pdf_page_reorder)
    ).toList()

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Text(text = stringResource(id = R.string.scan), style = TextStyle(
                fontSize = 20.sp,
                fontFamily = comfortaaFont,
                fontWeight = FontWeight.Bold
                )
            )
            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
                contentPadding = PaddingValues(5.dp),
            ) {
                items(scanItemList) { data ->
                    ToolsGridItemCard(data = data, navController = navController)
                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = stringResource(id = R.string.convert), style = TextStyle(
                fontSize = 16.sp,
                fontFamily = comfortaaFont,
                fontWeight = FontWeight.Bold
            )
            )
            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
                contentPadding = PaddingValues(5.dp),
            ) {
                items(conversionItemList) { data ->
                    ToolsGridItemCard(data = data, navController = navController)
                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = stringResource(id = R.string.edit), style = TextStyle(
                fontSize = 16.sp,
                fontFamily = comfortaaFont,
                fontWeight = FontWeight.Bold
            )
            )
            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
                contentPadding = PaddingValues(5.dp),
            ) {
                items(editItemList) { data ->
                    ToolsGridItemCard(data = data, navController = navController)
                }

            }
        }
    }
}

@Composable
fun ToolsGridItemCard(
    data: ToolsGridItem,
    navController: NavController
){
    Column(
        modifier = Modifier.size(width = 70.dp, height = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            colors = CardColors(
                containerColor = pinkGrey,
                contentColor = Color.White,
                disabledContainerColor = Color.White,
                disabledContentColor = Color.White
            ),
            modifier = Modifier
                .padding(0.dp)
                .width(50.dp)
                .height(50.dp),
            shape = CircleShape
        ) {
            Box(modifier = Modifier
                .padding(5.dp)
                .align(alignment = Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(id = data.image),
                    contentDescription = "", modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                        .padding(5.dp),
                    alignment = Alignment.Center
                )
            }
        }
        Text(
            text = stringResource(id = data.toolsText),
            fontSize = 8.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontFamily = comfortaaFont,
            modifier = Modifier.padding(16.dp)
        )
    }
}

class ToolsGridItem(
    val id: Int,
    val toolsText: Int,
    val image: Int
)

