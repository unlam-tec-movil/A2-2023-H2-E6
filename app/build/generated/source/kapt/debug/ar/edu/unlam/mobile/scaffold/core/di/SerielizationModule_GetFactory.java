package ar.edu.unlam.mobile.scaffold.core.di;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class SerielizationModule_GetFactory implements Factory<Gson> {
  @Override
  public Gson get() {
    return proxyGet();
  }

  public static SerielizationModule_GetFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Gson proxyGet() {
    return Preconditions.checkNotNullFromProvides(SerielizationModule.INSTANCE.get());
  }

  private static final class InstanceHolder {
    private static final SerielizationModule_GetFactory INSTANCE = new SerielizationModule_GetFactory();
  }
}
