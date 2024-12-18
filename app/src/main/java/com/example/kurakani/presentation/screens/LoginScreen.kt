package com.example.kurakani.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun LoginInScreen(modifier: Modifier = Modifier.statusBarsPadding()) {
    Text(text = "LOGIN SCREEN",modifier=modifier.background(Color.Gray).fillMaxSize())
}