package ar.edu.unlam.mobile.scaffold.ui.screens
<<<<<<< Updated upstream

=======
/*
import ar.edu.unlam.mobile.scaffold.data.game.local.NewDao
>>>>>>> Stashed changes
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.edu.unlam.mobile.scaffold.data.game.local.GameResult
import ar.edu.unlam.mobile.scaffold.data.game.local.NewDataBase
import ar.edu.unlam.mobile.scaffold.data.game.local.NewDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OptionResultViewModel @Inject constructor(
    private val database: NewDatabase
): ViewModel() {

    private val _gameResults: MutableStateFlow<List<GameResult>> = MutableStateFlow(emptyList())

    val gameResults: StateFlow<List<GameResult>> get() = _gameResults

    init {
        loadGameResults()
    }

    private fun loadGameResults() {
        viewModelScope.launch {
            database.NewDao().getAllResults().stateIn(viewModelScope).collect { results ->
                _gameResults.value = results
            }
        }
    }
    }
    */
