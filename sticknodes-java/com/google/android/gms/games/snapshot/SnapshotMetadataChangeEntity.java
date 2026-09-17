package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SnapshotMetadataChangeCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class SnapshotMetadataChangeEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.snapshot.SnapshotMetadataChange {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDescription", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPlayedTimeMillis", id = 2)
    private final java.lang.Long zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCoverImageUri", id = 4)
    private final android.net.Uri zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCoverImageTeleporter", id = 5)
    private com.google.android.gms.common.data.BitmapTeleporter zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProgressValue", id = 6)
    private final java.lang.Long zze;

    static {
            com.google.android.gms.games.snapshot.zzc r0 = new com.google.android.gms.games.snapshot.zzc
            r0.<init>()
            com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity.CREATOR = r0
            return
    }

    SnapshotMetadataChangeEntity() {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SnapshotMetadataChangeEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.Long r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.common.data.BitmapTeleporter r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.net.Uri r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.Long r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzd = r3
            r0.zzc = r4
            r0.zze = r5
            r1 = 1
            if (r3 == 0) goto L14
            if (r4 != 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.String r2 = "Cannot set both a URI and an image"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            return
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final android.graphics.Bitmap getCoverImage() {
            r1 = this;
            com.google.android.gms.common.data.BitmapTeleporter r0 = r1.zzd
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.Bitmap r0 = r0.get()
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final java.lang.Long getPlayedTimeMillis() {
            r1 = this;
            java.lang.Long r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final java.lang.Long getProgressValue() {
            r1 = this;
            java.lang.Long r0 = r1.zze
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.zza
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.Long r1 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(r5, r2, r1, r3)
            android.net.Uri r1 = r4.zzc
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.data.BitmapTeleporter r1 = r4.zzd
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.Long r6 = r4.zze
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final com.google.android.gms.common.data.BitmapTeleporter zza() {
            r1 = this;
            com.google.android.gms.common.data.BitmapTeleporter r0 = r1.zzd
            return r0
    }
}
