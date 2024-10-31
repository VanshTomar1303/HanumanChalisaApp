package com.vansh.hanumanchalisa

import kotlinx.serialization.Serializable

interface Screens {
    @Serializable
    data object HanumanSundarkand: Screens

    @Serializable
    data object HanumanChalisha: Screens

    @Serializable
    data object HanumanBahuk: Screens

    @Serializable
    data object HanumanAsthak: Screens

    @Serializable
    data object BajrangBaan: Screens

    @Serializable
    data object NavScreen: Screens
}