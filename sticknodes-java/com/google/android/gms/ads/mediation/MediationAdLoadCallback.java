package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(com.google.android.gms.ads.AdError r1);

    @java.lang.Deprecated
    void onFailure(java.lang.String r1);

    MediationAdCallbackT onSuccess(MediationAdT r1);
}
