package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzemn implements com.google.android.gms.ads.internal.zzg {
    private com.google.android.gms.ads.internal.zzg zza;

    public zzemn() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(android.view.View r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.zzg r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zza(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzb() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.zzg r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzb()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzc() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.zzg r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzc()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.zzg r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zza = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
