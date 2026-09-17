package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzeb implements com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult {
    final /* synthetic */ com.google.android.gms.common.api.Status zza;

    zzeb(com.google.android.gms.internal.games.zzed r1, com.google.android.gms.common.api.Status r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
    public final java.lang.String getSnapshotId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zza
            return r0
    }
}
