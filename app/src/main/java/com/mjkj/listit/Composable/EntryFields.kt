package com.mjkj.listit.Composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
        /** This is a composable function that creates a text field with an outlined border
         *
         *  @param label: String - The text to be displayed on the label
         *  @return text: String - The text entered into the text field
         * */
fun OutlinedTextField(label: String): String {
    var text by remember { mutableStateOf("") }

    androidx.compose.material3.OutlinedTextField(
        value = text,
        singleLine = true,
        onValueChange = { text = it },
        label = { Text(label) }
    )
    return text
}
