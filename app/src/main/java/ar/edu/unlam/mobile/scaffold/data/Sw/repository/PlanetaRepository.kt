package ar.edu.unlam.mobile.scaffold.data.Sw.repository

import ar.edu.unlam.mobile.scaffold.domain.kitty.models.Planeta
import kotlinx.coroutines.flow.Flow

interface PlanetaRepository {

    suspend fun getPlaneta():Flow<Planeta>
}