plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.nullx.tr4s"
    // GANTI KE 36 KARENA PLUGIN LU MINTA SDK TINGGI, STUPID!
    compileSdk = 36
    ndkVersion = "27.0.12077973"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        freeCompilerArgs += "-Xskip-metadata-version-check"
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.nullx.tr4s"
        // Minimal SDK 23 udah bener buat Android 6.0+
        minSdk = 23                         
        // TARGET JUGA NAIKKIN KE 36 BIAR GAK ERROR PAS BUILD, JERRR!
        targetSdk = 36
        
        versionCode = flutter.versionCode ?: 1
        // TADI DI SINI ILANG NAMANYA, STUPID! SEKARANG UDAH GACOR:
        versionName = flutter.versionName ?: "1.0" ?: "1.0.0"
    }

    buildTypes {
        release {
            // Pakai debug key dulu biar 'flutter build apk' gak ribet tanda tangan
            signingConfig = signingConfigs.getByName("debug")
            
            // Tambahin ini biar APK lu lebih ramping & sakti
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }
}

flutter {
    source = "../.."
}
