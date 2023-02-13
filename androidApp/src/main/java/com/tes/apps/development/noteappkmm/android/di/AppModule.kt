package com.tes.apps.development.noteappkmm.android.di

import android.app.Application
import com.squareup.sqldelight.db.SqlDriver
import com.tes.apps.development.noteappkmm.data.local.DatabaseDriverFactory
import com.tes.apps.development.noteappkmm.data.note.SqlDelightNoteDataSourceImpl
import com.tes.apps.development.noteappkmm.database.NoteDatabase
import com.tes.apps.development.noteappkmm.domain.note.NoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSourceImpl(NoteDatabase(driver))
    }
}