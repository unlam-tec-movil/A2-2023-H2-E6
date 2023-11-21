package ar.edu.unlam.mobile.scaffold.data.result.repository

import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GameResultDefaultRepository @Inject constructor(
    private val resultDao: ResultDao,
) : GameResultRepository {
    override suspend fun insert(gameResult: GameResultEntity) {
        resultDao.insert(gameResult)
    }

    override fun getAllResults(): Flow<List<GameResultEntity>> {
        return resultDao.getAllResults()
    }
}
