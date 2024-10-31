// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    id("androidx.navigation.safeargs.kotlin") version "2.8.3" apply false

    kotlin("jvm") version "2.0.21"
    kotlin("plugin.serialization") version "2.0.21"

    id("app.cash.sqldelight") version "2.0.2"
}

sqldelight {
    databases {
        create("AppDatabase") {
            packageName.set("com.emirs.geminihackhaton")
        }
    }
}