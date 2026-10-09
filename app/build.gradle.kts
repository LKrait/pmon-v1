plugins { id("com.android.application") }
android { namespace="com.sergec.drivemonitor"; compileSdk=36
 defaultConfig { applicationId="com.sergec.drivemonitor"; minSdk=26; targetSdk=36; versionCode=1; versionName="1.0"; buildConfigField("String","DRIVE_API_URL","\"https://example.com/api/drive/latest/\"") }
 buildFeatures { buildConfig=true }
 compileOptions { sourceCompatibility=JavaVersion.VERSION_17; targetCompatibility=JavaVersion.VERSION_17 }
}
