plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.kotlinCocoapods).apply(false)
    alias(libs.plugins.hilt).apply(false)
    alias(libs.plugins.ksp).apply(false)
    alias(libs.plugins.googleServices).apply(false)
    alias(libs.plugins.kapt) apply false
}