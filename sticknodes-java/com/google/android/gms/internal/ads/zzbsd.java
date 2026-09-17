package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbsd implements com.google.android.gms.ads.mediation.MediationInterstitialAdapter {
    private android.app.Activity zza;
    private com.google.android.gms.ads.mediation.MediationInterstitialListener zzb;
    private android.net.Uri zzc;

    public zzbsd() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.app.Activity zza(com.google.android.gms.internal.ads.zzbsd r0) {
            android.app.Activity r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.mediation.MediationInterstitialListener zzb(com.google.android.gms.internal.ads.zzbsd r0) {
            com.google.android.gms.ads.mediation.MediationInterstitialListener r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
            r1 = this;
            java.lang.String r0 = "Destroying AdMobCustomTabsAdapter adapter."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
            r1 = this;
            java.lang.String r0 = "Pausing AdMobCustomTabsAdapter adapter."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
            r1 = this;
            java.lang.String r0 = "Resuming AdMobCustomTabsAdapter adapter."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(android.content.Context r1, com.google.android.gms.ads.mediation.MediationInterstitialListener r2, android.os.Bundle r3, com.google.android.gms.ads.mediation.MediationAdRequest r4, android.os.Bundle r5) {
            r0 = this;
            r0.zzb = r2
            if (r2 != 0) goto La
            java.lang.String r1 = "Listener not set for mediation. Returning."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        La:
            boolean r2 = r1 instanceof android.app.Activity
            r4 = 0
            if (r2 == 0) goto L47
            boolean r2 = com.google.android.gms.internal.ads.zzbds.zzg(r1)
            if (r2 != 0) goto L20
            java.lang.String r1 = "Default browser does not support custom tabs. Bailing out."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r1 = r0.zzb
            r1.onAdFailedToLoad(r0, r4)
            return
        L20:
            java.lang.String r2 = "tab_url"
            java.lang.String r2 = r3.getString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L37
            java.lang.String r1 = "The tab_url retrieved from mediation metadata is empty. Bailing out."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r1 = r0.zzb
            r1.onAdFailedToLoad(r0, r4)
            return
        L37:
            android.app.Activity r1 = (android.app.Activity) r1
            r0.zza = r1
            android.net.Uri r1 = android.net.Uri.parse(r2)
            r0.zzc = r1
            com.google.android.gms.ads.mediation.MediationInterstitialListener r1 = r0.zzb
            r1.onAdLoaded(r0)
            return
        L47:
            java.lang.String r1 = "AdMobCustomTabs can only work with Activity context. Bailing out."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            com.google.android.gms.ads.mediation.MediationInterstitialListener r1 = r0.zzb
            r1.onAdFailedToLoad(r0, r4)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
            r11 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = new androidx.browser.customtabs.CustomTabsIntent$Builder
            r0.<init>()
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            android.content.Intent r1 = r0.intent
            android.net.Uri r2 = r11.zzc
            r1.setData(r2)
            com.google.android.gms.ads.internal.overlay.zzc r4 = new com.google.android.gms.ads.internal.overlay.zzc
            android.content.Intent r0 = r0.intent
            r1 = 0
            r4.<init>(r0, r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzbsb r6 = new com.google.android.gms.internal.ads.zzbsb
            r6.<init>(r11)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            r1 = 0
            r8.<init>(r1, r1, r1)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.google.android.gms.internal.ads.zzfun r1 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzbsc r2 = new com.google.android.gms.internal.ads.zzbsc
            r2.<init>(r11, r0)
            r1.post(r2)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            r0.zzq()
            return
    }
}
