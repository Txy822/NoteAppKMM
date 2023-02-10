package com.tes.apps.development.noteappkmm

import database.NoteEntity

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}