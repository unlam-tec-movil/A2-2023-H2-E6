package ar.edu.unlam.mobile.scaffold.ui.screens;

import ar.edu.unlam.mobile.scaffold.domain.sw.service.GameUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class OptionGameViewModel_Factory implements Factory<OptionGameViewModel> {
  private final Provider<GameUseCase> gameProvider;

  public OptionGameViewModel_Factory(Provider<GameUseCase> gameProvider) {
    this.gameProvider = gameProvider;
  }

  @Override
  public OptionGameViewModel get() {
    return newInstance(gameProvider.get());
  }

  public static OptionGameViewModel_Factory create(Provider<GameUseCase> gameProvider) {
    return new OptionGameViewModel_Factory(gameProvider);
  }

  public static OptionGameViewModel newInstance(GameUseCase game) {
    return new OptionGameViewModel(game);
  }
}
