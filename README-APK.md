# SlayLine Android APK

This is an Android Studio project wrapping the SlayLine web UI as a native-installable Android app.

IMPORTANT:
- This project is ready to compile into an APK, but an APK must be signed with an Android signing key before public distribution.
- I cannot sign an Android package with your personal signing key from this chat.
- The current web UI includes the prototype backend API calls; for the live AI chat, the production backend URL must replace the local `/api/chat` path or the WebView must point at your deployed SlayLine server.

## Build
Open this folder in Android Studio.
Build > Build APK(s).
The debug APK will be produced under:
app/build/outputs/apk/debug/

For a release APK:
Build > Generate Signed App Bundle / APK > APK
Create/select your keystore and sign the release.

## Next production Android work
- Point WebView/API to deployed SlayLine backend
- Android file picker bridge for document uploads
- Push notifications for deadlines
- Secure token storage
- Biometric app lock
- Play Store signing/configuration
