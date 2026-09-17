package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.internal.games.zzfp
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface GamesMetadata {

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LoadGamesResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.GameBuffer getGames();
    }

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.games.Game getCurrentGame(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.GamesMetadata.LoadGamesResult> loadGame(com.google.android.gms.common.api.GoogleApiClient r1);
}
