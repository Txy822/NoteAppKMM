package com.tes.apps.development.noteappkmm.domain.time

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime

object DateTimeUtil {

    fun now(): LocalDateTime{
        return  Clock.System.now().toLocalDateTime(kotlinx.datetime.TimeZone.currentSystemDefault())
    }
    fun toEpochMills(dateTime: LocalDateTime):Long{
        return dateTime.toInstant(kotlinx.datetime.TimeZone.currentSystemDefault()).toEpochMilliseconds()
    }

    fun formatNoteDate(dateTime: LocalDateTime):String{
        val month =dateTime.month.name.lowercase().take(3).replaceFirstChar { it.toUpperCase() }
        val day = if(dateTime.dayOfMonth<10) "0${dateTime.dayOfMonth}" else dateTime.dayOfMonth
        val year = dateTime.year
        val hour= if(dateTime.hour<10) "0${dateTime.hour}" else dateTime.hour
        val minute= if(dateTime.minute<10) "0${dateTime.hour}" else dateTime.minute

        return buildString {
            append(month)
            append("")
            append(day)
            append("")
            append(year)
            append("")
            append(hour)
            append("")
            append(minute)
        }
    }

}