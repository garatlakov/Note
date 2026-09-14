package com.example.note.presentation

import com.example.note.domain.model.Note

sealed class NoteEvents {
    data class DeleteNote(val note: Note): NoteEvents()
    data class UpsertNote(val note: Note): NoteEvents()
    data class ToggleNoteStatus(val note: Note): NoteEvents()
}