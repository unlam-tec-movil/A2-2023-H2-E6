package ar.edu.unlam.mobile.scaffold.data.result.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/result/repository/GameResultRepository;", "", "getAllResults", "Lkotlinx/coroutines/flow/Flow;", "", "Lar/edu/unlam/mobile/scaffold/data/result/local/entity/GameResultEntity;", "app_debug"})
public abstract interface GameResultRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity>> getAllResults();
}