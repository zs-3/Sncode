package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class GameBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.Game> {
    public GameBuffer(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public com.google.android.gms.games.Game get(int r3) {
            r2 = this;
            com.google.android.gms.games.GameRef r0 = new com.google.android.gms.games.GameRef
            com.google.android.gms.common.data.DataHolder r1 = r2.mDataHolder
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.google.android.gms.games.Game r1 = r0.get(r1)
            return r1
    }
}
