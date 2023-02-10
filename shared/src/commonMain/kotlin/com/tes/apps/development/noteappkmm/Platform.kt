package com.tes.apps.development.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform