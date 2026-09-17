package com.google.android.gms.games.stats;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface PlayerStats extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.stats.PlayerStats>, android.os.Parcelable {
    public static final float UNSET_VALUE = -1.0f;

    float getAverageSessionLength();

    @java.lang.Deprecated
    float getChurnProbability();

    int getDaysSinceLastPlayed();

    @java.lang.Deprecated
    float getHighSpenderProbability();

    int getNumberOfPurchases();

    int getNumberOfSessions();

    float getSessionPercentile();

    float getSpendPercentile();

    @java.lang.Deprecated
    float getSpendProbability();

    @java.lang.Deprecated
    float getTotalSpendNext28Days();

    android.os.Bundle zza();
}
