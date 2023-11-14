/*package ar.edu.unlam.mobile.scaffold.data.game.local

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase

@Dao
interface NewDao {
    @Insert
    suspend fun insert(gameResult: GameResult)

    @Query("SELECT * FROM game_Result")
    fun getAllResults(): List<GameResult>
}

@Database(entities = [GameResult::class], version = 1, exportSchema = false)
abstract class NewDataBase : RoomDatabase() {
    abstract fun NewDao(): NewDao
}*/