package ar.edu.unlam.mobile.scaffold.ui.screens
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
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
    private val database: SwDatabase
): ViewModel() {

    private val _gameResults: MutableStateFlow<List<GameResultEntity>> = MutableStateFlow(emptyList())

    val gameResults: MutableStateFlow<List<GameResultEntity>> get() = _gameResults

    init {
        loadGameResults()
    }

    private fun loadGameResults() {
        viewModelScope.launch {
            database.resultDao().getAllResults().stateIn(viewModelScope).collect { results ->
                _gameResults.value=results
            }
        }
    }
}
/*
import kotlinx.coroutines.flow.*

fun main() {
    val myFlow: Flow<Int> = flowOf(1, 2, 3)

    // Example 1: Using stateIn with CoroutineScope
    val stateFlow1 = myFlow.stateIn(GlobalScope)

    // Example 2: Using stateIn with additional parameters
    val stateFlow2 = myFlow.stateIn(GlobalScope, SharingStarted.WhileSubscribed(), initialValue = 0
 */


