package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdzo extends com.google.android.gms.internal.ads.zzdzr {
    private final android.content.Context zzg;
    private final java.util.concurrent.Executor zzh;

    public zzdzo(android.content.Context r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r1.<init>()
            r1.zzg = r2
            r1.zzh = r3
            com.google.android.gms.ads.internal.util.zzbt r3 = com.google.android.gms.ads.internal.zzu.zzt()
            android.os.Looper r3 = r3.zzb()
            com.google.android.gms.internal.ads.zzbux r0 = new com.google.android.gms.internal.ads.zzbux
            r0.<init>(r2, r3, r1, r1)
            r1.zzf = r0
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r5) {
            r4 = this;
            java.lang.Object r5 = r4.zzb
            monitor-enter(r5)
            boolean r0 = r4.zzd     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3a
            r0 = 1
            r4.zzd = r0     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbux r1 = r4.zzf     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzbvj r1 = r1.zzp()     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzbwa r2 = r4.zze     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzdzq r3 = new com.google.android.gms.internal.ads.zzdzq     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L30
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L30
            r1.zzg(r2, r3)     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L30
            goto L3a
        L1b:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "RemoteAdRequestClientTask.onConnected"
            r2.zzw(r1, r3)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzcas r1 = r4.zza     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzeag r2 = new com.google.android.gms.internal.ads.zzeag     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L30:
            com.google.android.gms.internal.ads.zzcas r1 = r4.zza     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzeag r2 = new com.google.android.gms.internal.ads.zzeag     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdzr, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            java.lang.String r2 = "Cannot connect to remote service, fallback to local instance."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzeag r2 = new com.google.android.gms.internal.ads.zzeag
            r0 = 1
            r2.<init>(r0)
            com.google.android.gms.internal.ads.zzcas r0 = r1.zza
            r0.zzd(r2)
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbwa r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            boolean r1 = r3.zzc     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Lb
            com.google.android.gms.internal.ads.zzcas r4 = r3.zza     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r4
        Lb:
            r1 = 1
            r3.zzc = r1     // Catch: java.lang.Throwable -> L2e
            r3.zze = r4     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzbux r4 = r3.zzf     // Catch: java.lang.Throwable -> L2e
            r4.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzcas r4 = r3.zza     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzdzn r1 = new com.google.android.gms.internal.ads.zzdzn     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Throwable -> L2e
            r4.addListener(r1, r2)     // Catch: java.lang.Throwable -> L2e
            android.content.Context r4 = r3.zzg     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzcas r1 = r3.zza     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.Executor r2 = r3.zzh     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzdzr.zzc(r4, r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzcas r4 = r3.zza     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r4
        L2e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r4
    }
}
