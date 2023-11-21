package ar.edu.unlam.mobile.scaffold.data.sw.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/sw/di/SwApiProvider;", "", "()V", "provideSwApi", "Lar/edu/unlam/mobile/scaffold/data/sw/network/SwApi;", "gson", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.Module
public final class SwApiProvider {
    @org.jetbrains.annotations.NotNull
    public static final ar.edu.unlam.mobile.scaffold.data.sw.di.SwApiProvider INSTANCE = null;
    
    private SwApiProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final ar.edu.unlam.mobile.scaffold.data.sw.network.SwApi provideSwApi(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        return null;
    }
}