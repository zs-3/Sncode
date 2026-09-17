package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzdi implements com.google.android.gms.games.Players {
    public zzdi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.Players
    public final android.content.Intent getCompareProfileIntent(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.Player r3) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            com.google.android.gms.games.PlayerEntity r0 = new com.google.android.gms.games.PlayerEntity
            r0.<init>(r3)
            android.content.Intent r2 = r2.zzx(r0)
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final com.google.android.gms.games.Player getCurrentPlayer(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            com.google.android.gms.games.Player r2 = r2.zzG()
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final java.lang.String getCurrentPlayerId(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            java.lang.String r2 = r2.zzK(r0)
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final android.content.Intent getPlayerSearchIntent(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            android.content.Intent r2 = r2.zzA()
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadConnectedPlayers(com.google.android.gms.common.api.GoogleApiClient r2, boolean r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzdf r0 = new com.google.android.gms.internal.games.zzdf
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadInvitablePlayers(com.google.android.gms.common.api.GoogleApiClient r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.games.zzdb r0 = new com.google.android.gms.internal.games.zzdb
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadMoreInvitablePlayers(com.google.android.gms.common.api.GoogleApiClient r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzdc r0 = new com.google.android.gms.internal.games.zzdc
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadMoreRecentlyPlayedWithPlayers(com.google.android.gms.common.api.GoogleApiClient r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzde r0 = new com.google.android.gms.internal.games.zzde
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadPlayer(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzcz r0 = new com.google.android.gms.internal.games.zzcz
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadPlayer(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.games.zzda r0 = new com.google.android.gms.internal.games.zzda
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.Players
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.Players.LoadPlayersResult> loadRecentlyPlayedWithPlayers(com.google.android.gms.common.api.GoogleApiClient r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.games.zzdd r0 = new com.google.android.gms.internal.games.zzdd
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }
}
