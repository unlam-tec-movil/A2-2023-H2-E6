import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame
import ar.edu.unlam.mobile.scaffold.ui.screens.GameUIState
import ar.edu.unlam.mobile.scaffold.ui.screens.OptionGameUIState
import ar.edu.unlam.mobile.scaffold.ui.screens.OptionGameViewModel

@Composable
fun OptionGameScreen(
    navController: NavController,
    snackbarHostState: SnackbarHostState,
    viewModel: OptionGameViewModel = hiltViewModel(),
) {
    val uiState: GameUIState by viewModel.uiState.collectAsState()

    // Utiliza un LaunchedEffect para observar los cambios en navigateToScreen1
    LaunchedEffect(viewModel.navigateToScreen1) {
        if (viewModel.navigateToScreen1) {
            navController.navigate("screenOne") {
                // PopBackStack para eliminar la pantalla actual del back stack
                popUpTo("screenOne") { inclusive = true }
            }
            viewModel.onNavigationHandled()
        }
    }

    when (val gameOptionState = uiState.optionGameState) {
        is OptionGameUIState.Loading -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                CircularProgressIndicator()
            }
        }

        is OptionGameUIState.Success -> {
            Body(
                viewModel = viewModel,
                optionGame = gameOptionState.optionGame,
                onAnswerSelected = { selectedOption ->
                    viewModel.validateGame(gameOptionState.optionGame, selectedOption)
                    viewModel.getNewGame()
                },
            )
        }

        is OptionGameUIState.Error -> {
            Text(text = gameOptionState.message)
        }

        is OptionGameUIState.Correct -> {
            LaunchedEffect(snackbarHostState) {
                snackbarHostState.showSnackbar("Correcto")
            }
        }

        is OptionGameUIState.Wrong -> {
            LaunchedEffect(snackbarHostState) {
                snackbarHostState.showSnackbar(gameOptionState.message)
            }
        }

        is OptionGameUIState.SetName -> {
            SetName(viewModel = viewModel)
        }
    }
}

@Composable
fun Body(
    viewModel: OptionGameViewModel,
    optionGame: OptionGame,
    onAnswerSelected: (selected: Option) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .background(Color.DarkGray),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = optionGame.question,
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(30.dp, 30.dp)
                    .background(Color.Black),
            )
        }
        Spacer(modifier = Modifier.height(100.dp))
        LazyColumn(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            items(count = optionGame.options.size) { index ->
                AnswerCard(
                    answer = optionGame.options[index].content,
                    isSelected = false,
                    onOptionSelected = {
                        onAnswerSelected(optionGame.options[index])
                    },
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        Text(text = "Vidas: ${viewModel.getVidas()}")

        Button(onClick = {
            viewModel.onNavigateToScreen1()
            viewModel.onNavigateToScreen1()
        }) {
            Text(
                text = "Volver a la pantalla principal",
            )
        }
    }
}

@Composable
fun AnswerCard(answer: String, isSelected: Boolean, onOptionSelected: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .clickable { onOptionSelected() },
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = answer,
                fontSize = 16.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
fun SetName(viewModel: OptionGameViewModel) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text("Juego finalizado :(", textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(value = viewModel.username, onValueChange = { username -> viewModel.updateUsername(username) })
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            viewModel.finishGame(viewModel.username)
            viewModel.onNavigateToScreen1()
            viewModel.onNavigateToScreen1()
        }) {
            Text(text = "Salir")
        }
    }
}
