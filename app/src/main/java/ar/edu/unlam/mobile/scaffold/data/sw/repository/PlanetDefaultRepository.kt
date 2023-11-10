package ar.edu.unlam.mobile.scaffold.data.sw.repository

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.planet.Planet
import ar.edu.unlam.mobile.scaffold.data.sw.network.PlanetNetworkRepository
import ar.edu.unlam.mobile.scaffold.data.sw.network.toPlanet
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PlanetDefaultRepository @Inject constructor(private val planetRepo: PlanetNetworkRepository) : PlanetRepository {
    override suspend fun getPlanet(id: Int): Flow<Planet> {
        return planetRepo.getPlanet(id).map { it.toPlanet() }
    }
}
