package com.example.valueclassissue

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform