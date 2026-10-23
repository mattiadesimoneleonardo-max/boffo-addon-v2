plugins {
    id("fabric-loom") version "1.14-SNAPSHOT"
}

base {
    archivesName = "boffo-addon"
    version = "1.1.0"
    group = "com.boffo"
}

repositories {
    maven("https://maven.meteordev.org/releases") { name = "meteor-maven" }
    maven("https://maven.meteordev.org/snapshots") { name = "meteor-maven-snapshots" }
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.11")
    mappings("net.fabricmc:yarn:1.21.11+build.3:v2")
    modImplementation("net.fabricmc:fabric-loader:0.18.2")
    modImplementation("meteordevelopment:meteor-client:1.21.11-SNAPSHOT")
}

tasks {
    processResources {
        val props = mapOf(
            "version" to project.version,
            "mc_version" to "1.21.11"
        )
        inputs.properties(props)
        filteringCharset = "UTF-8"
        filesMatching("fabric.mod.json") { expand(props) }
    }

    withType<JavaCompile> {
        options.release = 21
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
