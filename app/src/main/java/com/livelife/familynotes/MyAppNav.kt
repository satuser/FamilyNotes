package com.livelife.familynotes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.livelife.familynotes.newnote.newNoteNavGraph
import com.livelife.familynotes.notes.notesNavGraph
import com.livelife.familynotes.settings.settingsNavGraph
import kotlinx.serialization.Serializable

@Serializable
data class NewNotes(val name:String?)



@Composable
fun MyAppNav() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Routes.ScreenGroupNotes) {
        navigation<Routes.ScreenGroupNotes>(startDestination = Routes.ScreenNotes) {
            notesNavGraph(navController = navController)
        }

        navigation<Routes.ScreenGroupSettings>(startDestination = Routes.ScreenSettings) {
            settingsNavGraph(navController = navController)
        }

        navigation<Routes.ScreenGroupNewNote>(startDestination = Routes.ScreenNewNote(name = "") ) {
            newNoteNavGraph(navController = navController)
        }


    }
}



