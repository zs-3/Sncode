package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbl extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult {
    private final com.google.android.gms.games.snapshot.Snapshot zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.games.snapshot.Snapshot zzc;
    private final com.google.android.gms.games.snapshot.SnapshotContents zzd;

    zzbl(com.google.android.gms.common.data.DataHolder r6, java.lang.String r7, com.google.android.gms.drive.Contents r8, com.google.android.gms.drive.Contents r9, com.google.android.gms.drive.Contents r10) {
            r5 = this;
            r5.<init>(r6)
            com.google.android.gms.games.snapshot.SnapshotMetadataBuffer r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
            r0.<init>(r6)
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L78
            r2 = 0
            if (r1 != 0) goto L14
            r5.zza = r2     // Catch: java.lang.Throwable -> L78
            r5.zzc = r2     // Catch: java.lang.Throwable -> L78
            goto L6b
        L14:
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L78
            r3 = 0
            r4 = 1
            if (r1 != r4) goto L41
            int r6 = r6.getStatusCode()     // Catch: java.lang.Throwable -> L78
            r9 = 4004(0xfa4, float:5.611E-42)
            if (r6 == r9) goto L25
            goto L26
        L25:
            r4 = 0
        L26:
            com.google.android.gms.common.internal.Asserts.checkState(r4)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r6 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotMetadata r9 = r0.get(r3)     // Catch: java.lang.Throwable -> L78
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotEntity r9 = new com.google.android.gms.games.snapshot.SnapshotEntity     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r1 = new com.google.android.gms.games.snapshot.SnapshotContentsEntity     // Catch: java.lang.Throwable -> L78
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L78
            r9.<init>(r6, r1)     // Catch: java.lang.Throwable -> L78
            r5.zza = r9     // Catch: java.lang.Throwable -> L78
            r5.zzc = r2     // Catch: java.lang.Throwable -> L78
            goto L6b
        L41:
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r6 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotMetadata r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L78
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotEntity r1 = new com.google.android.gms.games.snapshot.SnapshotEntity     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r2 = new com.google.android.gms.games.snapshot.SnapshotContentsEntity     // Catch: java.lang.Throwable -> L78
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L78
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L78
            r5.zza = r1     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r6 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotMetadata r8 = r0.get(r4)     // Catch: java.lang.Throwable -> L78
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotEntity r8 = new com.google.android.gms.games.snapshot.SnapshotEntity     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r1 = new com.google.android.gms.games.snapshot.SnapshotContentsEntity     // Catch: java.lang.Throwable -> L78
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L78
            r8.<init>(r6, r1)     // Catch: java.lang.Throwable -> L78
            r5.zzc = r8     // Catch: java.lang.Throwable -> L78
        L6b:
            r0.release()
            r5.zzb = r7
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r6 = new com.google.android.gms.games.snapshot.SnapshotContentsEntity
            r6.<init>(r10)
            r5.zzd = r6
            return
        L78:
            r6 = move-exception
            r0.release()
            throw r6
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    public final java.lang.String getConflictId() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    public final com.google.android.gms.games.snapshot.Snapshot getConflictingSnapshot() {
            r1 = this;
            com.google.android.gms.games.snapshot.Snapshot r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    public final com.google.android.gms.games.snapshot.SnapshotContents getResolutionSnapshotContents() {
            r1 = this;
            com.google.android.gms.games.snapshot.SnapshotContents r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    public final com.google.android.gms.games.snapshot.Snapshot getSnapshot() {
            r1 = this;
            com.google.android.gms.games.snapshot.Snapshot r0 = r1.zza
            return r0
    }
}
