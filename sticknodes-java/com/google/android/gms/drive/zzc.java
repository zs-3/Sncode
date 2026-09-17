package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.drive.Contents> {
    public zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.Contents createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r1 = 0
            r2 = 0
            r4 = r2
            r7 = r4
            r9 = r7
            r5 = 0
            r6 = 0
            r8 = 0
        Lc:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L59
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L4f
            r3 = 3
            if (r2 == r3) goto L4a
            r3 = 4
            if (r2 == r3) goto L45
            r3 = 5
            if (r2 == r3) goto L3b
            r3 = 7
            if (r2 == r3) goto L36
            r3 = 8
            if (r2 == r3) goto L31
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r1)
            goto Lc
        L31:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r1)
            goto Lc
        L36:
            boolean r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r11, r1)
            goto Lc
        L3b:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r2 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r11, r1, r2)
            r7 = r1
            com.google.android.gms.drive.DriveId r7 = (com.google.android.gms.drive.DriveId) r7
            goto Lc
        L45:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r1)
            goto Lc
        L4a:
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r1)
            goto Lc
        L4f:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r11, r1, r2)
            r4 = r1
            android.os.ParcelFileDescriptor r4 = (android.os.ParcelFileDescriptor) r4
            goto Lc
        L59:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r0)
            com.google.android.gms.drive.Contents r11 = new com.google.android.gms.drive.Contents
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.Contents[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.Contents[] r1 = new com.google.android.gms.drive.Contents[r1]
            return r1
    }
}
