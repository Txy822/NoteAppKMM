package com.tes.apps.development.noteappkmm.domain

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime

data class Note(
    val id:Long?,
    val title:String,
    val content:String,
    val colorHex:Long,
    val created:LocalDateTime
)
