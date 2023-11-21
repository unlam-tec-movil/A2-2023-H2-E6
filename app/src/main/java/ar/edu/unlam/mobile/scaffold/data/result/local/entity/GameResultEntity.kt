package ar.edu.unlam.mobile.scaffold.data.result.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gameResult")
data class GameResultEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,
    @ColumnInfo(name = "nombre")
    var name: String = "",
    @ColumnInfo(name = "gameResult")
    val gameResult: String,
    // val size: Int,
)
