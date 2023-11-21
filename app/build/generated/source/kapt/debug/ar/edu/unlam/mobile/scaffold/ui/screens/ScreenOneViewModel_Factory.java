package ar.edu.unlam.mobile.scaffold.ui.screens;

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
public final class ScreenOneViewModel_Factory implements Factory<ScreenOneViewModel> {
  private final Provider<ScreenOneViewModel.ScreenOne> screenOneProvider;

  public ScreenOneViewModel_Factory(Provider<ScreenOneViewModel.ScreenOne> screenOneProvider) {
    this.screenOneProvider = screenOneProvider;
  }

  @Override
  public ScreenOneViewModel get() {
    return newInstance(screenOneProvider.get());
  }

  public static ScreenOneViewModel_Factory create(
      Provider<ScreenOneViewModel.ScreenOne> screenOneProvider) {
    return new ScreenOneViewModel_Factory(screenOneProvider);
  }

  public static ScreenOneViewModel newInstance(ScreenOneViewModel.ScreenOne screenOne) {
    return new ScreenOneViewModel(screenOne);
  }
}
