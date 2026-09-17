package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbry implements com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback {
    final com.google.android.gms.internal.ads.zzbpr zza;

    zzbry(com.google.android.gms.internal.ads.zzbpr r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zzf()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void onAdFailedToShow(com.google.android.gms.ads.AdError r6) {
            r5 = this;
            int r0 = r6.getCode()     // Catch: android.os.RemoteException -> L39
            java.lang.String r1 = r6.getMessage()     // Catch: android.os.RemoteException -> L39
            java.lang.String r2 = r6.getDomain()     // Catch: android.os.RemoteException -> L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L39
            r3.<init>()     // Catch: android.os.RemoteException -> L39
            java.lang.String r4 = "Mediated ad failed to show: Error Code = "
            r3.append(r4)     // Catch: android.os.RemoteException -> L39
            r3.append(r0)     // Catch: android.os.RemoteException -> L39
            java.lang.String r0 = ". Error Message = "
            r3.append(r0)     // Catch: android.os.RemoteException -> L39
            r3.append(r1)     // Catch: android.os.RemoteException -> L39
            java.lang.String r0 = " Error Domain = "
            r3.append(r0)     // Catch: android.os.RemoteException -> L39
            r3.append(r2)     // Catch: android.os.RemoteException -> L39
            java.lang.String r0 = r3.toString()     // Catch: android.os.RemoteException -> L39
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: android.os.RemoteException -> L39
            com.google.android.gms.internal.ads.zzbpr r0 = r5.zza     // Catch: android.os.RemoteException -> L39
            com.google.android.gms.ads.internal.client.zze r6 = r6.zza()     // Catch: android.os.RemoteException -> L39
            r0.zzk(r6)     // Catch: android.os.RemoteException -> L39
        L39:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L19
            r0.<init>()     // Catch: android.os.RemoteException -> L19
            java.lang.String r1 = "Mediated ad failed to show: "
            r0.append(r1)     // Catch: android.os.RemoteException -> L19
            r0.append(r3)     // Catch: android.os.RemoteException -> L19
            java.lang.String r0 = r0.toString()     // Catch: android.os.RemoteException -> L19
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: android.os.RemoteException -> L19
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L19
            r0.zzl(r3)     // Catch: android.os.RemoteException -> L19
        L19:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zzn()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zzp()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> La
            com.google.android.gms.internal.ads.zzbxw r1 = new com.google.android.gms.internal.ads.zzbxw     // Catch: android.os.RemoteException -> La
            r1.<init>(r3)     // Catch: android.os.RemoteException -> La
            r0.zzt(r1)     // Catch: android.os.RemoteException -> La
        La:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zzv()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zzw()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zzx()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zzy()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zze()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: android.os.RemoteException -> L5
            r0.zzm()     // Catch: android.os.RemoteException -> L5
        L5:
            return
    }
}
