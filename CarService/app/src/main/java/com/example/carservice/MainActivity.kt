package com.example.carservice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carservice.ui.theme.CarServiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarServiceTheme {
        Greeting("Android")
    }
}

@Composable
fun App()
{
    var counts = remember{
        listOf(mutableStateOf<Int>(50),mutableStateOf<Int>(13),mutableStateOf<Int>(18))
    }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(Modifier.height(50.dp))
        Text("Автосалон", fontSize = 30.sp)
        Row (
            Modifier
                .fillMaxHeight(0.3f)
                .fillMaxWidth()
                .padding(30.dp)
                .border(2.dp, Color.Black)
        )
        {
            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Lada", fontSize = 20.sp)
                Text("Стоимость 10000", fontSize = 20.sp)
            }
            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ){
                Text("Количество\nв наличии - " + counts[0].value, fontSize = 20.sp)
                Button(onClick = {counts[0].value -= 1}, ) {
                    Text("Купить")
                }
            }
        }
        Row(
            Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .padding(30.dp)
                .border(2.dp, Color.Black)
        ){
            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Toyota", fontSize = 22.sp)
                Text("Стоимость\n35000", fontSize = 22.sp)
            }
            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Количество\nв наличии - " + counts[1].value, fontSize = 20.sp)
                Button(onClick = {counts[1].value -= 1}, ) {
                    Text("Купить")
                }
            }
        }
        Row(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(30.dp)
                .border(2.dp, Color.Black)
        ) {
            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Mercedez", fontSize = 22.sp)
                Text("Стоимость\n50000", fontSize = 22.sp)
            }
            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Количество\nв наличии - " + counts[2].value, fontSize = 20.sp)
                Button(onClick = {counts[2].value -= 1}, ) {
                    Text("Купить")
                }
            }
        }
    }
}