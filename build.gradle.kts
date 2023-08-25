// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
    id("de.jensklingenberg.ktorfit") version "1.0.0" apply false
    kotlin("plugin.serialization") version "1.8.21" apply false
    id("com.google.protobuf") version "0.9.3" apply false
}