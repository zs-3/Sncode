package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbw extends com.google.android.gms.internal.games.zzcg {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;

    zzbw(com.google.android.gms.internal.games.zzcm r1, com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, int r4, int r5) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r7) throws android.os.RemoteException {
            r6 = this;
            r0 = r7
            com.google.android.gms.games.internal.zzbz r0 = (com.google.android.gms.games.internal.zzbz) r0
            java.lang.String r3 = r6.zza
            int r4 = r6.zzb
            int r5 = r6.zzc
            r2 = 0
            r1 = r6
            r0.zzaz(r1, r2, r3, r4, r5)
            return
    }
}
