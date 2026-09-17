package com.google.android.gms.ads.mediation.rtb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public interface SignalCallbacks {
    void onFailure(com.google.android.gms.ads.AdError r1);

    @java.lang.Deprecated
    void onFailure(java.lang.String r1);

    void onSuccess(java.lang.String r1);
}
