package com.example.note.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.note.domain.model.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class NoteViewModel@Inject constructor
    (private val noteUseCases: NoteUseCases): ViewModel() {

        private val _state = mutableStateOf(NotesState())
        val state : State<NotesState> = _state

        init {
            getNotes()
        }

        fun onEvent(event: NoteEvents){
            when(event){
                is NoteEvents.DeleteNote -> {
                    viewModelScope.launch {
                        noteUseCases.deleteNote(event.note)
                    }
                }
                is NoteEvents.UpsertNote -> {
                    viewModelScope.launch {
                        noteUseCases.upsertNotes(event.note)
                    }
                }
                is NoteEvents.ToggleNoteStatus -> {
                    viewModelScope.launch {
                        noteUseCases.upsertNotes(
                            event.note.copy(isCompleted = !event.note.isCompleted)
                        )
                    }
                }
            }
        }

    private fun getNotes(){
        viewModelScope.launch {
            noteUseCases.getNotes().collect{
                _state.value = state.value.copy(
                    notes = it
                )
            }
        }
    }
}