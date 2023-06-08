package com.example.template

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun template(){
    Column {
        Text("This is a template")
        var buttonText by remember { mutableStateOf("This is a button") }
        Button(onClick = {buttonText = "This button has been clicked"}){
            Text(buttonText)
        }
    }
}
