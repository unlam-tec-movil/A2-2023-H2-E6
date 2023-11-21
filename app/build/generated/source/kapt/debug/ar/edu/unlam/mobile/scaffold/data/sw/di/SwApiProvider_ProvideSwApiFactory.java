package ar.edu.unlam.mobile.scaffold.data.sw.di;

import ar.edu.unlam.mobile.scaffold.data.sw.network.SwApi;
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
public final class SwApiProvider_ProvideSwApiFactory implements Factory<SwApi> {
  private final Provider<Gson> gsonProvider;

  public SwApiProvider_ProvideSwApiFactory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public SwApi get() {
    return provideSwApi(gsonProvider.get());
  }

  public static SwApiProvider_ProvideSwApiFactory create(Provider<Gson> gsonProvider) {
    return new SwApiProvider_ProvideSwApiFactory(gsonProvider);
  }

  public static SwApi provideSwApi(Gson gson) {
    return Preconditions.checkNotNullFromProvides(SwApiProvider.INSTANCE.provideSwApi(gson));
  }
}
