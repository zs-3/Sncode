package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class zzi implements android.os.Parcelable.Creator<com.google.android.gms.drive.zzh> {
    public zzi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.zzh createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r3 = r1
        L7:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L29
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 2
            if (r6 == r7) goto L24
            r7 = 3
            if (r6 == r7) goto L1f
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L7
        L1f:
            long r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r9, r5)
            goto L7
        L24:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r9, r5)
            goto L7
        L29:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.drive.zzh r9 = new com.google.android.gms.drive.zzh
            r9.<init>(r1, r3)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.zzh[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.zzh[] r1 = new com.google.android.gms.drive.zzh[r1]
            return r1
    }
}
