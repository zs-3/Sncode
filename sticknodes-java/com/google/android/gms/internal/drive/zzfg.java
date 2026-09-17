package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzfg implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzff> {
    public zzfg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzff createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = r2
            r4 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L45
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 2
            if (r6 == r7) goto L3c
            r7 = 3
            if (r6 == r7) goto L35
            r7 = 4
            if (r6 == r7) goto L2c
            r7 = 5
            if (r6 == r7) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L9
        L27:
            boolean r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r9, r5)
            goto L9
        L2c:
            android.os.Parcelable$Creator<com.google.android.gms.drive.zza> r3 = com.google.android.gms.drive.zza.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r3)
            com.google.android.gms.drive.zza r3 = (com.google.android.gms.drive.zza) r3
            goto L9
        L35:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r2 = com.google.android.gms.drive.DriveId.CREATOR
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r9, r5, r2)
            goto L9
        L3c:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r1 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r1)
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1
            goto L9
        L45:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.internal.drive.zzff r9 = new com.google.android.gms.internal.drive.zzff
            r9.<init>(r1, r2, r3, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzff[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzff[] r1 = new com.google.android.gms.internal.drive.zzff[r1]
            return r1
    }
}
