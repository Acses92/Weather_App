import ProjectConfig.dep
import ru.kravchenkoAnatoly.weatherApp.Dependencies
import ru.kravchenkoAnatoly.weatherApp.Modules

plugins {
    id(ProjectConfig.PluginsIds.androidLibrary)
    id(ProjectConfig.PluginsIds.kotlin)
    id(ProjectConfig.PluginsIds.hilt)
    id(ProjectConfig.PluginsIds.kapt)
}

android {    namespace = ProjectConfig.namespace()
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
    implementation(project(dep(Modules.Common.commonaAndroid)))
    implementation(project(dep(Modules.Common.commonJava)))

    implementation(Dependencies.AndroidX.androidCore)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.UI.material)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.jUnitExt)
    androidTestImplementation(Dependencies.Test.espresso)
    implementation(Dependencies.Hilt.hiltAndroid)
    kapt(Dependencies.Hilt.hiltCompiler)
}