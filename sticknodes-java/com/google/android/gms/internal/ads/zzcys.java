package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcys extends com.google.android.gms.internal.ads.zzddr {
    private boolean zzb;

    public zzcys(java.util.Set r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzb = r1
            return
    }

    public final synchronized void zza() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzb     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzcyr r0 = new com.google.android.gms.internal.ads.zzcyr     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            r1.zzq(r0)     // Catch: java.lang.Throwable -> L14
            r0 = 1
            r1.zzb = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L12:
            monitor-exit(r1)
            return
        L14:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
