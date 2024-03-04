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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import com.muhammedjasir.docsnappro.R
import com.muhammedjasir.docsnappro.ui.theme.Navy
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun SignUpScreen(){
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = 10.dp, vertical = 20.dp
            )
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize().padding(innerPadding),
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
                    fontWeight = FontWeight.Bold,
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
            Spacer(modifier = Modifier.height(height = 20.dp))
            Text(
                modifier = Modifier.padding(horizontal = 10.dp),
                text = stringResource(id = R.string.email_hint),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 10.sp,
                ),
            )
            CustomTextFieldComponent()
            Spacer(modifier = Modifier.height(height = 20.dp))
            Text(
                modifier = Modifier.padding(horizontal = 10.dp),
                text = stringResource(id = R.string.password_hint),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 10.sp,
                ),
            )
            CustomTextFieldComponent()
            Spacer(modifier = Modifier.height(height = 20.dp))
            Text(
                modifier = Modifier.padding(horizontal = 10.dp),
                text = stringResource(id = R.string.confirm_password_hint),
                style = TextStyle(
                    fontFamily = comfortaaFont,
                    fontSize = 10.sp,
                ),
            )
            CustomTextFieldComponent()
            Spacer(modifier = Modifier.height(height = 20.dp))
            CheckBoxComponent()
            Spacer(modifier = Modifier.height(height = 40.dp))
            CustomButtonComponent()
        }
    }
}

@Composable
fun CustomTextFieldComponent() {
    var textValue by remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent),
        value = textValue,
        onValueChange = {
            textValue = it

        })
}

@Composable
fun CheckBoxComponent(){
    val (checkedState, onStateChange) = remember { mutableStateOf(false) }
    Row(
        Modifier
            .fillMaxWidth()
            .height(56.dp)
//            .toggleable(
//                value = checkedState,
//                onValueChange = { onStateChange(!checkedState) },
//                role = Role.Checkbox
//            )
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkedState,
            onCheckedChange = {onStateChange(!checkedState)
            }
        )
        Text(
            text = "Remember me",
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Composable
fun CustomButtonComponent(){
    Button(
        modifier = Modifier.fillMaxWidth()
            .height(height = 55.dp).padding(horizontal = 20.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Navy),
        onClick = {  }) {
        Text(text = "Finish", style = TextStyle(
            fontFamily = comfortaaFont,
            fontSize = 14.sp,
            color = Color.White
        ))
    }
}