package ar.edu.unlam.mobile.scaffold.data.result.repository

import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import javax.inject.Inject

class GameResultDefaultRepository @Inject constructor(
    database: SwDatabase,
) : GameResultRepository {
    private val resultDao: ResultDao = database.resultDao()
}
