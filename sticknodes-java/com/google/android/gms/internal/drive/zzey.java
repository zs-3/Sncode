package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzey implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzex> {
    public zzey() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzex createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L23
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r6)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            r4 = 2
            if (r3 == r4) goto L1a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r6, r2)
            goto L5
        L1a:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r1 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r6, r2, r1)
            com.google.android.gms.drive.DriveId r1 = (com.google.android.gms.drive.DriveId) r1
            goto L5
        L23:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r6, r0)
            com.google.android.gms.internal.drive.zzex r6 = new com.google.android.gms.internal.drive.zzex
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzex[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzex[] r1 = new com.google.android.gms.internal.drive.zzex[r1]
            return r1
    }
}
