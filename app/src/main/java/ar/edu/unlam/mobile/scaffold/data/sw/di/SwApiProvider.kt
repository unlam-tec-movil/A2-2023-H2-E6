package ar.edu.unlam.mobile.scaffold.data.sw.di

import ar.edu.unlam.mobile.scaffold.data.sw.network.SwApi
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SwApiProvider {
    @Provides
    @Singleton
    fun provideSwApi(gson: Gson): SwApi {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl("https://swapi.dev/api/")
            .build()
        return retrofit.create(SwApi::class.java)
    }
}
