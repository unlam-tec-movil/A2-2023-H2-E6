package ar.edu.unlam.mobile.scaffold.data.kitty.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/kitty/di/KittyDataModule;", "", "()V", "bindKittyNetworkRepo", "Lar/edu/unlam/mobile/scaffold/data/kitty/network/KittyNetworkRepository;", "kittyHTTPClient", "Lar/edu/unlam/mobile/scaffold/data/kitty/network/KittyHTTPRepository;", "bindKittyRepository", "Lar/edu/unlam/mobile/scaffold/data/kitty/repository/KittyRepository;", "kittyRepositoryImpl", "Lar/edu/unlam/mobile/scaffold/data/kitty/repository/KittyDefaultRepository;", "app_debug"})
@dagger.Module
public abstract class KittyDataModule {
    
    public KittyDataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract ar.edu.unlam.mobile.scaffold.data.kitty.repository.KittyRepository bindKittyRepository(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.kitty.repository.KittyDefaultRepository kittyRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract ar.edu.unlam.mobile.scaffold.data.kitty.network.KittyNetworkRepository bindKittyNetworkRepo(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.kitty.network.KittyHTTPRepository kittyHTTPClient);
}