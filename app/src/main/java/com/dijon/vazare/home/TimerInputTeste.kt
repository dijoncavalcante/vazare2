package com.dijon.vazare.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextFieldComponent(
    value: String,
    onValueChange: (String) -> Unit,
    supportingText: String?,
    isError: Boolean
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            supportingText = supportingText?.let {
                @Composable {
                    Text(
                        text = supportingText,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            },
            isError = isError,
//            readOnly = true,
        )
            Button(onClick = {  }) {
                Text("Filled")
            }

            FilledTonalButton(onClick = {  }) {
                Text("Tonal")
            }

            OutlinedButton(onClick = { }) {
                Text("Outlined")
            }
            ElevatedButton(onClick = {  }) {
                Text("Elevated")
            }

            TextButton(
                onClick = {  }
            ) {
                Text("Text Button")
            }


    }
}