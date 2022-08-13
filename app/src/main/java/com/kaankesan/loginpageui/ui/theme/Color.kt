package com.kaankesan.loginpageui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple500 = Color(0xFF6200EE)

val red = Color(0xFFE57373)
val blue = Color(0xFF4FC3F7)
val black = Color(0xFFFFF176)

@Composable
fun ButtonColor():Color{
    return if(isSystemInDarkTheme()){
        blue
    }else{
        red
    }
}


@Composable
fun BackgroundColor():Color{
    return if(isSystemInDarkTheme()){
        Purple500
    }else{
        Purple500
    }
}



