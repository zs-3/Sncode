package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.internal.games.zzfp
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface Players {

    @com.google.android.gms.internal.games.zzfp
    public static final java.lang.String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LoadPlayersResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.PlayerBuffer getPlayers();
    }

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getCompareProfileIntent(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.games.Player r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.games.Player getCurrentPlayer(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    java.lang.String getCurrentPlayerId(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getPlayerSearchIntent(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadConnectedPlayers(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2);

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadInvitablePlayers(com.google.android.gms.common.api.GoogleApiClient r1, int r2, boolean r3);

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadMoreInvitablePlayers(com.google.android.gms.common.api.GoogleApiClient r1, int r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadMoreRecentlyPlayedWithPlayers(com.google.android.gms.common.api.GoogleApiClient r1, int r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadPlayer(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadPlayer(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, boolean r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadRecentlyPlayedWithPlayers(com.google.android.gms.common.api.GoogleApiClient r1, int r2, boolean r3);
}
