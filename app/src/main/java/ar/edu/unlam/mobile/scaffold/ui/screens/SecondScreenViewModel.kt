package ar.edu.unlam.mobile.scaffold.ui.screens
import androidx.lifecycle.ViewModel
import ar.edu.unlam.mobile.scaffold.data.Sw.local.Preguntas
import ar.edu.unlam.mobile.scaffold.data.Sw.local.Respuesta
import ar.edu.unlam.mobile.scaffold.domain.Sw.Repository.PreguntasUseCase
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@HiltViewModel
class SecondScreenViewModel @Inject constructor(
    private val preguntasUseCase: PreguntasUseCase
) : ViewModel() {
    // ...

    fun getDataClassPreguntas(): List<Preguntas> {
        return preguntasUseCase.obtenerPreguntas()
    }

    fun getDataClassRespuestas(): List<Respuesta> {
        return preguntasUseCase.obtenerRespuestas()
    }

    // ...
}
/*import androidx.lifecycle.ViewModel
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@HiltViewModel
class SecondScreenViewModel @Inject constructor() : ViewModel() {
    // Propiedades y lógica del ViewModel
    data class Pregunta(val id: Int, val texto: String)

    private val preguntasDataClass = listOf(
        Pregunta(0, "¿Quién es el padre de Luke Skywalker?"),

    )

    private val respuestasDataClass = listOf(
        Respuesta(0, "Darth Maul"),
        Respuesta(1, "Darth Vader"),
        Respuesta(2, "Yoda"),
        Respuesta(3, "Darth Sidious")
    )
    fun getDataClassPreguntas(): List<Pregunta> {
        return preguntasDataClass

    }
    fun getDataClassRespuestas(): List<Respuesta> {
        return respuestasDataClass
    }

    suspend fun getApiRespuestas(): List<String> {
        // Aquí realizas una solicitud a la API y obtienes las respuestas como una lista de cadenas.
        // Puedes implementar esta lógica para obtener respuestas de la API.
        return emptyList() // Placeholder, debes implementar esto.
    }




    data class Respuesta(val id: Int, val respuesta: String)
}*/