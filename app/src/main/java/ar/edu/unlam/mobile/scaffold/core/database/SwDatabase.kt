package ar.edu.unlam.mobile.scaffold.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult

@Database(
    entities = [GameResultEntity::class],
    version = 1
)
public abstract class SwDatabase : RoomDatabase() {

    public abstract fun resultDao(): ResultDao
}
/*
@Database(entities = [GameResultEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun resultDao(): ResultDao
}

 */