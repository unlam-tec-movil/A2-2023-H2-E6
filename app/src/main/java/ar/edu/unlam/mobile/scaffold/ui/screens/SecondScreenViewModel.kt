package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.edu.unlam.mobile.scaffold.data.Sw.Local.PreguntasRepuestas
import ar.edu.unlam.mobile.scaffold.domain.Sw.service.ObtenerPreguntaRespuesta
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SecondScreenViewModel @Inject constructor(
    private val obtenerPreguntaRespuesta: ObtenerPreguntaRespuesta
) : ViewModel() {

    var preguntaStarWars: PreguntasRepuestas? by mutableStateOf(null)
        private set

    fun obtenerPreguntaStarWars() {
        viewModelScope.launch {
            preguntaStarWars = obtenerPreguntaRespuesta.execute(1)
        }
    }

}
@Module
@InstallIn(SingletonComponent::class)
object SecondScreenModule {
    @Provides
    @ViewModelScoped
    fun provideSecondScreenViewModel(viewModel: SecondScreenViewModel): ViewModel {
        return viewModel
    }
/*  fun provideObtenerPreguntaRespuesta(repository: PreguntaRespuestaRepositoryImpl): ObtenerPreguntaRespuesta {
        return ObtenerPreguntaRespuesta(repository)
    }*/
}
