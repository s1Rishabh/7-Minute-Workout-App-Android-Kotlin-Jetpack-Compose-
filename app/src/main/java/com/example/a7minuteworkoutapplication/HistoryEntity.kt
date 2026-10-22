package com.example.a7minuteworkoutapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "History_Table")
class HistoryEntity (
    @PrimaryKey
    val date:String
)