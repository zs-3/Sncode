package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcst implements com.google.android.gms.internal.ads.zzczo, com.google.android.gms.internal.ads.zzayv {
    private final com.google.android.gms.internal.ads.zzfgh zza;
    private final com.google.android.gms.internal.ads.zzcys zzb;
    private final com.google.android.gms.internal.ads.zzczx zzc;
    private final java.util.concurrent.atomic.AtomicBoolean zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze;

    public zzcst(com.google.android.gms.internal.ads.zzfgh r2, com.google.android.gms.internal.ads.zzcys r3, com.google.android.gms.internal.ads.zzczx r4) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzd = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zze = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            return
    }

    private final void zza() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzd
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzcys r0 = r3.zzb
            r0.zza()
        Lf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(com.google.android.gms.internal.ads.zzayu r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r2.zza
            int r0 = r0.zze
            r1 = 1
            if (r0 != r1) goto Le
            boolean r0 = r3.zzj
            if (r0 == 0) goto Le
            r2.zza()
        Le:
            boolean r3 = r3.zzj
            if (r3 == 0) goto L20
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zze
            r0 = 0
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L20
            com.google.android.gms.internal.ads.zzczx r3 = r2.zzc
            r3.zza()
        L20:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final synchronized void zzs() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfgh r0 = r2.zza     // Catch: java.lang.Throwable -> Lf
            int r0 = r0.zze     // Catch: java.lang.Throwable -> Lf
            r1 = 1
            if (r0 == r1) goto Ld
            r2.zza()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return
        Ld:
            monitor-exit(r2)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
