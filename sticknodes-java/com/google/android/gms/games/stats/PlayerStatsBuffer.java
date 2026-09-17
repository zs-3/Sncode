package com.google.android.gms.games.stats;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class PlayerStatsBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.stats.PlayerStats> {
    public PlayerStatsBuffer(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.google.android.gms.games.stats.PlayerStats r1 = r0.zza(r1)
            return r1
    }

    public final com.google.android.gms.games.stats.PlayerStats zza(int r3) {
            r2 = this;
            com.google.android.gms.games.stats.zzb r0 = new com.google.android.gms.games.stats.zzb
            com.google.android.gms.common.data.DataHolder r1 = r2.mDataHolder
            r0.<init>(r1, r3)
            return r0
    }
}
