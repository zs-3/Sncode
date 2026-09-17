package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
public class CachedSettingsIo {
    private final java.io.File cachedSettingsFile;

    public CachedSettingsIo(com.google.firebase.crashlytics.internal.persistence.FileStore r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "com.crashlytics.settings.json"
            java.io.File r2 = r2.getCommonFile(r0)
            r1.cachedSettingsFile = r2
            return
    }

    private java.io.File getSettingsFile() {
            r1 = this;
            java.io.File r0 = r1.cachedSettingsFile
            return r0
    }

    public org.json.JSONObject readCachedSettings() {
            r6 = this;
            java.lang.String r0 = "Error while closing settings cache file."
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Checking for cached settings..."
            r1.d(r2)
            r1 = 0
            java.io.File r2 = r6.getSettingsFile()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            if (r3 == 0) goto L28
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(r3)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L4a
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L4a
            r4.<init>(r2)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L4a
            r1 = r3
            goto L32
        L26:
            r2 = move-exception
            goto L3d
        L28:
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r3 = "Settings file does not exist."
            r2.v(r3)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r4 = r1
        L32:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            r1 = r4
            goto L49
        L37:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L4b
        L3b:
            r2 = move-exception
            r3 = r1
        L3d:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "Failed to fetch cached settings"
            r4.e(r5, r2)     // Catch: java.lang.Throwable -> L4a
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r3, r0)
        L49:
            return r1
        L4a:
            r1 = move-exception
        L4b:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r3, r0)
            throw r1
    }

    public void writeCachedSettings(long r4, org.json.JSONObject r6) {
            r3 = this;
            java.lang.String r0 = "Failed to close settings writer."
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Writing settings to cache file..."
            r1.v(r2)
            if (r6 == 0) goto L44
            r1 = 0
            java.lang.String r2 = "expires_at"
            r6.put(r2, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.io.File r5 = r3.getSettingsFile()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r4.write(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r4.flush()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r4, r0)
            goto L44
        L2a:
            r5 = move-exception
            r1 = r4
            goto L40
        L2d:
            r5 = move-exception
            r1 = r4
            goto L33
        L30:
            r5 = move-exception
            goto L40
        L32:
            r5 = move-exception
        L33:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "Failed to cache settings"
            r4.e(r6, r5)     // Catch: java.lang.Throwable -> L30
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            goto L44
        L40:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            throw r5
        L44:
            return
    }
}
