package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
abstract class zzab extends com.google.android.gms.games.zzj {
    private final java.lang.String zza;

    public zzab(java.lang.String r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.<init>(r2)
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String zza(com.google.android.gms.internal.games.zzab r0) {
            java.lang.String r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.internal.games.zzaa r0 = new com.google.android.gms.internal.games.zzaa
            r0.<init>(r1, r2)
            return r0
    }
}
