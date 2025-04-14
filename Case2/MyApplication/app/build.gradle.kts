plugins {
    alias(libs.plugins.android.application)
    id("pl.droidsonroids.pitest") version "0.2.20"
    id("jacoco")
    id("info.solidsoft.pitest") version "1.15.0"

}

tasks.withType<JavaExec> {
    jvmArgs("-Duser.language=en", "-Duser.country=US")
}
tasks.withType<Test> {
    jvmArgs("-Duser.language=en", "-Duser.country=US")
}
android {
    namespace = "com.example.myapplication"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"


    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            enableUnitTestCoverage = true
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    testOptions {
        unitTests {
            all {
                it.jvmArgs("-Duser.language=en", "-Duser.country=US")
            }
        }
    }
}



pitest {
    targetClasses.set(listOf("com.example.myapplication.Datehelper"))
    targetTests.set(listOf("com.example.myapplication.*"))
    pitestVersion.set("1.15.0")
    outputFormats.set(setOf("HTML", "XML"))
    reportDir.set(file("$buildDir/reports/pitest"))

}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
   
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.0")
    testImplementation(libs.mockito.core)
    androidTestImplementation(libs.mockito.android)
    testImplementation(libs.mockito.junit.jupiter)
}



tasks.register<JacocoReport>("jacocoTestReport") {
    dependsOn("testDebugUnitTest")

    val fileFilter = listOf(
        "**/R.class",
        "**/R$*.class",
        "**/BuildConfig.*",
        "**/Manifest*.*",
        "**/*Test*.*",
        "android/**/*.*"
    )

    val debugTree = fileTree("${buildDir}/intermediates/javac/debug/compileDebugJavaWithJavac/classes/com/example/myapplication") {
        exclude(fileFilter)
    }



    classDirectories.setFrom(files(debugTree))

    sourceDirectories.setFrom(files("src/main/java"))

    executionData.setFrom(fileTree(buildDir).include("outputs/unit_test_code_coverage/debugUnitTest/testDebugUnitTest.exec"))

    reports {
        xml.required.set(true)
        html.required.set(true)
        csv.required.set(false)

        html.outputLocation.set(layout.buildDirectory.dir("reports/jacoco"))
    }
}