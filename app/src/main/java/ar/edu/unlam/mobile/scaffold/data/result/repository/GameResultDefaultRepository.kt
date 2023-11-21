package ar.edu.unlam.mobile.scaffold.data.result.repository

import androidx.room.Entity
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
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

/*
@Database(entities = [GameResultEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun resultDao(): ResultDao
}

 */