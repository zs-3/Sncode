package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public final class zzd implements android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.zzc> {
    public zzd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.metadata.internal.zzc createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r7)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L2c
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 2
            if (r4 == r5) goto L23
            r5 = 3
            if (r4 == r5) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L6
        L1e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r7, r3)
            goto L6
        L23:
            android.os.Parcelable$Creator<com.google.android.gms.drive.metadata.CustomPropertyKey> r1 = com.google.android.gms.drive.metadata.CustomPropertyKey.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r7, r3, r1)
            com.google.android.gms.drive.metadata.CustomPropertyKey r1 = (com.google.android.gms.drive.metadata.CustomPropertyKey) r1
            goto L6
        L2c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r0)
            com.google.android.gms.drive.metadata.internal.zzc r7 = new com.google.android.gms.drive.metadata.internal.zzc
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.metadata.internal.zzc[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.metadata.internal.zzc[] r1 = new com.google.android.gms.drive.metadata.internal.zzc[r1]
            return r1
    }
}
