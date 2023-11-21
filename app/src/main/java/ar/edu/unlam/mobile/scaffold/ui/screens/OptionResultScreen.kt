package ar.edu.unlam.mobile.scaffold.ui.screens

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OptionResultScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    viewModel: OptionResultViewModel = hiltViewModel()
) {
    val gameResults = viewModel.gameResults.collectAsState()

    LaunchedEffect(viewModel.navigateToScreen1) {
        if (viewModel.navigateToScreen1) {
            navController.navigate("screenOne") {
                // PopBackStack para eliminar la pantalla actual del back stack
                popUpTo("screenOne") { inclusive = true }
            }
            viewModel.onNavigationHandled()
        }
    }

    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TopAppBar(
                title = {
                    Text(text = "Resultados de partidas")
                },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))

                LazyColumn(){
                    items(gameResults.value.count()) {
                        index -> List(gameResults.value[index])
                    }
                }
            Spacer(modifier = Modifier.height(30.dp))
                Button(onClick = {
                    viewModel.onNavigateToScreen1()
                    viewModel.onNavigateToScreen1() }) {
                    Text(text = "Volver al inicio")
                }


        }
    }
}
@Composable
fun List(result: GameResultEntity){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column(horizontalAlignment = Alignment.Start) {
            Text(text = "Nombre: ${result.name}")
        }
        Spacer(modifier = Modifier.width(20.dp))
        Column(
            horizontalAlignment = Alignment.Start) {
            Text(text = "Correctas: ${result.gameResult}")
        }
    }
}

