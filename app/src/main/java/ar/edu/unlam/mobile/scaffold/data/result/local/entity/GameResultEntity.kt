package ar.edu.unlam.mobile.scaffold.data.result.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult
import org.jetbrains.annotations.NotNull

@Entity(tableName = "gameResult")
abstract class GameResultEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val gameResult: String,
) : List<GameResultEntity>

fun GameResultEntity.toDomain() = GameResult(
    id = id,
    gameResult = gameResult,
)

