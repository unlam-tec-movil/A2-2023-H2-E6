package ar.edu.unlam.mobile.scaffold.ui.screens;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lar/edu/unlam/mobile/scaffold/ui/screens/OptionResultViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lar/edu/unlam/mobile/scaffold/core/database/SwDatabase;", "(Lar/edu/unlam/mobile/scaffold/core/database/SwDatabase;)V", "_gameResults", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lar/edu/unlam/mobile/scaffold/data/result/local/entity/GameResultEntity;", "_navigateToScreen1", "Landroidx/compose/runtime/MutableState;", "", "gameResults", "getGameResults", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "navigateToScreen1", "getNavigateToScreen1", "()Z", "loadGameResults", "", "onNavigateToScreen1", "onNavigationHandled", "app_debug"})
public final class OptionResultViewModel extends androidx.lifecycle.ViewModel {
    private final ar.edu.unlam.mobile.scaffold.core.database.SwDatabase database = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity>> _gameResults = null;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _navigateToScreen1 = null;
    
    @javax.inject.Inject
    public OptionResultViewModel(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.core.database.SwDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity>> getGameResults() {
        return null;
    }
    
    private final void loadGameResults() {
    }
    
    public final boolean getNavigateToScreen1() {
        return false;
    }
    
    public final void onNavigateToScreen1() {
    }
    
    public final void onNavigationHandled() {
    }
}