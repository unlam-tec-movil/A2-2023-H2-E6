package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import ar.edu.unlam.mobile.scaffold.data.local.GameResult
import kotlinx.coroutines.flow.MutableStateFlow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OptionResultScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    viewModel: OptionResultViewModel = hiltViewModel(),
) {
    val gameResults = viewModel.gameResults.collectAsState()
   // val gameResults: MutableStateFlow<List<GameResult>> =
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background,
    ) {

        Column {
            TopAppBar(
                title = {
                    Text(text = "Game Results")
                },
                modifier = Modifier.fillMaxWidth(),
            )
            gameResults.value.forEach { result ->
                Text(text = result.gameResult)
            }
        }
        Button(onClick = {

            navController.navigate("ScreenOne")
        }) {
            Text(text = "volver a la pantalla principal")
        }
    }
}
