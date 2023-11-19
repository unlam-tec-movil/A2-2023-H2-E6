package ar.edu.unlam.mobile.scaffold.data.result.repository

import androidx.room.Entity
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
@Entity
class GameResultDefaultRepository @Inject constructor(
    database: SwDatabase,
) : GameResultRepository {
    private val resultDao: ResultDao = database.resultDao()
    override fun getAllResults(): Flow<List<GameResultEntity>> {
        TODO("Not yet implemented")
    }
}

/*
@Database(entities = [GameResultEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun resultDao(): ResultDao
}

 */