package com.google.android.gms.games.stats;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.internal.games.zzfp
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface Stats {

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LoadPlayerStatsResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.stats.PlayerStats getPlayerStats();
    }

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult> loadPlayerStats(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2);
}
