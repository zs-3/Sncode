package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzgn implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgm> {
    public zzgn() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgm createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L42
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L38
            r7 = 4
            if (r6 == r7) goto L2f
            r7 = 5
            if (r6 == r7) goto L26
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L8
        L26:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.FilterHolder> r4 = com.google.android.gms.drive.query.internal.FilterHolder.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r4)
            com.google.android.gms.drive.query.internal.FilterHolder r4 = (com.google.android.gms.drive.query.internal.FilterHolder) r4
            goto L8
        L2f:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r3 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r3)
            com.google.android.gms.drive.DriveId r3 = (com.google.android.gms.drive.DriveId) r3
            goto L8
        L38:
            java.lang.String[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r9, r5)
            goto L8
        L3d:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r5)
            goto L8
        L42:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.internal.drive.zzgm r9 = new com.google.android.gms.internal.drive.zzgm
            r9.<init>(r1, r2, r3, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgm[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzgm[] r1 = new com.google.android.gms.internal.drive.zzgm[r1]
            return r1
    }
}
