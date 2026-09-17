package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public interface MediationInterstitialAdCallback extends com.google.android.gms.ads.mediation.MediationAdCallback {
    void onAdFailedToShow(com.google.android.gms.ads.AdError r1);

    @java.lang.Deprecated
    void onAdFailedToShow(java.lang.String r1);

    void onAdLeftApplication();
}
