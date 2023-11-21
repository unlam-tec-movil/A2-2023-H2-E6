package ar.edu.unlam.mobile.scaffold.data.sw.network;

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
public final class PlanetRetrofitRepository_Factory implements Factory<PlanetRetrofitRepository> {
  private final Provider<SwApi> apiProvider;

  public PlanetRetrofitRepository_Factory(Provider<SwApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public PlanetRetrofitRepository get() {
    return newInstance(apiProvider.get());
  }

  public static PlanetRetrofitRepository_Factory create(Provider<SwApi> apiProvider) {
    return new PlanetRetrofitRepository_Factory(apiProvider);
  }

  public static PlanetRetrofitRepository newInstance(SwApi api) {
    return new PlanetRetrofitRepository(api);
  }
}
