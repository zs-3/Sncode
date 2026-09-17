package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface MediationNativeListener {
    void onAdClicked(com.google.android.gms.ads.mediation.MediationNativeAdapter r1);

    void onAdClosed(com.google.android.gms.ads.mediation.MediationNativeAdapter r1);

    @java.lang.Deprecated
    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter r1, int r2);

    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter r1, com.google.android.gms.ads.AdError r2);

    void onAdImpression(com.google.android.gms.ads.mediation.MediationNativeAdapter r1);

    void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationNativeAdapter r1);

    void onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter r1, com.google.android.gms.ads.mediation.UnifiedNativeAdMapper r2);

    void onAdOpened(com.google.android.gms.ads.mediation.MediationNativeAdapter r1);

    void onVideoEnd(com.google.android.gms.ads.mediation.MediationNativeAdapter r1);

    void zzd(com.google.android.gms.ads.mediation.MediationNativeAdapter r1, com.google.android.gms.internal.ads.zzbgx r2);

    void zze(com.google.android.gms.ads.mediation.MediationNativeAdapter r1, com.google.android.gms.internal.ads.zzbgx r2, java.lang.String r3);
}
