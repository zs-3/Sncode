package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzdw extends com.google.android.gms.internal.games.zzed {
    final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadata zza;

    zzdw(com.google.android.gms.internal.games.zzek r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.snapshot.SnapshotMetadata r3) {
            r0 = this;
            r0.zza = r3
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.games.internal.zzbz r2 = (com.google.android.gms.games.internal.zzbz) r2
            com.google.android.gms.games.snapshot.SnapshotMetadata r0 = r1.zza
            java.lang.String r0 = r0.getSnapshotId()
            r2.zzQ(r1, r0)
            return
    }
}
