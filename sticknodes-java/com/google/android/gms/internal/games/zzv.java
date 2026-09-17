package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzv extends com.google.android.gms.internal.games.zzab {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ int zzb;

    zzv(com.google.android.gms.internal.games.zzac r1, java.lang.String r2, com.google.android.gms.common.api.GoogleApiClient r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.zza = r4
            r0.zzb = r5
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.games.internal.zzbz r3 = (com.google.android.gms.games.internal.zzbz) r3
            java.lang.String r0 = r2.zza
            int r1 = r2.zzb
            r3.zzZ(r2, r0, r1)
            return
    }
}
