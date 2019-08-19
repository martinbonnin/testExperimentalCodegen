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
            if (requested.id.id == "kotlin-android") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
            if (requested.id.id == "com.android.application") {
                useModule("com.android.tools.build:gradle:${requested.version}")
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
