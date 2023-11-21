package ar.edu.unlam.mobile.scaffold.data.result.local

import android.telephony.VisualVoicemailSmsFilterSettings
import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.Query
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow

@Dao

interface ResultDao {
    @Insert
    fun insert( gameResult: GameResultEntity)


    @Query("SELECT * FROM gameResult")
    fun getAllResults(): Flow<List<GameResultEntity>>
}

/*
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
    val allEntities: Flow<List<GameResultEntity>> = resultDao.getAllResults()

    suspend fun insert(gameResult: GameResultEntity) {
        resultDao.insert(gameResult)
    }

    override fun getAllResults(): Flow<List<GameResultEntity>> {
        return resultDao.getAllResults()
    }
}

 */