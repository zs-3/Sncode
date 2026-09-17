package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzk implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzj> {
    public zzk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzj createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r6 = r4
            r7 = r6
            r8 = r7
            r5 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L59
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L4f
            r3 = 3
            if (r2 == r3) goto L4a
            r3 = 4
            if (r2 == r3) goto L40
            r3 = 5
            if (r2 == r3) goto L36
            r3 = 6
            if (r2 == r3) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto Lb
        L2c:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.zzt> r2 = com.google.android.gms.drive.events.zzt.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r8 = r1
            com.google.android.gms.drive.events.zzt r8 = (com.google.android.gms.drive.events.zzt) r8
            goto Lb
        L36:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.zzx> r2 = com.google.android.gms.drive.events.zzx.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r7 = r1
            com.google.android.gms.drive.events.zzx r7 = (com.google.android.gms.drive.events.zzx) r7
            goto Lb
        L40:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.zze> r2 = com.google.android.gms.drive.events.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r6 = r1
            com.google.android.gms.drive.events.zze r6 = (com.google.android.gms.drive.events.zze) r6
            goto Lb
        L4a:
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto Lb
        L4f:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r2 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r4 = r1
            com.google.android.gms.drive.DriveId r4 = (com.google.android.gms.drive.DriveId) r4
            goto Lb
        L59:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.internal.drive.zzj r10 = new com.google.android.gms.internal.drive.zzj
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzj[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzj[] r1 = new com.google.android.gms.internal.drive.zzj[r1]
            return r1
    }
}
