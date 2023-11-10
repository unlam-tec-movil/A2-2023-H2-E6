package ar.edu.unlam.mobile.scaffold.data.sw.network

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Terrain
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.planet.Planet

data class PlanetApiModel(
    val name: String,
    val population: String,
    val terrain: String,
)

fun PlanetApiModel.toPlanet() = Planet(
    name = name,
    population = population,
    terrains = terrain.split(", ").map { Terrain(it) },
)
