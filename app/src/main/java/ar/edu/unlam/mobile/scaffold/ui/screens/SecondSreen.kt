package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.* // ktlint-disable no-wildcard-imports
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.* // ktlint-disable no-wildcard-imports
import androidx.compose.runtime.* // ktlint-disable no-wildcard-imports
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, id: Int, viewModel: ScreenOneViewModel = hiltViewModel()) { // Cambiar el tipo a NavController
    var selectedAnswer by remember { mutableStateOf("") }
    val buttonModifier = Modifier
        .padding(16.dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "¿Quien es el padre de Luke Skywalker?",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(16.dp),
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(4) { index ->
                val answer = when (index) {
                    0 -> "Darth Maul"
                    1 -> "Darth Vader"
                    2 -> "Yoda"
                    3 -> "Darth Sidious"
                    else -> ""
                }
                AnswerCard(
                    answer = answer,
                    isSelected = answer == selectedAnswer,
                    onAnswerSelected = {
                        selectedAnswer = answer
                    },
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
@Composable
fun AnswerCard(answer: String, isSelected: Boolean, onAnswerSelected: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onAnswerSelected() },
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = answer,
                fontSize = 16.sp,
            )
        }
    }
}
