package com.example.valueclassissue

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

public actual fun getPlatform(): Platform = AndroidPlatform()