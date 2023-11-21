package ar.edu.unlam.mobile.scaffold.data.kitty.di;

import ar.edu.unlam.mobile.scaffold.data.kitty.network.KittyAPI;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class KittyDataProvider_ProvideKittyAPIFactory implements Factory<KittyAPI> {
  private final Provider<Gson> gsonProvider;

  public KittyDataProvider_ProvideKittyAPIFactory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public KittyAPI get() {
    return provideKittyAPI(gsonProvider.get());
  }

  public static KittyDataProvider_ProvideKittyAPIFactory create(Provider<Gson> gsonProvider) {
    return new KittyDataProvider_ProvideKittyAPIFactory(gsonProvider);
  }

  public static KittyAPI provideKittyAPI(Gson gson) {
    return Preconditions.checkNotNullFromProvides(KittyDataProvider.INSTANCE.provideKittyAPI(gson));
  }
}
