package com.muhammedjasir.docsnappro.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.muhammedjasir.docsnappro.screens.RecentFilesData
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun FilesCardComponent(data: RecentFilesData, navController: NavController){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp).background(color = Color.Transparent).padding(vertical = 5.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = data.image), contentDescription = "", modifier = Modifier
                .width(60.dp)
                .height(90.dp))
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                modifier = Modifier.width(180.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = data.title, style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontFamily = comfortaaFont,
                    fontSize = 18.sp
                )
                )
                Text(text = data.date, style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = comfortaaFont
                )
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(
                modifier = Modifier.size(35.dp),
                onClick = {  }) {
                Icon(imageVector = Icons.Rounded.MoreVert, contentDescription = "")
            }
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(
                modifier = Modifier.size(35.dp),
                onClick = {  }) {
                Icon(imageVector = Icons.Rounded.Share, contentDescription = "")
            }
        }
    }
}