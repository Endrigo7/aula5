plugins {
    kotlin("jvm") version "1.5.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation("io.mockk:mockk:1.10.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
