package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.drive.zza> {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.zza createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r1 = 0
            r4 = r1
            r6 = r4
            r8 = r6
        L9:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L33
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L2e
            r3 = 3
            if (r2 == r3) goto L29
            r3 = 4
            if (r2 == r3) goto L24
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r1)
            goto L9
        L24:
            long r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r1)
            goto L9
        L29:
            long r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r1)
            goto L9
        L2e:
            long r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r1)
            goto L9
        L33:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r0)
            com.google.android.gms.drive.zza r11 = new com.google.android.gms.drive.zza
            r3 = r11
            r3.<init>(r4, r6, r8)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.zza[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.zza[] r1 = new com.google.android.gms.drive.zza[r1]
            return r1
    }
}
