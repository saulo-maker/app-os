package com.saulodev.river.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
    ) {
        Column() {
            Text(text = "Saulo")
            Text(text = "Paulo")
            Button(onClick = { navController.navigate("login") }) {
                Text(text = "Voltar")
            }
        }
    }
}