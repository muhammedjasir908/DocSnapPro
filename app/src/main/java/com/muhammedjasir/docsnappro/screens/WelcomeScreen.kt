package com.muhammedjasir.docsnappro.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.navigation.Screens
import com.muhammedjasir.docsnappro.ui.theme.Navy
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun WelcomeScreen(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp),
                painter = painterResource(id = R.drawable.app_icon),
                contentDescription = "")
            Spacer(modifier = Modifier.height(height = 20.dp))
            Text(
                text = stringResource(id = R.string.app_name),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(height = 20.dp))
            CustomAuthServiceButtonComponent(imageId = R.drawable.google_logo, text = "Continue with Google")
            Spacer(modifier = Modifier.height(height = 10.dp))
            CustomAuthServiceButtonComponent(imageId = R.drawable.facebook_logo, text = "Continue with Facebook")
            Spacer(modifier = Modifier.height(height = 20.dp))
            DividerComponent()
            Spacer(modifier = Modifier.height(height = 20.dp))
            SignInButtonComponent(onClick = {navController.navigate(Screens.SignIn.route)})
            Spacer(modifier = Modifier.height(height = 10.dp))
            SignUpTextButtonComponent(onClick = {navController.navigate(Screens.SignUp.route)})
            Spacer(modifier = Modifier.height(height = 10.dp))
        }
    }
}

@Composable
fun CustomAuthServiceButtonComponent(
    imageId: Int,
    text: String
){
    OutlinedButton(
        modifier = Modifier
            .width(width = 300.dp)
            .height(height = 55.dp),
        border = BorderStroke(width = 2.dp, color = Navy),
        onClick = {  }) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "",
            modifier = Modifier.size(width = 30.dp, height = 30.dp))
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSize))
        Text(text = text, textAlign = TextAlign.Center, fontFamily = comfortaaFont, color = Color.Black)
    }
}

@Composable
fun DividerComponent(){
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        HorizontalDivider(
            modifier = Modifier
                .width(width = 180.dp)
                .padding(start = 10.dp, end = 10.dp)
        )
        Text(text = "or", fontFamily = comfortaaFont)
        HorizontalDivider(
            modifier = Modifier
                .width(width = 180.dp)
                .padding(start = 10.dp, end = 10.dp)
        )
    }
}

@Composable
fun SignInButtonComponent(
    onClick: () -> Unit
){
    Button(
        modifier = Modifier
            .width(width = 300.dp)
            .height(height = 55.dp),
        colors = ButtonDefaults.buttonColors(Navy),
        onClick = onClick) {
        Text(text = "Sign in with password", fontFamily = comfortaaFont)
    }
}

@Composable
fun SignUpTextButtonComponent(
    onClick: () -> Unit
){
  Row(
      modifier = Modifier,
      horizontalArrangement = Arrangement.Center,
      verticalAlignment = Alignment.CenterVertically
  ) {
      Text(text = "Don't have an account?", fontFamily = comfortaaFont)
      TextButton(onClick = onClick) {
          Text(text = "Sign Up", fontFamily = comfortaaFont, color = Navy)
      }
  }
}
