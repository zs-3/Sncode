package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdkWithMembers
@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter {
    static final com.google.android.gms.ads.AdError zza = null;
    com.google.android.gms.ads.mediation.customevent.CustomEventBanner zzb;
    com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial zzc;
    com.google.android.gms.ads.mediation.customevent.CustomEventNative zzd;
    private android.view.View zze;

    static {
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            r1 = 0
            java.lang.String r2 = "Could not instantiate custom event adapter"
            java.lang.String r3 = "com.google.android.gms.ads"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zza = r0
            return
    }

    public CustomEventAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void zza(com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r0, android.view.View r1) {
            r0.zze = r1
            return
    }

    private static java.lang.Object zzb(java.lang.Class r3, java.lang.String r4) {
            java.util.Objects.requireNonNull(r4)
            java.lang.Class r0 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L19
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r3.cast(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not instantiate custom event adapter: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ". "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
            r1 = this;
            android.view.View r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
            r1 = this;
            com.google.android.gms.ads.mediation.customevent.CustomEventBanner r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.onDestroy()
        L7:
            com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial r0 = r1.zzc
            if (r0 == 0) goto Le
            r0.onDestroy()
        Le:
            com.google.android.gms.ads.mediation.customevent.CustomEventNative r0 = r1.zzd
            if (r0 == 0) goto L15
            r0.onDestroy()
        L15:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
            r1 = this;
            com.google.android.gms.ads.mediation.customevent.CustomEventBanner r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.onPause()
        L7:
            com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial r0 = r1.zzc
            if (r0 == 0) goto Le
            r0.onPause()
        Le:
            com.google.android.gms.ads.mediation.customevent.CustomEventNative r0 = r1.zzd
            if (r0 == 0) goto L15
            r0.onPause()
        L15:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
            r1 = this;
            com.google.android.gms.ads.mediation.customevent.CustomEventBanner r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.onResume()
        L7:
            com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial r0 = r1.zzc
            if (r0 == 0) goto Le
            r0.onResume()
        Le:
            com.google.android.gms.ads.mediation.customevent.CustomEventNative r0 = r1.zzd
            if (r0 == 0) goto L15
            r0.onResume()
        L15:
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(android.content.Context r8, com.google.android.gms.ads.mediation.MediationBannerListener r9, android.os.Bundle r10, com.google.android.gms.ads.AdSize r11, com.google.android.gms.ads.mediation.MediationAdRequest r12, android.os.Bundle r13) {
            r7 = this;
            java.lang.Class<com.google.android.gms.ads.mediation.customevent.CustomEventBanner> r0 = com.google.android.gms.ads.mediation.customevent.CustomEventBanner.class
            java.lang.String r1 = "class_name"
            java.lang.String r2 = r10.getString(r1)
            java.lang.Object r0 = zzb(r0, r2)
            com.google.android.gms.ads.mediation.customevent.CustomEventBanner r0 = (com.google.android.gms.ads.mediation.customevent.CustomEventBanner) r0
            r7.zzb = r0
            if (r0 != 0) goto L18
            com.google.android.gms.ads.AdError r8 = com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zza
            r9.onAdFailedToLoad(r7, r8)
            return
        L18:
            if (r13 != 0) goto L1c
            r13 = 0
            goto L24
        L1c:
            java.lang.String r0 = r10.getString(r1)
            android.os.Bundle r13 = r13.getBundle(r0)
        L24:
            r6 = r13
            com.google.android.gms.ads.mediation.customevent.CustomEventBanner r0 = r7.zzb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.ads.mediation.customevent.zza r2 = new com.google.android.gms.ads.mediation.customevent.zza
            r2.<init>(r7, r9)
            java.lang.String r9 = "parameter"
            java.lang.String r3 = r10.getString(r9)
            r1 = r8
            r4 = r11
            r5 = r12
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(android.content.Context r7, com.google.android.gms.ads.mediation.MediationInterstitialListener r8, android.os.Bundle r9, com.google.android.gms.ads.mediation.MediationAdRequest r10, android.os.Bundle r11) {
            r6 = this;
            java.lang.Class<com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial> r0 = com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial.class
            java.lang.String r1 = "class_name"
            java.lang.String r2 = r9.getString(r1)
            java.lang.Object r0 = zzb(r0, r2)
            com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial r0 = (com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial) r0
            r6.zzc = r0
            if (r0 != 0) goto L18
            com.google.android.gms.ads.AdError r7 = com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zza
            r8.onAdFailedToLoad(r6, r7)
            return
        L18:
            if (r11 != 0) goto L1c
            r11 = 0
            goto L24
        L1c:
            java.lang.String r0 = r9.getString(r1)
            android.os.Bundle r11 = r11.getBundle(r0)
        L24:
            r5 = r11
            com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial r0 = r6.zzc
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.ads.mediation.customevent.zzb r2 = new com.google.android.gms.ads.mediation.customevent.zzb
            r2.<init>(r6, r6, r8)
            java.lang.String r8 = "parameter"
            java.lang.String r3 = r9.getString(r8)
            r1 = r7
            r4 = r10
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(android.content.Context r7, com.google.android.gms.ads.mediation.MediationNativeListener r8, android.os.Bundle r9, com.google.android.gms.ads.mediation.NativeMediationAdRequest r10, android.os.Bundle r11) {
            r6 = this;
            java.lang.Class<com.google.android.gms.ads.mediation.customevent.CustomEventNative> r0 = com.google.android.gms.ads.mediation.customevent.CustomEventNative.class
            java.lang.String r1 = "class_name"
            java.lang.String r2 = r9.getString(r1)
            java.lang.Object r0 = zzb(r0, r2)
            com.google.android.gms.ads.mediation.customevent.CustomEventNative r0 = (com.google.android.gms.ads.mediation.customevent.CustomEventNative) r0
            r6.zzd = r0
            if (r0 != 0) goto L18
            com.google.android.gms.ads.AdError r7 = com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zza
            r8.onAdFailedToLoad(r6, r7)
            return
        L18:
            if (r11 != 0) goto L1c
            r11 = 0
            goto L24
        L1c:
            java.lang.String r0 = r9.getString(r1)
            android.os.Bundle r11 = r11.getBundle(r0)
        L24:
            r5 = r11
            com.google.android.gms.ads.mediation.customevent.CustomEventNative r0 = r6.zzd
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.ads.mediation.customevent.zzc r2 = new com.google.android.gms.ads.mediation.customevent.zzc
            r2.<init>(r6, r8)
            java.lang.String r8 = "parameter"
            java.lang.String r3 = r9.getString(r8)
            r1 = r7
            r4 = r10
            r0.requestNativeAd(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
            r1 = this;
            com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial r0 = r1.zzc
            if (r0 == 0) goto L7
            UX.aTqO5.a()
        L7:
            return
    }
}
