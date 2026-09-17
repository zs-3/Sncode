package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
class zzao extends com.google.android.gms.common.api.internal.DataHolderResult {
    zzao(com.google.android.gms.common.data.DataHolder r2) {
            r1 = this;
            int r0 = r2.getStatusCode()
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.games.GamesStatusCodes.zza(r0)
            r1.<init>(r2, r0)
            return
    }
}
