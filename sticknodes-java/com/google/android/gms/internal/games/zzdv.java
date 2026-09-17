package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzdv extends com.google.android.gms.internal.games.zzea {
    final /* synthetic */ com.google.android.gms.games.snapshot.Snapshot zza;
    final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadataChange zzb;

    zzdv(com.google.android.gms.internal.games.zzek r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.snapshot.Snapshot r3, com.google.android.gms.games.snapshot.SnapshotMetadataChange r4) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.games.internal.zzbz r3 = (com.google.android.gms.games.internal.zzbz) r3
            com.google.android.gms.games.snapshot.Snapshot r0 = r2.zza
            com.google.android.gms.games.snapshot.SnapshotMetadataChange r1 = r2.zzb
            r3.zzO(r2, r0, r1)
            return
    }
}
