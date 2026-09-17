package com.google.android.gms.drive.query;

/* loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.Query> {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.Query createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r8 = 0
            r10 = 0
        Ld:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L51
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L47;
                case 2: goto L1e;
                case 3: goto L42;
                case 4: goto L38;
                case 5: goto L33;
                case 6: goto L2e;
                case 7: goto L27;
                case 8: goto L22;
                default: goto L1e;
            }
        L1e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto Ld
        L22:
            boolean r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto Ld
        L27:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveSpace> r2 = com.google.android.gms.drive.DriveSpace.CREATOR
            java.util.ArrayList r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r12, r1, r2)
            goto Ld
        L2e:
            boolean r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto Ld
        L33:
            java.util.ArrayList r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r12, r1)
            goto Ld
        L38:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.SortOrder> r2 = com.google.android.gms.drive.query.SortOrder.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r6 = r1
            com.google.android.gms.drive.query.SortOrder r6 = (com.google.android.gms.drive.query.SortOrder) r6
            goto Ld
        L42:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            goto Ld
        L47:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzr> r2 = com.google.android.gms.drive.query.internal.zzr.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r4 = r1
            com.google.android.gms.drive.query.internal.zzr r4 = (com.google.android.gms.drive.query.internal.zzr) r4
            goto Ld
        L51:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.drive.query.Query r12 = new com.google.android.gms.drive.query.Query
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.Query[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.query.Query[] r1 = new com.google.android.gms.drive.query.Query[r1]
            return r1
    }
}
