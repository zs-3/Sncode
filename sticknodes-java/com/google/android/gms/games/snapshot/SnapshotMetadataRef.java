package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class SnapshotMetadataRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.snapshot.SnapshotMetadata {
    private final com.google.android.gms.games.Game zza;
    private final com.google.android.gms.games.Player zzb;

    public SnapshotMetadataRef(com.google.android.gms.common.data.DataHolder r3, int r4) {
            r2 = this;
            r2.<init>(r3, r4)
            com.google.android.gms.games.GameRef r0 = new com.google.android.gms.games.GameRef
            r0.<init>(r3, r4)
            r2.zza = r0
            com.google.android.gms.games.PlayerRef r0 = new com.google.android.gms.games.PlayerRef
            r1 = 0
            r0.<init>(r3, r4, r1)
            r2.zzb = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.games.snapshot.SnapshotMetadataEntity.zzd(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadata freeze() {
            r1 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final float getCoverImageAspectRatio() {
            r4 = this;
            java.lang.String r0 = "cover_icon_image_height"
            float r0 = r4.getFloat(r0)
            java.lang.String r1 = "cover_icon_image_width"
            float r1 = r4.getFloat(r1)
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L12
            return r2
        L12:
            float r1 = r1 / r0
            return r1
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final android.net.Uri getCoverImageUri() {
            r1 = this;
            java.lang.String r0 = "cover_icon_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getCoverImageUrl() {
            r1 = this;
            java.lang.String r0 = "cover_icon_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = "description"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final void getDescription(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "description"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String getDeviceName() {
            r1 = this;
            java.lang.String r0 = "device_name"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final com.google.android.gms.games.Game getGame() {
            r1 = this;
            com.google.android.gms.games.Game r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getLastModifiedTimestamp() {
            r2 = this;
            java.lang.String r0 = "last_modified_timestamp"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final com.google.android.gms.games.Player getOwner() {
            r1 = this;
            com.google.android.gms.games.Player r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getPlayedTime() {
            r2 = this;
            java.lang.String r0 = "duration"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getProgressValue() {
            r2 = this;
            java.lang.String r0 = "progress_value"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String getSnapshotId() {
            r1 = this;
            java.lang.String r0 = "external_snapshot_id"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String getUniqueName() {
            r1 = this;
            java.lang.String r0 = "unique_name"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final boolean hasChangePending() {
            r1 = this;
            java.lang.String r0 = "pending_change_count"
            int r0 = r1.getInteger(r0)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.snapshot.SnapshotMetadataEntity.zzb(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.snapshot.SnapshotMetadataEntity.zzc(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity
            r0.<init>(r1)
            r0.writeToParcel(r2, r3)
            return
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = "title"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }
}
