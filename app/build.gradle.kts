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
    implementation(project(dep(Modules.Root.app)))
    implementation(project(dep(Modules.Root.data)))
    implementation(project(dep(Modules.Root.domain)))
    implementation(project(dep(Modules.Common.commonJava)))
    implementation(project(dep(Modules.Common.commonaAndroid)))
    implementation(project(dep(Modules.Presentation.detailFragment)))
    implementation(project(dep(Modules.Presentation.mainFragment)))
    implementation(project(dep(Modules.Presentation.settingsFragment)))

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

    //debugging
    implementation(Dependencies.Hilt.hiltAndroid)
    kapt(Dependencies.Hilt.hiltCompiler)

    //room
    implementation(Dependencies.Room.runtime)

    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.jUnitExt)
    androidTestImplementation(Dependencies.Test.espresso)
}