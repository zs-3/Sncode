package com.google.android.gms.ads.mediation.rtb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class RtbAdapter extends com.google.android.gms.ads.mediation.Adapter {
    public RtbAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData r1, com.google.android.gms.ads.mediation.rtb.SignalCallbacks r2);

    public void loadRtbAppOpenAd(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration r1, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> r2) {
            r0 = this;
            r0.loadAppOpenAd(r1, r2)
            return
    }

    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration r1, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> r2) {
            r0 = this;
            UX.aTqO5.a()
            return
    }

    public void loadRtbInterscrollerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration r4, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterscrollerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> r5) {
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

    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration r1, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> r2) {
            r0 = this;
            UX.aTqO5.a()
            return
    }

    @java.lang.Deprecated
    public void loadRtbNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration r1, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> r2) {
            r0 = this;
            UX.aTqO5.a()
            return
    }

    public void loadRtbNativeAdMapper(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration r1, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> r2) throws android.os.RemoteException {
            r0 = this;
            r0.loadNativeAdMapper(r1, r2)
            return
    }

    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration r1, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> r2) {
            r0 = this;
            r0.loadRewardedAd(r1, r2)
            return
    }

    public void loadRtbRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration r1, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> r2) {
            r0 = this;
            r0.loadRewardedInterstitialAd(r1, r2)
            return
    }
}
