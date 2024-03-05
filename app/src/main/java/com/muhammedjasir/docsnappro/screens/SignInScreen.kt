package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.components.CustomAuthTextFieldComponent
import com.muhammedjasir.docsnappro.components.CustomFilledButtonComponent
import com.muhammedjasir.docsnappro.components.CustomRememberMeComponent
import com.muhammedjasir.docsnappro.navigation.Screens
import com.muhammedjasir.docsnappro.ui.theme.Navy
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun SignInScreen(navController: NavController){
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            IconButton(
                modifier = Modifier.size(35.dp),
                onClick = { navController.popBackStack() }) {
                Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "")
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = stringResource(id = R.string.hello_there),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = stringResource(id = R.string.sign_in_sub_text),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = comfortaaFont
                )
            )
            CustomAuthTextFieldComponent(hint = stringResource(id = R.string.email_hint), space = 20)
            CustomAuthTextFieldComponent(hint = stringResource(id = R.string.password_hint), space = 20)
            Spacer(modifier = Modifier.height(height = 20.dp))
            CustomRememberMeComponent()
            Spacer(modifier = Modifier.height(height = 20.dp))
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                color = Navy,
                thickness = 2.dp
            )
            TextButton(
                onClick = { navController.navigate(Screens.ForgotPassword.route) }) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(id = R.string.forgot_password),
                    style = TextStyle(
                        fontFamily = comfortaaFont,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )
            }
            Spacer(modifier = Modifier.height(height = 10.dp))
            SignInServicesComponent()
            Spacer(modifier = Modifier.height(height = 20.dp))
            CustomFilledButtonComponent(onClick = {
                navController.navigate(Screens.Home.route)
                                                  }, text = stringResource(id = R.string.sign_in))
        }
    }
}

@Composable
fun SignInServicesComponent(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        IconOutlineButtonComponent(imageId = R.drawable.google_logo)
        Spacer(modifier = Modifier.width(10.dp))
        IconOutlineButtonComponent(imageId = R.drawable.facebook_logo)
    }
}

@Composable
fun IconOutlineButtonComponent(
    imageId: Int
){
    OutlinedButton(
        modifier = Modifier
            .width(width = 150.dp)
            .height(height = 55.dp),
        border = BorderStroke(width = 2.dp, color = Navy),
        onClick = { }) {
        Image(
            modifier = Modifier.size(width = 25.dp, height = 35.dp),
            painter = painterResource(id = imageId),
            contentDescription = "",)
//            modifier = Modifier.size(ButtonDefaults.IconSize))
    }
}