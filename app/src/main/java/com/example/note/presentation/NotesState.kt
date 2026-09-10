package com.example.note.presentation

import com.example.note.domain.model.Note

data class NotesState(
    val notes: List<Note> = emptyList()
)
