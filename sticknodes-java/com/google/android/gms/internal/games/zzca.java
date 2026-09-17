package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzca extends com.google.android.gms.internal.games.zzcl {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ java.lang.String zzc;

    zzca(com.google.android.gms.internal.games.zzcm r1, com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, long r4, java.lang.String r6) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r6
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r7) throws android.os.RemoteException {
            r6 = this;
            r0 = r7
            com.google.android.gms.games.internal.zzbz r0 = (com.google.android.gms.games.internal.zzbz) r0
            java.lang.String r2 = r6.zza
            long r3 = r6.zzb
            java.lang.String r5 = r6.zzc
            r1 = r6
            r0.zzaX(r1, r2, r3, r5)
            return
    }
}
