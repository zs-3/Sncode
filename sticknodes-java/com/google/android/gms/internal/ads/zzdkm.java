package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdkm {
    private com.google.android.gms.internal.ads.zzbfz zza;

    public zzdkm(com.google.android.gms.internal.ads.zzdjx r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final synchronized com.google.android.gms.internal.ads.zzbfz zza() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbfz r0 = r1.zza     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzbfz r1) {
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
