package com.example.note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "note"
)
data class Note(
    val name: String,
    val description: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int
)
