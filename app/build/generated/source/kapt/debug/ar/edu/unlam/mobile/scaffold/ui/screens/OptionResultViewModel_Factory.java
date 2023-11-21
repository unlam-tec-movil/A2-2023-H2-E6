package ar.edu.unlam.mobile.scaffold.ui.screens;

import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase;
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
public final class OptionResultViewModel_Factory implements Factory<OptionResultViewModel> {
  private final Provider<SwDatabase> databaseProvider;

  public OptionResultViewModel_Factory(Provider<SwDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public OptionResultViewModel get() {
    return newInstance(databaseProvider.get());
  }

  public static OptionResultViewModel_Factory create(Provider<SwDatabase> databaseProvider) {
    return new OptionResultViewModel_Factory(databaseProvider);
  }

  public static OptionResultViewModel newInstance(SwDatabase database) {
    return new OptionResultViewModel(database);
  }
}
