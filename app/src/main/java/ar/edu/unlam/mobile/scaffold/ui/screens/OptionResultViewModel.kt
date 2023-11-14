/*package ar.edu.unlam.mobile.scaffold.ui.screens
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OptionResultViewModel @Inject constructor(
    private val database: SwDatabase
): ViewModel() {

    private val _gameResults: MutableStateFlow<List<GameResult>> = MutableStateFlow(emptyList())

    val gameResults: StateFlow<List<GameResult>> get() = _gameResults

    init {
        loadGameResults()
    }

    private fun loadGameResults() {
        viewModelScope.launch {
            database.resultDao().getAllResults().stateIn(viewModelScope).collect { results ->
                _gameResults.value = results
            }
        }
    }
}
*/
