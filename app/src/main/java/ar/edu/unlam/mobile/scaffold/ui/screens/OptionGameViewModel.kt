package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResult
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultDefaultRepository
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository
import ar.edu.unlam.mobile.scaffold.domain.sw.service.GameUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
// import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
// import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult

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
// private val database: SwDatabase
) : ViewModel() {
    private val _optionGameState = mutableStateOf(OptionGameUIState.Loading)

    private val _uiState = MutableStateFlow(
        GameUIState(_optionGameState.value),
    )

    val uiState = _uiState.asStateFlow()

    private var gameResult: String = ""

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
            val gameResult: String = if (optionGame.isCorrect(selectedOption)) {
                "Correcto"
            } else {
                "Incorrecto la correcta era ${optionGame.answer.content}"
            }

            saveGameResult(gameResult)
            if (optionGame.isCorrect(selectedOption)) {
                _uiState.value = GameUIState(OptionGameUIState.Correct(gameResult))
            } else {
                _uiState.value = GameUIState(OptionGameUIState.Wrong(gameResult))
            }
        }

        private fun saveGameResult(result: String) {
            viewModelScope.launch {
                GameResultDefaultRepository.insertGameResult(result)
            }
        }

<<<<<<< HEAD
    private fun saveGameResult(result: String) {
        viewModelScope.launch {
            val id = 1
         val gameResult = GameResult(gameResult = result, id = id)
         GameResult.insert(gameResult)// Todo, esto tiene que ir en el repo y ser consumido por el service
        }
    }
=======
>>>>>>> 8eef56b09e3a977d7828466123ff29929ae78d0f

    private val _navigateToScreen1 = mutableStateOf(false)
    val navigateToScreen1: Boolean
        get() = _navigateToScreen1.value

    fun onNavigateToScreen1() {
        _navigateToScreen1.value = true
    }

    fun onNavigationHandled() {
        _navigateToScreen1.value = false
    }
}
