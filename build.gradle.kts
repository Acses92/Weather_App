// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(ProjectConfig.PluginsIds.android) version ProjectConfig.PluginsVersion.androidGradleVersion apply false
    id(ProjectConfig.PluginsIds.kotlin) version ProjectConfig.PluginsVersion.kotlinVersion apply false
    id(ProjectConfig.PluginsIds.kotlinJvm) version ProjectConfig.PluginsVersion.kotlinVersion apply false
    id(ProjectConfig.PluginsIds.androidLibrary) version ProjectConfig.PluginsVersion.androidGradleVersion apply false
    id(ProjectConfig.PluginsIds.hilt) version ProjectConfig.PluginsVersion.hiltVersion apply false
}