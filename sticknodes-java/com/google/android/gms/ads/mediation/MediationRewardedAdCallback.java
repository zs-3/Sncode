package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public interface MediationRewardedAdCallback extends com.google.android.gms.ads.mediation.MediationAdCallback {
    void onAdFailedToShow(com.google.android.gms.ads.AdError r1);

    @java.lang.Deprecated
    void onAdFailedToShow(java.lang.String r1);

    void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem r1);

    void onVideoComplete();

    void onVideoStart();
}
