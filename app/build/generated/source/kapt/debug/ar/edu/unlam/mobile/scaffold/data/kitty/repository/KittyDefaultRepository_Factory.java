package ar.edu.unlam.mobile.scaffold.data.kitty.repository;

import ar.edu.unlam.mobile.scaffold.data.kitty.network.KittyNetworkRepository;
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
public final class KittyDefaultRepository_Factory implements Factory<KittyDefaultRepository> {
  private final Provider<KittyNetworkRepository> networkRepositoryProvider;

  public KittyDefaultRepository_Factory(
      Provider<KittyNetworkRepository> networkRepositoryProvider) {
    this.networkRepositoryProvider = networkRepositoryProvider;
  }

  @Override
  public KittyDefaultRepository get() {
    return newInstance(networkRepositoryProvider.get());
  }

  public static KittyDefaultRepository_Factory create(
      Provider<KittyNetworkRepository> networkRepositoryProvider) {
    return new KittyDefaultRepository_Factory(networkRepositoryProvider);
  }

  public static KittyDefaultRepository newInstance(KittyNetworkRepository networkRepository) {
    return new KittyDefaultRepository(networkRepository);
  }
}
