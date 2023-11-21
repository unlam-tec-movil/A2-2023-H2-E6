package ar.edu.unlam.mobile.scaffold.ui.screens;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lar/edu/unlam/mobile/scaffold/ui/screens/OptionGameViewModel;", "Landroidx/lifecycle/ViewModel;", "game", "Lar/edu/unlam/mobile/scaffold/domain/sw/service/GameUseCase;", "(Lar/edu/unlam/mobile/scaffold/domain/sw/service/GameUseCase;)V", "_navigateToScreen1", "Landroidx/compose/runtime/MutableState;", "", "_optionGameState", "Lar/edu/unlam/mobile/scaffold/ui/screens/OptionGameUIState$Loading;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lar/edu/unlam/mobile/scaffold/ui/screens/GameUIState;", "gameResult", "", "navigateToScreen1", "getNavigateToScreen1", "()Z", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getNewGame", "", "onNavigateToScreen1", "onNavigationHandled", "saveGameResult", "result", "validateGame", "optionGame", "Lar/edu/unlam/mobile/scaffold/data/game/repository/models/OptionGame;", "selectedOption", "Lar/edu/unlam/mobile/scaffold/data/game/repository/models/Option;", "app_debug"})
public final class OptionGameViewModel extends androidx.lifecycle.ViewModel {
    private final ar.edu.unlam.mobile.scaffold.domain.sw.service.GameUseCase game = null;
    private final androidx.compose.runtime.MutableState<ar.edu.unlam.mobile.scaffold.ui.screens.OptionGameUIState.Loading> _optionGameState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<ar.edu.unlam.mobile.scaffold.ui.screens.GameUIState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<ar.edu.unlam.mobile.scaffold.ui.screens.GameUIState> uiState = null;
    private java.lang.String gameResult = "";
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _navigateToScreen1 = null;
    
    @javax.inject.Inject
    public OptionGameViewModel(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.domain.sw.service.GameUseCase game) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<ar.edu.unlam.mobile.scaffold.ui.screens.GameUIState> getUiState() {
        return null;
    }
    
    public final void getNewGame() {
    }
    
    public final void validateGame(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame optionGame, @org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option selectedOption) {
    }
    
    private final void saveGameResult(java.lang.String result) {
    }
    
    public final boolean getNavigateToScreen1() {
        return false;
    }
    
    public final void onNavigateToScreen1() {
    }
    
    public final void onNavigationHandled() {
    }
}