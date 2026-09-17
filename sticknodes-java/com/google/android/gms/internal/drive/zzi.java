package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzi implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzh> {
    public zzi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzh createFromParcel(android.os.Parcel r14) {
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r14)
            r1 = 0
            r3 = 0
            r4 = 0
            r9 = r1
            r11 = r9
            r7 = r4
            r6 = 0
            r8 = 0
        Ld:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L4c
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L47
            r3 = 3
            if (r2 == r3) goto L3d
            r3 = 4
            if (r2 == r3) goto L38
            r3 = 5
            if (r2 == r3) goto L33
            r3 = 6
            if (r2 == r3) goto L2e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r1)
            goto Ld
        L2e:
            long r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r14, r1)
            goto Ld
        L33:
            long r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r14, r1)
            goto Ld
        L38:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            goto Ld
        L3d:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r2 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r7 = r1
            com.google.android.gms.drive.DriveId r7 = (com.google.android.gms.drive.DriveId) r7
            goto Ld
        L47:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            goto Ld
        L4c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.android.gms.internal.drive.zzh r14 = new com.google.android.gms.internal.drive.zzh
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r11)
            return r14
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzh[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzh[] r1 = new com.google.android.gms.internal.drive.zzh[r1]
            return r1
    }
}
