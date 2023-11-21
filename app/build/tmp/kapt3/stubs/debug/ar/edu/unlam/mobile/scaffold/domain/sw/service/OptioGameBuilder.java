package ar.edu.unlam.mobile.scaffold.domain.sw.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lar/edu/unlam/mobile/scaffold/domain/sw/service/OptioGameBuilder;", "Lar/edu/unlam/mobile/scaffold/domain/sw/service/ResultUseCase;", "resultREpo", "Lar/edu/unlam/mobile/scaffold/data/result/repository/GameResultRepository;", "(Lar/edu/unlam/mobile/scaffold/data/result/repository/GameResultRepository;)V", "createResult", "Lkotlinx/coroutines/flow/Flow;", "Lar/edu/unlam/mobile/scaffold/data/result/local/entity/GameResult;", "app_debug"})
public final class OptioGameBuilder implements ar.edu.unlam.mobile.scaffold.domain.sw.service.ResultUseCase {
    private final ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository resultREpo = null;
    
    @javax.inject.Inject
    public OptioGameBuilder(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository resultREpo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResult> createResult() {
        return null;
    }
}