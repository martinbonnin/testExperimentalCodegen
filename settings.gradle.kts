rootProject.name = "testAndroidCompileOnly"

pluginManagement {
    repositories {
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        //mavenLocal()
        google()
        jcenter()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlinx-serialization") {
                useModule("org.jetbrains.kotlin:kotlin-serialization:${requested.version}")
            }
            if (requested.id.id == "com.apollographql.apollo") {
                useModule("com.apollographql.apollo:apollo-gradle-plugin-kotlin:${requested.version}")
            }
            if (requested.id.id == "com.apollographql.android") {
                useModule("com.apollographql.apollo:apollo-gradle-plugin:${requested.version}")
            }
        }
    }
}
