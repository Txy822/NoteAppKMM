package com.tes.apps.development.noteappkmm.android.note_list

import com.tes.apps.development.noteappkmm.domain.note.Note

data class NoteListState(
    val notes:List<Note> = emptyList(),
    val searchText :String = "",
    val isSearchActive: Boolean = false
)
