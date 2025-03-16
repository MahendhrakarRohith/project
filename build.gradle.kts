// project-level build.gradle.kts

plugins {

    alias(libs.plugins.android.application) apply false

    id("com.android.library") version "8.1.0" apply false
    // Other plugins if necessary
}

buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.3.15")
        classpath("com.android.tools.build:gradle:8.0.0")
    // Firebase services classpath
    }
}

allprojects {
    // Remove the repositories block from here as it is already configured in settings.gradle.kts
}
