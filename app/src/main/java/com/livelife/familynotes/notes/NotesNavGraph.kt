package com.livelife.familynotes.notes

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.livelife.familynotes.Routes

fun NavGraphBuilder.notesNavGraph(navController: NavHostController) {
        composable<Routes.ScreenNotes>() {
            MainScreen(navController)
        }

        composable<Routes.ScreenDetails> {
            NotesDetailScreen(navController)
        }
}