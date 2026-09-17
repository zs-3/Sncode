package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @java.lang.Deprecated
    void onAdFailedToLoad(int r1);

    void onAdFailedToLoad(com.google.android.gms.ads.AdError r1);

    void onAdLeftApplication();

    void onAdOpened();
}
