package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxo extends com.google.android.gms.ads.rewarded.RewardedAd {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbxf zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzbxx zzd;
    private com.google.android.gms.ads.internal.client.zzci zze;
    private com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener zzf;
    private com.google.android.gms.ads.OnPaidEventListener zzg;
    private com.google.android.gms.ads.FullScreenContentCallback zzh;
    private final long zzi;
    private final java.lang.Object zzj;

    public zzbxo(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = r4.getApplicationContext()
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.internal.ads.zzbph r2 = new com.google.android.gms.internal.ads.zzbph
            r2.<init>()
            com.google.android.gms.internal.ads.zzbxf r4 = r1.zzs(r4, r5, r2)
            com.google.android.gms.internal.ads.zzbxx r1 = new com.google.android.gms.internal.ads.zzbxx
            r1.<init>()
            r3.<init>(r0, r5, r4, r1)
            return
    }

    protected zzbxo(android.content.Context r3, java.lang.String r4, com.google.android.gms.internal.ads.zzbxf r5, com.google.android.gms.internal.ads.zzbxx r6) {
            r2 = this;
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzi = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzj = r0
            android.content.Context r3 = r3.getApplicationContext()
            r2.zzc = r3
            r2.zza = r4
            r2.zzb = r5
            r2.zzd = r6
            return
    }

    private final void zzd(android.content.Context r2, com.google.android.gms.internal.ads.zzbpl r3) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzci r0 = r1.zze
            if (r0 != 0) goto Le
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.ads.internal.client.zzci r2 = r0.zzg(r2, r3)
            r1.zze = r2
        Le:
            return
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final android.os.Bundle getAdMetadata() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbxf r0 = r2.zzb     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Lf
            android.os.Bundle r0 = r0.zzb()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        Lf:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final java.lang.String getAdUnitId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
            r1 = this;
            com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
            r1 = this;
            com.google.android.gms.ads.OnPaidEventListener r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
            r3 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzbxf r1 = r3.zzb     // Catch: android.os.RemoteException -> La
            if (r1 == 0) goto L10
            com.google.android.gms.ads.internal.client.zzdy r0 = r1.zzc()     // Catch: android.os.RemoteException -> La
            goto L10
        La:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r1)
        L10:
            com.google.android.gms.ads.ResponseInfo r0 = com.google.android.gms.ads.ResponseInfo.zzb(r0)
            return r0
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.rewarded.RewardItem getRewardItem() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbxf r0 = r2.zzb     // Catch: android.os.RemoteException -> L16
            if (r0 == 0) goto L9
            com.google.android.gms.internal.ads.zzbxc r0 = r0.zzd()     // Catch: android.os.RemoteException -> L16
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Lf
            com.google.android.gms.ads.rewarded.RewardItem r0 = com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD     // Catch: android.os.RemoteException -> L16
            goto L15
        Lf:
            com.google.android.gms.internal.ads.zzbxp r1 = new com.google.android.gms.internal.ads.zzbxp     // Catch: android.os.RemoteException -> L16
            r1.<init>(r0)     // Catch: android.os.RemoteException -> L16
            r0 = r1
        L15:
            return r0
        L16:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            com.google.android.gms.ads.rewarded.RewardItem r0 = com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD
            return r0
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback r2) {
            r1 = this;
            r1.zzh = r2
            com.google.android.gms.internal.ads.zzbxx r0 = r1.zzd
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbxf r0 = r1.zzb     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L7
            r0.zzh(r2)     // Catch: android.os.RemoteException -> L8
        L7:
            return
        L8:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener r3) {
            r2 = this;
            r2.zzf = r3     // Catch: android.os.RemoteException -> Lf
            com.google.android.gms.internal.ads.zzbxf r0 = r2.zzb     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto Le
            com.google.android.gms.ads.internal.client.zzfs r1 = new com.google.android.gms.ads.internal.client.zzfs     // Catch: android.os.RemoteException -> Lf
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lf
            r0.zzi(r1)     // Catch: android.os.RemoteException -> Lf
        Le:
            return
        Lf:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r3) {
            r2 = this;
            r2.zzg = r3     // Catch: android.os.RemoteException -> Lf
            com.google.android.gms.internal.ads.zzbxf r0 = r2.zzb     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto Le
            com.google.android.gms.ads.internal.client.zzft r1 = new com.google.android.gms.ads.internal.client.zzft     // Catch: android.os.RemoteException -> Lf
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lf
            r0.zzj(r1)     // Catch: android.os.RemoteException -> Lf
        Le:
            return
        Lf:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions r3) {
            r2 = this;
            if (r3 == 0) goto L15
            com.google.android.gms.internal.ads.zzbxf r0 = r2.zzb     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzbxt r1 = new com.google.android.gms.internal.ads.zzbxt     // Catch: android.os.RemoteException -> Lf
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lf
            r0.zzl(r1)     // Catch: android.os.RemoteException -> Lf
            return
        Lf:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
        L15:
            return
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(android.app.Activity r2, com.google.android.gms.ads.OnUserEarnedRewardListener r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbxx r0 = r1.zzd
            r0.zzc(r3)
            if (r2 != 0) goto Lc
            java.lang.String r3 = "The activity for show is null, will proceed with show using the context provided when loading the ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
        Lc:
            com.google.android.gms.internal.ads.zzbxf r3 = r1.zzb     // Catch: android.os.RemoteException -> L1f
            if (r3 == 0) goto L1e
            com.google.android.gms.internal.ads.zzbxx r0 = r1.zzd     // Catch: android.os.RemoteException -> L1f
            r3.zzk(r0)     // Catch: android.os.RemoteException -> L1f
            com.google.android.gms.internal.ads.zzbxf r3 = r1.zzb     // Catch: android.os.RemoteException -> L1f
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L1f
            r3.zzm(r2)     // Catch: android.os.RemoteException -> L1f
        L1e:
            return
        L1f:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            return
    }

    public final com.google.android.gms.ads.rewarded.RewardedAd zza() {
            r7 = this;
            r0 = 0
            java.lang.Object r1 = r7.zzj     // Catch: android.os.RemoteException -> L2f
            monitor-enter(r1)     // Catch: android.os.RemoteException -> L2f
            android.content.Context r2 = r7.zzc     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzbph r3 = new com.google.android.gms.internal.ads.zzbph     // Catch: java.lang.Throwable -> L2c
            r3.<init>()     // Catch: java.lang.Throwable -> L2c
            r7.zzd(r2, r3)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.ads.internal.client.zzci r2 = r7.zze     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r7.zza     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzbxf r2 = r2.zzg(r3)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L1f
            java.lang.String r2 = "Failed to obtain a Rewarded Ad from the preloader."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            return r0
        L1f:
            com.google.android.gms.internal.ads.zzbxo r3 = new com.google.android.gms.internal.ads.zzbxo     // Catch: java.lang.Throwable -> L2c
            android.content.Context r4 = r7.zzc     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r7.zza     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzbxx r6 = r7.zzd     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r4, r5, r2, r6)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            return r3
        L2c:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: android.os.RemoteException -> L2f
        L2f:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r1)
            return r0
    }

    public final void zzb(com.google.android.gms.ads.internal.client.zzei r4, com.google.android.gms.ads.rewarded.RewardedAdLoadCallback r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbxf r0 = r3.zzb     // Catch: android.os.RemoteException -> L1c
            if (r0 == 0) goto L1b
            long r0 = r3.zzi     // Catch: android.os.RemoteException -> L1c
            r4.zzq(r0)     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.internal.ads.zzbxf r0 = r3.zzb     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.ads.internal.client.zzr r1 = com.google.android.gms.ads.internal.client.zzr.zza     // Catch: android.os.RemoteException -> L1c
            android.content.Context r2 = r3.zzc     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.ads.internal.client.zzm r4 = r1.zza(r2, r4)     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.internal.ads.zzbxs r1 = new com.google.android.gms.internal.ads.zzbxs     // Catch: android.os.RemoteException -> L1c
            r1.<init>(r5, r3)     // Catch: android.os.RemoteException -> L1c
            r0.zzf(r4, r1)     // Catch: android.os.RemoteException -> L1c
        L1b:
            return
        L1c:
            r4 = move-exception
            java.lang.String r5 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r5, r4)
            return
    }

    public final boolean zzc() {
            r3 = this;
            java.lang.Object r0 = r3.zzj     // Catch: android.os.RemoteException -> L1a
            monitor-enter(r0)     // Catch: android.os.RemoteException -> L1a
            android.content.Context r1 = r3.zzc     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzbph r2 = new com.google.android.gms.internal.ads.zzbph     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            r3.zzd(r1, r2)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.ads.internal.client.zzci r1 = r3.zze     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r3.zza     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.zzl(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: android.os.RemoteException -> L1a
        L1a:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            r0 = 0
            return r0
    }
}
