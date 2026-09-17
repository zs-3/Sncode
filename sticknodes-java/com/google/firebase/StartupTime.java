package com.google.firebase;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class StartupTime {
    public StartupTime() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.StartupTime create(long r8, long r10, long r12) {
            com.google.firebase.AutoValue_StartupTime r7 = new com.google.firebase.AutoValue_StartupTime
            r0 = r7
            r1 = r8
            r3 = r10
            r5 = r12
            r0.<init>(r1, r3, r5)
            return r7
    }

    public static com.google.firebase.StartupTime now() {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = android.os.SystemClock.uptimeMillis()
            com.google.firebase.StartupTime r0 = create(r0, r2, r4)
            return r0
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}
