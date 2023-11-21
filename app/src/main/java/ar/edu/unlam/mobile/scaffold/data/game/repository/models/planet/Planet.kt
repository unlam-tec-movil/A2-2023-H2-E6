package ar.edu.unlam.mobile.scaffold.data.game.repository.models.planet

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Terrain

data class Planet(
    val name: String,
    val population: String,
    val terrains: List<Terrain>,
)
