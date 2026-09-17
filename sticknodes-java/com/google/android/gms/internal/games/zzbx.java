package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbx extends com.google.android.gms.internal.games.zzcj {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ boolean zze;

    zzbx(com.google.android.gms.internal.games.zzcm r1, com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, int r4, int r5, int r6, boolean r7) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r7
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r8) throws android.os.RemoteException {
            r7 = this;
            r0 = r8
            com.google.android.gms.games.internal.zzbz r0 = (com.google.android.gms.games.internal.zzbz) r0
            java.lang.String r2 = r7.zza
            int r3 = r7.zzb
            int r4 = r7.zzc
            int r5 = r7.zzd
            boolean r6 = r7.zze
            r1 = r7
            r0.zzaG(r1, r2, r3, r4, r5, r6)
            return
    }
}
