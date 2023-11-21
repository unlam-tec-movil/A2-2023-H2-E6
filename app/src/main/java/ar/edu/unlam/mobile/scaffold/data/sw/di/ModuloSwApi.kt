package ar.edu.unlam.mobile.scaffold.data.sw.di

import ar.edu.unlam.mobile.scaffold.data.sw.network.PlanetNetworkRepository
import ar.edu.unlam.mobile.scaffold.data.sw.network.PlanetRetrofitRepository
import ar.edu.unlam.mobile.scaffold.data.sw.repository.PlanetDefaultRepository
import ar.edu.unlam.mobile.scaffold.data.sw.repository.PlanetRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ModuloSwApi {
    @Binds
    abstract fun bindSwRepository(swApiProviderImpl: PlanetDefaultRepository): PlanetRepository

    @Binds
    abstract fun bindPlanetNetworkRepo(planetRetro: PlanetRetrofitRepository): PlanetNetworkRepository
}
