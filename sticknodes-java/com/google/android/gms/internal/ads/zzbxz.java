package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxz extends com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbxf zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzbxx zzd;
    private com.google.android.gms.ads.FullScreenContentCallback zze;
    private com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener zzf;
    private com.google.android.gms.ads.OnPaidEventListener zzg;
    private final long zzh;

    public zzbxz(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzh = r0
            r2.zza = r4
            android.content.Context r0 = r3.getApplicationContext()
            r2.zzc = r0
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.internal.ads.zzbph r1 = new com.google.android.gms.internal.ads.zzbph
            r1.<init>()
            com.google.android.gms.internal.ads.zzbxf r3 = r0.zzs(r3, r4, r1)
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzbxx r3 = new com.google.android.gms.internal.ads.zzbxx
            r3.<init>()
            r2.zzd = r3
            return
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
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

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final java.lang.String getAdUnitId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
            r1 = this;
            com.google.android.gms.ads.FullScreenContentCallback r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
            r1 = this;
            com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
            r1 = this;
            com.google.android.gms.ads.OnPaidEventListener r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
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

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.rewarded.RewardItem getRewardItem() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbxf r0 = r2.zzb     // Catch: android.os.RemoteException -> L12
            if (r0 == 0) goto L9
            com.google.android.gms.internal.ads.zzbxc r0 = r0.zzd()     // Catch: android.os.RemoteException -> L12
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzbxp r1 = new com.google.android.gms.internal.ads.zzbxp     // Catch: android.os.RemoteException -> L12
            r1.<init>(r0)     // Catch: android.os.RemoteException -> L12
            return r1
        L12:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        L18:
            com.google.android.gms.ads.rewarded.RewardItem r0 = com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD
            return r0
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback r2) {
            r1 = this;
            r1.zze = r2
            com.google.android.gms.internal.ads.zzbxx r0 = r1.zzd
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
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

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener r3) {
            r2 = this;
            r2.zzf = r3
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

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r3) {
            r2 = this;
            r2.zzg = r3
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

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbxf r0 = r2.zzb     // Catch: android.os.RemoteException -> Ld
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzbxt r1 = new com.google.android.gms.internal.ads.zzbxt     // Catch: android.os.RemoteException -> Ld
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Ld
            r0.zzl(r1)     // Catch: android.os.RemoteException -> Ld
        Lc:
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(android.app.Activity r2, com.google.android.gms.ads.OnUserEarnedRewardListener r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbxx r0 = r1.zzd
            r0.zzc(r3)
            com.google.android.gms.internal.ads.zzbxf r3 = r1.zzb     // Catch: android.os.RemoteException -> L18
            if (r3 == 0) goto L17
            com.google.android.gms.internal.ads.zzbxx r0 = r1.zzd     // Catch: android.os.RemoteException -> L18
            r3.zzk(r0)     // Catch: android.os.RemoteException -> L18
            com.google.android.gms.internal.ads.zzbxf r3 = r1.zzb     // Catch: android.os.RemoteException -> L18
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L18
            r3.zzm(r2)     // Catch: android.os.RemoteException -> L18
        L17:
            return
        L18:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            return
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzei r4, com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbxf r0 = r3.zzb     // Catch: android.os.RemoteException -> L1c
            if (r0 == 0) goto L1b
            long r0 = r3.zzh     // Catch: android.os.RemoteException -> L1c
            r4.zzq(r0)     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.internal.ads.zzbxf r0 = r3.zzb     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.ads.internal.client.zzr r1 = com.google.android.gms.ads.internal.client.zzr.zza     // Catch: android.os.RemoteException -> L1c
            android.content.Context r2 = r3.zzc     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.ads.internal.client.zzm r4 = r1.zza(r2, r4)     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.internal.ads.zzbxy r1 = new com.google.android.gms.internal.ads.zzbxy     // Catch: android.os.RemoteException -> L1c
            r1.<init>(r5, r3)     // Catch: android.os.RemoteException -> L1c
            r0.zzg(r4, r1)     // Catch: android.os.RemoteException -> L1c
        L1b:
            return
        L1c:
            r4 = move-exception
            java.lang.String r5 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r5, r4)
            return
    }
}
