package com.livelife.familynotes.settings

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.livelife.familynotes.Routes

fun NavGraphBuilder.settingsNavGraph(navController: NavHostController) {
        composable<Routes.ScreenSettings> {
            SettingsScreen(navController)
        }
}