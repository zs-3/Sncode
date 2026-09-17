package com.google.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza {
    public static final java.lang.String AD_UNIT_ID_PARAMETER = "pubid";
    private com.google.android.gms.ads.AdLoader adLoader;
    protected com.google.android.gms.ads.AdView mAdView;
    protected com.google.android.gms.ads.interstitial.InterstitialAd mInterstitialAd;

    public AbstractAdViewAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    com.google.android.gms.ads.AdRequest buildAdRequest(android.content.Context r4, com.google.android.gms.ads.mediation.MediationAdRequest r5, android.os.Bundle r6, android.os.Bundle r7) {
            r3 = this;
            com.google.android.gms.ads.AdRequest$Builder r0 = new com.google.android.gms.ads.AdRequest$Builder
            r0.<init>()
            java.util.Set r1 = r5.getKeywords()
            if (r1 == 0) goto L1f
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.addKeyword(r2)
            goto Lf
        L1f:
            boolean r1 = r5.isTesting()
            if (r1 == 0) goto L2f
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            java.lang.String r4 = com.google.android.gms.ads.internal.util.client.zzf.zzz(r4)
            r0.zza(r4)
        L2f:
            int r4 = r5.taggedForChildDirectedTreatment()
            r1 = -1
            if (r4 == r1) goto L42
            int r4 = r5.taggedForChildDirectedTreatment()
            r1 = 1
            if (r4 != r1) goto L3e
            goto L3f
        L3e:
            r1 = 0
        L3f:
            r0.zzd(r1)
        L42:
            boolean r4 = r5.isDesignedForFamilies()
            r0.zzb(r4)
            android.os.Bundle r4 = r3.buildExtrasBundle(r6, r7)
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r5 = com.google.ads.mediation.admob.AdMobAdapter.class
            r0.addNetworkExtrasBundle(r5, r4)
            com.google.android.gms.ads.AdRequest r4 = r0.build()
            return r4
    }

    protected abstract android.os.Bundle buildExtrasBundle(android.os.Bundle r1, android.os.Bundle r2);

    public java.lang.String getAdUnitId(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "pubid"
            java.lang.String r2 = r2.getString(r0)
            return r2
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
            r1 = this;
            com.google.android.gms.ads.AdView r0 = r1.mAdView
            return r0
    }

    com.google.android.gms.ads.interstitial.InterstitialAd getInterstitialAd() {
            r1 = this;
            com.google.android.gms.ads.interstitial.InterstitialAd r0 = r1.mInterstitialAd
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.zza
    public com.google.android.gms.ads.internal.client.zzeb getVideoController() {
            r1 = this;
            com.google.android.gms.ads.AdView r0 = r1.mAdView
            if (r0 == 0) goto Ld
            com.google.android.gms.ads.VideoController r0 = r0.zza()
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zza()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    com.google.android.gms.ads.AdLoader.Builder newAdLoader(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.ads.AdLoader$Builder r0 = new com.google.android.gms.ads.AdLoader$Builder
            r0.<init>(r2, r3)
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
            r2 = this;
            com.google.android.gms.ads.AdView r0 = r2.mAdView
            r1 = 0
            if (r0 == 0) goto La
            r0.destroy()
            r2.mAdView = r1
        La:
            com.google.android.gms.ads.interstitial.InterstitialAd r0 = r2.mInterstitialAd
            if (r0 == 0) goto L10
            r2.mInterstitialAd = r1
        L10:
            com.google.android.gms.ads.AdLoader r0 = r2.adLoader
            if (r0 == 0) goto L16
            r2.adLoader = r1
        L16:
            return
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean r2) {
            r1 = this;
            com.google.android.gms.ads.interstitial.InterstitialAd r0 = r1.mInterstitialAd
            if (r0 == 0) goto L7
            r0.setImmersiveMode(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
            r1 = this;
            com.google.android.gms.ads.AdView r0 = r1.mAdView
            if (r0 == 0) goto L7
            r0.pause()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
            r1 = this;
            com.google.android.gms.ads.AdView r0 = r1.mAdView
            if (r0 == 0) goto L7
            r0.resume()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(android.content.Context r4, com.google.android.gms.ads.mediation.MediationBannerListener r5, android.os.Bundle r6, com.google.android.gms.ads.AdSize r7, com.google.android.gms.ads.mediation.MediationAdRequest r8, android.os.Bundle r9) {
            r3 = this;
            com.google.android.gms.ads.AdView r0 = new com.google.android.gms.ads.AdView
            r0.<init>(r4)
            r3.mAdView = r0
            com.google.android.gms.ads.AdSize r1 = new com.google.android.gms.ads.AdSize
            int r2 = r7.getWidth()
            int r7 = r7.getHeight()
            r1.<init>(r2, r7)
            r0.setAdSize(r1)
            com.google.android.gms.ads.AdView r7 = r3.mAdView
            java.lang.String r0 = r3.getAdUnitId(r6)
            r7.setAdUnitId(r0)
            com.google.android.gms.ads.AdView r7 = r3.mAdView
            com.google.ads.mediation.zzb r0 = new com.google.ads.mediation.zzb
            r0.<init>(r3, r5)
            r7.setAdListener(r0)
            com.google.android.gms.ads.AdView r5 = r3.mAdView
            com.google.android.gms.ads.AdRequest r4 = r3.buildAdRequest(r4, r8, r9, r6)
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(android.content.Context r2, com.google.android.gms.ads.mediation.MediationInterstitialListener r3, android.os.Bundle r4, com.google.android.gms.ads.mediation.MediationAdRequest r5, android.os.Bundle r6) {
            r1 = this;
            java.lang.String r0 = r1.getAdUnitId(r4)
            com.google.android.gms.ads.AdRequest r4 = r1.buildAdRequest(r2, r5, r6, r4)
            com.google.ads.mediation.zzc r5 = new com.google.ads.mediation.zzc
            r5.<init>(r1, r3)
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(android.content.Context r6, com.google.android.gms.ads.mediation.MediationNativeListener r7, android.os.Bundle r8, com.google.android.gms.ads.mediation.NativeMediationAdRequest r9, android.os.Bundle r10) {
            r5 = this;
            com.google.ads.mediation.zze r0 = new com.google.ads.mediation.zze
            r0.<init>(r5, r7)
            java.lang.String r7 = "pubid"
            java.lang.String r7 = r8.getString(r7)
            com.google.android.gms.ads.AdLoader$Builder r7 = r5.newAdLoader(r6, r7)
            com.google.android.gms.ads.AdLoader$Builder r7 = r7.withAdListener(r0)
            com.google.android.gms.ads.formats.NativeAdOptions r1 = r9.getNativeAdOptions()
            r7.zzc(r1)
            com.google.android.gms.ads.nativead.NativeAdOptions r1 = r9.getNativeAdRequestOptions()
            r7.withNativeAdOptions(r1)
            boolean r1 = r9.isUnifiedNativeAdRequested()
            if (r1 == 0) goto L2a
            r7.zzb(r0)
        L2a:
            boolean r1 = r9.zzb()
            if (r1 == 0) goto L60
            java.util.Map r1 = r9.zza()
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            java.util.Map r4 = r9.zza()
            java.lang.Object r4 = r4.get(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r3 == r4) goto L5b
            r3 = 0
            goto L5c
        L5b:
            r3 = r0
        L5c:
            r7.zza(r2, r0, r3)
            goto L3c
        L60:
            com.google.android.gms.ads.AdLoader r7 = r7.build()
            r5.adLoader = r7
            com.google.android.gms.ads.AdRequest r6 = r5.buildAdRequest(r6, r9, r10, r8)
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
            r2 = this;
            com.google.android.gms.ads.interstitial.InterstitialAd r0 = r2.mInterstitialAd
            if (r0 == 0) goto L8
            r1 = 0
            UX.aTqO5.a()
        L8:
            return
    }
}
