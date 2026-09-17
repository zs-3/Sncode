package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class Adapter implements com.google.android.gms.ads.mediation.MediationExtrasReceiver {
    public Adapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.google.android.gms.ads.VersionInfo getSDKVersionInfo();

    public abstract com.google.android.gms.ads.VersionInfo getVersionInfo();

    public abstract void initialize(android.content.Context r1, com.google.android.gms.ads.mediation.InitializationCompleteCallback r2, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> r3);

    public void loadAppOpenAd(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration r4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> r5) {
            r3 = this;
            java.lang.Class r4 = r3.getClass()
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not support app open ads."
            java.lang.String r4 = r4.concat(r1)
            r1 = 7
            java.lang.String r2 = "com.google.android.gms.ads"
            r0.<init>(r1, r4, r2)
            r5.onFailure(r0)
            return
    }

    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration r4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> r5) {
            r3 = this;
            java.lang.Class r4 = r3.getClass()
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not support banner ads."
            java.lang.String r4 = r4.concat(r1)
            r1 = 7
            java.lang.String r2 = "com.google.android.gms.ads"
            r0.<init>(r1, r4, r2)
            r5.onFailure(r0)
            return
    }

    public void loadInterscrollerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration r4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterscrollerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> r5) {
            r3 = this;
            java.lang.Class r4 = r3.getClass()
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not support interscroller ads."
            java.lang.String r4 = r4.concat(r1)
            r1 = 7
            java.lang.String r2 = "com.google.android.gms.ads"
            r0.<init>(r1, r4, r2)
            r5.onFailure(r0)
            return
    }

    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration r4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> r5) {
            r3 = this;
            java.lang.Class r4 = r3.getClass()
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not support interstitial ads."
            java.lang.String r4 = r4.concat(r1)
            r1 = 7
            java.lang.String r2 = "com.google.android.gms.ads"
            r0.<init>(r1, r4, r2)
            r5.onFailure(r0)
            return
    }

    @java.lang.Deprecated
    public void loadNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration r4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> r5) {
            r3 = this;
            java.lang.Class r4 = r3.getClass()
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not support native ads."
            java.lang.String r4 = r4.concat(r1)
            r1 = 7
            java.lang.String r2 = "com.google.android.gms.ads"
            r0.<init>(r1, r4, r2)
            r5.onFailure(r0)
            return
    }

    public void loadNativeAdMapper(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration r1, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> r2) throws android.os.RemoteException {
            r0 = this;
            android.os.RemoteException r1 = new android.os.RemoteException
            java.lang.String r2 = "Method is not found"
            r1.<init>(r2)
            throw r1
    }

    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration r4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> r5) {
            r3 = this;
            java.lang.Class r4 = r3.getClass()
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not support rewarded ads."
            java.lang.String r4 = r4.concat(r1)
            r1 = 7
            java.lang.String r2 = "com.google.android.gms.ads"
            r0.<init>(r1, r4, r2)
            r5.onFailure(r0)
            return
    }

    public void loadRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration r4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> r5) {
            r3 = this;
            java.lang.Class r4 = r3.getClass()
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not support rewarded interstitial ads."
            java.lang.String r4 = r4.concat(r1)
            r1 = 7
            java.lang.String r2 = "com.google.android.gms.ads"
            r0.<init>(r1, r4, r2)
            r5.onFailure(r0)
            return
    }
}
