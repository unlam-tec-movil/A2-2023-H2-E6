package ar.edu.unlam.mobile.scaffold.data.result.repository

import androidx.room.Entity
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
class GameResultDefaultRepository @Inject constructor(


    database: SwDatabase,
) : GameResultRepository {
    private val resultDao: ResultDao = database.resultDao()
    val allEntity: Flow<List<GameResultEntity>> = resultDao.getAllResults()
    override fun getAllResults(): Flow<List<GameResultEntity>> {
       return flow{
           resultDao
       }
    }

    companion object {
        fun insertGameResult(result: String) {

        }

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