package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzapn implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaqc zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzapo zzb;

    zzapn(com.google.android.gms.internal.ads.zzapo r1, com.google.android.gms.internal.ads.zzaqc r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.internal.ads.zzapo r0 = r2.zzb     // Catch: java.lang.InterruptedException -> Lc
            java.util.concurrent.BlockingQueue r0 = com.google.android.gms.internal.ads.zzapo.zza(r0)     // Catch: java.lang.InterruptedException -> Lc
            com.google.android.gms.internal.ads.zzaqc r1 = r2.zza     // Catch: java.lang.InterruptedException -> Lc
            r0.put(r1)     // Catch: java.lang.InterruptedException -> Lc
            return
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
    }
}
