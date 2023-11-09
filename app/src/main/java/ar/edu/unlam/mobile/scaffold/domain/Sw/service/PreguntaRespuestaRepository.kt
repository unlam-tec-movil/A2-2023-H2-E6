package ar.edu.unlam.mobile.scaffold.domain.Sw.service

import ar.edu.unlam.mobile.scaffold.data.Sw.Local.PreguntasRepuestas



interface PreguntasRespuestasRepository {
    suspend fun getPreguntaStarWarsById(id: Int): PreguntasRepuestas?

}
