# 7 Minute Workout App (Android, Kotlin)

A simple 7-minute workout app for Android. It guides you through a set of bodyweight exercises with timers and voice cues, saves your workout history, and includes a BMI calculator.

## Screenshots

<p align="center">
  <img src="Screenshot_20260316_134959_7%20Minute%20Workout%20Application.jpg" width="180" />
  <img src="Screenshot_20260316_135005_7%20Minute%20Workout%20Application.jpg" width="180" />
  <img src="Screenshot_20260316_135019_7%20Minute%20Workout%20Application.jpg" width="180" />
  <img src="Screenshot_20260316_135054_7%20Minute%20Workout%20Application.jpg" width="180" />
  <img src="Screenshot_20260316_135114_7%20Minute%20Workout%20Application.jpg" width="180" />
</p>

## Features

- ⏱️ **Workout timer**: 10-second rest before each exercise, then a 30-second exercise timer with a circular progress bar
- 🏋️ **Exercise list**: bodyweight exercises, each with a name and image
- 🔊 **Voice cues**: Text-to-Speech announces the next exercise
- 📈 **Workout history**: completed workouts are saved with their date in a local database
- ⚖️ **BMI calculator**: supports Metric (kg / cm) and US (lbs / feet + inches) units, with a BMI category and short advice
- ✅ **Works offline**: no internet connection needed

## Tech Stack

- **Language:** Kotlin
- **UI:** XML layouts, View Binding, Material Components
- **Database:** Room (Entity, DAO, Database) with Kotlin Coroutines and Flow
- **Timers:** CountDownTimer
- **Voice:** Android Text-to-Speech
- **Navigation:** Multiple Activities with Intents and a Toolbar back button

## How to Run

1. Clone the repository:
```bash
   git clone https://github.com/s1Rishabh/7-Minute-Workout-App-Android-Kotlin-Jetpack-Compose-.git
```
2. Open the project in Android Studio.
3. Let Gradle sync.
4. Run the app on an emulator or a real device (Android 7.0, API 24 or higher).

## What I Learned

- Building screens with XML layouts and accessing views with View Binding
- Managing timers and cancelling them correctly in the Activity lifecycle
- Saving and reading data with Room, Coroutines and Flow
- Using Text-to-Speech in an Android app
- Debugging crashes with Logcat and fixing Gradle and dependency version issues
