package com.muhammedjasir.docsnappro.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhammedjasir.docsnappro.ui.theme.Navy
import com.muhammedjasir.docsnappro.ui.theme.comfortaaFont

@Composable
fun AppNavigationGraph(){

}

@Composable
fun CustomAuthTextFieldComponent(
    hint:String,
    space: Int
){
   Column(

   ) {
       Spacer(modifier = Modifier.height(height = space.dp))
       Text(
           modifier = Modifier.padding(horizontal = 10.dp),
           text = hint,
           style = TextStyle(
               fontFamily = comfortaaFont,
               fontSize = 10.sp,
           ),
       )
       CustomTextFieldComponent()
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
fun CustomRememberMeComponent(){
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
fun CustomFilledButtonComponent(
    onClick:() -> Unit,
    text: String
){
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(height = 55.dp)
            .padding(horizontal = 20.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Navy),
        onClick = onClick ) {
        Text(text = text, style = TextStyle(
            fontFamily = comfortaaFont,
            fontSize = 14.sp,
            color = Color.White
        ))
    }
}


