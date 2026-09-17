package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzdx extends com.google.android.gms.internal.games.zzej {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadataChange zzc;
    final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotContents zzd;

    zzdx(com.google.android.gms.internal.games.zzek r1, com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, java.lang.String r4, com.google.android.gms.games.snapshot.SnapshotMetadataChange r5, com.google.android.gms.games.snapshot.SnapshotContents r6) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r7) throws android.os.RemoteException {
            r6 = this;
            r0 = r7
            com.google.android.gms.games.internal.zzbz r0 = (com.google.android.gms.games.internal.zzbz) r0
            java.lang.String r2 = r6.zza
            java.lang.String r3 = r6.zzb
            com.google.android.gms.games.snapshot.SnapshotMetadataChange r4 = r6.zzc
            com.google.android.gms.games.snapshot.SnapshotContents r5 = r6.zzd
            r1 = r6
            r0.zzaM(r1, r2, r3, r4, r5)
            return
    }
}
