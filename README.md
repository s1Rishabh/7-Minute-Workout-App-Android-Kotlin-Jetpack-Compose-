# 7-Minute-Workout-App-Android

A focused 7-minute workout app with interval timer, curated exercises, spoken/audio cues, and workout history. Built with a unidirectional data flow and ViewModel-backed state for a snappy, resilient UI.

Features

⏱️ Interval timer (work/rest cycles, total session time)

🧱 Preloaded exercise set (bodyweight) with images/animations

🔁 Customizable rounds and rest lengths

🔊 Optional voice/TTS and vibration cues

📈 Workout history with stats (sessions, streaks, total time)

🌚 Light/Dark theme, Material 3

✅ Works offline

Tech Stack

UI: Jetpack Compose, Material 3

State: ViewModel + Kotlin Flows/StateFlow

Navigation: androidx.navigation.compose

Persistence: Room (history)

DI: Hilt

Utilities: Kotlin Coroutines, WorkManager (reminders/notifications)

Architecture

Presentation: Composables + ViewModels (UDF)

Domain: Use cases for timer control, history, and exercise catalog

Data: Repositories (Room + in-memory exercise provider)
