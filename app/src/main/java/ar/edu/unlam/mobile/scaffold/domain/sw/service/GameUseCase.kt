package ar.edu.unlam.mobile.scaffold.domain.sw.service

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame
import kotlinx.coroutines.flow.Flow

interface GameUseCase {
    fun createGame(): Flow<OptionGame>
}
