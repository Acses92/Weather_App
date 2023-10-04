pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Weather App"
include(":app")
include(":domain")
include(":data")
include(":common:common-android")
include(":common:common-java")
include(":presentation:mainFragment")
include(":presentation:detailFragment")
include(":presentation:settingFragment")
