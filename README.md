# Drive Monitor Android
Native Java dashboard targeting Android 16 / API 36. It generates random drive data every two seconds and can read a separate Django JSON API.

## GitHub build
Upload the complete folder to a repository. Under **Actions**, run **Build Android APK**, then download the `DriveMonitor-debug-apk` artifact.

## Configure Django
Change `DRIVE_API_URL` in `app/build.gradle.kts`. HTTPS is enforced. Expected response:
```json
{"drive_name":"PF753-CUTTER-01","status":"RUNNING","output_frequency_hz":48.7,"output_current_a":7.4,"dc_bus_voltage_v":648.0,"motor_speed_rpm":1462,"elapsed_runtime_hours":2374.6,"temperature_c":41.2,"timestamp":"2026-10-09T13:20:00Z"}
```
The app falls back to demo values if the API is unavailable. Before production use, add API authentication and authorization. Never expose a PLC or drive directly to the internet.
