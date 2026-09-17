package com.google.android.gms.drive.query;

/* loaded from: classes.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.SortOrder> {
    public zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.SortOrder createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r7)
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L2a
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 1
            if (r4 == r5) goto L23
            r5 = 2
            if (r4 == r5) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L6
        L1e:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r7, r3)
            goto L6
        L23:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzf> r1 = com.google.android.gms.drive.query.internal.zzf.CREATOR
            java.util.ArrayList r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r7, r3, r1)
            goto L6
        L2a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r0)
            com.google.android.gms.drive.query.SortOrder r7 = new com.google.android.gms.drive.query.SortOrder
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.SortOrder[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.query.SortOrder[] r1 = new com.google.android.gms.drive.query.SortOrder[r1]
            return r1
    }
}
