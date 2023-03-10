object Versions {
    const val KOTLIN_VERSION = "1.5.0"
    const val KOTLINX_COROUTINES = "1.5.0"
    const val BUILD_GRADLE = "4.2.1"
    const val COMPILE_SDK_VERSION = 33
    const val BUILD_TOOLS_VERSION = "30.0.3"
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 33

    const val CORE_KTX = "1.9.0"
    const val APP_COMPAT = "1.6.0"
    const val ACTIVITY_KTX = "1.2.3"
    const val FRAGMENT_KTX = "1.3.4"
    const val LIFECYCLE_KTX = "2.3.1"
    const val ROOM = "2.5.0"
    const val NAVIGATION="2.5.3"

    const val HILT_NAVIGATION_FRAGMENT="1.0.0"
    const val HILT = "2.44"
    const val MATERIAL = "1.7.0"

    const val RETROFIT = "2.9.0"
    const val OKHTTP = "4.3.1"
    const val RETROFIT_COROUTINES_ADAPTER="1.0.0"

    const val JUNIT = "4.13.2"
    const val ANDROID_JUNIT = "1.1.5"
    const val ESPRESSO_CORE = "3.5.1"
}

object Kotlin {
    const val KOTLIN_STDLIB      = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}"
    const val COROUTINES_CORE    = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.KOTLINX_COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.KOTLINX_COROUTINES}"
}

object AndroidX {
    const val CORE_KTX                = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val APP_COMPAT              = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"

    const val ACTIVITY_KTX            = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
    const val FRAGMENT_KTX            = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

    const val LIFECYCLE_VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
    const val LIFECYCLE_LIVEDATA_KTX  = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_KTX}"

    const val ROOM_RUNTIME            = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_COMPILER           = "androidx.room:room-compiler:${Versions.ROOM}"

    // To use Kotlin annotation processing tool (kapt)
    const val ROOM_KAPT ="androidx.room:room-compiler:${Versions.ROOM}"
    // To use Kotlin Symbol Processing (KSP)
    const val ROOM_KSP ="androidx.room:room-compiler:${Versions.ROOM}"

    const val NAVIGATION_FRAGMENT     = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI          = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
}

object Google {
    const val HILT_ANDROID          = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val KAPT_HILT_ANDROID_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    const val HILT_NAVIGATION_FRAGMENT = "androidx.hilt:hilt-navigation-fragment:${Versions.HILT_NAVIGATION_FRAGMENT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
}

object Libraries {
    const val RETROFIT                   = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER_GSON    = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val RETROFIT_COROUTINES_ADAPTER="com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:${Versions.RETROFIT_COROUTINES_ADAPTER}"
    const val OKHTTP                     = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
}

object Junit {
    const val JUNIT         = "junit:junit:${Versions.JUNIT}"
}

object AndroidTest {
    const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}