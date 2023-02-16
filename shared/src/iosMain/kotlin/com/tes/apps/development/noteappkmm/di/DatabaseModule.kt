package com.tes.apps.development.noteappkmm.di

import com.tes.apps.development.noteappkmm.data.local.DatabaseDriverFactory
import com.tes.apps.development.noteappkmm.data.note.SqlDelightNoteDataSourceImpl
import com.tes.apps.development.noteappkmm.database.NoteDatabase
import com.tes.apps.development.noteappkmm.domain.note.NoteDataSource

class DatabaseModule {
    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource: NoteDataSource by lazy { SqlDelightNoteDataSourceImpl(NoteDatabase(factory.createDriver()))}
}