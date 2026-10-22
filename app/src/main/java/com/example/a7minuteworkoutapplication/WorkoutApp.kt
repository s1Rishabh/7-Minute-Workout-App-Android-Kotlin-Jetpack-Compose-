package com.example.a7minuteworkoutapplication

import android.app.Application

class WorkoutApp:Application()
{
    val db by lazy {
        HistoryDataBase.getInstance(this)
    }
}