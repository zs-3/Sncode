package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzayd {
    private final java.util.Map zza;

    public zzayd() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final java.util.concurrent.atomic.AtomicReference zza(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zza     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L13
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            java.util.Map r1 = r2.zza     // Catch: java.lang.Throwable -> L1d
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1d
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            java.util.Map r0 = r2.zza
            java.lang.Object r3 = r0.get(r3)
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            return r3
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }
}
