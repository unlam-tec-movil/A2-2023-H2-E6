package ar.edu.unlam.mobile.scaffold.data.result.repository;

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
public final class GameResultDefaultRepository_Factory implements Factory<GameResultDefaultRepository> {
  private final Provider<SwDatabase> databaseProvider;

  public GameResultDefaultRepository_Factory(Provider<SwDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public GameResultDefaultRepository get() {
    return newInstance(databaseProvider.get());
  }

  public static GameResultDefaultRepository_Factory create(Provider<SwDatabase> databaseProvider) {
    return new GameResultDefaultRepository_Factory(databaseProvider);
  }

  public static GameResultDefaultRepository newInstance(SwDatabase database) {
    return new GameResultDefaultRepository(database);
  }
}
