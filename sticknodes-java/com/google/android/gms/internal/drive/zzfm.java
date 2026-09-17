package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzfm implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfl> {
    public zzfm() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzfl createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r3 = 0
            r4 = 0
            r6 = r1
            r8 = r6
            r11 = r4
            r10 = 0
        Lc:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L40
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L3b
            r3 = 3
            if (r2 == r3) goto L36
            r3 = 4
            if (r2 == r3) goto L31
            r3 = 5
            if (r2 == r3) goto L2a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Lc
        L2a:
            android.os.Parcelable$Creator<com.google.android.gms.drive.zzh> r2 = com.google.android.gms.drive.zzh.CREATOR
            java.util.ArrayList r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r13, r1, r2)
            goto Lc
        L31:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto Lc
        L36:
            long r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r1)
            goto Lc
        L3b:
            long r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r1)
            goto Lc
        L40:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.internal.drive.zzfl r13 = new com.google.android.gms.internal.drive.zzfl
            r5 = r13
            r5.<init>(r6, r8, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzfl[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzfl[] r1 = new com.google.android.gms.internal.drive.zzfl[r1]
            return r1
    }
}
