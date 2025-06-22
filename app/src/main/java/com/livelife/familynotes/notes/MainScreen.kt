package com.livelife.familynotes.notes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.livelife.familynotes.NewNotes
import com.livelife.familynotes.Routes

@Composable
fun MainScreen(navController: NavController) {
        Column( modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Here comes the list")
        Button(
            onClick = {navController.navigate(Routes.ScreenNewNote("John")) }
        ) {
            Text("Click Me")
        }
    }
}