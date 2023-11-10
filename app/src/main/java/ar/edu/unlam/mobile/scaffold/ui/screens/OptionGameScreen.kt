package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame

@Composable
fun OptionGameScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    snackbarHostState: SnackbarHostState,
    viewModel: OptionGameViewModel = hiltViewModel(),
) {
    val uiState: GameUIState by viewModel.uiState.collectAsState()
    when (val gameOptionState = uiState.optionGameState) {
        is OptionGameUIState.Loading -> {
            CircularProgressIndicator()
        }

        is OptionGameUIState.Success -> {
            Body(
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
    }
}

@Composable
fun Body(
    optionGame: OptionGame,
    onAnswerSelected: (selected: Option) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
            .fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = optionGame.question,
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp),
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(count = optionGame.options.size) { index ->
                OptionsCard(
                    answer = optionGame.options[index].content,
                    isSelected = false,
                    onOptionSelected = {
                        onAnswerSelected(optionGame.options[index])
                    },
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Composable
fun OptionsCard(answer: String, isSelected: Boolean, onOptionSelected: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onOptionSelected() },
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
