package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun AccountScreen(navController: NavHostController){
    Surface(
        modifier = Modifier.fillMaxSize().padding(top = 50.dp)
    ) {
        Column {
            Text(text = stringResource(id = R.string.account), style = TextStyle(
                fontSize = 20.sp,
                fontFamily = comfortaaFont,
                fontWeight = FontWeight.Bold
            )
            )

        }
    }
}