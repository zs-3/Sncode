package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzcb implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult {
    final /* synthetic */ com.google.android.gms.common.api.Status zza;

    zzcb(com.google.android.gms.internal.games.zzcd r1, com.google.android.gms.common.api.Status r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    public final com.google.android.gms.games.leaderboard.LeaderboardBuffer getLeaderboards() {
            r2 = this;
            com.google.android.gms.games.leaderboard.LeaderboardBuffer r0 = new com.google.android.gms.games.leaderboard.LeaderboardBuffer
            r1 = 14
            com.google.android.gms.common.data.DataHolder r1 = com.google.android.gms.common.data.DataHolder.empty(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
            r0 = this;
            return
    }
}
