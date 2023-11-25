import ru.kravchenkoAnatoly.weatherApp.Dependencies

plugins {
    id(ProjectConfig.PluginsIds.androidLibrary)
    id(ProjectConfig.PluginsIds.kotlin)
    id(ProjectConfig.PluginsIds.kapt)
    id(ProjectConfig.PluginsIds.hilt)
}

android {
    namespace = ProjectConfig.namespace()
    compileSdk = ProjectConfig.ConfigData.compileSdk

    defaultConfig {
        minSdk = ProjectConfig.ConfigData.androidMinSdk

        testInstrumentationRunner = ProjectConfig.testRunner
        //consumerProguardFiles(ProjectConfig.ProGuardSettings.consumerRules)
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(ProjectConfig.ProGuardSettings.androidOptimize),
                ProjectConfig.ProGuardSettings.rules)
        }
    }
    compileOptions {
        sourceCompatibility = ProjectConfig.javaVersion
        targetCompatibility = ProjectConfig.javaVersion
    }
    kotlinOptions {
        jvmTarget = ProjectConfig.javaVersion.toString()
    }
}

dependencies {

    //core
    implementation(Dependencies.AndroidX.androidCore)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.UI.material)

    //retrofit
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.converterMoshi)
    implementation(Dependencies.Debuging.okhttpLoging)

    //hilt
    implementation(Dependencies.Hilt.hiltAndroid)
    kapt(Dependencies.Hilt.hiltCompiler)

    //room
    implementation(Dependencies.Room.runtime)
    implementation(Dependencies.Room.ktx)
    kapt(Dependencies.Room.compiler)

    //moshi
    implementation(Dependencies.Moshi.moshi)
    implementation(Dependencies.Moshi.moshiAdapters)
    implementation(Dependencies.Moshi.moshiKotlin)
    kapt(Dependencies.Moshi.moshiCodegen)

    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.jUnitExt)
    androidTestImplementation(Dependencies.Test.espresso)
}