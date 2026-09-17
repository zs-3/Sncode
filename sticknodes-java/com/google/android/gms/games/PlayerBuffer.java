package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class PlayerBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.Player> {
    public PlayerBuffer(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public com.google.android.gms.games.Player get(int r4) {
            r3 = this;
            com.google.android.gms.games.PlayerRef r0 = new com.google.android.gms.games.PlayerRef
            com.google.android.gms.common.data.DataHolder r1 = r3.mDataHolder
            r2 = 0
            r0.<init>(r1, r4, r2)
            return r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.google.android.gms.games.Player r1 = r0.get(r1)
            return r1
    }
}
