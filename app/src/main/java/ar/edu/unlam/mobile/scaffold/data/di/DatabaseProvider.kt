package ar.edu.unlam.mobile.scaffold.data.di

import android.content.Context
import androidx.room.Room
import ar.edu.unlam.mobile.scaffold.core.database.SwDatabase
import ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseProvider {

    @Provides
    @Singleton
    fun provideResultDao(database: SwDatabase): ResultDao = database.resultDao()

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): SwDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            SwDatabase::class.java,
            "sw_database",
        ).build()
    }
}

