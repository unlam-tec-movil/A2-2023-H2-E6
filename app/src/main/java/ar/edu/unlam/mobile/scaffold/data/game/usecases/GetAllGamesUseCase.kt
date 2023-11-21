package ar.edu.unlam.mobile.scaffold.data.game.usecases

import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllGamesUseCase @Inject constructor(
    private val repository: GameResultRepository,
) {

    operator fun invoke(): Flow<List<GameResultEntity>> = repository.getAllResults()
}
