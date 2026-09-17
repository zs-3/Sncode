package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbg extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult {
    zzbg(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    public final com.google.android.gms.games.snapshot.SnapshotMetadataBuffer getSnapshots() {
            r2 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadataBuffer r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
            com.google.android.gms.common.data.DataHolder r1 = r2.mDataHolder
            r0.<init>(r1)
            return r0
    }
}
