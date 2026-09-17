package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzda extends com.google.android.gms.internal.games.zzdh {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ boolean zzb;

    zzda(com.google.android.gms.internal.games.zzdi r1, com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.games.internal.zzbz r3 = (com.google.android.gms.games.internal.zzbz) r3
            java.lang.String r0 = r2.zza
            boolean r1 = r2.zzb
            r3.zzav(r2, r0, r1)
            return
    }
}
