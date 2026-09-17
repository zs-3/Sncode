package com.google.android.gms.drive.query.internal;

/* loaded from: classes.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzb> {
    public zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzb createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r7)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L30
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 1
            if (r4 == r5) goto L27
            r5 = 2
            if (r4 == r5) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L6
        L1e:
            android.os.Parcelable$Creator<com.google.android.gms.drive.metadata.internal.MetadataBundle> r2 = com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r7, r3, r2)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = (com.google.android.gms.drive.metadata.internal.MetadataBundle) r2
            goto L6
        L27:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzx> r1 = com.google.android.gms.drive.query.internal.zzx.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r7, r3, r1)
            com.google.android.gms.drive.query.internal.zzx r1 = (com.google.android.gms.drive.query.internal.zzx) r1
            goto L6
        L30:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r0)
            com.google.android.gms.drive.query.internal.zzb r7 = new com.google.android.gms.drive.query.internal.zzb
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzb[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.query.internal.zzb[] r1 = new com.google.android.gms.drive.query.internal.zzb[r1]
            return r1
    }
}
