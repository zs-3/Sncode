package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
/* loaded from: classes.dex */
public interface Leaderboard extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.leaderboard.Leaderboard> {
    public static final int SCORE_ORDER_LARGER_IS_BETTER = 1;
    public static final int SCORE_ORDER_SMALLER_IS_BETTER = 0;

    java.lang.String getDisplayName();

    void getDisplayName(android.database.CharArrayBuffer r1);

    android.net.Uri getIconImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getIconImageUrl();

    java.lang.String getLeaderboardId();

    int getScoreOrder();

    java.util.ArrayList<com.google.android.gms.games.leaderboard.LeaderboardVariant> getVariants();

    com.google.android.gms.games.Game zza();
}
