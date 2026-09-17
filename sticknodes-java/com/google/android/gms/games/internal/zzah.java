package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzah extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult {
    private final com.google.android.gms.games.snapshot.SnapshotMetadata zza;

    zzah(com.google.android.gms.common.data.DataHolder r3) {
            r2 = this;
            r2.<init>(r3)
            com.google.android.gms.games.snapshot.SnapshotMetadataBuffer r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
            r0.<init>(r3)
            int r3 = r0.getCount()     // Catch: java.lang.Throwable -> L22
            if (r3 <= 0) goto L1b
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r3 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity     // Catch: java.lang.Throwable -> L22
            r1 = 0
            com.google.android.gms.games.snapshot.SnapshotMetadata r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L22
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r2.zza = r3     // Catch: java.lang.Throwable -> L22
            goto L1e
        L1b:
            r3 = 0
            r2.zza = r3     // Catch: java.lang.Throwable -> L22
        L1e:
            r0.release()
            return
        L22:
            r3 = move-exception
            r0.release()
            throw r3
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    public final com.google.android.gms.games.snapshot.SnapshotMetadata getSnapshotMetadata() {
            r1 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadata r0 = r1.zza
            return r0
    }
}
