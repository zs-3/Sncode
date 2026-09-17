package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbg implements com.google.android.gms.games.GamesMetadata {
    public zzbg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.GamesMetadata
    public final com.google.android.gms.games.Game getCurrentGame(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            com.google.android.gms.games.Game r2 = r2.zzE()
            return r2
    }

    @Override // com.google.android.gms.games.GamesMetadata
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.GamesMetadata.LoadGamesResult> loadGame(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.games.zzbc r0 = new com.google.android.gms.internal.games.zzbc
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }
}
