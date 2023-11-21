package ar.edu.unlam.mobile.scaffold.data.sw.network

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PlanetRetrofitRepository @Inject constructor(private val api: SwApi) : PlanetNetworkRepository {
    override suspend fun getPlanet(id: Int): Flow<PlanetApiModel> {
        return flow {
            emit(api.getPlanet(id))
        }
    }
}
