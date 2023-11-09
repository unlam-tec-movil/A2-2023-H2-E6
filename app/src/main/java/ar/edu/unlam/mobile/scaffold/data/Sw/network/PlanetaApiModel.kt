package ar.edu.unlam.mobile.scaffold.data.Sw.network

import ar.edu.unlam.mobile.scaffold.domain.Sw.models.Planeta

data class PlanetaApiModel(
    val name: String,
) {
    fun toPlaneta(): Planeta {
        return Planeta(
            name = name,

        )
    }
}
