package com.example.note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDb: RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object{
        const val DATABASE_NAME = "note_db"
    }
}
