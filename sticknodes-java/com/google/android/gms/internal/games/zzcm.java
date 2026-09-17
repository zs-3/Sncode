package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzcm implements com.google.android.gms.games.leaderboard.Leaderboards {
    public zzcm() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final android.content.Intent getAllLeaderboardsIntent(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            android.content.Intent r2 = r2.zzu()
            return r2
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final android.content.Intent getLeaderboardIntent(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            r0 = -1
            android.content.Intent r2 = r2.zzy(r3, r0, r0)
            return r2
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final android.content.Intent getLeaderboardIntent(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            r0 = -1
            android.content.Intent r2 = r2.zzy(r3, r4, r0)
            return r2
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final android.content.Intent getLeaderboardIntent(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            android.content.Intent r2 = r2.zzy(r3, r4, r5)
            return r2
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult> loadCurrentPlayerLeaderboardScore(com.google.android.gms.common.api.GoogleApiClient r8, java.lang.String r9, int r10, int r11) {
            r7 = this;
            com.google.android.gms.internal.games.zzbw r6 = new com.google.android.gms.internal.games.zzbw
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r8 = r8.enqueue(r6)
            return r8
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.games.zzbv r0 = new com.google.android.gms.internal.games.zzbv
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(com.google.android.gms.common.api.GoogleApiClient r2, boolean r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzbu r0 = new com.google.android.gms.internal.games.zzbu
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadMoreScores(com.google.android.gms.common.api.GoogleApiClient r8, com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r9, int r10, int r11) {
            r7 = this;
            com.google.android.gms.internal.games.zzbz r6 = new com.google.android.gms.internal.games.zzbz
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r8 = r8.enqueue(r6)
            return r8
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadPlayerCenteredScores(com.google.android.gms.common.api.GoogleApiClient r10, java.lang.String r11, int r12, int r13, int r14) {
            r9 = this;
            com.google.android.gms.internal.games.zzby r8 = new com.google.android.gms.internal.games.zzby
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r10 = r10.enqueue(r8)
            return r10
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadPlayerCenteredScores(com.google.android.gms.common.api.GoogleApiClient r10, java.lang.String r11, int r12, int r13, int r14, boolean r15) {
            r9 = this;
            com.google.android.gms.internal.games.zzby r8 = new com.google.android.gms.internal.games.zzby
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r10 = r10.enqueue(r8)
            return r10
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadTopScores(com.google.android.gms.common.api.GoogleApiClient r10, java.lang.String r11, int r12, int r13, int r14) {
            r9 = this;
            com.google.android.gms.internal.games.zzbx r8 = new com.google.android.gms.internal.games.zzbx
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r10 = r10.enqueue(r8)
            return r10
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadTopScores(com.google.android.gms.common.api.GoogleApiClient r10, java.lang.String r11, int r12, int r13, int r14, boolean r15) {
            r9 = this;
            com.google.android.gms.internal.games.zzbx r8 = new com.google.android.gms.internal.games.zzbx
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r10 = r10.enqueue(r8)
            return r10
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final void submitScore(com.google.android.gms.common.api.GoogleApiClient r8, java.lang.String r9, long r10) {
            r7 = this;
            r0 = 0
            com.google.android.gms.games.internal.zzbz r1 = com.google.android.gms.games.Games.zzd(r8, r0)
            if (r1 == 0) goto L16
            r2 = 0
            r6 = 0
            r3 = r9
            r4 = r10
            r1.zzaX(r2, r3, r4, r6)     // Catch: android.os.RemoteException -> Lf
            return
        Lf:
            java.lang.String r8 = "LeaderboardsImpl"
            java.lang.String r9 = "service died"
            com.google.android.gms.internal.games.zzft.zzd(r8, r9)
        L16:
            return
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final void submitScore(com.google.android.gms.common.api.GoogleApiClient r8, java.lang.String r9, long r10, java.lang.String r12) {
            r7 = this;
            r0 = 0
            com.google.android.gms.games.internal.zzbz r1 = com.google.android.gms.games.Games.zzd(r8, r0)
            if (r1 == 0) goto L16
            r2 = 0
            r3 = r9
            r4 = r10
            r6 = r12
            r1.zzaX(r2, r3, r4, r6)     // Catch: android.os.RemoteException -> Lf
            return
        Lf:
            java.lang.String r8 = "LeaderboardsImpl"
            java.lang.String r9 = "service died"
            com.google.android.gms.internal.games.zzft.zzd(r8, r9)
        L16:
            return
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult> submitScoreImmediate(com.google.android.gms.common.api.GoogleApiClient r9, java.lang.String r10, long r11) {
            r8 = this;
            com.google.android.gms.internal.games.zzca r7 = new com.google.android.gms.internal.games.zzca
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r9 = r9.execute(r7)
            return r9
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult> submitScoreImmediate(com.google.android.gms.common.api.GoogleApiClient r9, java.lang.String r10, long r11, java.lang.String r13) {
            r8 = this;
            com.google.android.gms.internal.games.zzca r7 = new com.google.android.gms.internal.games.zzca
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r6)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r9 = r9.execute(r7)
            return r9
    }
}
