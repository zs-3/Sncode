package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface SnapshotsClient {
    public static final int DISPLAY_LIMIT_NONE = -1;
    public static final java.lang.String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";
    public static final java.lang.String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";
    public static final int RESOLUTION_POLICY_HIGHEST_PROGRESS = 4;
    public static final int RESOLUTION_POLICY_LAST_KNOWN_GOOD = 2;
    public static final int RESOLUTION_POLICY_LONGEST_PLAYTIME = 1;
    public static final int RESOLUTION_POLICY_MANUAL = -1;
    public static final int RESOLUTION_POLICY_MOST_RECENTLY_MODIFIED = 3;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    public static final class DataOrConflict<T> {
        private final java.lang.Object zza;
        private final com.google.android.gms.games.SnapshotsClient.SnapshotConflict zzb;

        public DataOrConflict(java.lang.Object r1, com.google.android.gms.games.SnapshotsClient.SnapshotConflict r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                return
        }

        public com.google.android.gms.games.SnapshotsClient.SnapshotConflict getConflict() {
                r2 = this;
                boolean r0 = r2.isConflict()
                if (r0 == 0) goto L9
                com.google.android.gms.games.SnapshotsClient$SnapshotConflict r0 = r2.zzb
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "getConflict called when there is no conflict."
                r0.<init>(r1)
                throw r0
        }

        public T getData() {
                r2 = this;
                boolean r0 = r2.isConflict()
                if (r0 != 0) goto L9
                java.lang.Object r0 = r2.zza
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "getData called when there is a conflict."
                r0.<init>(r1)
                throw r0
        }

        public boolean isConflict() {
                r1 = this;
                com.google.android.gms.games.SnapshotsClient$SnapshotConflict r0 = r1.zzb
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResolutionPolicy {
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    public static final class SnapshotConflict {
        private final com.google.android.gms.games.snapshot.Snapshot zza;
        private final java.lang.String zzb;
        private final com.google.android.gms.games.snapshot.Snapshot zzc;
        private final com.google.android.gms.games.snapshot.SnapshotContents zzd;

        public SnapshotConflict(com.google.android.gms.games.snapshot.Snapshot r1, java.lang.String r2, com.google.android.gms.games.snapshot.Snapshot r3, com.google.android.gms.games.snapshot.SnapshotContents r4) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                r0.zzc = r3
                r0.zzd = r4
                return
        }

        public java.lang.String getConflictId() {
                r1 = this;
                java.lang.String r0 = r1.zzb
                return r0
        }

        public com.google.android.gms.games.snapshot.Snapshot getConflictingSnapshot() {
                r1 = this;
                com.google.android.gms.games.snapshot.Snapshot r0 = r1.zzc
                return r0
        }

        public com.google.android.gms.games.snapshot.SnapshotContents getResolutionSnapshotContents() {
                r1 = this;
                com.google.android.gms.games.snapshot.SnapshotContents r0 = r1.zzd
                return r0
        }

        public com.google.android.gms.games.snapshot.Snapshot getSnapshot() {
                r1 = this;
                com.google.android.gms.games.snapshot.Snapshot r0 = r1.zza
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    public static final class SnapshotContentUnavailableApiException extends com.google.android.gms.common.api.ApiException {
        protected final com.google.android.gms.games.snapshot.SnapshotMetadata metadata;

        public SnapshotContentUnavailableApiException(com.google.android.gms.common.api.Status r1, com.google.android.gms.games.snapshot.SnapshotMetadata r2) {
                r0 = this;
                r0.<init>(r1)
                r0.metadata = r2
                return
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadata getSnapshotMetadata() {
                r1 = this;
                com.google.android.gms.games.snapshot.SnapshotMetadata r0 = r1.metadata
                return r0
        }
    }

    com.google.android.gms.tasks.Task<com.google.android.gms.games.snapshot.SnapshotMetadata> commitAndClose(com.google.android.gms.games.snapshot.Snapshot r1, com.google.android.gms.games.snapshot.SnapshotMetadataChange r2);

    com.google.android.gms.tasks.Task<java.lang.String> delete(com.google.android.gms.games.snapshot.SnapshotMetadata r1);

    com.google.android.gms.tasks.Task<java.lang.Void> discardAndClose(com.google.android.gms.games.snapshot.Snapshot r1);

    com.google.android.gms.tasks.Task<java.lang.Integer> getMaxCoverImageSize();

    com.google.android.gms.tasks.Task<java.lang.Integer> getMaxDataSize();

    com.google.android.gms.tasks.Task<android.content.Intent> getSelectSnapshotIntent(java.lang.String r1, boolean r2, boolean r3, int r4);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.snapshot.SnapshotMetadataBuffer>> load(boolean r1);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata r1);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata r1, int r2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(java.lang.String r1, boolean r2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(java.lang.String r1, boolean r2, int r3);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String r1, com.google.android.gms.games.snapshot.Snapshot r2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String r1, java.lang.String r2, com.google.android.gms.games.snapshot.SnapshotMetadataChange r3, com.google.android.gms.games.snapshot.SnapshotContents r4);
}
