package com.example.vidyarthibus.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = Blue40,
    secondary = Cyan40,
    tertiary = BlueGrey40
)

private val DarkColors = darkColorScheme(
    primary = Blue80,
    secondary = Cyan80,
    tertiary = BlueGrey80
)

@Composable
fun VidyarthiBusTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}