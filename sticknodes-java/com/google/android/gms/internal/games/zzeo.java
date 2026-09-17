package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
abstract class zzeo extends com.google.android.gms.games.zzj {
    /* synthetic */ zzeo(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.internal.games.zzen r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.internal.games.zzem r0 = new com.google.android.gms.internal.games.zzem
            r0.<init>(r1, r2)
            return r0
    }
}
