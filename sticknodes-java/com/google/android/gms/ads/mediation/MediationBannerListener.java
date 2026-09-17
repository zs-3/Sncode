package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface MediationBannerListener {
    void onAdClicked(com.google.android.gms.ads.mediation.MediationBannerAdapter r1);

    void onAdClosed(com.google.android.gms.ads.mediation.MediationBannerAdapter r1);

    @java.lang.Deprecated
    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter r1, int r2);

    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter r1, com.google.android.gms.ads.AdError r2);

    void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationBannerAdapter r1);

    void onAdLoaded(com.google.android.gms.ads.mediation.MediationBannerAdapter r1);

    void onAdOpened(com.google.android.gms.ads.mediation.MediationBannerAdapter r1);

    void zzb(com.google.android.gms.ads.mediation.MediationBannerAdapter r1, java.lang.String r2, java.lang.String r3);
}
