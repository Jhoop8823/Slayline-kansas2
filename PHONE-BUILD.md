# SlayLine — Build the APK entirely from your Android phone

This project is configured for GitHub Actions, so you do NOT need Android Studio or a computer.

## Phone-only method

### 1. Create a GitHub account
Use the GitHub mobile app or your phone browser.

### 2. Create a new repository
Create an empty repository named:
`slayline-kansas`

### 3. Upload this ZIP's contents
Extract this ZIP on your phone with your file manager.

Upload the folders/files to the GitHub repository. Make sure `.github/workflows/build-apk.yml` is included.

### 4. Start the cloud build
In GitHub:
Actions → Build SlayLine APK → Run workflow.

GitHub's server will compile the Android app.

### 5. Download the APK
When the workflow finishes:
Actions → the completed run → Artifacts → `SlayLine-debug-apk`

Download it to your phone.

### 6. Install
Tap the downloaded APK.

Android may ask you to allow installation from that source. Only enable that permission for the browser/file manager you trust, then install SlayLine.

## What this APK contains

- SlayLine Android shell
- Kansas family-law UI
- AI legal chat interface
- PFA analyzer interface
- Kansas law library
- evidence/documents workspace
- case timeline
- attorney handoff
- Kansas forms navigation
- offline legal starter responses

## Important about live AI

The APK's frontend currently expects the SlayLine backend for live AI. Without the backend, the built-in starter responses still work.

The next production step is deploying the backend to a cloud service and changing the app's API base URL. The backend can use a free-tier AI API during development.

## Security

This is a development build. Do not upload confidential PFA/court documents to a public GitHub repository. Keep API keys and user documents out of GitHub.
