package com.github.fengdai.compose.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row {
                val fontSize = 48.sp
                val modifier = Modifier.border(1.dp, Color.Blue)
                Text(text = "Function", modifier, fontSize = fontSize)
                Text(text = "功能", modifier, fontSize = fontSize)
                Text(text = "機能", modifier, fontSize = fontSize)
            }
        }
    }
}
