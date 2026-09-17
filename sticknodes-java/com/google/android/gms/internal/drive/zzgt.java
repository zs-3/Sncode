package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzgt implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgs> {
    public zzgt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgs createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r8)
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L3a
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 2
            if (r5 == r6) goto L31
            r6 = 3
            if (r5 == r6) goto L2c
            r6 = 4
            if (r5 == r6) goto L23
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L8
        L23:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.zzt> r2 = com.google.android.gms.drive.events.zzt.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r8, r4, r2)
            com.google.android.gms.drive.events.zzt r2 = (com.google.android.gms.drive.events.zzt) r2
            goto L8
        L2c:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L8
        L31:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r1 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r8, r4, r1)
            com.google.android.gms.drive.DriveId r1 = (com.google.android.gms.drive.DriveId) r1
            goto L8
        L3a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r0)
            com.google.android.gms.internal.drive.zzgs r8 = new com.google.android.gms.internal.drive.zzgs
            r8.<init>(r1, r3, r2)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgs[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzgs[] r1 = new com.google.android.gms.internal.drive.zzgs[r1]
            return r1
    }
}
