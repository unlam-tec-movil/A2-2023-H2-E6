package ar.edu.unlam.mobile.scaffold.data.sw.repository;

import ar.edu.unlam.mobile.scaffold.data.sw.network.PlanetNetworkRepository;
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
public final class PlanetDefaultRepository_Factory implements Factory<PlanetDefaultRepository> {
  private final Provider<PlanetNetworkRepository> planetRepoProvider;

  public PlanetDefaultRepository_Factory(Provider<PlanetNetworkRepository> planetRepoProvider) {
    this.planetRepoProvider = planetRepoProvider;
  }

  @Override
  public PlanetDefaultRepository get() {
    return newInstance(planetRepoProvider.get());
  }

  public static PlanetDefaultRepository_Factory create(
      Provider<PlanetNetworkRepository> planetRepoProvider) {
    return new PlanetDefaultRepository_Factory(planetRepoProvider);
  }

  public static PlanetDefaultRepository newInstance(PlanetNetworkRepository planetRepo) {
    return new PlanetDefaultRepository(planetRepo);
  }
}
