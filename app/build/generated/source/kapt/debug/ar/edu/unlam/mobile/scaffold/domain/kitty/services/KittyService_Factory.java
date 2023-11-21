package ar.edu.unlam.mobile.scaffold.domain.kitty.services;

import ar.edu.unlam.mobile.scaffold.data.kitty.repository.KittyRepository;
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
public final class KittyService_Factory implements Factory<KittyService> {
  private final Provider<KittyRepository> repositoryProvider;

  public KittyService_Factory(Provider<KittyRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public KittyService get() {
    return newInstance(repositoryProvider.get());
  }

  public static KittyService_Factory create(Provider<KittyRepository> repositoryProvider) {
    return new KittyService_Factory(repositoryProvider);
  }

  public static KittyService newInstance(KittyRepository repository) {
    return new KittyService(repository);
  }
}
