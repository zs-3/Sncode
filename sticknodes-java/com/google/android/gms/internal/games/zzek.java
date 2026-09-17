package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzek implements com.google.android.gms.games.snapshot.Snapshots {
    public zzek() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult> commitAndClose(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.snapshot.Snapshot r3, com.google.android.gms.games.snapshot.SnapshotMetadataChange r4) {
            r1 = this;
            com.google.android.gms.internal.games.zzdv r0 = new com.google.android.gms.internal.games.zzdv
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult> delete(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.snapshot.SnapshotMetadata r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzdw r0 = new com.google.android.gms.internal.games.zzdw
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final void discardAndClose(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.snapshot.Snapshot r3) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            r2.zzT(r3)
            return
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final int getMaxCoverImageSize(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            int r2 = r2.zzq()
            return r2
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final int getMaxDataSize(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            int r2 = r2.zzs()
            return r2
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final android.content.Intent getSelectSnapshotIntent(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, boolean r4, boolean r5, int r6) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            android.content.Intent r2 = r2.zzC(r3, r4, r5, r6)
            return r2
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.games.snapshot.SnapshotMetadata getSnapshotFromBundle(android.os.Bundle r3) {
            r2 = this;
            if (r3 == 0) goto L12
            java.lang.String r0 = "com.google.android.gms.games.SNAPSHOT_METADATA"
            boolean r1 = r3.containsKey(r0)
            if (r1 != 0) goto Lb
            goto L12
        Lb:
            android.os.Parcelable r3 = r3.getParcelable(r0)
            com.google.android.gms.games.snapshot.SnapshotMetadata r3 = (com.google.android.gms.games.snapshot.SnapshotMetadata) r3
            return r3
        L12:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult> load(com.google.android.gms.common.api.GoogleApiClient r2, boolean r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzdt r0 = new com.google.android.gms.internal.games.zzdt
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> open(com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.games.snapshot.SnapshotMetadata r4) {
            r2 = this;
            java.lang.String r4 = r4.getUniqueName()
            r0 = 0
            r1 = -1
            com.google.android.gms.common.api.PendingResult r3 = r2.open(r3, r4, r0, r1)
            return r3
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> open(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.snapshot.SnapshotMetadata r3, int r4) {
            r1 = this;
            java.lang.String r3 = r3.getUniqueName()
            r0 = 0
            com.google.android.gms.common.api.PendingResult r2 = r1.open(r2, r3, r0, r4)
            return r2
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> open(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = -1
            com.google.android.gms.common.api.PendingResult r2 = r1.open(r2, r3, r4, r0)
            return r2
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> open(com.google.android.gms.common.api.GoogleApiClient r8, java.lang.String r9, boolean r10, int r11) {
            r7 = this;
            com.google.android.gms.internal.games.zzdu r6 = new com.google.android.gms.internal.games.zzdu
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r8 = r8.execute(r6)
            return r8
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> resolveConflict(com.google.android.gms.common.api.GoogleApiClient r10, java.lang.String r11, com.google.android.gms.games.snapshot.Snapshot r12) {
            r9 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadata r0 = r12.getMetadata()
            com.google.android.gms.games.snapshot.SnapshotMetadataChange$Builder r1 = new com.google.android.gms.games.snapshot.SnapshotMetadataChange$Builder
            r1.<init>()
            r1.fromMetadata(r0)
            com.google.android.gms.games.snapshot.SnapshotMetadataChange r7 = r1.build()
            java.lang.String r6 = r0.getSnapshotId()
            com.google.android.gms.games.snapshot.SnapshotContents r8 = r12.getSnapshotContents()
            com.google.android.gms.internal.games.zzdx r12 = new com.google.android.gms.internal.games.zzdx
            r2 = r12
            r3 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r10 = r10.execute(r12)
            return r10
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> resolveConflict(com.google.android.gms.common.api.GoogleApiClient r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.games.snapshot.SnapshotMetadataChange r12, com.google.android.gms.games.snapshot.SnapshotContents r13) {
            r8 = this;
            com.google.android.gms.internal.games.zzdx r7 = new com.google.android.gms.internal.games.zzdx
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r9 = r9.execute(r7)
            return r9
    }
}
