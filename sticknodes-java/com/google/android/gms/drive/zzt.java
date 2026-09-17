package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class zzt implements android.os.Parcelable.Creator<com.google.android.gms.drive.UserMetadata> {
    public zzt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.UserMetadata createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r8 = r6
            r7 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L45
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L40
            r3 = 3
            if (r2 == r3) goto L3b
            r3 = 4
            if (r2 == r3) goto L36
            r3 = 5
            if (r2 == r3) goto L31
            r3 = 6
            if (r2 == r3) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto Lb
        L2c:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto Lb
        L31:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            goto Lb
        L36:
            java.lang.String r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto Lb
        L3b:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto Lb
        L40:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto Lb
        L45:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.drive.UserMetadata r10 = new com.google.android.gms.drive.UserMetadata
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.UserMetadata[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.UserMetadata[] r1 = new com.google.android.gms.drive.UserMetadata[r1]
            return r1
    }
}
