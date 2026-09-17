package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbjz {
    private boolean zza;
    private boolean zzb;
    private float zzc;
    private final java.util.concurrent.atomic.AtomicBoolean zzd;

    public zzbjz() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            r2.zzb = r0
            r1 = 0
            r2.zzc = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r0)
            r2.zzd = r1
            return
    }

    public final synchronized float zza() {
            r1 = this;
            monitor-enter(r1)
            float r0 = r1.zzc     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzb(boolean r1, float r2) {
            r0 = this;
            monitor-enter(r0)
            r0.zzb = r1     // Catch: java.lang.Throwable -> L7
            r0.zzc = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzc(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            r1.zza = r2     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.zzd     // Catch: java.lang.Throwable -> Lb
            r0 = 1
            r2.set(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean zzd() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized boolean zze(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zzd     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Ld
            boolean r2 = r1.zza     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Ld:
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
