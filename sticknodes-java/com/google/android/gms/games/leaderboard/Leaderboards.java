package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.internal.games.zzfp
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface Leaderboards {

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LeaderboardMetadataResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.leaderboard.LeaderboardBuffer getLeaderboards();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LoadPlayerScoreResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.leaderboard.LeaderboardScore getScore();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LoadScoresResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.leaderboard.Leaderboard getLeaderboard();

        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer getScores();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface SubmitScoreResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.leaderboard.ScoreSubmissionData getScoreData();
    }

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getAllLeaderboardsIntent(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getLeaderboardIntent(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2);

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getLeaderboardIntent(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3);

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getLeaderboardIntent(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3, int r4);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult> loadCurrentPlayerLeaderboardScore(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3, int r4);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, boolean r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadMoreScores(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r2, int r3, int r4);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadPlayerCenteredScores(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3, int r4, int r5);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadPlayerCenteredScores(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3, int r4, int r5, boolean r6);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadTopScores(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3, int r4, int r5);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult> loadTopScores(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3, int r4, int r5, boolean r6);

    @com.google.android.gms.internal.games.zzfp
    void submitScore(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, long r3);

    @com.google.android.gms.internal.games.zzfp
    void submitScore(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, long r3, java.lang.String r5);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult> submitScoreImmediate(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, long r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult> submitScoreImmediate(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, long r3, java.lang.String r5);
}
