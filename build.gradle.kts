plugins {
    `java-gradle-plugin`
}



gradlePlugin {
    plugins {
        create("simplePlugin") {
            id = "trust-all"
            implementationClass = "fi.arteme.trustall.TrustAllPlugin"
        }
    }
}
