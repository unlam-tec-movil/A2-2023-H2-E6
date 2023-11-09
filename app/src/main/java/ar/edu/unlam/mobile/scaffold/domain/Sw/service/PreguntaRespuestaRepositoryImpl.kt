package ar.edu.unlam.mobile.scaffold.domain.Sw.service

import ar.edu.unlam.mobile.scaffold.data.Sw.Local.PreguntasRepuestas
import ar.edu.unlam.mobile.scaffold.data.Sw.Local.preguntasRepuestas

class PreguntasRepositoryImpl : PreguntasRespuestasRepository {
    override suspend fun getPreguntaStarWarsById(id: Int): PreguntasRepuestas? {
        return preguntasRepuestas.find { it.id == id }
    }
}