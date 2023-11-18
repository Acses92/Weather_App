import ProjectConfig.dep
import ru.kravchenkoAnatoly.weatherApp.Dependencies
import ru.kravchenkoAnatoly.weatherApp.Modules

plugins {
    id(ProjectConfig.PluginsIds.android)
    id(ProjectConfig.PluginsIds.kotlin)
    id(ProjectConfig.PluginsIds.kapt)
    id(ProjectConfig.PluginsIds.hilt)
}

android {
    namespace = ProjectConfig.namespace()
    compileSdk = ProjectConfig.ConfigData.compileSdk

    defaultConfig {
        applicationId = ProjectConfig.applicationId
        minSdk = ProjectConfig.ConfigData.androidMinSdk
        targetSdk = ProjectConfig.ConfigData.androidTargetSdk
        versionCode = ProjectConfig.ConfigData.versionCode
        versionName = ProjectConfig.ConfigData.versionName

        testInstrumentationRunner = ProjectConfig.testRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ProjectConfig.ProGuardSettings.androidOptimize),
                ProjectConfig.ProGuardSettings.rules
            )
        }
    }
    compileOptions {
        sourceCompatibility = ProjectConfig.javaVersion
        targetCompatibility = ProjectConfig.javaVersion
    }
    kotlinOptions {
        jvmTarget = ProjectConfig.javaVersion.toString()
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(dep(Modules.Common.root)))
    implementation(project(dep(Modules.Feature.detailScreenFeature)))
    implementation(project(dep(Modules.Feature.mainScreenFeature)))
    implementation(project(dep(Modules.Feature.settingsScreenFeature)))
    implementation(project(dep(Modules.Data.weatherData)))
    implementation(project(dep(Modules.Data.root)))


    //core
    implementation(Dependencies.AndroidX.androidCore)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.viewModel)
    implementation(Dependencies.Core.coroutineCore)

    //ui
    implementation(Dependencies.UI.material)
    implementation(Dependencies.UI.constraintLayout)

    //navigation
    implementation(Dependencies.Navigation.navigationFragment)
    implementation(Dependencies.Navigation.navigationUi)

    //retrofit
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.converterMoshi)
    implementation(Dependencies.Debuging.okhttpLoging)

    //hilt
    implementation(Dependencies.Hilt.hiltAndroid)
    //implementation(project(mapOf("path" to ":feature:mainScreenFeature")))
    kapt(Dependencies.Hilt.hiltCompiler)

    //room
    implementation(Dependencies.Room.runtime)

    implementation(Dependencies.Debuging.timber)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.jUnitExt)
    androidTestImplementation(Dependencies.Test.espresso)
}