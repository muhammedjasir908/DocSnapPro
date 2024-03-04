package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.ui.theme.Navy
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun HomeScreen(navController: NavController){

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
                contentPadding = PaddingValues(
                    start = 5.dp,
                    top = 5.dp,
                    end = 5.dp,
                    bottom = 5.dp),
                content = {items(8){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Card(
                            colors = CardColors(
                                containerColor = Navy,
                                contentColor = Color.White,
                                disabledContainerColor = Color.White,
                                disabledContentColor = Color.White
                            ),
                            modifier = Modifier
                                .padding(4.dp)
                                .width(50.dp)
                                .height(50.dp),
                            shape = CircleShape
                        ) {
                            Image(painter = painterResource(id = R.drawable.account),
                                contentDescription = "", modifier = Modifier
                                    .width(70.dp)
                                    .height(70.dp)
                                    .padding(5.dp), alignment = Alignment.Center)
                        }
                        Text(
                            text = "Text",
                            fontSize = 12.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }

                }
            )
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
        }

    }
}