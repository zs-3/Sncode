package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdzx extends com.google.android.gms.internal.ads.zzdzr {
    private java.lang.String zzg;
    private int zzh;

    zzdzx(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.zzh = r0
            com.google.android.gms.ads.internal.util.zzbt r0 = com.google.android.gms.ads.internal.zzu.zzt()
            android.os.Looper r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzbux r1 = new com.google.android.gms.internal.ads.zzbux
            r1.<init>(r3, r0, r2, r2)
            r2.zzf = r1
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r5) {
            r4 = this;
            java.lang.Object r5 = r4.zzb
            monitor-enter(r5)
            boolean r0 = r4.zzd     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L5e
            r0 = 1
            r4.zzd = r0     // Catch: java.lang.Throwable -> L60
            int r1 = r4.zzh     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            r2 = 2
            if (r1 != r2) goto L20
            com.google.android.gms.internal.ads.zzbux r1 = r4.zzf     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzbvj r1 = r1.zzp()     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzbwa r2 = r4.zze     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzdzq r3 = new com.google.android.gms.internal.ads.zzdzq     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            r1.zze(r2, r3)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            goto L5e
        L20:
            r2 = 3
            if (r1 != r2) goto L34
            com.google.android.gms.internal.ads.zzbux r1 = r4.zzf     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzbvj r1 = r1.zzp()     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            java.lang.String r2 = r4.zzg     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzdzq r3 = new com.google.android.gms.internal.ads.zzdzq     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            r1.zzh(r2, r3)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            goto L5e
        L34:
            com.google.android.gms.internal.ads.zzcas r1 = r4.zza     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzeag r2 = new com.google.android.gms.internal.ads.zzeag     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L54
            goto L5e
        L3f:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "RemoteUrlAndCacheKeyClientTask.onConnected"
            r2.zzw(r1, r3)     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzcas r1 = r4.zza     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzeag r2 = new com.google.android.gms.internal.ads.zzeag     // Catch: java.lang.Throwable -> L60
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L60
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L60
            goto L5e
        L54:
            com.google.android.gms.internal.ads.zzcas r1 = r4.zza     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzeag r2 = new com.google.android.gms.internal.ads.zzeag     // Catch: java.lang.Throwable -> L60
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L60
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            return
        L60:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
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

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbwa r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            int r1 = r4.zzh     // Catch: java.lang.Throwable -> L39
            r2 = 1
            r3 = 2
            if (r1 == r2) goto L16
            if (r1 == r3) goto L16
            com.google.android.gms.internal.ads.zzeag r5 = new com.google.android.gms.internal.ads.zzeag     // Catch: java.lang.Throwable -> L39
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L39
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzg(r5)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r5
        L16:
            boolean r1 = r4.zzc     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L1e
            com.google.android.gms.internal.ads.zzcas r5 = r4.zza     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r5
        L1e:
            r4.zzh = r3     // Catch: java.lang.Throwable -> L39
            r4.zzc = r2     // Catch: java.lang.Throwable -> L39
            r4.zze = r5     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbux r5 = r4.zzf     // Catch: java.lang.Throwable -> L39
            r5.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzcas r5 = r4.zza     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzdzv r1 = new com.google.android.gms.internal.ads.zzdzv     // Catch: java.lang.Throwable -> L39
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Throwable -> L39
            r5.addListener(r1, r2)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzcas r5 = r4.zza     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r5
        L39:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r5
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            int r1 = r4.zzh     // Catch: java.lang.Throwable -> L3a
            r2 = 3
            r3 = 1
            if (r1 == r3) goto L17
            if (r1 == r2) goto L17
            com.google.android.gms.internal.ads.zzeag r5 = new com.google.android.gms.internal.ads.zzeag     // Catch: java.lang.Throwable -> L3a
            r1 = 2
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L3a
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzg(r5)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return r5
        L17:
            boolean r1 = r4.zzc     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzcas r5 = r4.zza     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return r5
        L1f:
            r4.zzh = r2     // Catch: java.lang.Throwable -> L3a
            r4.zzc = r3     // Catch: java.lang.Throwable -> L3a
            r4.zzg = r5     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzbux r5 = r4.zzf     // Catch: java.lang.Throwable -> L3a
            r5.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzcas r5 = r4.zza     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzdzw r1 = new com.google.android.gms.internal.ads.zzdzw     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Throwable -> L3a
            r5.addListener(r1, r2)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzcas r5 = r4.zza     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return r5
        L3a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r5
    }
}
