package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzaq extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult {
    private final com.google.android.gms.games.leaderboard.LeaderboardBuffer zza;

    zzaq(com.google.android.gms.common.data.DataHolder r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.games.leaderboard.LeaderboardBuffer r0 = new com.google.android.gms.games.leaderboard.LeaderboardBuffer
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    public final com.google.android.gms.games.leaderboard.LeaderboardBuffer getLeaderboards() {
            r1 = this;
            com.google.android.gms.games.leaderboard.LeaderboardBuffer r0 = r1.zza
            return r0
    }
}
