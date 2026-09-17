package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class DataCollectionArbiter {
    private java.lang.Boolean crashlyticsDataCollectionEnabled;
    com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> dataCollectionEnabledTask;
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> dataCollectionExplicitlyApproved;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private boolean setInManifest;
    private final android.content.SharedPreferences sharedPreferences;
    private final java.lang.Object taskLock;
    boolean taskResolved;

    public DataCollectionArbiter(com.google.firebase.FirebaseApp r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.taskLock = r0
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r2.dataCollectionEnabledTask = r1
            r1 = 0
            r2.taskResolved = r1
            r2.setInManifest = r1
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r2.dataCollectionExplicitlyApproved = r1
            android.content.Context r1 = r3.getApplicationContext()
            r2.firebaseApp = r3
            android.content.SharedPreferences r3 = com.google.firebase.crashlytics.internal.common.CommonUtils.getSharedPrefs(r1)
            r2.sharedPreferences = r3
            java.lang.Boolean r3 = r2.getDataCollectionValueFromSharedPreferences()
            if (r3 != 0) goto L33
            java.lang.Boolean r3 = r2.getDataCollectionValueFromManifest(r1)
        L33:
            r2.crashlyticsDataCollectionEnabled = r3
            monitor-enter(r0)
            boolean r3 = r2.isAutomaticDataCollectionEnabled()     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L45
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r3 = r2.dataCollectionEnabledTask     // Catch: java.lang.Throwable -> L47
            r1 = 0
            r3.trySetResult(r1)     // Catch: java.lang.Throwable -> L47
            r3 = 1
            r2.taskResolved = r3     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
    }

    private java.lang.Boolean getDataCollectionValueFromManifest(android.content.Context r2) {
            r1 = this;
            java.lang.Boolean r2 = readCrashlyticsDataCollectionEnabledFromManifest(r2)
            if (r2 != 0) goto Lb
            r2 = 0
            r1.setInManifest = r2
            r2 = 0
            return r2
        Lb:
            r0 = 1
            r1.setInManifest = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = r0.equals(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    private java.lang.Boolean getDataCollectionValueFromSharedPreferences() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.sharedPreferences
            java.lang.String r1 = "firebase_crashlytics_collection_enabled"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L19
            r0 = 0
            r3.setInManifest = r0
            android.content.SharedPreferences r0 = r3.sharedPreferences
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L19:
            r0 = 0
            return r0
    }

    private boolean isFirebaseDataCollectionDefaultEnabled() {
            r1 = this;
            com.google.firebase.FirebaseApp r0 = r1.firebaseApp     // Catch: java.lang.IllegalStateException -> L7
            boolean r0 = r0.isDataCollectionDefaultEnabled()     // Catch: java.lang.IllegalStateException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    private void logDataCollectionState(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L5
            java.lang.String r5 = "ENABLED"
            goto L7
        L5:
            java.lang.String r5 = "DISABLED"
        L7:
            java.lang.Boolean r0 = r4.crashlyticsDataCollectionEnabled
            if (r0 != 0) goto Le
            java.lang.String r0 = "global Firebase setting"
            goto L17
        Le:
            boolean r0 = r4.setInManifest
            if (r0 == 0) goto L15
            java.lang.String r0 = "firebase_crashlytics_collection_enabled manifest flag"
            goto L17
        L15:
            java.lang.String r0 = "API"
        L17:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            java.lang.String r5 = "Crashlytics automatic data collection %s by %s."
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r1.d(r5)
            return
    }

    private static java.lang.Boolean readCrashlyticsDataCollectionEnabledFromManifest(android.content.Context r3) {
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r1 == 0) goto L33
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r3 == 0) goto L33
            android.os.Bundle r1 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r1 == 0) goto L33
            boolean r1 = r1.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r1 == 0) goto L33
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            boolean r3 = r3.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            return r3
        L29:
            r3 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Could not read data collection permission from manifest"
            r0.e(r1, r3)
        L33:
            r3 = 0
            return r3
    }

    public void grantDataCollectionPermission(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L9
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2 = r1.dataCollectionExplicitlyApproved
            r0 = 0
            r2.trySetResult(r0)
            return
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "An invalid data collection token was used."
            r2.<init>(r0)
            throw r2
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Boolean r0 = r1.crashlyticsDataCollectionEnabled     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L13
            goto Le
        La:
            boolean r0 = r1.isFirebaseDataCollectionDefaultEnabled()     // Catch: java.lang.Throwable -> L13
        Le:
            r1.logDataCollectionState(r0)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> waitForAutomaticDataCollectionEnabled() {
            r2 = this;
            java.lang.Object r0 = r2.taskLock
            monitor-enter(r0)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r1 = r2.dataCollectionEnabledTask     // Catch: java.lang.Throwable -> Lb
            com.google.android.gms.tasks.Task r1 = r1.getTask()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> waitForDataCollectionPermission() {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r2.dataCollectionExplicitlyApproved
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            com.google.android.gms.tasks.Task r1 = r2.waitForAutomaticDataCollectionEnabled()
            com.google.android.gms.tasks.Task r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks.race(r0, r1)
            return r0
    }
}
