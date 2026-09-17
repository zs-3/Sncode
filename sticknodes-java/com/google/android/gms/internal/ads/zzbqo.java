package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbqo implements com.google.android.gms.ads.mediation.MediationBannerListener, com.google.android.gms.ads.mediation.MediationInterstitialListener, com.google.android.gms.ads.mediation.MediationNativeListener {
    private final com.google.android.gms.internal.ads.zzbpr zza;
    private com.google.android.gms.ads.mediation.UnifiedNativeAdMapper zzb;
    private com.google.android.gms.internal.ads.zzbgx zzc;

    public zzbqo(com.google.android.gms.internal.ads.zzbpr r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(com.google.android.gms.ads.mediation.MediationBannerAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdClicked."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zze()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(com.google.android.gms.ads.mediation.MediationInterstitialAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdClicked."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zze()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(com.google.android.gms.ads.mediation.MediationNativeAdapter r3) {
            r2 = this;
            java.lang.String r3 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r3)
            com.google.android.gms.ads.mediation.UnifiedNativeAdMapper r3 = r2.zzb
            com.google.android.gms.internal.ads.zzbgx r0 = r2.zzc
            java.lang.String r1 = "#007 Could not call remote method."
            if (r0 != 0) goto L21
            if (r3 != 0) goto L14
            r3 = 0
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r3)
            return
        L14:
            boolean r3 = r3.getOverrideClickHandling()
            if (r3 == 0) goto L1b
            goto L21
        L1b:
            java.lang.String r3 = "Could not call onAdClicked since setOverrideClickHandling is not set to true"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            return
        L21:
            java.lang.String r3 = "Adapter called onAdClicked."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            com.google.android.gms.internal.ads.zzbpr r3 = r2.zza     // Catch: android.os.RemoteException -> L2c
            r3.zze()     // Catch: android.os.RemoteException -> L2c
            return
        L2c:
            r3 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(com.google.android.gms.ads.mediation.MediationBannerAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdClosed."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzf()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(com.google.android.gms.ads.mediation.MediationInterstitialAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdClosed."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzf()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(com.google.android.gms.ads.mediation.MediationNativeAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdClosed."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzf()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter r2, int r3) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Adapter called onAdFailedToLoad with error. "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L1f
            r2.zzg(r3)     // Catch: android.os.RemoteException -> L1f
            return
        L1f:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter r5, com.google.android.gms.ads.AdError r6) {
            r4 = this;
            java.lang.String r5 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r5)
            int r5 = r6.getCode()
            java.lang.String r0 = r6.getMessage()
            java.lang.String r1 = r6.getDomain()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Adapter called onAdFailedToLoad with error. ErrorCode: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ". ErrorMessage: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ". ErrorDomain: "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r5)
            com.google.android.gms.internal.ads.zzbpr r5 = r4.zza     // Catch: android.os.RemoteException -> L3f
            com.google.android.gms.ads.internal.client.zze r6 = r6.zza()     // Catch: android.os.RemoteException -> L3f
            r5.zzh(r6)     // Catch: android.os.RemoteException -> L3f
            return
        L3f:
            r5 = move-exception
            java.lang.String r6 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r6, r5)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationInterstitialAdapter r2, int r3) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Adapter called onAdFailedToLoad with error "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "."
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L24
            r2.zzg(r3)     // Catch: android.os.RemoteException -> L24
            return
        L24:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationInterstitialAdapter r5, com.google.android.gms.ads.AdError r6) {
            r4 = this;
            java.lang.String r5 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r5)
            int r5 = r6.getCode()
            java.lang.String r0 = r6.getMessage()
            java.lang.String r1 = r6.getDomain()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Adapter called onAdFailedToLoad with error. ErrorCode: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ". ErrorMessage: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ". ErrorDomain: "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r5)
            com.google.android.gms.internal.ads.zzbpr r5 = r4.zza     // Catch: android.os.RemoteException -> L3f
            com.google.android.gms.ads.internal.client.zze r6 = r6.zza()     // Catch: android.os.RemoteException -> L3f
            r5.zzh(r6)     // Catch: android.os.RemoteException -> L3f
            return
        L3f:
            r5 = move-exception
            java.lang.String r6 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r6, r5)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter r2, int r3) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Adapter called onAdFailedToLoad with error "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "."
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L24
            r2.zzg(r3)     // Catch: android.os.RemoteException -> L24
            return
        L24:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter r5, com.google.android.gms.ads.AdError r6) {
            r4 = this;
            java.lang.String r5 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r5)
            int r5 = r6.getCode()
            java.lang.String r0 = r6.getMessage()
            java.lang.String r1 = r6.getDomain()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Adapter called onAdFailedToLoad with error. ErrorCode: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ". ErrorMessage: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ". ErrorDomain: "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r5)
            com.google.android.gms.internal.ads.zzbpr r5 = r4.zza     // Catch: android.os.RemoteException -> L3f
            com.google.android.gms.ads.internal.client.zze r6 = r6.zza()     // Catch: android.os.RemoteException -> L3f
            r5.zzh(r6)     // Catch: android.os.RemoteException -> L3f
            return
        L3f:
            r5 = move-exception
            java.lang.String r6 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r6, r5)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(com.google.android.gms.ads.mediation.MediationNativeAdapter r3) {
            r2 = this;
            java.lang.String r3 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r3)
            com.google.android.gms.ads.mediation.UnifiedNativeAdMapper r3 = r2.zzb
            com.google.android.gms.internal.ads.zzbgx r0 = r2.zzc
            java.lang.String r1 = "#007 Could not call remote method."
            if (r0 != 0) goto L21
            if (r3 != 0) goto L14
            r3 = 0
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r3)
            return
        L14:
            boolean r3 = r3.getOverrideImpressionRecording()
            if (r3 == 0) goto L1b
            goto L21
        L1b:
            java.lang.String r3 = "Could not call onAdImpression since setOverrideImpressionRecording is not set to true"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            return
        L21:
            java.lang.String r3 = "Adapter called onAdImpression."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r3)
            com.google.android.gms.internal.ads.zzbpr r3 = r2.zza     // Catch: android.os.RemoteException -> L2c
            r3.zzm()     // Catch: android.os.RemoteException -> L2c
            return
        L2c:
            r3 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r3)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationBannerAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdLeftApplication."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzn()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationInterstitialAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdLeftApplication."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzn()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationNativeAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdLeftApplication."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzn()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(com.google.android.gms.ads.mediation.MediationBannerAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdLoaded."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzo()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(com.google.android.gms.ads.mediation.MediationInterstitialAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdLoaded."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzo()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter r2, com.google.android.gms.ads.mediation.UnifiedNativeAdMapper r3) {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            java.lang.String r0 = "Adapter called onAdLoaded."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            r1.zzb = r3
            boolean r2 = r2 instanceof com.google.ads.mediation.admob.AdMobAdapter
            if (r2 == 0) goto L11
            goto L29
        L11:
            com.google.android.gms.ads.VideoController r2 = new com.google.android.gms.ads.VideoController
            r2.<init>()
            com.google.android.gms.internal.ads.zzbqb r0 = new com.google.android.gms.internal.ads.zzbqb
            r0.<init>()
            r2.zzb(r0)
            if (r3 == 0) goto L29
            boolean r0 = UX.aTqO5.m0a()
            if (r0 == 0) goto L29
            r3.zze(r2)
        L29:
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L2f
            r2.zzo()     // Catch: android.os.RemoteException -> L2f
            return
        L2f:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(com.google.android.gms.ads.mediation.MediationBannerAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdOpened."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzp()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(com.google.android.gms.ads.mediation.MediationInterstitialAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdOpened."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzp()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(com.google.android.gms.ads.mediation.MediationNativeAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onAdOpened."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzp()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(com.google.android.gms.ads.mediation.MediationNativeAdapter r2) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = "Adapter called onVideoEnd."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L10
            r2.zzv()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r2)
            return
    }

    public final com.google.android.gms.ads.mediation.UnifiedNativeAdMapper zza() {
            r1 = this;
            com.google.android.gms.ads.mediation.UnifiedNativeAdMapper r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzb(com.google.android.gms.ads.mediation.MediationBannerAdapter r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            java.lang.String r1 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r1)
            java.lang.String r1 = "Adapter called onAppEvent."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)
            com.google.android.gms.internal.ads.zzbpr r1 = r0.zza     // Catch: android.os.RemoteException -> L10
            r1.zzq(r2, r3)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r1)
            return
    }

    public final com.google.android.gms.internal.ads.zzbgx zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgx r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzd(com.google.android.gms.ads.mediation.MediationNativeAdapter r2, com.google.android.gms.internal.ads.zzbgx r3) {
            r1 = this;
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r2)
            java.lang.String r2 = r3.zzb()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Adapter called onAdLoaded with template id "
            java.lang.String r2 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            r1.zzc = r3
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> L1e
            r2.zzo()     // Catch: android.os.RemoteException -> L1e
            return
        L1e:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r3, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(com.google.android.gms.ads.mediation.MediationNativeAdapter r1, com.google.android.gms.internal.ads.zzbgx r2, java.lang.String r3) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbpr r1 = r0.zza     // Catch: android.os.RemoteException -> La
            com.google.android.gms.internal.ads.zzbgw r2 = r2.zza()     // Catch: android.os.RemoteException -> La
            r1.zzr(r2, r3)     // Catch: android.os.RemoteException -> La
            return
        La:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r1)
            return
    }
}
