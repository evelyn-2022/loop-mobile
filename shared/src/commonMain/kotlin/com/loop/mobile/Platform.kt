package com.loop.mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform