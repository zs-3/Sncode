package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends com.google.android.gms.ads.mediation.customevent.CustomEvent {
    void requestInterstitialAd(android.content.Context r1, com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener r2, java.lang.String r3, com.google.android.gms.ads.mediation.MediationAdRequest r4, android.os.Bundle r5);

    void showInterstitial();
}
