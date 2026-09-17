package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzep implements com.google.android.gms.games.stats.Stats {
    public zzep() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.stats.Stats
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult> loadPlayerStats(com.google.android.gms.common.api.GoogleApiClient r2, boolean r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzel r0 = new com.google.android.gms.internal.games.zzel
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }
}
