package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbc extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult {
    private final com.google.android.gms.games.leaderboard.LeaderboardScoreEntity zza;

    zzbc(com.google.android.gms.common.data.DataHolder r3) {
            r2 = this;
            r2.<init>(r3)
            com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r0 = new com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
            r0.<init>(r3)
            int r3 = r0.getCount()     // Catch: java.lang.Throwable -> L22
            if (r3 <= 0) goto L1b
            r3 = 0
            com.google.android.gms.games.leaderboard.LeaderboardScore r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.games.leaderboard.LeaderboardScoreEntity r1 = new com.google.android.gms.games.leaderboard.LeaderboardScoreEntity     // Catch: java.lang.Throwable -> L22
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r2.zza = r1     // Catch: java.lang.Throwable -> L22
            goto L1e
        L1b:
            r3 = 0
            r2.zza = r3     // Catch: java.lang.Throwable -> L22
        L1e:
            r0.release()
            return
        L22:
            r3 = move-exception
            r0.release()
            throw r3
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    public final com.google.android.gms.games.leaderboard.LeaderboardScore getScore() {
            r1 = this;
            com.google.android.gms.games.leaderboard.LeaderboardScoreEntity r0 = r1.zza
            return r0
    }
}
