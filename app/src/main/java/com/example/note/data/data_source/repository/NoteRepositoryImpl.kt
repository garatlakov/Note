package com.example.note.data.data_source.repository

import com.example.note.data.data_source.NoteDao
import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl @Inject constructor(private val dao: NoteDao): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun upsertNote(note: Note) {
        dao.upsertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}