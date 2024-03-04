package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.components.CustomAuthTextFieldComponent
import com.muhammedjasir.docsnappro.components.CustomFilledButtonComponent
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun ForgotPasswordScreen(navController: NavController){
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
            Text(text = stringResource(id = R.string.forgot_password),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = stringResource(id = R.string.forgot_password_sub_text),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 14.sp
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            CustomAuthTextFieldComponent(hint = stringResource(id = R.string.email_hint), space = 20)
            Spacer(modifier = Modifier.height(30.dp))
            CustomFilledButtonComponent(onClick = { }, text = stringResource(id = R.string.continue_str))
        }
    }
}