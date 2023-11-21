package ar.edu.unlam.mobile.scaffold.data.game.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/game/repository/RawDataRepository;", "", "getRawData", "Lkotlinx/coroutines/flow/Flow;", "Lar/edu/unlam/mobile/scaffold/data/game/repository/models/RawData;", "app_debug"})
public abstract interface RawDataRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<ar.edu.unlam.mobile.scaffold.data.game.repository.models.RawData> getRawData();
}