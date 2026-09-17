package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface LeaderboardsClient {

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    public static class LeaderboardScores implements com.google.android.gms.common.api.Releasable {
        private final com.google.android.gms.games.leaderboard.Leaderboard zza;
        private final com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer zzb;

        public LeaderboardScores(com.google.android.gms.games.leaderboard.Leaderboard r1, com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                return
        }

        public com.google.android.gms.games.leaderboard.Leaderboard getLeaderboard() {
                r1 = this;
                com.google.android.gms.games.leaderboard.Leaderboard r0 = r1.zza
                return r0
        }

        public com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer getScores() {
                r1 = this;
                com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r0 = r1.zzb
                return r0
        }

        @Override // com.google.android.gms.common.api.Releasable
        public void release() {
                r1 = this;
                com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r0 = r1.zzb
                r0.release()
                return
        }
    }

    com.google.android.gms.tasks.Task<android.content.Intent> getAllLeaderboardsIntent();

    com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String r1);

    com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String r1, int r2);

    com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String r1, int r2, int r3);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.LeaderboardScore>> loadCurrentPlayerLeaderboardScore(java.lang.String r1, int r2, int r3);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.Leaderboard>> loadLeaderboardMetadata(java.lang.String r1, boolean r2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.LeaderboardBuffer>> loadLeaderboardMetadata(boolean r1);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadMoreScores(com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r1, int r2, int r3);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(java.lang.String r1, int r2, int r3, int r4);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(java.lang.String r1, int r2, int r3, int r4, boolean r5);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadTopScores(java.lang.String r1, int r2, int r3, int r4);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadTopScores(java.lang.String r1, int r2, int r3, int r4, boolean r5);

    void submitScore(java.lang.String r1, long r2);

    void submitScore(java.lang.String r1, long r2, java.lang.String r4);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.leaderboard.ScoreSubmissionData> submitScoreImmediate(java.lang.String r1, long r2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.leaderboard.ScoreSubmissionData> submitScoreImmediate(java.lang.String r1, long r2, java.lang.String r4);
}
