<<<<<<< Updated upstream
package ar.edu.unlam.mobile.scaffold.data.local
=======
/*package ar.edu.unlam.mobile.scaffold.data.game.local
>>>>>>> Stashed changes

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase

@Dao
interface NewDao {
    @Insert
    suspend fun insert(gameResult: GameResult)

<<<<<<< Updated upstream
    @Query("SELECT * FROM GameResult")
    suspend fun getAllResults(): List<GameResult>
}
=======
    @Query("SELECT * FROM game_Result")
    fun getAllResults(): List<GameResult>
}

@Database(entities = [GameResult::class], version = 1, exportSchema = false)
abstract class NewDataBase : RoomDatabase() {
    abstract fun NewDao(): NewDao
}*/
>>>>>>> Stashed changes
