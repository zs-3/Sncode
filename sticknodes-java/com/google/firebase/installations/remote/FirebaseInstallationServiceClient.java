package com.google.firebase.installations.remote;

/* loaded from: classes2.dex */
public class FirebaseInstallationServiceClient {
    private static final java.util.regex.Pattern EXPIRATION_TIMESTAMP_PATTERN = null;
    private static final java.nio.charset.Charset UTF_8 = null;
    private final android.content.Context context;
    private final com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatController> heartBeatProvider;
    private final com.google.firebase.installations.remote.RequestLimiter requestLimiter;

    static {
            java.lang.String r0 = "[0-9]+s"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.firebase.installations.remote.FirebaseInstallationServiceClient.EXPIRATION_TIMESTAMP_PATTERN = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.firebase.installations.remote.FirebaseInstallationServiceClient.UTF_8 = r0
            return
    }

    public FirebaseInstallationServiceClient(android.content.Context r1, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatController> r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.heartBeatProvider = r2
            com.google.firebase.installations.remote.RequestLimiter r1 = new com.google.firebase.installations.remote.RequestLimiter
            r1.<init>()
            r0.requestLimiter = r1
            return
    }

    private static java.lang.String availableFirebaseOptions(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L12
            java.lang.String r2 = ""
            goto L23
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L23:
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    private static org.json.JSONObject buildCreateFirebaseInstallationRequestBody(java.lang.String r2, java.lang.String r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1e
            r0.<init>()     // Catch: org.json.JSONException -> L1e
            java.lang.String r1 = "fid"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1e
            java.lang.String r2 = "appId"
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L1e
            java.lang.String r2 = "authVersion"
            java.lang.String r3 = "FIS_v2"
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L1e
            java.lang.String r2 = "sdkVersion"
            java.lang.String r3 = "a:18.0.0"
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L1e
            return r0
        L1e:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            throw r3
    }

    private static org.json.JSONObject buildGenerateAuthTokenRequestBody() {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L17
            r0.<init>()     // Catch: org.json.JSONException -> L17
            java.lang.String r1 = "sdkVersion"
            java.lang.String r2 = "a:18.0.0"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L17
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L17
            r1.<init>()     // Catch: org.json.JSONException -> L17
            java.lang.String r2 = "installation"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L17
            return r1
        L17:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    private java.lang.String getFingerprintHashForPackage() {
            r5 = this;
            java.lang.String r0 = "ContentValues"
            r1 = 0
            android.content.Context r2 = r5.context     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            byte[] r2 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            if (r2 != 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r2.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r2.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            android.content.Context r3 = r5.context     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r2.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r2 = r2.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            android.util.Log.e(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            return r1
        L2a:
            r3 = 0
            java.lang.String r0 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            return r0
        L30:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No such package: "
            r3.append(r4)
            android.content.Context r4 = r5.context
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r0, r3, r2)
            return r1
    }

    private java.net.URL getFullyQualifiedRequestUri(java.lang.String r6) throws com.google.firebase.installations.FirebaseInstallationsException {
            r5 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L1c
            java.lang.String r1 = "https://%s/%s/%s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.net.MalformedURLException -> L1c
            r3 = 0
            java.lang.String r4 = "firebaseinstallations.googleapis.com"
            r2[r3] = r4     // Catch: java.net.MalformedURLException -> L1c
            r3 = 1
            java.lang.String r4 = "v1"
            r2[r3] = r4     // Catch: java.net.MalformedURLException -> L1c
            r3 = 2
            r2[r3] = r6     // Catch: java.net.MalformedURLException -> L1c
            java.lang.String r6 = java.lang.String.format(r1, r2)     // Catch: java.net.MalformedURLException -> L1c
            r0.<init>(r6)     // Catch: java.net.MalformedURLException -> L1c
            return r0
        L1c:
            r6 = move-exception
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r6 = r6.getMessage()
            com.google.firebase.installations.FirebaseInstallationsException$Status r1 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r6, r1)
            throw r0
    }

    private static byte[] getJsonBytes(org.json.JSONObject r1) throws java.io.IOException {
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    private static boolean isSuccessfulResponseCode(int r1) {
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto La
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    private static void logBadConfigError() {
            java.lang.String r0 = "Firebase-Installations"
            java.lang.String r1 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r0, r1)
            return
    }

    private static void logFisCommunicationError(java.net.HttpURLConnection r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r1 = readErrorResponse(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L16
            java.lang.String r0 = "Firebase-Installations"
            android.util.Log.w(r0, r1)
            java.lang.String r1 = availableFirebaseOptions(r2, r3, r4)
            android.util.Log.w(r0, r1)
        L16:
            return
    }

    private java.net.HttpURLConnection openHttpURLConnection(java.net.URL r5, java.lang.String r6) throws com.google.firebase.installations.FirebaseInstallationsException {
            r4 = this;
            java.lang.String r0 = "Failed to get heartbeats header"
            java.lang.String r1 = "ContentValues"
            java.net.URLConnection r5 = r5.openConnection()     // Catch: java.io.IOException -> L74
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.io.IOException -> L74
            r2 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r2)
            r3 = 0
            r5.setUseCaches(r3)
            r5.setReadTimeout(r2)
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r5.addRequestProperty(r2, r3)
            java.lang.String r2 = "Accept"
            r5.addRequestProperty(r2, r3)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r5.addRequestProperty(r2, r3)
            java.lang.String r2 = "Cache-Control"
            java.lang.String r3 = "no-cache"
            r5.addRequestProperty(r2, r3)
            android.content.Context r2 = r4.context
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r5.addRequestProperty(r3, r2)
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatController> r2 = r4.heartBeatProvider
            java.lang.Object r2 = r2.get()
            com.google.firebase.heartbeatinfo.HeartBeatController r2 = (com.google.firebase.heartbeatinfo.HeartBeatController) r2
            if (r2 == 0) goto L65
            java.lang.String r3 = "x-firebase-client"
            com.google.android.gms.tasks.Task r2 = r2.getHeartBeatsHeader()     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L61
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2)     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L61
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L61
            r5.addRequestProperty(r3, r2)     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L61
            goto L65
        L55:
            r2 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            android.util.Log.w(r1, r0, r2)
            goto L65
        L61:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
        L65:
            java.lang.String r0 = r4.getFingerprintHashForPackage()
            java.lang.String r1 = "X-Android-Cert"
            r5.addRequestProperty(r1, r0)
            java.lang.String r0 = "x-goog-api-key"
            r5.addRequestProperty(r0, r6)
            return r5
        L74:
            com.google.firebase.installations.FirebaseInstallationsException r5 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r6 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            java.lang.String r0 = "Firebase Installations Service is unavailable. Please try again later."
            r5.<init>(r0, r6)
            throw r5
    }

    static long parseTokenExpirationTimestamp(java.lang.String r2) {
            java.util.regex.Pattern r0 = com.google.firebase.installations.remote.FirebaseInstallationServiceClient.EXPIRATION_TIMESTAMP_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            java.lang.String r1 = "Invalid Expiration Timestamp."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            if (r2 == 0) goto L28
            int r0 = r2.length()
            if (r0 != 0) goto L18
            goto L28
        L18:
            r0 = 0
            int r1 = r2.length()
            int r1 = r1 + (-1)
            java.lang.String r2 = r2.substring(r0, r1)
            long r0 = java.lang.Long.parseLong(r2)
            goto L2a
        L28:
            r0 = 0
        L2a:
            return r0
    }

    private com.google.firebase.installations.remote.InstallationResponse readCreateResponse(java.net.HttpURLConnection r6) throws java.lang.AssertionError, java.io.IOException {
            r5 = this;
            java.io.InputStream r6 = r6.getInputStream()
            android.util.JsonReader r0 = new android.util.JsonReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = com.google.firebase.installations.remote.FirebaseInstallationServiceClient.UTF_8
            r1.<init>(r6, r2)
            r0.<init>(r1)
            com.google.firebase.installations.remote.TokenResult$Builder r1 = com.google.firebase.installations.remote.TokenResult.builder()
            com.google.firebase.installations.remote.InstallationResponse$Builder r2 = com.google.firebase.installations.remote.InstallationResponse.builder()
            r0.beginObject()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La3
            java.lang.String r3 = r0.nextName()
            java.lang.String r4 = "name"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L35
            java.lang.String r3 = r0.nextString()
            r2.setUri(r3)
            goto L1b
        L35:
            java.lang.String r4 = "fid"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L45
            java.lang.String r3 = r0.nextString()
            r2.setFid(r3)
            goto L1b
        L45:
            java.lang.String r4 = "refreshToken"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L55
            java.lang.String r3 = r0.nextString()
            r2.setRefreshToken(r3)
            goto L1b
        L55:
            java.lang.String r4 = "authToken"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L9e
            r0.beginObject()
        L60:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L92
            java.lang.String r3 = r0.nextName()
            java.lang.String r4 = "token"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L7a
            java.lang.String r3 = r0.nextString()
            r1.setToken(r3)
            goto L60
        L7a:
            java.lang.String r4 = "expiresIn"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L8e
            java.lang.String r3 = r0.nextString()
            long r3 = parseTokenExpirationTimestamp(r3)
            r1.setTokenExpirationTimestamp(r3)
            goto L60
        L8e:
            r0.skipValue()
            goto L60
        L92:
            com.google.firebase.installations.remote.TokenResult r3 = r1.build()
            r2.setAuthToken(r3)
            r0.endObject()
            goto L1b
        L9e:
            r0.skipValue()
            goto L1b
        La3:
            r0.endObject()
            r0.close()
            r6.close()
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r6 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK
            com.google.firebase.installations.remote.InstallationResponse$Builder r6 = r2.setResponseCode(r6)
            com.google.firebase.installations.remote.InstallationResponse r6 = r6.build()
            return r6
    }

    private static java.lang.String readErrorResponse(java.net.HttpURLConnection r7) {
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = com.google.firebase.installations.remote.FirebaseInstallationServiceClient.UTF_8
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
        L19:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            if (r3 == 0) goto L28
            r0.append(r3)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r3 = 10
            r0.append(r3)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            goto L19
        L28:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r4[r5] = r6     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r4[r5] = r7     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r7 = 2
            r4[r7] = r0     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r2.close()     // Catch: java.io.IOException -> L49
        L49:
            return r7
        L4a:
            r7 = move-exception
            r2.close()     // Catch: java.io.IOException -> L4e
        L4e:
            throw r7
        L4f:
            r2.close()     // Catch: java.io.IOException -> L52
        L52:
            return r1
    }

    private com.google.firebase.installations.remote.TokenResult readGenerateAuthTokenResponse(java.net.HttpURLConnection r5) throws java.lang.AssertionError, java.io.IOException {
            r4 = this;
            java.io.InputStream r5 = r5.getInputStream()
            android.util.JsonReader r0 = new android.util.JsonReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = com.google.firebase.installations.remote.FirebaseInstallationServiceClient.UTF_8
            r1.<init>(r5, r2)
            r0.<init>(r1)
            com.google.firebase.installations.remote.TokenResult$Builder r1 = com.google.firebase.installations.remote.TokenResult.builder()
            r0.beginObject()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.String r2 = r0.nextName()
            java.lang.String r3 = "token"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L31
            java.lang.String r2 = r0.nextString()
            r1.setToken(r2)
            goto L17
        L31:
            java.lang.String r3 = "expiresIn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L45
            java.lang.String r2 = r0.nextString()
            long r2 = parseTokenExpirationTimestamp(r2)
            r1.setTokenExpirationTimestamp(r2)
            goto L17
        L45:
            r0.skipValue()
            goto L17
        L49:
            r0.endObject()
            r0.close()
            r5.close()
            com.google.firebase.installations.remote.TokenResult$ResponseCode r5 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK
            com.google.firebase.installations.remote.TokenResult$Builder r5 = r1.setResponseCode(r5)
            com.google.firebase.installations.remote.TokenResult r5 = r5.build()
            return r5
    }

    private void writeFIDCreateRequestBodyToOutputStream(java.net.HttpURLConnection r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r0 = this;
            org.json.JSONObject r2 = buildCreateFirebaseInstallationRequestBody(r2, r3)
            byte[] r2 = getJsonBytes(r2)
            writeRequestBodyToOutputStream(r1, r2)
            return
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(java.net.HttpURLConnection r2) throws java.io.IOException {
            r1 = this;
            org.json.JSONObject r0 = buildGenerateAuthTokenRequestBody()
            byte[] r0 = getJsonBytes(r0)
            writeRequestBodyToOutputStream(r2, r0)
            return
    }

    private static void writeRequestBodyToOutputStream(java.net.URLConnection r1, byte[] r2) throws java.io.IOException {
            java.io.OutputStream r1 = r1.getOutputStream()
            if (r1 == 0) goto L1d
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch: java.lang.Throwable -> L15
            r0.close()     // Catch: java.io.IOException -> L14
            r1.close()     // Catch: java.io.IOException -> L14
        L14:
            return
        L15:
            r2 = move-exception
            r0.close()     // Catch: java.io.IOException -> L1c
            r1.close()     // Catch: java.io.IOException -> L1c
        L1c:
            throw r2
        L1d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Cannot send request to FIS servers. No OutputStream available."
            r1.<init>(r2)
            throw r1
    }

    public com.google.firebase.installations.remote.InstallationResponse createFirebaseInstallation(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) throws com.google.firebase.installations.FirebaseInstallationsException {
            r8 = this;
            com.google.firebase.installations.remote.RequestLimiter r0 = r8.requestLimiter
            boolean r0 = r0.isRequestAllowed()
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            if (r0 == 0) goto L97
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r11
            java.lang.String r4 = "projects/%s/installations"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.net.URL r2 = r8.getFullyQualifiedRequestUri(r2)
        L1a:
            if (r3 > r0) goto L8f
            r4 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r4)
            java.net.HttpURLConnection r4 = r8.openHttpURLConnection(r2, r9)
            java.lang.String r5 = "POST"
            r4.setRequestMethod(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
            r4.setDoOutput(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
            if (r13 == 0) goto L35
            java.lang.String r5 = "x-goog-fis-android-iid-migration-auth"
            r4.addRequestProperty(r5, r13)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
        L35:
            r8.writeFIDCreateRequestBodyToOutputStream(r4, r10, r12)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
            com.google.firebase.installations.remote.RequestLimiter r6 = r8.requestLimiter     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
            r6.setNextRequestTime(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
            boolean r6 = isSuccessfulResponseCode(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
            if (r6 == 0) goto L52
            com.google.firebase.installations.remote.InstallationResponse r9 = r8.readCreateResponse(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86
        L4b:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r9
        L52:
            logFisCommunicationError(r4, r12, r9, r11)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            r6 = 429(0x1ad, float:6.01E-43)
            if (r5 == r6) goto L74
            r6 = 500(0x1f4, float:7.0E-43)
            if (r5 < r6) goto L62
            r6 = 600(0x258, float:8.41E-43)
            if (r5 >= r6) goto L62
            goto L86
        L62:
            logBadConfigError()     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            com.google.firebase.installations.remote.InstallationResponse$Builder r5 = com.google.firebase.installations.remote.InstallationResponse.builder()     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r6 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            com.google.firebase.installations.remote.InstallationResponse$Builder r5 = r5.setResponseCode(r6)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            com.google.firebase.installations.remote.InstallationResponse r9 = r5.build()     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            goto L4b
        L74:
            com.google.firebase.installations.FirebaseInstallationsException r5 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            java.lang.String r6 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r7 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
            throw r5     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L86 java.lang.Throwable -> L86
        L7e:
            r9 = move-exception
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r9
        L86:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r3 = r3 + 1
            goto L1a
        L8f:
            com.google.firebase.installations.FirebaseInstallationsException r9 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r10 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r9.<init>(r1, r10)
            throw r9
        L97:
            com.google.firebase.installations.FirebaseInstallationsException r9 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r10 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r9.<init>(r1, r10)
            throw r9
    }

    public com.google.firebase.installations.remote.TokenResult generateAuthToken(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) throws com.google.firebase.installations.FirebaseInstallationsException {
            r7 = this;
            com.google.firebase.installations.remote.RequestLimiter r0 = r7.requestLimiter
            boolean r0 = r0.isRequestAllowed()
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            if (r0 == 0) goto Lc3
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r10
            r3 = 1
            r0[r3] = r9
            java.lang.String r9 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r9 = java.lang.String.format(r9, r0)
            java.net.URL r9 = r7.getFullyQualifiedRequestUri(r9)
        L1d:
            if (r2 > r3) goto Lbb
            r0 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.net.HttpURLConnection r0 = r7.openHttpURLConnection(r9, r8)
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            java.lang.String r4 = "Authorization"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            r5.<init>()     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            java.lang.String r6 = "FIS_v2 "
            r5.append(r6)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            r5.append(r11)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            r0.addRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            r0.setDoOutput(r3)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            r7.writeGenerateAuthTokenRequestBodyToOutputStream(r0)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            int r4 = r0.getResponseCode()     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            com.google.firebase.installations.remote.RequestLimiter r5 = r7.requestLimiter     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            r5.setNextRequestTime(r4)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            boolean r5 = isSuccessfulResponseCode(r4)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
            if (r5 == 0) goto L64
            com.google.firebase.installations.remote.TokenResult r8 = r7.readGenerateAuthTokenResponse(r0)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1
        L5d:
            r0.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r8
        L64:
            r5 = 0
            logFisCommunicationError(r0, r5, r8, r10)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            r5 = 401(0x191, float:5.62E-43)
            if (r4 == r5) goto L9a
            r5 = 404(0x194, float:5.66E-43)
            if (r4 != r5) goto L71
            goto L9a
        L71:
            r5 = 429(0x1ad, float:6.01E-43)
            if (r4 == r5) goto L90
            r5 = 500(0x1f4, float:7.0E-43)
            if (r4 < r5) goto L7e
            r5 = 600(0x258, float:8.41E-43)
            if (r4 >= r5) goto L7e
            goto Lb1
        L7e:
            logBadConfigError()     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            com.google.firebase.installations.remote.TokenResult$Builder r4 = com.google.firebase.installations.remote.TokenResult.builder()     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            com.google.firebase.installations.remote.TokenResult$ResponseCode r5 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            com.google.firebase.installations.remote.TokenResult$Builder r4 = r4.setResponseCode(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            com.google.firebase.installations.remote.TokenResult r8 = r4.build()     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            goto L5d
        L90:
            com.google.firebase.installations.FirebaseInstallationsException r4 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            java.lang.String r5 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r6 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            throw r4     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
        L9a:
            com.google.firebase.installations.remote.TokenResult$Builder r4 = com.google.firebase.installations.remote.TokenResult.builder()     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            com.google.firebase.installations.remote.TokenResult$ResponseCode r5 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            com.google.firebase.installations.remote.TokenResult$Builder r4 = r4.setResponseCode(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            com.google.firebase.installations.remote.TokenResult r8 = r4.build()     // Catch: java.lang.Throwable -> La9 java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            goto L5d
        La9:
            r8 = move-exception
            r0.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r8
        Lb1:
            r0.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r2 = r2 + 1
            goto L1d
        Lbb:
            com.google.firebase.installations.FirebaseInstallationsException r8 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r9 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r8.<init>(r1, r9)
            throw r8
        Lc3:
            com.google.firebase.installations.FirebaseInstallationsException r8 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r9 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r8.<init>(r1, r9)
            throw r8
    }
}
