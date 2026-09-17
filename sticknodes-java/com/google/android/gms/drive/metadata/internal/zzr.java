package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public final class zzr implements android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.zzq> {
    public zzr() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.metadata.internal.zzq createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r4 = -1
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L32
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 2
            if (r6 == r7) goto L2d
            r7 = 3
            if (r6 == r7) goto L28
            r7 = 4
            if (r6 == r7) goto L23
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L8
        L23:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L8
        L28:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r9, r5)
            goto L8
        L2d:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r5)
            goto L8
        L32:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.drive.metadata.internal.zzq r9 = new com.google.android.gms.drive.metadata.internal.zzq
            r9.<init>(r1, r2, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.metadata.internal.zzq[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.metadata.internal.zzq[] r1 = new com.google.android.gms.drive.metadata.internal.zzq[r1]
            return r1
    }
}
