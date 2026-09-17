package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface PlayersClient {
    public static final java.lang.String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";

    com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntent(com.google.android.gms.games.Player r1);

    com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntent(java.lang.String r1);

    com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntentWithAlternativeNameHints(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.Player> getCurrentPlayer();

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> getCurrentPlayer(boolean r1);

    com.google.android.gms.tasks.Task<java.lang.String> getCurrentPlayerId();

    com.google.android.gms.tasks.Task<android.content.Intent> getPlayerSearchIntent();

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadFriends(int r1, boolean r2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadMoreFriends(int r1);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadMoreRecentlyPlayedWithPlayers(int r1);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> loadPlayer(java.lang.String r1);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> loadPlayer(java.lang.String r1, boolean r2);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadRecentlyPlayedWithPlayers(int r1, boolean r2);
}
