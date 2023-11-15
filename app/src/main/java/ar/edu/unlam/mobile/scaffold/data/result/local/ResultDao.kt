package ar.edu.unlam.mobile.scaffold.data.result.local

import android.telephony.VisualVoicemailSmsFilterSettings
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity

@Dao
interface ResultDao {
    @Insert
    fun insert(gameResult: GameResultEntity)


    @Query("SELECT * FROM gameResult")
    fun getAllResults(): List<GameResultEntity>
}

