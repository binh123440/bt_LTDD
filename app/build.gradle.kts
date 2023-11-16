plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.ltdd_lehabinh"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ltdd_lehabinh"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    configurations.all {
        resolutionStrategy {
            force ("com.android.support:appcompat-v7:27.0.2")
            force ("com.android.support:support-v4:27.0.2")
            force ("com.android.support:appcompat-v7:27.0.2")
            force ("com.android.support:cardview-v7:27.0.2")
            force ("com.android.support:design:27.0.2")
        }
    }
    implementation("com.squareup.okio:okio:3.1.0")
    implementation("com.squareup.moshi:moshi:1.13.0")
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


}