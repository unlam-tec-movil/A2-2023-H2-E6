package ar.edu.unlam.mobile.scaffold.data.result.repository

import androidx.room.Entity
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResult
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
@Entity
class GameResultDefaultRepository @Inject constructor(
    database: SwDatabase,
) : GameResultRepository {
    private val resultDao: ResultDao = database.resultDao()
    val allEntities: Flow<List<GameResultEntity>> = resultDao.getAllResults()
   //pend fun insert(gameResult: GameResultEntity) {
   //     ResultDao.insert(GameResultEntity)
   // }
    override fun getAllResults(): Flow<List<GameResultEntity>> {
return flow{
   resultDao

    database.resultDao().insert(gameResult)
}

    }
}

/*
@Database(entities = [GameResultEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun resultDao(): ResultDao
}

 */