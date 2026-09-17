package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbt extends com.google.android.gms.internal.games.zzad implements com.google.android.gms.games.LeaderboardsClient {
    public static final /* synthetic */ int zza = 0;

    public zzbt(android.app.Activity r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzbt(android.content.Context r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getAllLeaderboardsIntent() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbk r1 = com.google.android.gms.internal.games.zzbk.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6630(0x19e6, float:9.29E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String r2) {
            r1 = this;
            r0 = -1
            com.google.android.gms.tasks.Task r2 = r1.getLeaderboardIntent(r2, r0, r0)
            return r2
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            com.google.android.gms.tasks.Task r2 = r1.getLeaderboardIntent(r2, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String r3, int r4, int r5) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbh r1 = new com.google.android.gms.internal.games.zzbh
            r1.<init>(r3, r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6631(0x19e7, float:9.292E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.LeaderboardScore>> loadCurrentPlayerLeaderboardScore(java.lang.String r3, int r4, int r5) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbl r1 = new com.google.android.gms.internal.games.zzbl
            r1.<init>(r3, r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6633(0x19e9, float:9.295E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.Leaderboard>> loadLeaderboardMetadata(java.lang.String r3, boolean r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbp r1 = new com.google.android.gms.internal.games.zzbp
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6632(0x19e8, float:9.293E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.LeaderboardBuffer>> loadLeaderboardMetadata(boolean r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbj r1 = new com.google.android.gms.internal.games.zzbj
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6632(0x19e8, float:9.293E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadMoreScores(com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r3, int r4, int r5) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbi r1 = new com.google.android.gms.internal.games.zzbi
            r1.<init>(r3, r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6636(0x19ec, float:9.299E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(java.lang.String r9, int r10, int r11, int r12) {
            r8 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbn r7 = new com.google.android.gms.internal.games.zzbn
            r6 = 0
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = r0.run(r7)
            r10 = 6635(0x19eb, float:9.298E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = r9.setMethodKey(r10)
            com.google.android.gms.common.api.internal.TaskApiCall r9 = r9.build()
            com.google.android.gms.tasks.Task r9 = r8.doRead(r9)
            return r9
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(java.lang.String r9, int r10, int r11, int r12, boolean r13) {
            r8 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbn r7 = new com.google.android.gms.internal.games.zzbn
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = r0.run(r7)
            r10 = 6635(0x19eb, float:9.298E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = r9.setMethodKey(r10)
            com.google.android.gms.common.api.internal.TaskApiCall r9 = r9.build()
            com.google.android.gms.tasks.Task r9 = r8.doRead(r9)
            return r9
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadTopScores(java.lang.String r9, int r10, int r11, int r12) {
            r8 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbm r7 = new com.google.android.gms.internal.games.zzbm
            r6 = 0
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = r0.run(r7)
            r10 = 6634(0x19ea, float:9.296E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = r9.setMethodKey(r10)
            com.google.android.gms.common.api.internal.TaskApiCall r9 = r9.build()
            com.google.android.gms.tasks.Task r9 = r8.doRead(r9)
            return r9
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadTopScores(java.lang.String r9, int r10, int r11, int r12, boolean r13) {
            r8 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbm r7 = new com.google.android.gms.internal.games.zzbm
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = r0.run(r7)
            r10 = 6634(0x19ea, float:9.296E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = r9.setMethodKey(r10)
            com.google.android.gms.common.api.internal.TaskApiCall r9 = r9.build()
            com.google.android.gms.tasks.Task r9 = r8.doRead(r9)
            return r9
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final void submitScore(java.lang.String r3, long r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbr r1 = new com.google.android.gms.internal.games.zzbr
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6637(0x19ed, float:9.3E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            r2.doWrite(r3)
            return
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final void submitScore(java.lang.String r3, long r4, java.lang.String r6) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbs r1 = new com.google.android.gms.internal.games.zzbs
            r1.<init>(r3, r4, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6637(0x19ed, float:9.3E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            r2.doWrite(r3)
            return
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.leaderboard.ScoreSubmissionData> submitScoreImmediate(java.lang.String r3, long r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbq r1 = new com.google.android.gms.internal.games.zzbq
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6638(0x19ee, float:9.302E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.leaderboard.ScoreSubmissionData> submitScoreImmediate(java.lang.String r3, long r4, java.lang.String r6) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzbo r1 = new com.google.android.gms.internal.games.zzbo
            r1.<init>(r3, r4, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6638(0x19ee, float:9.302E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }
}
