rootProject.name = "golang-android-plugin"

include("gradle-plugin")

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {
            val agp = "8.1.1"
            val lombok = "6.4.1"

            library("android-gradle", "com.android.tools.build:gradle:$agp")
            plugin("lombok", "io.freefair.lombok").version(lombok)
        }
    }
}
