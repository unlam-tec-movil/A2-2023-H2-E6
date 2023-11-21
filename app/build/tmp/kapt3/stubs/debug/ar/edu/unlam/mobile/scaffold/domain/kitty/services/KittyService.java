package ar.edu.unlam.mobile.scaffold.domain.kitty.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lar/edu/unlam/mobile/scaffold/domain/kitty/services/KittyService;", "Lar/edu/unlam/mobile/scaffold/domain/kitty/services/KittyGetter;", "repository", "Lar/edu/unlam/mobile/scaffold/data/kitty/repository/KittyRepository;", "(Lar/edu/unlam/mobile/scaffold/data/kitty/repository/KittyRepository;)V", "getRepository", "()Lar/edu/unlam/mobile/scaffold/data/kitty/repository/KittyRepository;", "getKitty", "Lkotlinx/coroutines/flow/Flow;", "Lar/edu/unlam/mobile/scaffold/domain/kitty/models/Kitty;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKittyById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class KittyService implements ar.edu.unlam.mobile.scaffold.domain.kitty.services.KittyGetter {
    @org.jetbrains.annotations.NotNull
    private final ar.edu.unlam.mobile.scaffold.data.kitty.repository.KittyRepository repository = null;
    
    @javax.inject.Inject
    public KittyService(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.kitty.repository.KittyRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ar.edu.unlam.mobile.scaffold.data.kitty.repository.KittyRepository getRepository() {
        return null;
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