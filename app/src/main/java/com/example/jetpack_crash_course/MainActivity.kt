package com.example.jetpack_crash_course

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.jetpack_crash_course.ui.theme.Jetpack_crash_courseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        HakunaMatata("Hoodlab")
        }
    }
}


@Composable
fun HakunaMatata(name: String){
    Text(
        text = "$name Hakuna Matata",
        fontWeight = FontWeight.Bold,
        color = Color.Green,
        fontSize = 20.sp,
        modifier = Modifier.padding(20.dp)
    )
}


@Preview(showBackground = true)
@Composable

fun PrevHakunaMatata(){
    HakunaMatata("HoodLab")
}
//darel
//        darel
//        irashitsa dan nolwen