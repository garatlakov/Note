package com.example.note.domain.use_case

import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository

class UpsertNotes(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.upsertNote(note)
    }
}