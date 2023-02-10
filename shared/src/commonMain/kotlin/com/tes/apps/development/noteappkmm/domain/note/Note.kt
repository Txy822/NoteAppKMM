package com.tes.apps.development.noteappkmm.domain.note

import BabyBlueHex
import LightGreenHex
import RedOrangeHex
import RedPinkHex
import VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id:Long?,
    val title:String,
    val content:String,
    val colorHex:Long,
    val created:LocalDateTime
)
{
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor()= colors.random()
    }
}
