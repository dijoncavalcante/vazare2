package com.dijon.vazare.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VazareScreen(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 16.dp)
    ) {
        Text(text = "Olá Dijon")
    }
}