package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class LeaderboardScoreBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.leaderboard.LeaderboardScore> {
    private final com.google.android.gms.games.leaderboard.zza zza;

    public LeaderboardScoreBuffer(com.google.android.gms.common.data.DataHolder r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.games.leaderboard.zza r0 = new com.google.android.gms.games.leaderboard.zza
            android.os.Bundle r2 = r2.getMetadata()
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public com.google.android.gms.games.leaderboard.LeaderboardScore get(int r3) {
            r2 = this;
            com.google.android.gms.games.leaderboard.LeaderboardScoreRef r0 = new com.google.android.gms.games.leaderboard.LeaderboardScoreRef
            com.google.android.gms.common.data.DataHolder r1 = r2.mDataHolder
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.google.android.gms.games.leaderboard.LeaderboardScore r1 = r0.get(r1)
            return r1
    }

    public final com.google.android.gms.games.leaderboard.zza zza() {
            r1 = this;
            com.google.android.gms.games.leaderboard.zza r0 = r1.zza
            return r0
    }
}
