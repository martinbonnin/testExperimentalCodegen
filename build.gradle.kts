
plugins {
    application
    kotlin("jvm") version "1.3.31"
    id("com.apollographql.android") version "1.0.3-SNAPSHOT"
}

repositories {
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
    //mavenLocal()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("com.apollographql.apollo:apollo-runtime:1.0.3-SNAPSHOT")
    implementation("com.apollographql.apollo:apollo-coroutines-support:1.0.3-SNAPSHOT")

}

