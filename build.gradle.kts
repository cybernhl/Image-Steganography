plugins {
    java
    kotlin("jvm") version "2.0.0"
}

group = "com.github.issamemari"
version = "1.0-SNAPSHOT"

sourceSets {
    main {
        kotlin.srcDirs("src/main/java", "src/main/kotlin")
        resources.srcDirs("src/main/resources")
    }
    test {
        kotlin.srcDirs("src/test/kotlin")
        resources.srcDirs("src/test/resources")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

kotlin {
    jvmToolchain(8)
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.0")
    implementation("commons-io:commons-io:2.6")
    implementation("com.github.ajalt:clikt:1.3.0")

//TODO if  pure Java or kotlin project  auto-load "rt.jar"(Java 8) or "java.desktop:java.desktop" (Java 9)
//TODO 1.only jdk 1.8 !! 2. https://blog.csdn.net/weixin_44147584/article/details/115599699
//     implementation(files("C:\\Progra~1\\Android\\Android Studio\\jre\\jre\\lib\\rt.jar"))
//   implementation("java.desktop:java.desktop") //FIXME not work Java 9 rt move to "Java desktop"

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation(kotlin("test"))
}