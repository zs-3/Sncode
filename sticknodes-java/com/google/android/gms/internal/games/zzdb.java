package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzdb extends com.google.android.gms.internal.games.zzdh {
    final /* synthetic */ int zza;
    final /* synthetic */ boolean zzb;

    zzdb(com.google.android.gms.internal.games.zzdi r1, com.google.android.gms.common.api.GoogleApiClient r2, int r3, boolean r4) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.games.internal.zzbz r4 = (com.google.android.gms.games.internal.zzbz) r4
            int r0 = r3.zza
            boolean r1 = r3.zzb
            r2 = 0
            r4.zzao(r3, r0, r2, r1)
            return
    }
}
