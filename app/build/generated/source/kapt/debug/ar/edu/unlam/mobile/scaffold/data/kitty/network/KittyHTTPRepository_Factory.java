package ar.edu.unlam.mobile.scaffold.data.kitty.network;

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
public final class KittyHTTPRepository_Factory implements Factory<KittyHTTPRepository> {
  private final Provider<KittyAPI> apiProvider;

  public KittyHTTPRepository_Factory(Provider<KittyAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public KittyHTTPRepository get() {
    return newInstance(apiProvider.get());
  }

  public static KittyHTTPRepository_Factory create(Provider<KittyAPI> apiProvider) {
    return new KittyHTTPRepository_Factory(apiProvider);
  }

  public static KittyHTTPRepository newInstance(KittyAPI api) {
    return new KittyHTTPRepository(api);
  }
}
