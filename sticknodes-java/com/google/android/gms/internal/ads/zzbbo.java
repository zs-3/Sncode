package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbbo implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbg zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbq zzc;

    zzbbo(com.google.android.gms.internal.ads.zzbbq r1, com.google.android.gms.internal.ads.zzbbg r2, com.google.android.gms.internal.ads.zzcas r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbbq r4 = r3.zzc
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbbq.zzb(r4)
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbbq r0 = r3.zzc     // Catch: java.lang.Throwable -> L38
            boolean r1 = com.google.android.gms.internal.ads.zzbbq.zzf(r0)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            return
        L11:
            r1 = 1
            com.google.android.gms.internal.ads.zzbbq.zzd(r0, r1)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbbq r0 = r3.zzc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbbf r0 = com.google.android.gms.internal.ads.zzbbq.zza(r0)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L1f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            return
        L1f:
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbbl r2 = new com.google.android.gms.internal.ads.zzbbl     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L38
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza(r2)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzcas r1 = r3.zzb     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbbm r2 = new com.google.android.gms.internal.ads.zzbbm     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Throwable -> L38
            r1.addListener(r2, r0)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            return
    }
}
