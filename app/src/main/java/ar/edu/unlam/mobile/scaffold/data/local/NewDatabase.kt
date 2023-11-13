package ar.edu.unlam.mobile.scaffold.data.game.local

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [GameResult::class], version = 1)
abstract class NewDatabase : RoomDatabase() {
    abstract fun newDao(): NewDao
    abstract fun NewDao(): Any
}
