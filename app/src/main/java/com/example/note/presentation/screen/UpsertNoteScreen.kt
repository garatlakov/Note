package com.example.note.presentation.screen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.note.domain.model.Note

@Composable
fun UpsertNoteScreen(){

}

@Composable
fun UpsertNoteContext(modifier: Modifier = Modifier, note: Note){
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        OutlinedTextField(
            value = note.name,
            onValueChange = { },
            modifier = modifier.fillMaxWidth(),
            label = { }
        )
        Spacer(
            modifier = modifier.size(10.dp)
        )
        OutlinedTextField(
            value = note.description,
            onValueChange = { },
            modifier = modifier.fillMaxHeight(),
            label = { }
        )
    }
}

@Composable
@Preview(showBackground = true)
fun UpsertNoteScreenPreview() {
    UpsertNoteContext(
        modifier = Modifier,
        note = Note(
            name = "Тест",
            description = "Това е тест, най готиния тест в света на тестовете.",
            id = 1
        )
    )
}