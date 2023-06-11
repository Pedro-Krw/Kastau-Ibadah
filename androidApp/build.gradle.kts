plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
}

android {
    namespace = "com.pacepdro.kastauibadah.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.pacepdro.kastauibadah.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.ui:ui-tooling:1.4.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
    implementation("androidx.compose.foundation:foundation:1.4.3")
    implementation("androidx.compose.material:material:1.4.3")
    implementation("androidx.activity:activity-compose:1.7.1")

// Ex library
    //    Constraint layout
    implementation ("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    // Kotlin
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.1")

    // Jetpack Compose Integration
    implementation("androidx.navigation:navigation-compose:2.5.1")

//    web view
    implementation ("androidx.webkit:webkit:1.4.0")
// Image Slider
    implementation ("io.coil-kt:coil-compose:1.4.0")


    // Paging Compose
    implementation ("com.google.accompanist:accompanist-pager:0.13.0")
    implementation ("com.google.accompanist:accompanist-pager-indicators:0.13.0")




}