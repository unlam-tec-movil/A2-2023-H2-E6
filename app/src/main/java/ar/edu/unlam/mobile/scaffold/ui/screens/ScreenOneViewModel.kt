package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@HiltViewModel
class ScreenOneViewModel @Inject constructor(val screenOne: ScreenOne) : ViewModel() {
    class ScreenOne {
        @Module
        @InstallIn(SingletonComponent::class)
        object ScreenOneModule {
            @Provides
            fun provideScreenOne(): ScreenOne {
                return ScreenOne()
            }
        }
    }
}
