package com.example.note.domain.use_case

import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository
import jakarta.inject.Inject

class DeleteNote @Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}