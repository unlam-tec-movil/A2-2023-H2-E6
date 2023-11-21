package ar.edu.unlam.mobile.scaffold.domain.sw.service;

import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository;
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
public final class OptioGameBuilder_Factory implements Factory<OptioGameBuilder> {
  private final Provider<GameResultRepository> resultREpoProvider;

  public OptioGameBuilder_Factory(Provider<GameResultRepository> resultREpoProvider) {
    this.resultREpoProvider = resultREpoProvider;
  }

  @Override
  public OptioGameBuilder get() {
    return newInstance(resultREpoProvider.get());
  }

  public static OptioGameBuilder_Factory create(Provider<GameResultRepository> resultREpoProvider) {
    return new OptioGameBuilder_Factory(resultREpoProvider);
  }

  public static OptioGameBuilder newInstance(GameResultRepository resultREpo) {
    return new OptioGameBuilder(resultREpo);
  }
}
