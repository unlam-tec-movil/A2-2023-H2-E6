package ar.edu.unlam.mobile.scaffold.data.local

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase

@Dao
interface NewDao {
    @Insert
    suspend fun insert(gameResult: GameResult)

    @Query("SELECT * FROM GameResult")
    suspend fun getAllResults(): List<GameResult>
}