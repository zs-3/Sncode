package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbx extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult {
    private final com.google.android.gms.games.leaderboard.ScoreSubmissionData zza;

    zzbx(com.google.android.gms.common.data.DataHolder r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.games.leaderboard.ScoreSubmissionData r0 = new com.google.android.gms.games.leaderboard.ScoreSubmissionData     // Catch: java.lang.Throwable -> Le
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Le
            r1.zza = r0     // Catch: java.lang.Throwable -> Le
            r2.close()
            return
        Le:
            r0 = move-exception
            r2.close()
            throw r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
    public final com.google.android.gms.games.leaderboard.ScoreSubmissionData getScoreData() {
            r1 = this;
            com.google.android.gms.games.leaderboard.ScoreSubmissionData r0 = r1.zza
            return r0
    }
}
