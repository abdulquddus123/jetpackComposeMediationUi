package com.example.mediation_ui_jetpack

import com.example.mediation_ui_jetpack.HomeScreen
import com.example.mediation_ui_jetpack.ui.theme.MeditationUIYouTubeTheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent




class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIYouTubeTheme {
                HomeScreen()
            }
        }
    }
}

