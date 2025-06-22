package com.livelife.familynotes

import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    object ScreenGroupNotes: Routes()

    @Serializable
    data object ScreenNotes: Routes()

    @Serializable
    data object ScreenDetails: Routes()

    @Serializable
    data object ScreenGroupNewNote: Routes()

    @Serializable
    data class ScreenNewNote(val name: String): Routes()

    @Serializable
    data object ScreenGroupSettings: Routes()

    @Serializable
    data object ScreenSettings:Routes()
}