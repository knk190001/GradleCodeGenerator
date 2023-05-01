plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "1.2.0"
}

repositories{
    mavenCentral()
}

dependencies{
    implementation("org.reflections:reflections:0.9.12")
    implementation(project(":api-common"))
    api(gradleApi())
}


//
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
            id = "com.github.knk190001.gradle-code-generator-common"
            displayName = "Gradle code generator plugin"
            description = "Gradle plugin for auto-generating code"
            implementationClass = "io.heartpattern.gcg.plugin.common.GradleCodeGeneratorCommonPlugin"
        }
    }
}