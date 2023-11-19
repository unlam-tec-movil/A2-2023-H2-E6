package ar.edu.unlam.mobile.scaffold.domain.sw.service

import ar.edu.unlam.mobile.scaffold.data.game.repository.RawDataRepository
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResult
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


    class OptioGameBuilder @Inject constructor(private val resultREpo: GameResultRepository) : ResultUseCase {

        override fun createResult(): Flow<GameResult> {
            TODO("Not yet implemented")
            //fun saveGameResult
        }
}