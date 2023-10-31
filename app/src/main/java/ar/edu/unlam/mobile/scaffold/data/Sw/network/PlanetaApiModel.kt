package ar.edu.unlam.mobile.scaffold.data.Sw.network

import ar.edu.unlam.mobile.scaffold.domain.kitty.models.Planeta

data class PlanetaApiModel(
    val name: String,
    val climate: String,
    val terrain: String
) {

    fun toPlaneta(): Planeta {
        return Planeta(
            name = name,
            climate = climate,
            terrain = terrain,

            )
    }

}