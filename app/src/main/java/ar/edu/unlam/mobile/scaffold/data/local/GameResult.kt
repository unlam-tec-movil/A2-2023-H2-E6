package ar.edu.unlam.mobile.scaffold.data.game.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game_Result")
data class GameResult(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val gameResult: String,
)
