package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbe extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.Players.LoadPlayersResult {
    private final com.google.android.gms.games.PlayerBuffer zza;

    zzbe(com.google.android.gms.common.data.DataHolder r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.games.PlayerBuffer r0 = new com.google.android.gms.games.PlayerBuffer
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.games.Players.LoadPlayersResult
    public final com.google.android.gms.games.PlayerBuffer getPlayers() {
            r1 = this;
            com.google.android.gms.games.PlayerBuffer r0 = r1.zza
            return r0
    }
}
