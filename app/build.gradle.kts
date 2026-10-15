plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.streetlegends"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.example.streetlegends"
        minSdk = 23
        //noinspection OldTargetApi
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    //noinspection GradleDependency
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}
