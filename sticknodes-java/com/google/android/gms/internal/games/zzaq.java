package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
abstract class zzaq extends com.google.android.gms.games.zzj {
    /* synthetic */ zzaq(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.internal.games.zzap r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.internal.games.zzao r0 = new com.google.android.gms.internal.games.zzao
            r0.<init>(r1, r2)
            return r0
    }
}
