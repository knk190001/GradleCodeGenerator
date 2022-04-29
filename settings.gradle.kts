rootProject.name = "gradle-code-generator"

// API
include(
    "api-common",
    "api-kotlin",
    "api-java"
)

// Plugin
include(
    "plugin-common",
    "plugin-java",
    "plugin-kotlin"
)

rootProject.children.forEach{subProject->
    subProject.buildFileName = "${subProject.name}.gradle.kts"
    subProject.projectDir = file(subProject.name.replace('-','/'))
}

pluginManagement{
    repositories{
        mavenLocal()
        gradlePluginPortal()
    }
}