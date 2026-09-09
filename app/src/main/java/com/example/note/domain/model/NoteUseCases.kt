package com.example.note.domain.model

import com.example.note.domain.use_case.DeleteNote
import com.example.note.domain.use_case.GetNote
import com.example.note.domain.use_case.GetNotes
import com.example.note.domain.use_case.UpsertNotes

data class NoteUseCases(
    val getNote: GetNote,
    val getNotes: GetNotes,
    val upsertNotes: UpsertNotes,
    val deleteNote: DeleteNote
)
