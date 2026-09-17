package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SnapshotEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class SnapshotEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.snapshot.Snapshot {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.snapshot.SnapshotEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMetadata", id = 1)
    private final com.google.android.gms.games.snapshot.SnapshotMetadataEntity zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSnapshotContents", id = 3)
    private final com.google.android.gms.games.snapshot.SnapshotContentsEntity zzb;

    static {
            com.google.android.gms.games.snapshot.zzb r0 = new com.google.android.gms.games.snapshot.zzb
            r0.<init>()
            com.google.android.gms.games.snapshot.SnapshotEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public SnapshotEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.games.snapshot.SnapshotMetadata r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.games.snapshot.SnapshotContentsEntity r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity
            r0.<init>(r2)
            r1.zza = r0
            r1.zzb = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.games.snapshot.Snapshot
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
        L6:
            r1 = 0
            goto L2a
        L8:
            if (r4 != r5) goto Lb
            goto L2a
        Lb:
            com.google.android.gms.games.snapshot.Snapshot r5 = (com.google.android.gms.games.snapshot.Snapshot) r5
            com.google.android.gms.games.snapshot.SnapshotMetadata r0 = r5.getMetadata()
            com.google.android.gms.games.snapshot.SnapshotMetadata r3 = r4.getMetadata()
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            com.google.android.gms.games.snapshot.SnapshotContents r5 = r5.getSnapshotContents()
            com.google.android.gms.games.snapshot.SnapshotContents r0 = r4.getSnapshotContents()
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r0)
            if (r5 != 0) goto L2a
            goto L6
        L2a:
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.snapshot.Snapshot freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.snapshot.Snapshot freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public com.google.android.gms.games.snapshot.SnapshotMetadata getMetadata() {
            r1 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public com.google.android.gms.games.snapshot.SnapshotContents getSnapshotContents() {
            r1 = this;
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r0 = r1.zzb
            boolean r0 = r0.isClosed()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.games.snapshot.SnapshotMetadata r1 = r3.getMetadata()
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.games.snapshot.SnapshotContents r1 = r3.getSnapshotContents()
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            com.google.android.gms.games.snapshot.SnapshotMetadata r1 = r3.getMetadata()
            java.lang.String r2 = "Metadata"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.snapshot.SnapshotContents r1 = r3.getSnapshotContents()
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "HasContents"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.games.snapshot.SnapshotMetadata r1 = r4.getMetadata()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.games.snapshot.SnapshotContents r1 = r4.getSnapshotContents()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
