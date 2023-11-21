package ar.edu.unlam.mobile.scaffold.domain.kitty.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lar/edu/unlam/mobile/scaffold/domain/kitty/services/KittyMockService;", "Lar/edu/unlam/mobile/scaffold/domain/kitty/services/KittyGetter;", "()V", "getKitty", "Lkotlinx/coroutines/flow/Flow;", "Lar/edu/unlam/mobile/scaffold/domain/kitty/models/Kitty;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKittyById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton
public final class KittyMockService implements ar.edu.unlam.mobile.scaffold.domain.kitty.services.KittyGetter {
    
    @javax.inject.Inject
    public KittyMockService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getKitty(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<ar.edu.unlam.mobile.scaffold.domain.kitty.models.Kitty>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getKittyById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<ar.edu.unlam.mobile.scaffold.domain.kitty.models.Kitty>> continuation) {
        return null;
    }
}