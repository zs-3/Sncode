package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzgg implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgf> {
    public zzgg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgf createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r8)
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L35
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 2
            if (r5 == r6) goto L2c
            r6 = 3
            if (r5 == r6) goto L27
            r6 = 4
            if (r5 == r6) goto L22
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L7
        L22:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r8, r4)
            goto L7
        L27:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r8, r4)
            goto L7
        L2c:
            android.os.Parcelable$Creator r1 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r8, r4, r1)
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            goto L7
        L35:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r0)
            com.google.android.gms.internal.drive.zzgf r8 = new com.google.android.gms.internal.drive.zzgf
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgf[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzgf[] r1 = new com.google.android.gms.internal.drive.zzgf[r1]
            return r1
    }
}
