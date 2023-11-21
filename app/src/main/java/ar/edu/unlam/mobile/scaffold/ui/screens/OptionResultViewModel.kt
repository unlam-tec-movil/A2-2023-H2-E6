package ar.edu.unlam.mobile.scaffold.ui.screens
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.game.use_cases.GetAllGamesUseCase
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OptionResultViewModel @Inject constructor(
    private val getAllGamesUseCase: GetAllGamesUseCase
): ViewModel() {

    private val _gameResults: MutableStateFlow<List<GameResultEntity>> = MutableStateFlow(emptyList())

    val gameResults: MutableStateFlow<List<GameResultEntity>> get() = _gameResults


    init {
        loadGameResults()
    }

    private fun loadGameResults() {
        viewModelScope.launch {
            getAllGamesUseCase().stateIn(viewModelScope).collect { results ->
                _gameResults.value=results
            }
        }
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

}
