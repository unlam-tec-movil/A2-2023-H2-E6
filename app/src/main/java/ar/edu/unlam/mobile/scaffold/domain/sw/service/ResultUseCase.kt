package ar.edu.unlam.mobile.scaffold.domain.sw.service

import ar.edu.unlam.mobile.scaffold.data.result.model.GameResult
import kotlinx.coroutines.flow.Flow

interface ResultUseCase {
    fun createResult(): Flow<GameResult>
}
