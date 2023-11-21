package ar.edu.unlam.mobile.scaffold.data.game.repository

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.RawData
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.planet.PlanetPopulationGameRawData
import ar.edu.unlam.mobile.scaffold.data.sw.repository.PlanetRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.util.Random
import javax.inject.Inject

const val MAX_PLANET_ID: Int = 20

class PlanetPopulationRawDataRepository @Inject constructor(
    private val planetRepository: PlanetRepository,
) : RawDataRepository {

    override fun getRawData(): Flow<RawData> {
        val random = Random()
        return flow {
            planetRepository.getPlanet(random.nextInt(MAX_PLANET_ID) + 1).collect {
                emit(
                    PlanetPopulationGameRawData(
                        name = it.name,
                        gameRawType = "Planeta",
                        attributeName = "Población",
                        attributeValue = it.population,
                    ),
                )
            }
        }
    }
}
