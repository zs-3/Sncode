package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class zzk implements android.os.Parcelable.Creator<com.google.android.gms.drive.DriveId> {
    public zzk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.DriveId createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r3 = 0
            r4 = -1
            r7 = r1
            r9 = r7
            r6 = r3
            r11 = -1
        Lc:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L3e
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L39
            r3 = 3
            if (r2 == r3) goto L34
            r3 = 4
            if (r2 == r3) goto L2f
            r3 = 5
            if (r2 == r3) goto L2a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Lc
        L2a:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto Lc
        L2f:
            long r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r1)
            goto Lc
        L34:
            long r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r1)
            goto Lc
        L39:
            java.lang.String r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto Lc
        L3e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.drive.DriveId r13 = new com.google.android.gms.drive.DriveId
            r5 = r13
            r5.<init>(r6, r7, r9, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.DriveId[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.DriveId[] r1 = new com.google.android.gms.drive.DriveId[r1]
            return r1
    }
}
