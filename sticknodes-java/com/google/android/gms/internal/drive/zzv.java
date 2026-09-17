package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzv implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzu> {
    public zzv() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzu createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r6 = r4
            r7 = r6
            r8 = r7
            r5 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L4f
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L45
            r3 = 3
            if (r2 == r3) goto L40
            r3 = 4
            if (r2 == r3) goto L3b
            r3 = 5
            if (r2 == r3) goto L31
            r3 = 6
            if (r2 == r3) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto Lb
        L2c:
            java.lang.Integer r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(r10, r1)
            goto Lb
        L31:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r2 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r7 = r1
            com.google.android.gms.drive.DriveId r7 = (com.google.android.gms.drive.DriveId) r7
            goto Lb
        L3b:
            java.lang.String r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto Lb
        L40:
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto Lb
        L45:
            android.os.Parcelable$Creator<com.google.android.gms.drive.metadata.internal.MetadataBundle> r2 = com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r4 = r1
            com.google.android.gms.drive.metadata.internal.MetadataBundle r4 = (com.google.android.gms.drive.metadata.internal.MetadataBundle) r4
            goto Lb
        L4f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.internal.drive.zzu r10 = new com.google.android.gms.internal.drive.zzu
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzu[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzu[] r1 = new com.google.android.gms.internal.drive.zzu[r1]
            return r1
    }
}
