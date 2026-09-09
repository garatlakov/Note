package com.example.note.di

import android.content.Context
import androidx.room.Room
import com.example.note.data.data_source.NoteDb
import com.example.note.data.data_source.repository.NoteRepositoryImpl
import com.example.note.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(/* ...value = */ SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): NoteDb{
        return Room.databaseBuilder(
            context = context,
            klass = NoteDb::class.java,
            name = NoteDb.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteDao(db: NoteDb) = db.noteDao()

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDb): NoteRepository{
        return NoteRepositoryImpl(db.noteDao())
    }
}