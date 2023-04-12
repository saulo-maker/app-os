package com.saulodev.river.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.saulodev.river.R

@Composable
fun MenuScreen(navController: NavController) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
    ) {
        Column() {
            Card(modifier = Modifier
                .padding(8.dp)
                .clickable { }
                .fillMaxWidth()
                .fillMaxHeight(),
                elevation = 8.dp,
                shape = RoundedCornerShape(8.dp)
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Image")
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "OS: PARCEIRO: STATUS:", style = MaterialTheme.typography.h6)
                    }
                }
            }
            Button(onClick = { navController.navigate("login") }) {
                Text(text = "Voltar")
            }
        }
    }
}

@Preview
@Composable
fun ViewMenu() {
    val navController = rememberNavController()
    MenuScreen(navController = navController)
}