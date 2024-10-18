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
fun ThirddScreen(navController: NavController, word:  String){
    fun countVowels(text: String): Int {
        val vowels = "aeiouAEIOU"
        return text.count { it in vowels }
    }
    var vowels = countVowels(word);
    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center,

        ) {

        Text(text = "$word number of vowels : $vowels")


        Button(onClick = {
            navController.navigate("Start")
        }) {
            Text(text = "Click here for Start Screen ")
        }

        Button(onClick = {
            navController.navigate("SecondScreen/"+word)
        }) {
            Text(text = "Click here for the Second Screen")

        }
    }
}

