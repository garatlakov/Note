package com.example.note.presentation.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.note.domain.model.Note

@Composable
fun NoteItemView(
    note: Note,
    onToggleStatus: () -> Unit,
    modifier: Modifier = Modifier,
    onNoteClick: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = note.isCompleted,
            onCheckedChange = { onToggleStatus() }
        )
        Text(
            modifier = Modifier
                .padding(start = 8.dp)
                .clickable(
                    onClick = onNoteClick
                ),
            text = note.name
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NoteItemPreview() {
    NoteItemView(
        note = Note(
            name = "Примерна бележка",
            description = "Описание",
            isCompleted = false,
            id = 0
        ),
        onToggleStatus = {},
        onNoteClick = {}
    )
}