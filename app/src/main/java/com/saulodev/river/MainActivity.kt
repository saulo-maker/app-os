package com.saulodev.river

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
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
                placeholder = { Text(text = "Nome:")})
            Spacer(modifier = Modifier.size(10.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text(text = "Senha:")})
            Spacer(
                modifier = Modifier.size(10.dp)
            )
            Button(
                onClick = {},
                modifier = btnLogin,
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
            ) {
                Text(text = "Acessar")
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RiverTheme {
        Main()
    }
}