package com.muhammedjasir.docsnappro.screens

import android.graphics.drawable.Icon
import android.graphics.drawable.PaintDrawable
import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun SignUpScreen(){
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                10.dp
            )
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            IconButton(
                modifier = Modifier.size(30.dp),
                onClick = { /*TODO*/ }) {
                androidx.compose.material3.Icon(
                    imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "")
            }
            Spacer(modifier = Modifier.height(height = 20.dp))
            Text(
                text = stringResource(id = R.string.create_an_account),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
               )
            Spacer(modifier = Modifier.height(height = 10.dp))
            Text(
                text = stringResource(id = R.string.create_an_account_sub_text),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 14.sp,
                ),
            )
            Spacer(modifier = Modifier.height(height = 10.dp))
            Text(
                text = stringResource(id = R.string.email_hint),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 10.sp,
                ),
            )
            CustomTextFieldComponent(labelValue = "Email")
            Spacer(modifier = Modifier.height(height = 10.dp))
            Text(
                text = stringResource(id = R.string.password_hint),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 0.sp,
                ),
            )
            CustomTextFieldComponent(labelValue = "Password")
            Spacer(modifier = Modifier.height(height = 10.dp))
            Text(
                text = stringResource(id = R.string.confirm_password_hint),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 10.sp,
                ),
            )
            CustomTextFieldComponent(labelValue = "Confirm password")
        }
    }
}

@Composable
fun CustomTextFieldComponent(
    labelValue: String,

){
    var textValue by remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .padding(horizontal = 10.dp),
        value = textValue,
        onValueChange = {
            textValue = it

        })
}