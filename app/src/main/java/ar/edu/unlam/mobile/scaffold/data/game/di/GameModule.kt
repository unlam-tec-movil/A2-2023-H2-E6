package ar.edu.unlam.mobile.scaffold.data.game.di

import ar.edu.unlam.mobile.scaffold.data.game.repository.PlanetPopulationRawDataRepository
import ar.edu.unlam.mobile.scaffold.data.game.repository.RawDataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class GameModule {
    @Binds
    abstract fun bindGameRepository(gameRepositoryImpl: PlanetPopulationRawDataRepository): RawDataRepository
}
