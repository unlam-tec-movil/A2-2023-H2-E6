package ar.edu.unlam.mobile.scaffold.domain.sw.service

import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OptionResultBuilder @Inject constructor(private val resultREpo: GameResultRepository) : ResultUseCase {

    override fun createResult(): Flow<GameResult> {
        TODO("Not yet implemented")
        // fun saveGameResult
    }
}
