package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzaj implements com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult {
    private final com.google.android.gms.common.api.Status zza;
    private final java.lang.String zzb;

    zzaj(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.games.GamesStatusCodes.zza(r1)
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
    public final java.lang.String getSnapshotId() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zza
            return r0
    }
}
