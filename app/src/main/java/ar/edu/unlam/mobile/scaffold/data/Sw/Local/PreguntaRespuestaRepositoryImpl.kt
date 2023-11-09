package ar.edu.unlam.mobile.scaffold.data.Sw.Local

import ar.edu.unlam.mobile.scaffold.domain.Sw.service.PreguntasRespuestasRepository

class PreguntaRespuestaRepositoryImpl {
    class PreguntasRepositoryImpl : PreguntasRespuestasRepository {
        override suspend fun getPreguntaStarWarsById(id: Int): PreguntasRepuestas? {
            return preguntasRepuestas.find { it.id == id }
        }
    }
}