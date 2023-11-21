package ar.edu.unlam.mobile.scaffold.data.result.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ResultDao {
    @Insert
    suspend fun insert(gameResult: GameResultEntity)

    @Query("SELECT * FROM gameResult")
    fun getAllResults(): Flow<List<GameResultEntity>>
}
