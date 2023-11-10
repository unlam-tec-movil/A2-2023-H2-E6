package ar.edu.unlam.mobile.scaffold.data.sw.network

import kotlinx.coroutines.flow.Flow

interface PlanetNetworkRepository {
    suspend fun getPlanet(id: Int): Flow<PlanetApiModel>
}
