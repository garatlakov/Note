package com.example.note.domain.use_case

import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetNotes @Inject constructor(
    private val repository: NoteRepository
) {
    operator fun invoke(): Flow<List<Note>>{
        return repository.getNotes()
    }
}