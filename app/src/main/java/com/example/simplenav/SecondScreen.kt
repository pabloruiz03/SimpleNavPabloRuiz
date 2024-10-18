package com.example.simplenav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, word:  String){





    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        Text(text = "word in uppercase : ${word.uppercase()}")


        Button(onClick = {
            navController.navigate("Start")
        }) {
            Text(text = "Click here for Start Screen ")
        }

        Button(onClick = {
            navController.navigate("ThirdScreen/"+word)
        }) {
            Text(text = "Click here for Third Screen")
        }
    }
}

