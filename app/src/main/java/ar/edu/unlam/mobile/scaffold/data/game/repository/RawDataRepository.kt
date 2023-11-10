package ar.edu.unlam.mobile.scaffold.data.game.repository

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.RawData
import kotlinx.coroutines.flow.Flow

interface RawDataRepository {
    fun getRawData(): Flow<RawData>
}
