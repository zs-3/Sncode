package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzemc implements com.google.android.gms.ads.internal.zzg {
    final java.util.concurrent.atomic.AtomicBoolean zza;
    private final com.google.android.gms.internal.ads.zzcxy zzb;
    private final com.google.android.gms.internal.ads.zzcys zzc;
    private final com.google.android.gms.internal.ads.zzdgc zzd;
    private final com.google.android.gms.internal.ads.zzdfu zze;
    private final com.google.android.gms.internal.ads.zzcpm zzf;

    zzemc(com.google.android.gms.internal.ads.zzcxy r3, com.google.android.gms.internal.ads.zzcys r4, com.google.android.gms.internal.ads.zzdgc r5, com.google.android.gms.internal.ads.zzdfu r6, com.google.android.gms.internal.ads.zzcpm r7) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zza = r0
            r2.zzb = r3
            r2.zzc = r4
            r2.zzd = r5
            r2.zze = r6
            r2.zzf = r7
            return
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(android.view.View r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zza     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto Ld
            monitor-exit(r3)
            return
        Ld:
            com.google.android.gms.internal.ads.zzcpm r0 = r3.zzf     // Catch: java.lang.Throwable -> L19
            r0.zzr()     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.internal.ads.zzdfu r0 = r3.zze     // Catch: java.lang.Throwable -> L19
            r0.zza(r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)
            return
        L19:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zza
            boolean r0 = r0.get()
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzcxy r0 = r1.zzb
            r0.onAdClicked()
        Ld:
            return
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zza
            boolean r0 = r0.get()
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzcys r0 = r1.zzc
            r0.zza()
            com.google.android.gms.internal.ads.zzdgc r0 = r1.zzd
            r0.zza()
        L12:
            return
    }
}
