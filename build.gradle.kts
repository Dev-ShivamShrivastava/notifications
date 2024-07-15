// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    //hilt
    alias(libs.plugins.hilt) apply false
    //Kotlin Symbol Processing (KSP
    alias(libs.plugins.ksp) apply false
}