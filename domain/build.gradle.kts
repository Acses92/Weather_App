plugins {
    id(ProjectConfig.PluginsIds.javaLibrary)
    id(ProjectConfig.PluginsIds.kotlinJvm)
}

java {
    sourceCompatibility = ProjectConfig.javaVersion
    targetCompatibility = ProjectConfig.javaVersion
}