package ar.edu.unlam.mobile.scaffold.domain.sw.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lar/edu/unlam/mobile/scaffold/domain/sw/service/OptionGameBuilder;", "Lar/edu/unlam/mobile/scaffold/domain/sw/service/GameUseCase;", "rawDataRepo", "Lar/edu/unlam/mobile/scaffold/data/game/repository/RawDataRepository;", "(Lar/edu/unlam/mobile/scaffold/data/game/repository/RawDataRepository;)V", "createGame", "Lkotlinx/coroutines/flow/Flow;", "Lar/edu/unlam/mobile/scaffold/data/game/repository/models/OptionGame;", "app_debug"})
public final class OptionGameBuilder implements ar.edu.unlam.mobile.scaffold.domain.sw.service.GameUseCase {
    private final ar.edu.unlam.mobile.scaffold.data.game.repository.RawDataRepository rawDataRepo = null;
    
    @javax.inject.Inject
    public OptionGameBuilder(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.game.repository.RawDataRepository rawDataRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame> createGame() {
        return null;
    }
}