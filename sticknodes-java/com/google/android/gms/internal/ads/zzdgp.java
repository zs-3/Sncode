package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdgp extends com.google.android.gms.internal.ads.zzddr {
    zzdgp(java.util.Set r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final synchronized void zza(com.google.android.gms.ads.nonagon.signalgeneration.zzbd r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdgn r0 = new com.google.android.gms.internal.ads.zzdgn     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            r1.zzq(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzb(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdgo r0 = new com.google.android.gms.internal.ads.zzdgo     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            r1.zzq(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
