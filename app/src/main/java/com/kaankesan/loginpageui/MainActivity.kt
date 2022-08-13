package com.kaankesan.loginpageui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kaankesan.loginpageui.ui.theme.BackgroundColor
import com.kaankesan.loginpageui.ui.theme.ButtonColor
import com.kaankesan.loginpageui.ui.theme.LoginPageUITheme
import com.kaankesan.loginpageui.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginPageUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackgroundColor()
                ) {
                    LoginUI()
                }
            }
        }
    }
}

@Composable
fun LoginUI() {
    val context = LocalContext.current
    val text1 = remember{ mutableStateOf("")}
    val text2 = remember{ mutableStateOf("")}

    Column(
        
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        
    ) {
        Image(painter = painterResource(id = R.drawable.ic_baseline_align_horizontal_center_24),
            contentDescription = "",Modifier.size(80.dp))
        TextField(
            value = text1.value,
            onValueChange = { text1.value = it },
            label = { Text(text = "Username")},
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = ButtonColor(),
                textColor = Purple500
            )
        )

        TextField(
            value = text2.value,
            onValueChange = { text2.value = it },
            label = { Text(text = "Password")},
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = ButtonColor(),
                textColor = Purple500
            )
        )
        Button(onClick = {
            Toast.makeText(context,"Signed in",Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Sign in")
        }

    }
}

