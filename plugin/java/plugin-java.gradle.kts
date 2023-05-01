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
        create("gradle-code-generator-java"){
            id = "com.github.knk190001.gradle-code-generator-java"
            displayName = "Gradle java code generator plugin"
            description = "Gradle plugin for auto-generating java code"
            implementationClass = "io.heartpattern.gcg.plugin.java.GradleCodeGeneratorJavaPlugin"
        }
    }
}