package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzgx implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgw> {
    public zzgx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgw createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r7)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L2e
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 2
            if (r4 == r5) goto L25
            r5 = 3
            if (r4 == r5) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L6
        L1e:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r2 = com.google.android.gms.drive.DriveId.CREATOR
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r7, r3, r2)
            goto L6
        L25:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r1 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r7, r3, r1)
            com.google.android.gms.drive.DriveId r1 = (com.google.android.gms.drive.DriveId) r1
            goto L6
        L2e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r0)
            com.google.android.gms.internal.drive.zzgw r7 = new com.google.android.gms.internal.drive.zzgw
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgw[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzgw[] r1 = new com.google.android.gms.internal.drive.zzgw[r1]
            return r1
    }
}
