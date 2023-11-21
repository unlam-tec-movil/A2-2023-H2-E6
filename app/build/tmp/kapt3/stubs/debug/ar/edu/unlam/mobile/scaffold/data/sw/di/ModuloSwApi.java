package ar.edu.unlam.mobile.scaffold.data.sw.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/sw/di/ModuloSwApi;", "", "()V", "bindPlanetNetworkRepo", "Lar/edu/unlam/mobile/scaffold/data/sw/network/PlanetNetworkRepository;", "planetRetro", "Lar/edu/unlam/mobile/scaffold/data/sw/network/PlanetRetrofitRepository;", "bindSwRepository", "Lar/edu/unlam/mobile/scaffold/data/sw/repository/PlanetRepository;", "swApiProviderImpl", "Lar/edu/unlam/mobile/scaffold/data/sw/repository/PlanetDefaultRepository;", "app_debug"})
@dagger.Module
public abstract class ModuloSwApi {
    
    public ModuloSwApi() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract ar.edu.unlam.mobile.scaffold.data.sw.repository.PlanetRepository bindSwRepository(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.sw.repository.PlanetDefaultRepository swApiProviderImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract ar.edu.unlam.mobile.scaffold.data.sw.network.PlanetNetworkRepository bindPlanetNetworkRepo(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.sw.network.PlanetRetrofitRepository planetRetro);
}