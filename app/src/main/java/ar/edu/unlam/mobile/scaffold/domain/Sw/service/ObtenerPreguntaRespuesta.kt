package ar.edu.unlam.mobile.scaffold.domain.Sw.service

import ar.edu.unlam.mobile.scaffold.data.Sw.Local.PreguntasRepuestas


class ObtenerPreguntaRespuesta (private val preguntasRepository: PreguntasRespuestasRepository) {

        suspend fun execute(id: Int): PreguntasRepuestas? {
            return preguntasRepository.getPreguntaStarWarsById(id)
        }
    }
