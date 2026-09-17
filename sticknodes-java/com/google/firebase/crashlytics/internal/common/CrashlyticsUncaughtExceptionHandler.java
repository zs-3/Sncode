package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class CrashlyticsUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener crashListener;
    private final java.lang.Thread.UncaughtExceptionHandler defaultHandler;
    private final java.util.concurrent.atomic.AtomicBoolean isHandlingException;
    private final com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent nativeComponent;
    private final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider;

    interface CrashListener {
        void onUncaughtException(com.google.firebase.crashlytics.internal.settings.SettingsProvider r1, java.lang.Thread r2, java.lang.Throwable r3);
    }

    public CrashlyticsUncaughtExceptionHandler(com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener r1, com.google.firebase.crashlytics.internal.settings.SettingsProvider r2, java.lang.Thread.UncaughtExceptionHandler r3, com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r4) {
            r0 = this;
            r0.<init>()
            r0.crashListener = r1
            r0.settingsProvider = r2
            r0.defaultHandler = r3
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.isHandlingException = r1
            r0.nativeComponent = r4
            return
    }

    private boolean shouldRecordUncaughtException(java.lang.Thread r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto Ld
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Crashlytics will not record uncaught exception; null thread"
            r2.e(r3)
            return r0
        Ld:
            if (r3 != 0) goto L19
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Crashlytics will not record uncaught exception; null throwable"
            r2.e(r3)
            return r0
        L19:
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r2 = r1.nativeComponent
            boolean r2 = r2.hasCrashDataForCurrentSession()
            if (r2 == 0) goto L2b
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Crashlytics will not record uncaught exception; native crash exists for session."
            r2.d(r3)
            return r0
        L2b:
            r2 = 1
            return r2
    }

    boolean isHandlingException() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.isHandlingException
            boolean r0 = r0.get()
            return r0
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
            r7 = this;
            java.lang.String r0 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r1 = "Completed exception processing, but no default exception handler."
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.isHandlingException
            r3 = 1
            r2.set(r3)
            r2 = 0
            boolean r4 = r7.shouldRecordUncaughtException(r8, r9)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            if (r4 == 0) goto L19
            com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler$CrashListener r4 = r7.crashListener     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            com.google.firebase.crashlytics.internal.settings.SettingsProvider r5 = r7.settingsProvider     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r4.onUncaughtException(r5, r8, r9)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            goto L22
        L19:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            java.lang.String r5 = "Uncaught exception will not be recorded by Crashlytics."
            r4.d(r5)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
        L22:
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.defaultHandler
            if (r4 == 0) goto L44
            goto L37
        L27:
            r4 = move-exception
            goto L54
        L29:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = "An error occurred in the uncaught exception handler"
            r5.e(r6, r4)     // Catch: java.lang.Throwable -> L27
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.defaultHandler
            if (r4 == 0) goto L44
        L37:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r1.d(r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            r0.uncaughtException(r8, r9)
            goto L4e
        L44:
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r8.d(r1)
            java.lang.System.exit(r3)
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.isHandlingException
            r8.set(r2)
            return
        L54:
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.defaultHandler
            if (r5 == 0) goto L65
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r1.d(r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            r0.uncaughtException(r8, r9)
            goto L6f
        L65:
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r8.d(r1)
            java.lang.System.exit(r3)
        L6f:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.isHandlingException
            r8.set(r2)
            throw r4
    }
}
