package com.example.valueclassissue

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

public actual fun getPlatform(): Platform = IOSPlatform()