package ar.edu.unlam.mobile.scaffold.data.result.repository;

import java.lang.System;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/result/repository/GameResultDefaultRepository;", "Lar/edu/unlam/mobile/scaffold/data/result/repository/GameResultRepository;", "database", "Lar/edu/unlam/mobile/scaffold/core/database/SwDatabase;", "(Lar/edu/unlam/mobile/scaffold/core/database/SwDatabase;)V", "allEntity", "Lkotlinx/coroutines/flow/Flow;", "", "Lar/edu/unlam/mobile/scaffold/data/result/local/entity/GameResultEntity;", "getAllEntity", "()Lkotlinx/coroutines/flow/Flow;", "resultDao", "Lar/edu/unlam/mobile/scaffold/data/result/local/ResultDao;", "getAllResults", "insert", "", "gameResult", "(Lar/edu/unlam/mobile/scaffold/data/result/local/entity/GameResultEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GameResultDefaultRepository implements ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository {
    private final ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao resultDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity>> allEntity = null;
    
    @javax.inject.Inject
    public GameResultDefaultRepository(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.core.database.SwDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity>> getAllEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity gameResult, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity>> getAllResults() {
        return null;
    }
}