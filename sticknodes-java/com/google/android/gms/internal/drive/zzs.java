package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzs implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzr> {
    public zzs() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzr createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r6)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
        L6:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L20
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r6)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            r4 = 2
            if (r3 == r4) goto L1b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r6, r2)
            goto L6
        L1b:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r6, r2)
            goto L6
        L20:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r6, r0)
            com.google.android.gms.internal.drive.zzr r6 = new com.google.android.gms.internal.drive.zzr
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzr[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzr[] r1 = new com.google.android.gms.internal.drive.zzr[r1]
            return r1
    }
}
