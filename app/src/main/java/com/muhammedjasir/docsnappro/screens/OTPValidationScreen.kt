package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.components.CustomFilledButtonComponent
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun OTPValidationScreen(navController: NavController){
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            IconButton(
                modifier = Modifier.size(35.dp),
                onClick = {  }) {
                Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "")
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = stringResource(id = R.string.you_have_got_mail),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = stringResource(id = R.string.otp_verification_sub_text),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = comfortaaFont
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            OTPTextFieldRowComponent()
            Spacer(modifier = Modifier.height(20.dp))
            CustomFilledButtonComponent(onClick = {  }, text = stringResource(id = R.string.confirm_str))
        }
    }
}

@Composable
fun OTPTextFieldRowComponent(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        OTPTextFieldComponent()
        OTPTextFieldComponent()
        OTPTextFieldComponent()
        OTPTextFieldComponent()
    }
}

@Composable
fun OTPTextFieldComponent(){
    var textValue by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier
            .height(55.dp)
            .width(80.dp)
            .padding(horizontal = 5.dp),
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent),
        value = textValue,
        shape = RoundedCornerShape(15.dp),
        onValueChange = {
            textValue = it

        })
}