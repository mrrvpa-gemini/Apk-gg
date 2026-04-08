plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.nullx.tr4s"
    compileSdk = 34

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
    }

    defaultConfig {
        applicationId = "com.nullx.tr4s"
        minSdk = 21
        targetSdk = 34
        versionCode = flutter.versionCode ?: 1
        versionName = flutter.versionName ?: "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
        freeCompilerArgs += "-Xskip-metadata-version-check"
    }
}

flutter {
    source = "../.."
}
