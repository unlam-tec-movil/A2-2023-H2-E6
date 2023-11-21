package ar.edu.unlam.mobile.scaffold.domain.sw.service;

import ar.edu.unlam.mobile.scaffold.data.game.repository.RawDataRepository;
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
public final class OptionGameBuilder_Factory implements Factory<OptionGameBuilder> {
  private final Provider<RawDataRepository> rawDataRepoProvider;

  public OptionGameBuilder_Factory(Provider<RawDataRepository> rawDataRepoProvider) {
    this.rawDataRepoProvider = rawDataRepoProvider;
  }

  @Override
  public OptionGameBuilder get() {
    return newInstance(rawDataRepoProvider.get());
  }

  public static OptionGameBuilder_Factory create(Provider<RawDataRepository> rawDataRepoProvider) {
    return new OptionGameBuilder_Factory(rawDataRepoProvider);
  }

  public static OptionGameBuilder newInstance(RawDataRepository rawDataRepo) {
    return new OptionGameBuilder(rawDataRepo);
  }
}
