package ar.edu.unlam.mobile.scaffold.data.result.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult
import org.jetbrains.annotations.NotNull

@Entity(tableName = "gameResult")
data class GameResultEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val gameResult: String, val size: Int,
)
data class GameResult(
    val id: Int,
    val gameResult: String,


)

fun GameResultEntity.toDomain() = GameResult(
    id = id,
    gameResult = gameResult,
)

/*
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

package ar.edu.unlam.mobile.scaffold.data.result.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult

@Entity(tableName = "gameResult")
data class GameResultEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val gameResult: String,
    val size: Int,
)

data class GameResult(
    val id: Int,
    val gameResult: String,
    val size: Int
)

fun GameResultEntity.toDomain() = GameResult(
    id = id,
    gameResult = gameResult,
    size = size
)


 */