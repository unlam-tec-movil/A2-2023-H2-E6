package ar.edu.unlam.mobile.scaffold.data.result.repository

import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow

interface GameResultRepository{

    fun getAllResults(): Flow<List<GameResultEntity>>
}

