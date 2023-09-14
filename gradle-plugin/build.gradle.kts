plugins {
    java
    `java-gradle-plugin`
    `maven-publish`
    alias(deps.plugins.lombok)
}

dependencies {
    compileOnly(deps.android.gradle)
    compileOnly(gradleApi())
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

gradlePlugin {
    plugins {
        create("golang") {
            id = "com.github.kr328.gradle.golang"
            implementationClass = "com.github.kr328.gradle.golang.ProjectPlugin"
        }
    }
}