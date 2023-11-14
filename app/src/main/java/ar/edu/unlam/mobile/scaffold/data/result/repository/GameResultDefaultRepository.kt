package ar.edu.unlam.mobile.scaffold.data.result.repository

import androidx.room.Entity
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import javax.inject.Inject
@Entity
class GameResultDefaultRepository @Inject constructor(
    database: SwDatabase,
) : GameResultRepository {
    private val resultDao: ResultDao = database.resultDao()
 //   database.newDao().insert(gameResult)

}
