package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.internal.games.zzfp
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface Snapshots {

    @com.google.android.gms.internal.games.zzfp
    public static final int DISPLAY_LIMIT_NONE = -1;

    @com.google.android.gms.internal.games.zzfp
    public static final java.lang.String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";

    @com.google.android.gms.internal.games.zzfp
    public static final java.lang.String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";

    @com.google.android.gms.internal.games.zzfp
    public static final int RESOLUTION_POLICY_HIGHEST_PROGRESS = 4;

    @com.google.android.gms.internal.games.zzfp
    public static final int RESOLUTION_POLICY_LAST_KNOWN_GOOD = 2;

    @com.google.android.gms.internal.games.zzfp
    public static final int RESOLUTION_POLICY_LONGEST_PLAYTIME = 1;

    @com.google.android.gms.internal.games.zzfp
    public static final int RESOLUTION_POLICY_MANUAL = -1;

    @com.google.android.gms.internal.games.zzfp
    public static final int RESOLUTION_POLICY_MOST_RECENTLY_MODIFIED = 3;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface CommitSnapshotResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.snapshot.SnapshotMetadata getSnapshotMetadata();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface DeleteSnapshotResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.internal.games.zzfp
        java.lang.String getSnapshotId();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LoadSnapshotsResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.snapshot.SnapshotMetadataBuffer getSnapshots();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface OpenSnapshotResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.internal.games.zzfp
        java.lang.String getConflictId();

        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.snapshot.Snapshot getConflictingSnapshot();

        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.snapshot.SnapshotContents getResolutionSnapshotContents();

        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.snapshot.Snapshot getSnapshot();
    }

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult> commitAndClose(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.games.snapshot.Snapshot r2, com.google.android.gms.games.snapshot.SnapshotMetadataChange r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult> delete(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.games.snapshot.SnapshotMetadata r2);

    @com.google.android.gms.internal.games.zzfp
    void discardAndClose(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.games.snapshot.Snapshot r2);

    @com.google.android.gms.internal.games.zzfp
    int getMaxCoverImageSize(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    int getMaxDataSize(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getSelectSnapshotIntent(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, boolean r3, boolean r4, int r5);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.games.snapshot.SnapshotMetadata getSnapshotFromBundle(android.os.Bundle r1);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult> load(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> open(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.games.snapshot.SnapshotMetadata r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> open(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.games.snapshot.SnapshotMetadata r2, int r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> open(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, boolean r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> open(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, boolean r3, int r4);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> resolveConflict(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, com.google.android.gms.games.snapshot.Snapshot r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult> resolveConflict(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.games.snapshot.SnapshotMetadataChange r4, com.google.android.gms.games.snapshot.SnapshotContents r5);
}
