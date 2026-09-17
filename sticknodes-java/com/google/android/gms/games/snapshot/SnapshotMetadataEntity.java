package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SnapshotMetadataEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class SnapshotMetadataEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.snapshot.SnapshotMetadata {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.snapshot.SnapshotMetadataEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGame", id = 1)
    private final com.google.android.gms.games.GameEntity zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOwner", id = 2)
    private final com.google.android.gms.games.PlayerEntity zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSnapshotId", id = 3)
    private final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCoverImageUri", id = 5)
    private final android.net.Uri zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCoverImageUrl", id = 6)
    private final java.lang.String zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTitle", id = 7)
    private final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDescription", id = 8)
    private final java.lang.String zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLastModifiedTimestamp", id = 9)
    private final long zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPlayedTime", id = 10)
    private final long zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCoverImageAspectRatio", id = 11)
    private final float zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUniqueName", id = 12)
    private final java.lang.String zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "hasChangePending", id = 13)
    private final boolean zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProgressValue", id = 14)
    private final long zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDeviceName", id = 15)
    private final java.lang.String zzn;

    static {
            com.google.android.gms.games.snapshot.zzd r0 = new com.google.android.gms.games.snapshot.zzd
            r0.<init>()
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SnapshotMetadataEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.games.GameEntity r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.games.PlayerEntity r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.net.Uri r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) long r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) long r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) float r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) java.lang.String r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) boolean r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) long r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) java.lang.String r20) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.zza = r1
            r1 = r5
            r0.zzb = r1
            r1 = r6
            r0.zzc = r1
            r1 = r7
            r0.zzd = r1
            r1 = r8
            r0.zze = r1
            r1 = r15
            r0.zzj = r1
            r1 = r9
            r0.zzf = r1
            r1 = r10
            r0.zzg = r1
            r1 = r11
            r0.zzh = r1
            r1 = r13
            r0.zzi = r1
            r1 = r16
            r0.zzk = r1
            r1 = r17
            r0.zzl = r1
            r1 = r18
            r0.zzm = r1
            r1 = r20
            r0.zzn = r1
            return
    }

    public SnapshotMetadataEntity(com.google.android.gms.games.snapshot.SnapshotMetadata r4) {
            r3 = this;
            com.google.android.gms.games.PlayerEntity r0 = new com.google.android.gms.games.PlayerEntity
            com.google.android.gms.games.Player r1 = r4.getOwner()
            r0.<init>(r1)
            r3.<init>()
            com.google.android.gms.games.GameEntity r1 = new com.google.android.gms.games.GameEntity
            com.google.android.gms.games.Game r2 = r4.getGame()
            r1.<init>(r2)
            r3.zza = r1
            r3.zzb = r0
            java.lang.String r0 = r4.getSnapshotId()
            r3.zzc = r0
            android.net.Uri r0 = r4.getCoverImageUri()
            r3.zzd = r0
            java.lang.String r0 = r4.getCoverImageUrl()
            r3.zze = r0
            float r0 = r4.getCoverImageAspectRatio()
            r3.zzj = r0
            java.lang.String r0 = r4.zza()
            r3.zzf = r0
            java.lang.String r0 = r4.getDescription()
            r3.zzg = r0
            long r0 = r4.getLastModifiedTimestamp()
            r3.zzh = r0
            long r0 = r4.getPlayedTime()
            r3.zzi = r0
            java.lang.String r0 = r4.getUniqueName()
            r3.zzk = r0
            boolean r0 = r4.hasChangePending()
            r3.zzl = r0
            long r0 = r4.getProgressValue()
            r3.zzm = r0
            java.lang.String r4 = r4.getDeviceName()
            r3.zzn = r4
            return
    }

    static int zzb(com.google.android.gms.games.snapshot.SnapshotMetadata r3) {
            r0 = 13
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.games.Game r1 = r3.getGame()
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.games.Player r1 = r3.getOwner()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.getSnapshotId()
            r2 = 2
            r0[r2] = r1
            android.net.Uri r1 = r3.getCoverImageUri()
            r2 = 3
            r0[r2] = r1
            float r1 = r3.getCoverImageAspectRatio()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.zza()
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = r3.getDescription()
            r2 = 6
            r0[r2] = r1
            long r1 = r3.getLastModifiedTimestamp()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            long r1 = r3.getPlayedTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            java.lang.String r1 = r3.getUniqueName()
            r2 = 9
            r0[r2] = r1
            boolean r1 = r3.hasChangePending()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 10
            r0[r2] = r1
            long r1 = r3.getProgressValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 11
            r0[r2] = r1
            java.lang.String r3 = r3.getDeviceName()
            r1 = 12
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static java.lang.String zzc(com.google.android.gms.games.snapshot.SnapshotMetadata r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            com.google.android.gms.games.Game r1 = r3.getGame()
            java.lang.String r2 = "Game"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.Player r1 = r3.getOwner()
            java.lang.String r2 = "Owner"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getSnapshotId()
            java.lang.String r2 = "SnapshotId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getCoverImageUri()
            java.lang.String r2 = "CoverImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getCoverImageUrl()
            java.lang.String r2 = "CoverImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            float r1 = r3.getCoverImageAspectRatio()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "CoverImageAspectRatio"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDescription()
            java.lang.String r2 = "Description"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getLastModifiedTimestamp()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "LastModifiedTimestamp"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getPlayedTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "PlayedTime"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getUniqueName()
            java.lang.String r2 = "UniqueName"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.hasChangePending()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "ChangePending"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getProgressValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "ProgressValue"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r3 = r3.getDeviceName()
            java.lang.String r1 = "DeviceName"
            com.google.android.gms.common.internal.Objects$ToStringHelper r3 = r0.add(r1, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    static boolean zzd(com.google.android.gms.games.snapshot.SnapshotMetadata r5, java.lang.Object r6) {
            boolean r0 = r6 instanceof com.google.android.gms.games.snapshot.SnapshotMetadata
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r6) goto La
            return r0
        La:
            com.google.android.gms.games.snapshot.SnapshotMetadata r6 = (com.google.android.gms.games.snapshot.SnapshotMetadata) r6
            com.google.android.gms.games.Game r2 = r6.getGame()
            com.google.android.gms.games.Game r3 = r5.getGame()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            com.google.android.gms.games.Player r2 = r6.getOwner()
            com.google.android.gms.games.Player r3 = r5.getOwner()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            java.lang.String r2 = r6.getSnapshotId()
            java.lang.String r3 = r5.getSnapshotId()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            android.net.Uri r2 = r6.getCoverImageUri()
            android.net.Uri r3 = r5.getCoverImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            float r2 = r6.getCoverImageAspectRatio()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r5.getCoverImageAspectRatio()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            java.lang.String r2 = r6.zza()
            java.lang.String r3 = r5.zza()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            java.lang.String r2 = r6.getDescription()
            java.lang.String r3 = r5.getDescription()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            long r2 = r6.getLastModifiedTimestamp()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getLastModifiedTimestamp()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            long r2 = r6.getPlayedTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getPlayedTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            java.lang.String r2 = r6.getUniqueName()
            java.lang.String r3 = r5.getUniqueName()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            boolean r2 = r6.hasChangePending()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.hasChangePending()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            long r2 = r6.getProgressValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getProgressValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Leb
            java.lang.String r6 = r6.getDeviceName()
            java.lang.String r5 = r5.getDeviceName()
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r6, r5)
            if (r5 == 0) goto Leb
            return r0
        Leb:
            return r1
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzd(r0, r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.snapshot.SnapshotMetadata freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadata freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public float getCoverImageAspectRatio() {
            r1 = this;
            float r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public android.net.Uri getCoverImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getCoverImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public void getDescription(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzg
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getDeviceName() {
            r1 = this;
            java.lang.String r0 = r1.zzn
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public com.google.android.gms.games.Game getGame() {
            r1 = this;
            com.google.android.gms.games.GameEntity r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getLastModifiedTimestamp() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public com.google.android.gms.games.Player getOwner() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getPlayedTime() {
            r2 = this;
            long r0 = r2.zzi
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getProgressValue() {
            r2 = this;
            long r0 = r2.zzm
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getSnapshotId() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getUniqueName() {
            r1 = this;
            java.lang.String r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public boolean hasChangePending() {
            r1 = this;
            boolean r0 = r1.zzl
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = zzb(r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = zzc(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.games.Game r1 = r4.getGame()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.games.Player r1 = r4.getOwner()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.getSnapshotId()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.net.Uri r1 = r4.getCoverImageUri()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.getCoverImageUrl()
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.lang.String r6 = r4.zzf
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.lang.String r6 = r4.getDescription()
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            long r1 = r4.getLastModifiedTimestamp()
            r6 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            long r1 = r4.getPlayedTime()
            r6 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            float r6 = r4.getCoverImageAspectRatio()
            r1 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r1, r6)
            java.lang.String r6 = r4.getUniqueName()
            r1 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            boolean r6 = r4.hasChangePending()
            r1 = 13
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            long r1 = r4.getProgressValue()
            r6 = 14
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            java.lang.String r6 = r4.getDeviceName()
            r1 = 15
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }
}
