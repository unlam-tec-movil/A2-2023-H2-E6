package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.edu.unlam.mobile.scaffold.core.di.SerielizationModule.get
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResult
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultDefaultRepository
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository
import ar.edu.unlam.mobile.scaffold.data.game.use_cases.AddUseCase
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
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
    object SetName: OptionGameUIState
    data class Error(val message: String) : OptionGameUIState
    data class Correct(val message: String) : OptionGameUIState
    data class Wrong(val message: String) : OptionGameUIState

}

data class GameUIState(
    val optionGameState: OptionGameUIState = OptionGameUIState.Loading,
)

@HiltViewModel
class OptionGameViewModel @Inject constructor(
    private val addUseCase: AddUseCase,
    private val game: GameUseCase,
// private val database: SwDatabase
) : ViewModel() {
    private val _optionGameState = mutableStateOf(OptionGameUIState.Loading)
    private val _uiState = MutableStateFlow(
        GameUIState(_optionGameState.value),
    )

    var username by mutableStateOf("")
        private set

    var startGame by mutableStateOf(true)
        private set

    val uiState = _uiState.asStateFlow()

    private var gameResult: String = ""
    private var vidas: Int = 4
    private var score: Int = 0

    init {
        getNewGame()
    }

    fun getNewGame() {
        viewModelScope.launch {
            if(startGame) {
                game.createGame().collect {
                    _uiState.value = GameUIState(OptionGameUIState.Success(it))
                }
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

    fun validateGame(optionGame: OptionGame, selectedOption: Option) {
        if (optionGame.isCorrect(selectedOption)) {
           gameResult = "Correcto"
           _uiState.value = GameUIState(OptionGameUIState.Correct(gameResult))
           score += 1
       }
        else {
                vidas -= 1
                gameResult = "Incorrecto la correcta era ${optionGame.answer.content}"
                _uiState.value = GameUIState(OptionGameUIState.Wrong(gameResult))
            if(vidas == 0){
                startGame = false
                _uiState.value = GameUIState(OptionGameUIState.SetName)
                }
            }
        }

    fun finishGame(name: String){
        updateUsername(name)
        saveGameResult(score.toString(), username)
    }

    private fun saveGameResult(result: String, name: String) {
        viewModelScope.launch {
            addUseCase(generarData(result, name))

        }

<
    private fun generarData(score: String, name: String): GameResultEntity{
        return GameResultEntity(gameResult = score, name = name)
    }


    private val _navigateToScreen1 = mutableStateOf(false)
    val navigateToScreen1: Boolean
        get() = _navigateToScreen1.value

    fun onNavigateToScreen1() {
        _navigateToScreen1.value = true
    }

    fun onNavigationHandled() {
        _navigateToScreen1.value = false
    }
    fun updateUsername(input: String){
        username = input
    }

    fun getVidas(): Int{
        return vidas
    }
}
