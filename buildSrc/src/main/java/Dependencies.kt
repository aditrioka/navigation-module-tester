object ApplicationId {
    val id = "id.aditrioka.navigationmodule"
}

object Modules {
    val app = ":app"

    val navigation = ":navigation"

    val screenOne = ":screenone"
    val screenTwo = ":screentwo"
    val screenThree = ":screenthree"
}

object Libraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
}

object SupportLibraries {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
}

object GoogleLibraries {
    val playCore = "com.google.android.play:core:${Versions.playCore}"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"
}

object Versions {
    val gradle = "3.2.1"

    val compileSdk = 28
    val minSdk = 21
    val targetSdk = 28

    val appcompat = "1.0.2"

    val playCore = "1.3.6"

    val kotlin = "1.3.11"
}