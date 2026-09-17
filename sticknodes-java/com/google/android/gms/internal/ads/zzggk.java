package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzggk extends java.util.concurrent.TimeoutException {
    /* synthetic */ zzggk(java.lang.String r1, com.google.android.gms.internal.ads.zzggj r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]     // Catch: java.lang.Throwable -> L9
            r1.setStackTrace(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r1
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
