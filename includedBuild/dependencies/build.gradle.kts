plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

// To make it available as direct dependency
group = "com.badoo.reaktive.dependencies"
version = "SNAPSHOT"

repositories {
    jcenter()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
}

gradlePlugin {
    plugins.register("dependencies") {
        id = "dependencies"
        implementationClass = "com.badoo.reaktive.dependencies.DependenciesPlugin"
    }
}
