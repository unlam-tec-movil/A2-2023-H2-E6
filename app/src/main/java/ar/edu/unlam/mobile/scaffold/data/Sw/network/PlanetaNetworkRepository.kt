package ar.edu.unlam.mobile.scaffold.data.Sw.network

import ar.edu.unlam.mobile.scaffold.data.Sw.di.ModuloSwApi
import kotlinx.coroutines.flow.Flow

interface PlanetaNetworkRepository {

    suspend fun getRandomPlaneta(): Flow<ModuloSwApi>
}