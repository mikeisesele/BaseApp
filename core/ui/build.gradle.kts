import utils.composeConfiguration
import utils.providetestDependencies

plugins {
    `core-module-config`
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.nb.benefitspro.core.ui"
    testFixtures {
        enable = true
    }
    composeConfiguration(libs.versions.compose.compiler)
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:base"))
    implementation(project(":core:testing"))
    implementation(libs.hilt.android)
    implementation(libs.compose.material3)
    implementation(libs.google.material)

    api(libs.hilt.navigation.compose)
    kapt(libs.hilt.android.compiler)

    api(libs.compose.activity)
    api(libs.compose.material)
    api(libs.compose.ui)
    api(libs.compose.foundation.layout)
    api(libs.compose.foundation)

    api(libs.compose.ui.tooling.preview)
    debugApi(libs.compose.ui.tooling)

    api(libs.coil.compose)
    api(libs.coil.svg)

    providetestDependencies(libs)
}
