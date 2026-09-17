package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzacu {
    private final com.google.android.gms.internal.ads.zzact zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;

    public zzacu(com.google.android.gms.internal.ads.zzact r2) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.zzb = r2
            return
    }

    public final com.google.android.gms.internal.ads.zzadb zza(java.lang.Object... r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zzb
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.zzb     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r1 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
        Ld:
            r1 = r2
            goto L28
        Lf:
            com.google.android.gms.internal.ads.zzact r1 = r4.zza     // Catch: java.lang.Exception -> L17 java.lang.ClassNotFoundException -> L20 java.lang.Throwable -> L3b
            java.lang.reflect.Constructor r1 = r1.zza()     // Catch: java.lang.Exception -> L17 java.lang.ClassNotFoundException -> L20 java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            goto L28
        L17:
            r5 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "Error instantiating extension"
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L3b
            throw r1     // Catch: java.lang.Throwable -> L3b
        L20:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.zzb     // Catch: java.lang.Throwable -> L3b
            r3 = 1
            r1.set(r3)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            goto Ld
        L28:
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.Object r5 = r1.newInstance(r5)     // Catch: java.lang.Exception -> L32
            com.google.android.gms.internal.ads.zzadb r5 = (com.google.android.gms.internal.ads.zzadb) r5     // Catch: java.lang.Exception -> L32
            return r5
        L32:
            r5 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unexpected error creating extractor"
            r0.<init>(r1, r5)
            throw r0
        L3b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r5
    }
}
