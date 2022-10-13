plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 33

    defaultConfig {
        namespace = "com.github.fengdai.compose.androidview.issue"
        minSdk = 23
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }

    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=$buildDir/compose",
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=$buildDir/compose"
        )
    }

    val samples by signingConfigs.creating {
        storeFile(file("../samples.keystore"))
        storePassword("javascript")
        keyAlias("javascript")
        keyPassword("javascript")
    }

    buildTypes {
        val debug by getting {
            signingConfig = samples
        }
        val release by getting {
            signingConfig = samples
        }
    }
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material3)
    implementation("androidx.core:core:1.9.0")
}
