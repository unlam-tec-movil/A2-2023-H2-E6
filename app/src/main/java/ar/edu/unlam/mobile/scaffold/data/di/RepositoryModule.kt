package ar.edu.unlam.mobile.scaffold.data.di

import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultDefaultRepository
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindRepository(repositoryImpl: GameResultDefaultRepository): GameResultRepository
}