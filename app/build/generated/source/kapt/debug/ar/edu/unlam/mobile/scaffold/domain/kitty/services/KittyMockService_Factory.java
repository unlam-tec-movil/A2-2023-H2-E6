package ar.edu.unlam.mobile.scaffold.domain.kitty.services;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class KittyMockService_Factory implements Factory<KittyMockService> {
  @Override
  public KittyMockService get() {
    return newInstance();
  }

  public static KittyMockService_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static KittyMockService newInstance() {
    return new KittyMockService();
  }

  private static final class InstanceHolder {
    private static final KittyMockService_Factory INSTANCE = new KittyMockService_Factory();
  }
}
