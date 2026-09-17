package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzc implements android.os.Parcelable.Creator {
    public zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        La:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L51
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 1
            if (r2 == r8) goto L4b
            r8 = 2
            if (r2 == r8) goto L45
            r8 = 4
            if (r2 == r8) goto L3b
            r8 = 5
            if (r2 == r8) goto L31
            r8 = 6
            if (r2 == r8) goto L2b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto La
        L2b:
            java.lang.Long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(r10, r1)
            r7 = r1
            goto La
        L31:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.BitmapTeleporter> r2 = com.google.android.gms.common.data.BitmapTeleporter.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            com.google.android.gms.common.data.BitmapTeleporter r1 = (com.google.android.gms.common.data.BitmapTeleporter) r1
            r5 = r1
            goto La
        L3b:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r6 = r1
            goto La
        L45:
            java.lang.Long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(r10, r1)
            r4 = r1
            goto La
        L4b:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            r3 = r1
            goto La
        L51:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r10 = new com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity[] r1 = new com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity[r1]
            return r1
    }
}
