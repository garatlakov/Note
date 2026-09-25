package com.example.note.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.note.domain.model.Note
import com.example.note.presentation.views.NoteItemView

@Composable
fun NotesScreen(
    notes: List<Note>,
    onNoteClick: () -> Unit,
    onToggleStatus: () -> Unit
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(items = notes) { note ->
            NoteItemView(
                note = note,
                onToggleStatus = onToggleStatus,
                onNoteClick = onNoteClick)

        }
    }
}

@Composable
@Preview(showBackground = true)
fun NotesScreenPreview(){
    NotesScreen(
        notes = listOf(Note(
            name = "Да нахраня Лени",
            description = "Трябва да я храня всеки ден в 8.",
            id = 1),
            Note(
                name = "Да измия банята",
                description = "Трябва да я мия всеки ден",
                id = 2),
            Note(
                name = "Програмиране",
                description = "Това се прави по 10 часа на ден",
                id = 3),
            Note(
                name = "Разходка на гората",
                description = "Трябва да има спорт в тоя живот",
                id = 4)
            ),
        onNoteClick = {},
        onToggleStatus = {})
}