package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzdd extends com.google.android.gms.internal.games.zzdh {
    final /* synthetic */ int zza;
    final /* synthetic */ boolean zzb;

    zzdd(com.google.android.gms.internal.games.zzdi r1, com.google.android.gms.common.api.GoogleApiClient r2, int r3, boolean r4) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r7) throws android.os.RemoteException {
            r6 = this;
            r0 = r7
            com.google.android.gms.games.internal.zzbz r0 = (com.google.android.gms.games.internal.zzbz) r0
            int r3 = r6.zza
            boolean r5 = r6.zzb
            java.lang.String r2 = "played_with"
            r4 = 0
            r1 = r6
            r0.zzaC(r1, r2, r3, r4, r5)
            return
    }
}
