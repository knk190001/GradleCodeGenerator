plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "1.2.0"
}

repositories{
    mavenCentral()
}

dependencies{
    api("org.jetbrains.kotlin","kotlin-gradle-plugin","1.8.10")
    api(project(":plugin-common"))
}

//pluginBundle{
//    website = "https://github.com/knk190001/GradleCodeGenerator"
//    vcsUrl = "https://github.com/knk190001/GradleCodeGenerator"
//    tags = listOf("generator")
//}

gradlePlugin{
    website.set("https://github.com/knk190001/GradleCodeGenerator")
    vcsUrl.set("https://github.com/knk190001/GradleCodeGenerator")
    plugins{
        create("gradle-code-generator"){
            id = "com.github.knk190001.gradle-code-generator-kotlin"
            displayName = "Gradle kotlin code generator plugin"
            description = "Gradle plugin for auto-generating kotlin code"
            implementationClass = "io.heartpattern.gcg.plugin.kotlin.GradleCodeGeneratorKotlinPlugin"
        }
    }
}