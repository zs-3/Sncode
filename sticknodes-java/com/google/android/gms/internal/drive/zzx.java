package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzx implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzw> {
    public zzx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzw createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r9 = r6
            r8 = 0
            r10 = 0
            r11 = 0
        Ld:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L59
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r3) {
                case 2: goto L4f;
                case 3: goto L45;
                case 4: goto L3b;
                case 5: goto L36;
                case 6: goto L31;
                case 7: goto L2c;
                case 8: goto L27;
                case 9: goto L22;
                default: goto L1e;
            }
        L1e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Ld
        L22:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto Ld
        L27:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto Ld
        L2c:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto Ld
        L31:
            boolean r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto Ld
        L36:
            java.lang.Integer r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(r13, r1)
            goto Ld
        L3b:
            android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r3 = com.google.android.gms.drive.Contents.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r3)
            r6 = r1
            com.google.android.gms.drive.Contents r6 = (com.google.android.gms.drive.Contents) r6
            goto Ld
        L45:
            android.os.Parcelable$Creator<com.google.android.gms.drive.metadata.internal.MetadataBundle> r3 = com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r3)
            r5 = r1
            com.google.android.gms.drive.metadata.internal.MetadataBundle r5 = (com.google.android.gms.drive.metadata.internal.MetadataBundle) r5
            goto Ld
        L4f:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r3 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r3)
            r4 = r1
            com.google.android.gms.drive.DriveId r4 = (com.google.android.gms.drive.DriveId) r4
            goto Ld
        L59:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.internal.drive.zzw r13 = new com.google.android.gms.internal.drive.zzw
            int r7 = r2.intValue()
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzw[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzw[] r1 = new com.google.android.gms.internal.drive.zzw[r1]
            return r1
    }
}
