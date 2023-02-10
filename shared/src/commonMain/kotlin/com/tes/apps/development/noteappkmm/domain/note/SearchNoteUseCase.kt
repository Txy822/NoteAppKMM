package com.tes.apps.development.noteappkmm.domain.note

import com.tes.apps.development.noteappkmm.domain.time.DateTimeUtil

class SearchNoteUseCase {
    fun execute(notes: List<Note>, query: String): List<Note> {
        if(query.isBlank()) {
            return notes
        }
        return notes.filter {
            it.title.trim().lowercase().contains(query.lowercase()) ||
                    it.content.trim().lowercase().contains(query.lowercase())
        }.sortedBy {
            DateTimeUtil.toEpochMills(it.created)
        }
    }
}