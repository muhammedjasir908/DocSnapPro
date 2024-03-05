package com.muhammedjasir.docsnappro.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun SignUpDialog(
    onDismiss:() -> Unit
){
    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {  },
        modifier = Modifier.height(300.dp),
        text = {
            Column(
                modifier = Modifier.height(300.dp).padding(horizontal = 10.dp, vertical = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp),
                    imageVector = Icons.Rounded.CheckCircle, contentDescription = "")
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = stringResource(id = R.string.sign_up_successfully),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = comfortaaFont,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = stringResource(id = R.string.account_created),
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = comfortaaFont,
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Navy
                    ),
                    onClick = {  }) {
                    Text(text = stringResource(id = R.string.go_to_home),
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = comfortaaFont,
                            color = Color.White
                        )
                    )
                }
            }
        }
    )
}

@Composable
fun PasswordUpdatedDialog(
    onDismiss:() -> Unit
){
    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {  },
        modifier = Modifier.height(300.dp),
        text = {
            Column(
                modifier = Modifier.height(300.dp).padding(horizontal = 10.dp, vertical = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp),
                    imageVector = Icons.Rounded.CheckCircle, contentDescription = "")
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = stringResource(id = R.string.reset_password_success),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = comfortaaFont,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = stringResource(id = R.string.reset_password_success_sub_text),
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = comfortaaFont,
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Navy
                    ),
                    onClick = {  }) {
                    Text(text = stringResource(id = R.string.go_to_home),
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = comfortaaFont,
                            color = Color.White
                        )
                    )
                }
            }
        }
    )
}