package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbf extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult {
    private final com.google.android.gms.games.leaderboard.LeaderboardEntity zza;
    private final com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer zzb;

    zzbf(com.google.android.gms.common.data.DataHolder r2, com.google.android.gms.common.data.DataHolder r3) {
            r1 = this;
            r1.<init>(r3)
            com.google.android.gms.games.leaderboard.LeaderboardBuffer r0 = new com.google.android.gms.games.leaderboard.LeaderboardBuffer
            r0.<init>(r2)
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2c
            if (r2 <= 0) goto L1e
            r2 = 0
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.games.leaderboard.Leaderboard r2 = (com.google.android.gms.games.leaderboard.Leaderboard) r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r2.freeze()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.games.leaderboard.LeaderboardEntity r2 = (com.google.android.gms.games.leaderboard.LeaderboardEntity) r2     // Catch: java.lang.Throwable -> L2c
            r1.zza = r2     // Catch: java.lang.Throwable -> L2c
            goto L21
        L1e:
            r2 = 0
            r1.zza = r2     // Catch: java.lang.Throwable -> L2c
        L21:
            r0.release()
            com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r2 = new com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
            r2.<init>(r3)
            r1.zzb = r2
            return
        L2c:
            r2 = move-exception
            r0.release()
            throw r2
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    public final com.google.android.gms.games.leaderboard.Leaderboard getLeaderboard() {
            r1 = this;
            com.google.android.gms.games.leaderboard.LeaderboardEntity r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    public final com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer getScores() {
            r1 = this;
            com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r0 = r1.zzb
            return r0
    }
}
