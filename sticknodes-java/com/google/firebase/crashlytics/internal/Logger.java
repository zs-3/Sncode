package com.google.firebase.crashlytics.internal;

/* loaded from: classes2.dex */
public class Logger {
    static final com.google.firebase.crashlytics.internal.Logger DEFAULT_LOGGER = null;
    private int logLevel;
    private final java.lang.String tag;

    static {
            com.google.firebase.crashlytics.internal.Logger r0 = new com.google.firebase.crashlytics.internal.Logger
            java.lang.String r1 = "FirebaseCrashlytics"
            r0.<init>(r1)
            com.google.firebase.crashlytics.internal.Logger.DEFAULT_LOGGER = r0
            return
    }

    public Logger(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.tag = r1
            r1 = 4
            r0.logLevel = r1
            return
    }

    private boolean canLog(int r2) {
            r1 = this;
            int r0 = r1.logLevel
            if (r0 <= r2) goto Lf
            java.lang.String r0 = r1.tag
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    public static com.google.firebase.crashlytics.internal.Logger getLogger() {
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.DEFAULT_LOGGER
            return r0
    }

    public void d(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.d(r2, r0)
            return
    }

    public void d(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 3
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = r1.tag
            android.util.Log.d(r0, r2, r3)
        Lc:
            return
    }

    public void e(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.e(r2, r0)
            return
    }

    public void e(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = r1.tag
            android.util.Log.e(r0, r2, r3)
        Lc:
            return
    }

    public void i(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.i(r2, r0)
            return
    }

    public void i(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 4
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = r1.tag
            android.util.Log.i(r0, r2, r3)
        Lc:
            return
    }

    public void v(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.v(r2, r0)
            return
    }

    public void v(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = r1.tag
            android.util.Log.v(r0, r2, r3)
        Lc:
            return
    }

    public void w(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.w(r2, r0)
            return
    }

    public void w(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = r1.tag
            android.util.Log.w(r0, r2, r3)
        Lc:
            return
    }
}
