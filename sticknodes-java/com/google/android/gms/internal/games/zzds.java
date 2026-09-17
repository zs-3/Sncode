package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzds extends com.google.android.gms.internal.games.zzad implements com.google.android.gms.games.SnapshotsClient {
    public static final /* synthetic */ int zza = 0;

    public zzds(android.app.Activity r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzds(android.content.Context r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.snapshot.SnapshotMetadata> commitAndClose(com.google.android.gms.games.snapshot.Snapshot r3, com.google.android.gms.games.snapshot.SnapshotMetadataChange r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdn r1 = new com.google.android.gms.internal.games.zzdn
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6672(0x1a10, float:9.35E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.String> delete(com.google.android.gms.games.snapshot.SnapshotMetadata r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdj r1 = new com.google.android.gms.internal.games.zzdj
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6674(0x1a12, float:9.352E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> discardAndClose(com.google.android.gms.games.snapshot.Snapshot r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdq r1 = new com.google.android.gms.internal.games.zzdq
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6673(0x1a11, float:9.351E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> getMaxCoverImageSize() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdo r1 = com.google.android.gms.internal.games.zzdo.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6668(0x1a0c, float:9.344E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> getMaxDataSize() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdp r1 = com.google.android.gms.internal.games.zzdp.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6667(0x1a0b, float:9.342E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getSelectSnapshotIntent(java.lang.String r3, boolean r4, boolean r5, int r6) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdk r1 = new com.google.android.gms.internal.games.zzdk
            r1.<init>(r3, r4, r5, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6669(0x1a0d, float:9.345E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.snapshot.SnapshotMetadataBuffer>> load(boolean r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdr r1 = new com.google.android.gms.internal.games.zzdr
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6670(0x1a0e, float:9.347E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata r3) {
            r2 = this;
            java.lang.String r3 = r3.getUniqueName()
            r0 = 0
            r1 = -1
            com.google.android.gms.tasks.Task r3 = r2.open(r3, r0, r1)
            return r3
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata r2, int r3) {
            r1 = this;
            java.lang.String r2 = r2.getUniqueName()
            r0 = 0
            com.google.android.gms.tasks.Task r2 = r1.open(r2, r0, r3)
            return r2
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = -1
            com.google.android.gms.tasks.Task r2 = r1.open(r2, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(java.lang.String r3, boolean r4, int r5) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdm r1 = new com.google.android.gms.internal.games.zzdm
            r1.<init>(r3, r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6671(0x1a0f, float:9.348E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String r5, com.google.android.gms.games.snapshot.Snapshot r6) {
            r4 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadata r0 = r6.getMetadata()
            com.google.android.gms.games.snapshot.SnapshotMetadataChange$Builder r1 = new com.google.android.gms.games.snapshot.SnapshotMetadataChange$Builder
            r1.<init>()
            r1.fromMetadata(r0)
            com.google.android.gms.games.snapshot.SnapshotMetadataChange r1 = r1.build()
            java.lang.String r0 = r0.getSnapshotId()
            com.google.android.gms.games.snapshot.SnapshotContents r6 = r6.getSnapshotContents()
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r2 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdl r3 = new com.google.android.gms.internal.games.zzdl
            r3.<init>(r5, r0, r1, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r2.run(r3)
            r6 = 6675(0x1a13, float:9.354E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r6)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doWrite(r5)
            return r5
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String r3, java.lang.String r4, com.google.android.gms.games.snapshot.SnapshotMetadataChange r5, com.google.android.gms.games.snapshot.SnapshotContents r6) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzdl r1 = new com.google.android.gms.internal.games.zzdl
            r1.<init>(r3, r4, r5, r6)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6675(0x1a13, float:9.354E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }
}
