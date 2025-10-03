plugins {
   id("java")
   id("org.springframework.boot") version "3.5.6"
}

group = "tlgrm"
version = "1.0-SNAPSHOT"

repositories {
   mavenCentral()
}

dependencies {
   implementation("org.springframework.boot:spring-boot-starter-web")
   implementation("com.openai:openai-java:3.6.0")
   implementation("net.fellbaum:jemoji:1.7.5")

   testImplementation(platform("org.junit:junit-bom:5.10.0"))
   testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
   useJUnitPlatform()
}

apply(plugin = "io.spring.dependency-management")