package com.saulodev.river

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saulodev.river.ui.theme.MenuScreen
import com.saulodev.river.ui.theme.RiverTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RiverTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "login") {
                        composable("login") { Main(navController) }
                        composable("dashboard") { MenuScreen(navController = navController) }
                    }
                }
            }
        }
    }
}

@Composable
fun Main(navController: NavController) {
    Scaffold(
        bottomBar = { Text(text = "Bottom") }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .fillMaxWidth(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                val imageSize = Modifier.size(200.dp)

                val btnLogin = Modifier
                    .width(280.dp)
                    .height(40.dp)

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = imageSize
                )

                OutlinedTextField(
                    value = "", onValueChange = {},
                    placeholder = { Text(text = "Nome:")},
                    shape = CircleShape,
                    leadingIcon = { Icon(Icons.Default.Email, contentDescription = "") }
                )

                Spacer(modifier = Modifier.size(10.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text(text = "Senha:")},
                    shape = CircleShape,
                    leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "") }

                )

                Spacer(
                    modifier = Modifier.size(10.dp)
                )

                Button(
                    onClick = {navController.navigate("dashboard")},
                    modifier = btnLogin,
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(id = R.color.azul_marinho))
                ) {
                    Text(
                        text = "Acessar",
                        style = TextStyle(Color.White,
                            fontFamily = FontFamily.Monospace)
                    )
                }
            }
    }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RiverTheme {
        val navController = rememberNavController()
        Main(navController = navController)
    }
}