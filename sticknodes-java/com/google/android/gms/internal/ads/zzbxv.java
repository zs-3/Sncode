package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxv implements com.google.android.gms.ads.mediation.MediationRewardedAdCallback {
    private final com.google.android.gms.internal.ads.zzbpr zza;

    public zzbxv(com.google.android.gms.internal.ads.zzbpr r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called onAdClosed."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L10
            r0.zzf()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(com.google.android.gms.ads.AdError r6) {
            r5 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called onAdFailedToShow."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            int r0 = r6.getCode()
            java.lang.String r1 = r6.getMessage()
            java.lang.String r2 = r6.getDomain()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Mediation ad failed to show: Error Code = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Error Message = "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " Error Domain = "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r5.zza     // Catch: android.os.RemoteException -> L44
            com.google.android.gms.ads.internal.client.zze r6 = r6.zza()     // Catch: android.os.RemoteException -> L44
            r0.zzk(r6)     // Catch: android.os.RemoteException -> L44
            return
        L44:
            r6 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r6)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called onAdFailedToShow."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Mediation ad failed to show: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L1d
            r0.zzl(r3)     // Catch: android.os.RemoteException -> L1d
            return
        L1d:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called onAdOpened."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L10
            r0.zzp()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem r3) {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called onUserEarnedReward."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L15
            com.google.android.gms.internal.ads.zzbxw r1 = new com.google.android.gms.internal.ads.zzbxw     // Catch: android.os.RemoteException -> L15
            r1.<init>(r3)     // Catch: android.os.RemoteException -> L15
            r0.zzt(r1)     // Catch: android.os.RemoteException -> L15
            return
        L15:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called onVideoComplete."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L10
            r0.zzu()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called onVideoStart."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L10
            r0.zzy()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called reportAdClicked."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L10
            r0.zze()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
            r2 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called reportAdImpression."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            com.google.android.gms.internal.ads.zzbpr r0 = r2.zza     // Catch: android.os.RemoteException -> L10
            r0.zzm()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }
}
