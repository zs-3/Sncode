package com.google.android.gms.drive.query.internal;

/* loaded from: classes.dex */
public final class zze implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzd> {
    public zze() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzd createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L23
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r6)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            r4 = 1
            if (r3 == r4) goto L1a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r6, r2)
            goto L5
        L1a:
            android.os.Parcelable$Creator<com.google.android.gms.drive.metadata.internal.MetadataBundle> r1 = com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r6, r2, r1)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = (com.google.android.gms.drive.metadata.internal.MetadataBundle) r1
            goto L5
        L23:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r6, r0)
            com.google.android.gms.drive.query.internal.zzd r6 = new com.google.android.gms.drive.query.internal.zzd
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzd[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.query.internal.zzd[] r1 = new com.google.android.gms.drive.query.internal.zzd[r1]
            return r1
    }
}
