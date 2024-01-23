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
        maven {
            url = uri("https://api.xposed.info/")
        }
        mavenCentral()
    }
}

rootProject.name = "SekiraXposed"
include(":app")
 