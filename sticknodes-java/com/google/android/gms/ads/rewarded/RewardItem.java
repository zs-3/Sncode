package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public interface RewardItem {
    public static final com.google.android.gms.ads.rewarded.RewardItem DEFAULT_REWARD = null;

    static {
            com.google.android.gms.ads.rewarded.zza r0 = new com.google.android.gms.ads.rewarded.zza
            r0.<init>()
            com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD = r0
            return
    }

    int getAmount();

    java.lang.String getType();
}
