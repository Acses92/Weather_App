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
include(":common")
include(":data")
include(":feature:mainScreenFeature")
include(":feature:detailScreenFeature")
include(":feature:settingScreenFeature")
include(":data:weatherData")

