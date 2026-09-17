package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends com.google.android.gms.ads.mediation.MediationAdapter {
    android.view.View getBannerView();

    void requestBannerAd(android.content.Context r1, com.google.android.gms.ads.mediation.MediationBannerListener r2, android.os.Bundle r3, com.google.android.gms.ads.AdSize r4, com.google.android.gms.ads.mediation.MediationAdRequest r5, android.os.Bundle r6);
}
