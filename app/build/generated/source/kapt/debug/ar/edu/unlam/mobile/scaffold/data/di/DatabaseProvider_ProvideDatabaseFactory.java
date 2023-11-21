package ar.edu.unlam.mobile.scaffold.data.di;

import android.content.Context;
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DatabaseProvider_ProvideDatabaseFactory implements Factory<SwDatabase> {
  private final DatabaseProvider module;

  private final Provider<Context> contextProvider;

  public DatabaseProvider_ProvideDatabaseFactory(DatabaseProvider module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SwDatabase get() {
    return provideDatabase(module, contextProvider.get());
  }

  public static DatabaseProvider_ProvideDatabaseFactory create(DatabaseProvider module,
      Provider<Context> contextProvider) {
    return new DatabaseProvider_ProvideDatabaseFactory(module, contextProvider);
  }

  public static SwDatabase provideDatabase(DatabaseProvider instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideDatabase(context));
  }
}
