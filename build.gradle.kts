buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20-RC")
        classpath("com.android.tools.build:gradle:7.4.1")
        classpath("com.google.android.gms:oss-licenses-plugin:0.10.6")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
