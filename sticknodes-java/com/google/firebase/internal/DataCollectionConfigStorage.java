package com.google.firebase.internal;

/* loaded from: classes2.dex */
public class DataCollectionConfigStorage {
    private boolean dataCollectionDefaultEnabled;
    private final android.content.Context deviceProtectedContext;
    private final com.google.firebase.events.Publisher publisher;
    private final android.content.SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(android.content.Context r3, java.lang.String r4, com.google.firebase.events.Publisher r5) {
            r2 = this;
            r2.<init>()
            android.content.Context r3 = directBootSafe(r3)
            r2.deviceProtectedContext = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "com.google.firebase.common.prefs:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            r2.sharedPreferences = r3
            r2.publisher = r5
            boolean r3 = r2.readAutoDataCollectionEnabled()
            r2.dataCollectionDefaultEnabled = r3
            return
    }

    private static android.content.Context directBootSafe(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L7
            return r2
        L7:
            android.content.Context r2 = androidx.core.content.ContextCompat.createDeviceProtectedStorageContext(r2)
            return r2
    }

    private boolean readAutoDataCollectionEnabled() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.sharedPreferences
            java.lang.String r1 = "firebase_data_collection_default_enabled"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L12
            android.content.SharedPreferences r0 = r3.sharedPreferences
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
        L12:
            boolean r0 = r3.readManifestDataCollectionEnabled()
            return r0
    }

    private boolean readManifestDataCollectionEnabled() {
            r4 = this;
            java.lang.String r0 = "firebase_data_collection_default_enabled"
            android.content.Context r1 = r4.deviceProtectedContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r1 == 0) goto L29
            android.content.Context r2 = r4.deviceProtectedContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r1 == 0) goto L29
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r2 == 0) goto L29
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r2 == 0) goto L29
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            boolean r0 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            return r0
        L29:
            r0 = 1
            return r0
    }

    public synchronized boolean isEnabled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.dataCollectionDefaultEnabled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
