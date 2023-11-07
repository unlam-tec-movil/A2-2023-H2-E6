package ar.edu.unlam.mobile.scaffold.domain.Sw.Repository

import ar.edu.unlam.mobile.scaffold.data.Sw.local.Preguntas
import ar.edu.unlam.mobile.scaffold.data.Sw.local.Respuesta
import javax.inject.Inject

// Define la interfaz PreguntasRepository
interface PreguntasRepository {
    fun getPreguntas(): List<Preguntas>
    fun getRespuestas(): List<Respuesta>
}

// Implementación concreta de la interfaz PreguntasRepository
class PreguntasRepositoryImpl @Inject constructor() : PreguntasRepository {
    override fun getPreguntas(): List<Preguntas> {
        // Implementa la lógica para obtener las preguntas desde alguna fuente
        // Por ejemplo, desde una base de datos o una API
    }

    override fun getRespuestas(): List<Respuesta> {
        // Implementa la lógica para obtener las respuestas desde alguna fuente
        // Por ejemplo, desde una base de datos o una API
    }
}