package com.example.navigation_test.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.navigation_test.presentation.screens.MainScreen
import com.example.navigation_test.presentation.theme.Navigation_testTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation_testTheme {
                MainScreen()
            }
        }
    }
}

