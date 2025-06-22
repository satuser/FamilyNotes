package com.livelife.familynotes.newnote

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.livelife.familynotes.Routes

fun NavGraphBuilder.newNoteNavGraph(navController: NavHostController) {

        composable<Routes.ScreenNewNote> { backstackHandler ->
            val name = backstackHandler.toRoute<Routes.ScreenNewNote>().name
            NewNoteScreen(name = name, navController = navController)
        }
}