package ar.edu.unlam.mobile.scaffold.data.local


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "GameResult")
data class GameResult(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "game_result") val gameResult: String
)