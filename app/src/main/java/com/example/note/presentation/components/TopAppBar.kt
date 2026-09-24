package com.example.note.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.note.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteTopAppBar(onNavigationIconClick:  () -> Unit,
              onSaveNoteClick: () -> Unit){
    TopAppBar(
        title = {
        },
        modifier = Modifier
            .background(MaterialTheme.colorScheme.onTertiary),
        navigationIcon = {
            IconButton(
                onClick = onNavigationIconClick
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back64),
                    contentDescription = "Back"
                )
            }
        },
        actions = {
            IconButton(
                onClick = onSaveNoteClick){
                    Image(
                        painter = painterResource(id = R.drawable.check),
                        contentDescription = "Save"
                    )
                }
        }

    )
}

@Composable
@Preview(showBackground = true)
fun NoteTopAppBarPreview() {
    NoteTopAppBar(onNavigationIconClick = {},
        onSaveNoteClick = {})
}
