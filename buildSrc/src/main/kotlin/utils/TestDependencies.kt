package utils

import gradle.kotlin.dsl.accessors._e8ac5e837605381d1e3b56097e86cd58.implementation
import gradle.kotlin.dsl.accessors._e8ac5e837605381d1e3b56097e86cd58.testImplementation
import gradle.kotlin.dsl.accessors._e8ac5e837605381d1e3b56097e86cd58.testRuntimeOnly
import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.DependencyHandlerScope



fun DependencyHandlerScope.providetestDependencies(libs: LibrariesForLibs) {
    with(this) {
        testImplementation(libs.junit)
        testRuntimeOnly(libs.junit.engine)
        testImplementation(libs.turbine)
        testImplementation(libs.mockk)
        testImplementation(libs.androidx.core.testing)
        testImplementation(libs.coroutines.test)
        testImplementation(libs.kotest.assertions)
        implementation(libs.androidx.junit.ktx)
    }
}