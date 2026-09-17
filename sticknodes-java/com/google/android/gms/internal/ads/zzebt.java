package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzebt extends com.google.android.gms.internal.ads.zzebz {
    private com.google.android.gms.internal.ads.zzbvf zzh;

    zzebt(android.content.Context r1, java.util.concurrent.ScheduledExecutorService r2) {
            r0 = this;
            r0.<init>()
            r0.zze = r1
            com.google.android.gms.ads.internal.util.zzbt r1 = com.google.android.gms.ads.internal.zzu.zzt()
            android.os.Looper r1 = r1.zzb()
            r0.zzf = r1
            r0.zzg = r2
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(android.os.Bundle r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r4 = r3.zzc     // Catch: java.lang.Throwable -> L39
            if (r4 != 0) goto L37
            r4 = 1
            r3.zzc = r4     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbva r0 = r3.zzd     // Catch: java.lang.Throwable -> L1a android.os.RemoteException -> L2b
            com.google.android.gms.internal.ads.zzbvn r0 = r0.zzp()     // Catch: java.lang.Throwable -> L1a android.os.RemoteException -> L2b
            com.google.android.gms.internal.ads.zzbvf r1 = r3.zzh     // Catch: java.lang.Throwable -> L1a android.os.RemoteException -> L2b
            com.google.android.gms.internal.ads.zzeby r2 = new com.google.android.gms.internal.ads.zzeby     // Catch: java.lang.Throwable -> L1a android.os.RemoteException -> L2b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a android.os.RemoteException -> L2b
            r0.zze(r1, r2)     // Catch: java.lang.Throwable -> L1a android.os.RemoteException -> L2b
            monitor-exit(r3)
            return
        L1a:
            r4 = move-exception
            java.lang.String r0 = "RemoteAdsServiceProxyClientTask.onConnected"
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L39
            r1.zzw(r4, r0)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzcas r0 = r3.zza     // Catch: java.lang.Throwable -> L39
            r0.zzd(r4)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)
            return
        L2b:
            com.google.android.gms.internal.ads.zzcas r0 = r3.zza     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzeag r1 = new com.google.android.gms.internal.ads.zzeag     // Catch: java.lang.Throwable -> L39
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L39
            r0.zzd(r1)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)
            return
        L37:
            monitor-exit(r3)
            return
        L39:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvf r3, long r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzb     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.zzcas r3 = r2.zza     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.ScheduledExecutorService r1 = r2.zzg     // Catch: java.lang.Throwable -> L2f
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzo(r3, r4, r0, r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return r3
        L11:
            r0 = 1
            r2.zzb = r0     // Catch: java.lang.Throwable -> L2f
            r2.zzh = r3     // Catch: java.lang.Throwable -> L2f
            r2.zzb()     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzcas r3 = r2.zza     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.ScheduledExecutorService r1 = r2.zzg     // Catch: java.lang.Throwable -> L2f
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzo(r3, r4, r0, r1)     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzebs r4 = new com.google.android.gms.internal.ads.zzebs     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzgfz r5 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Throwable -> L2f
            r3.addListener(r4, r5)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return r3
        L2f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
