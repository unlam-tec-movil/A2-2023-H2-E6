package ar.edu.unlam.mobile.scaffold.core.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lar/edu/unlam/mobile/scaffold/core/di/SerielizationModule;", "", "()V", "get", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.Module
public final class SerielizationModule {
    @org.jetbrains.annotations.NotNull
    public static final ar.edu.unlam.mobile.scaffold.core.di.SerielizationModule INSTANCE = null;
    
    private SerielizationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.google.gson.Gson get() {
        return null;
    }
}