plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlinx.serialization)
}

android {
    namespace = "com.myaxa.core.coin"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.javax.inject)
    implementation(libs.bundles.ktor)
    implementation(libs.bundles.room)

    runtimeOnly(libs.androidx.annotation)

    implementation(projects.core.network)
    implementation(projects.core.database)
}
