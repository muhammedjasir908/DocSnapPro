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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.muhammedjasir.docsnappro.components.CustomRememberMeComponent
import com.muhammedjasir.docsnappro.components.SignUpDialog
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun CreatePasswordScreen(navController: NavController){
    var showSuccessDialog by remember {
        mutableStateOf(false)
    }

    if(showSuccessDialog){
        SignUpDialog(onDismiss = {showSuccessDialog = false})
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            IconButton(
                modifier = Modifier.size(35.dp),
                onClick = {  }) {
                Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "")
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = stringResource(id = R.string.create_new_password),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = stringResource(id = R.string.create_new_password_sub_text),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = comfortaaFont
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            CustomAuthTextFieldComponent(hint = stringResource(id = R.string.create_new_password), space = 20)
            CustomAuthTextFieldComponent(hint = stringResource(id = R.string.confirm_password_hint), space = 20)
            Spacer(modifier = Modifier.height(20.dp))
            CustomRememberMeComponent()
            Spacer(modifier = Modifier.height(30.dp))
            CustomFilledButtonComponent(onClick = { showSuccessDialog = true}, text = stringResource(id = R.string.continue_str))
        }
    }
}