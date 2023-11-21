package ar.edu.unlam.mobile.scaffold.ui.screens;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ScreenOneViewModel_ScreenOne_ScreenOneModule_ProvideScreenOneFactory implements Factory<ScreenOneViewModel.ScreenOne> {
  @Override
  public ScreenOneViewModel.ScreenOne get() {
    return provideScreenOne();
  }

  public static ScreenOneViewModel_ScreenOne_ScreenOneModule_ProvideScreenOneFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ScreenOneViewModel.ScreenOne provideScreenOne() {
    return Preconditions.checkNotNullFromProvides(ScreenOneViewModel.ScreenOne.ScreenOneModule.INSTANCE.provideScreenOne());
  }

  private static final class InstanceHolder {
    private static final ScreenOneViewModel_ScreenOne_ScreenOneModule_ProvideScreenOneFactory INSTANCE = new ScreenOneViewModel_ScreenOne_ScreenOneModule_ProvideScreenOneFactory();
  }
}
