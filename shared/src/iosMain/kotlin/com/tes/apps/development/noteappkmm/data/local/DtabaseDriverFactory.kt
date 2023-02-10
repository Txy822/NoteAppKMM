package com.tes.apps.development.noteappkmm.data.local

import com.squareup.sqldelight.db.SqlDriver
import com.tes.apps.development.noteappkmm.database.NoteDatabase
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(NoteDatabase.Schema, "note.db")
    }
}