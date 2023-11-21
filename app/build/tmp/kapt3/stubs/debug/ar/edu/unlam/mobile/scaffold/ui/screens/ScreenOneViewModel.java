package ar.edu.unlam.mobile.scaffold.ui.screens;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lar/edu/unlam/mobile/scaffold/ui/screens/ScreenOneViewModel;", "Landroidx/lifecycle/ViewModel;", "screenOne", "Lar/edu/unlam/mobile/scaffold/ui/screens/ScreenOneViewModel$ScreenOne;", "(Lar/edu/unlam/mobile/scaffold/ui/screens/ScreenOneViewModel$ScreenOne;)V", "getScreenOne", "()Lar/edu/unlam/mobile/scaffold/ui/screens/ScreenOneViewModel$ScreenOne;", "ScreenOne", "app_debug"})
public final class ScreenOneViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final ar.edu.unlam.mobile.scaffold.ui.screens.ScreenOneViewModel.ScreenOne screenOne = null;
    
    @javax.inject.Inject
    public ScreenOneViewModel(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.ui.screens.ScreenOneViewModel.ScreenOne screenOne) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ar.edu.unlam.mobile.scaffold.ui.screens.ScreenOneViewModel.ScreenOne getScreenOne() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lar/edu/unlam/mobile/scaffold/ui/screens/ScreenOneViewModel$ScreenOne;", "", "()V", "ScreenOneModule", "app_debug"})
    public static final class ScreenOne {
        
        public ScreenOne() {
            super();
        }
        
        @dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lar/edu/unlam/mobile/scaffold/ui/screens/ScreenOneViewModel$ScreenOne$ScreenOneModule;", "", "()V", "provideScreenOne", "Lar/edu/unlam/mobile/scaffold/ui/screens/ScreenOneViewModel$ScreenOne;", "app_debug"})
        @dagger.Module
        public static final class ScreenOneModule {
            @org.jetbrains.annotations.NotNull
            public static final ar.edu.unlam.mobile.scaffold.ui.screens.ScreenOneViewModel.ScreenOne.ScreenOneModule INSTANCE = null;
            
            private ScreenOneModule() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @dagger.Provides
            public final ar.edu.unlam.mobile.scaffold.ui.screens.ScreenOneViewModel.ScreenOne provideScreenOne() {
                return null;
            }
        }
    }
}