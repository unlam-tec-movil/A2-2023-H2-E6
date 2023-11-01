package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ar.edu.unlam.mobile.scaffold.R

@Composable
fun ScreenOne(modifier: Modifier.Companion = Modifier, navController: NavHostController, viewModel: ScreenOneViewModel = hiltViewModel()) {
    val controller = rememberNavController()
    val backgroundImageRes = painterResource(id = R.drawable.fondo_estrellas)
    val backgroundModifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    val textState = remember { mutableStateOf("") }
    val buttonModifier = Modifier
        .padding(16.dp)
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = backgroundImageRes,
            contentDescription = null,
            modifier = backgroundModifier,
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bienvenido A La Trivia De Star Wars",
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .padding(8.dp)
                    .size(200.dp)
                    .padding(16.dp),
                color = Color.White,
                fontSize = 24.sp
            )
            Button(
                onClick = {
                    navController.navigate("segundo/1") // Navega a SecondScreen con un ID
                },
                modifier = buttonModifier
            ) {
                Text(text = "Iniciar Juego")
            }
            Button(
                onClick = {
                    System.exit(0)
                },
                modifier = buttonModifier
            ) {
                Text(text = "Salir del Juego")
            }
        }
    }
}
