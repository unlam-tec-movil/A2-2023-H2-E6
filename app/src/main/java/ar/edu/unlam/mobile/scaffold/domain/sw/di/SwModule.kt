package ar.edu.unlam.mobile.scaffold.domain.sw.di

import ar.edu.unlam.mobile.scaffold.domain.sw.service.GameUseCase
import ar.edu.unlam.mobile.scaffold.domain.sw.service.OptionGameBuilder
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SwModule {

    @Binds
    abstract fun bindsGameUseCase(optionGameBuilder: OptionGameBuilder): GameUseCase
}
