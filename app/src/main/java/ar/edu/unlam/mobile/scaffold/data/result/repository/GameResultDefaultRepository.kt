package ar.edu.unlam.mobile.scaffold.data.result.repository

import androidx.room.Entity
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
@Entity
class GameResultDefaultRepository @Inject constructor(

    database: SwDatabase,
) : GameResultRepository {
    private val resultDao: ResultDao = database.resultDao()
    val allEntity: Flow<List<GameResultEntity>> = resultDao.getAllResults()
    suspend fun insert(gameResult: GameResultEntity) {
        resultDao.insert(gameResult)
    }
    override fun getAllResults(): Flow<List<GameResultEntity>> {
        return resultDao.getAllResults()
    }

    //companion object {
     //   fun insertGameResult(result: String) {

      //  }
   // }
}

/*
********************
* class MyRepository(private val myEntityDao: MyEntityDao) {
    val allEntities: Flow<List<MyEntity>> = myEntityDao.getAllEntities()

    suspend fun insertEntity(entity: MyEntity) {
        myEntityDao.insertEntity(entity)
    }
}

* ++++++++++++++++++++++++++++
package ar.edu.unlam.mobile.scaffold.data.result.repository

import androidx.room.Entity
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@Entity
class GameResultDefaultRepository @Inject constructor(
    database: SwDatabase,
) : GameResultRepository {
    private val resultDao: ResultDao = database.resultDao()
    val allEntities: Flow<List<GameResultEntity>> = resultDao.getAllResults()

    suspend fun insert(gameResult: GameResultEntity) {
        resultDao.insert(gameResult)
    }

    override fun getAllResults(): Flow<List<GameResultEntity>> {
        return resultDao.getAllResults()
    }
}


 */