import utils.providetestDependencies

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    `app-module-config`
    alias(libs.plugins.hilt.plugin)
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.diffplug.spotless")
    id("io.gitlab.arturbosch.detekt")
}

dependencies {

    implementation(project(":core:ui"))
    implementation(project(":core:securestore"))
    testImplementation(project(":core:testing"))

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.compose.activity)
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.core.splashscreen)
    implementation(libs.google.material)
    implementation(libs.compose.navigation)

    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)

    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)

    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)

    providetestDependencies(libs)
    detektPlugins(libs.detekt.formatter)
}
