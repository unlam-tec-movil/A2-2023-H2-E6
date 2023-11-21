package ar.edu.unlam.mobile.scaffold.data.game.repository;

import ar.edu.unlam.mobile.scaffold.data.sw.repository.PlanetRepository;
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
public final class PlanetPopulationRawDataRepository_Factory implements Factory<PlanetPopulationRawDataRepository> {
  private final Provider<PlanetRepository> planetRepositoryProvider;

  public PlanetPopulationRawDataRepository_Factory(
      Provider<PlanetRepository> planetRepositoryProvider) {
    this.planetRepositoryProvider = planetRepositoryProvider;
  }

  @Override
  public PlanetPopulationRawDataRepository get() {
    return newInstance(planetRepositoryProvider.get());
  }

  public static PlanetPopulationRawDataRepository_Factory create(
      Provider<PlanetRepository> planetRepositoryProvider) {
    return new PlanetPopulationRawDataRepository_Factory(planetRepositoryProvider);
  }

  public static PlanetPopulationRawDataRepository newInstance(PlanetRepository planetRepository) {
    return new PlanetPopulationRawDataRepository(planetRepository);
  }
}
