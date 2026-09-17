package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class LeaderboardBuffer extends com.google.android.gms.common.data.EntityBuffer<com.google.android.gms.games.leaderboard.Leaderboard> {
    public LeaderboardBuffer(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    protected final /* bridge */ /* synthetic */ com.google.android.gms.games.leaderboard.Leaderboard getEntry(int r3, int r4) {
            r2 = this;
            com.google.android.gms.games.leaderboard.LeaderboardRef r0 = new com.google.android.gms.games.leaderboard.LeaderboardRef
            com.google.android.gms.common.data.DataHolder r1 = r2.mDataHolder
            r0.<init>(r1, r3, r4)
            return r0
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    protected final java.lang.String getPrimaryDataMarkerColumn() {
            r1 = this;
            java.lang.String r0 = "external_leaderboard_id"
            return r0
    }
}
