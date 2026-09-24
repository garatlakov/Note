package com.example.note.presentation.screen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.note.domain.model.Note
import com.example.note.presentation.components.NoteTopAppBar

@Composable
fun UpsertNoteScreen(
    note: Note,
    onNavigationIconClick:  () -> Unit,
    onSaveNoteClick: () -> Unit
){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { NoteTopAppBar(
            onSaveNoteClick = onSaveNoteClick,
            onNavigationIconClick = onNavigationIconClick
        ) }
    ) {
            innerPadding -> UpsertNoteContext(
                modifier = Modifier.padding(innerPadding),
                note = note
            )
    }
}

@Composable
fun UpsertNoteContext(modifier: Modifier = Modifier, note: Note){
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        OutlinedTextField(
            value = note.name,
            onValueChange = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            label = { }
        )

        OutlinedTextField(
            value = note.description,
            onValueChange = { },
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(5.dp),
            label = { }
        )
    }
}

@Composable
@Preview(showBackground = true)
fun UpsertNoteScreenPreview() {
    UpsertNoteScreen(
        note = Note(
            name = "Тест",
            description = "Това е тест, най готиния тест в света на тестовете.",
            id = 1
        ),
        onSaveNoteClick = {},
        onNavigationIconClick = {}
    )
}