package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzae implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzad> {
    public zzae() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzad createFromParcel(android.os.Parcel r3) {
            r2 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r3)
        L4:
            int r1 = r3.dataPosition()
            if (r1 >= r0) goto L15
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r3, r1)
            goto L4
        L15:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r3, r0)
            com.google.android.gms.internal.drive.zzad r3 = new com.google.android.gms.internal.drive.zzad
            r3.<init>()
            return r3
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzad[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzad[] r1 = new com.google.android.gms.internal.drive.zzad[r1]
            return r1
    }
}
