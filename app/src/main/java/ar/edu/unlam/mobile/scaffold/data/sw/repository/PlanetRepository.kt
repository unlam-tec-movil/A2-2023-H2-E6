package ar.edu.unlam.mobile.scaffold.data.sw.repository

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.planet.Planet
import kotlinx.coroutines.flow.Flow

interface PlanetRepository {
    suspend fun getPlanet(id: Int): Flow<Planet>
}
