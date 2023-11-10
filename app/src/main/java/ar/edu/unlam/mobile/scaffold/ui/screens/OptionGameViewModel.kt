package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame
import ar.edu.unlam.mobile.scaffold.domain.sw.service.GameUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@Immutable
sealed interface OptionGameUIState {
    data class Success(val optionGame: OptionGame) : OptionGameUIState
    object Loading : OptionGameUIState
    data class Error(val message: String) : OptionGameUIState
    data class Correct(val message: String) : OptionGameUIState

    data class Wrong(val message: String) : OptionGameUIState
}

data class GameUIState(
    val optionGameState: OptionGameUIState = OptionGameUIState.Loading,
)

@HiltViewModel
class OptionGameViewModel @Inject constructor(
    private val game: GameUseCase,
) : ViewModel() {

    private val _optionGameState = mutableStateOf(OptionGameUIState.Loading)

    private val _uiState = MutableStateFlow(
        GameUIState(_optionGameState.value),
    )

    val uiState = _uiState.asStateFlow()

    init {
        getNewGame()
    }

    fun getNewGame() {
        viewModelScope.launch {
            game.createGame().collect {
                _uiState.value = GameUIState(OptionGameUIState.Success(it))
            }
        }
    }

    fun validateGame(optionGame: OptionGame, selectedOption: Option) {
        // Guardar el resultado en una variable y almacenarlo en Room
        if (optionGame.isCorrect(selectedOption)) {
            _uiState.value = GameUIState(OptionGameUIState.Correct("Correcto"))
        } else {
            _uiState.value = GameUIState(
                OptionGameUIState.Wrong(
                    "Incorrecto la correcta era ${optionGame.answer.content}",
                ),
            )
        }
    }
}
