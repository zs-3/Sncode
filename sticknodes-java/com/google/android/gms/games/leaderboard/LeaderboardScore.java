package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
/* loaded from: classes.dex */
public interface LeaderboardScore extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.leaderboard.LeaderboardScore> {
    public static final int LEADERBOARD_RANK_UNKNOWN = -1;

    java.lang.String getDisplayRank();

    void getDisplayRank(android.database.CharArrayBuffer r1);

    java.lang.String getDisplayScore();

    void getDisplayScore(android.database.CharArrayBuffer r1);

    long getRank();

    long getRawScore();

    com.google.android.gms.games.Player getScoreHolder();

    java.lang.String getScoreHolderDisplayName();

    void getScoreHolderDisplayName(android.database.CharArrayBuffer r1);

    android.net.Uri getScoreHolderHiResImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getScoreHolderHiResImageUrl();

    android.net.Uri getScoreHolderIconImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getScoreHolderIconImageUrl();

    java.lang.String getScoreTag();

    long getTimestampMillis();
}
