plugins {
    war
    id("org.gretty") version "3.0.3"
}

repositories {
    jcenter()
}

dependencies {
    providedCompile("javax.servlet:javax.servlet-api:4.0.1") 
    testImplementation("junit:junit:4.12")
}