package com.example.jetpack_crash_course

import android.os.Bundle
import android.view.RoundedCorner
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import com.example.jetpack_crash_course.ui.theme.Jetpack_crash_courseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column {
//                for (i in 1..10){
//                    HakunaMatataContent()
//                }
//            }
//            LazyColumn {
//                items(10000){
//                    HakunaMatataContent()
//                }
//            }
//            LazyVerticalGrid(
//                columns = GridCells.Fixed(2)
//            ) {
//                items(10000){
//                    HakunaMatataContent()
//                }
//            }
            var task by remember {
                mutableStateOf("")
            }
            val taskList = remember {
                mutableStateListOf("")
            }
           Column {
               TaskItem(task = task, onTaskChange = {task = it}, onAddTaskItem = {
                   taskList.add(task)
               },)
               Divider()
               TaskItemList(taskList)
           }
//        HakunaMatata("Hoodlab")
        }
    }
}

@Composable
fun TaskItem(task: String, onTaskChange:(String)->Unit, onAddTaskItem:()->Unit){

    val context = LocalContext.current

    Column(){
        TextField(value = task, onValueChange = onTaskChange)
        Button(
            onClick = {
//            Toast.makeText(context, task, Toast.LENGTH_SHORT).show()
               onAddTaskItem()
        },
            enabled = task.isNotEmpty()
        ) {
            Text("Add")
        }
    }



}

@Composable
fun TaskItemList(items: List<String>){
    LazyColumn {
        items(items){ task ->
            Text(task)
            Spacer(Modifier.size(16.dp))
        }
    }
}


//@Composable
//fun HakunaMatataContent()
//{
//    Column(modifier = Modifier
//        .fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//
//    )
//    {
//        HakunaMatataImage()
//        HakunaMatataText("Hoodland")
//    }
//}

//@Composable
//fun HakunaMatataContent()
//{
//    Row(modifier = Modifier
//        .fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically
//
//    )
//    {
//        HakunaMatataImage()
//        Spacer(Modifier.size(20.dp))
//        HakunaMatataText("Hoodland")
//    }
//}

@Composable
fun HakunaMatataContent()
{
//    Box(modifier = Modifier
//        .fillMaxSize(),
//        contentAlignment = Alignment.Center
//
//    )
//    {
//        HakunaMatataImage()
//        Spacer(Modifier.size(20.dp))
//        HakunaMatataText("Hoodland", modifier = Modifier.align(Alignment.BottomEnd))
//    }


    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .background(color = Color.Blue.copy(alpha = .2f)),
        contentAlignment = Alignment.Center

    )
    {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            HakunaMatataImage()
            Spacer(Modifier.size(20.dp))
            HakunaMatataText("Hoodland")
        }
    }
}

@Composable 
fun HakunaMatataText(name: String, modifier: Modifier = Modifier){
    Text(
        text = "$name Hakuna Matata",
        fontWeight = FontWeight.Bold,
        color = Color.Green,
        fontSize = 20.sp,
    //        modifier = Modifier.padding(20.dp)
        modifier = modifier
    )
}

@Composable
fun HakunaMatataImage() {
    Image(
        painter = painterResource(R.drawable.hakuna_matata),
        contentDescription = "Hakuna Matata Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(56.dp)
            .padding(vertical = 8.dp)
            .clip(
                RoundedCornerShape(20)
            )


    )
}


@Preview(showBackground = true)
@Composable

fun PrevHakunaMatata(){
    HakunaMatataText("HoodLab")
}

@Preview(showBackground = true)
@Composable
fun PrevHakunaMatataImage(){
    HakunaMatataImage()
}

@Preview(showBackground = true)
@Composable
fun PrevHakunaMatataContent(){
    HakunaMatataContent()
}

@Preview(showBackground = true)
@Composable
fun PrevTaskItem(){
    TaskItem(
        task = "",
        {},{}
    )
}


//darel
//        darel
//        irashitsa dan nolwen