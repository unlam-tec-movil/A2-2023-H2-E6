package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@HiltViewModel
class SecondScreenViewModel @Inject constructor() : ViewModel() {
    // Propiedades y lógica del ViewModel
}

@Module
@InstallIn(SingletonComponent::class)
object SecondScreenModule {
    @Provides
    @ViewModelScoped
    fun provideSecondScreenViewModel(viewModel: SecondScreenViewModel): ViewModel {
        return viewModel
    }
}
