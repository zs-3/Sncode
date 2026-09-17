package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzow implements android.os.Parcelable.Creator {
    public zzow() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r4 = 0
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L32
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 1
            if (r6 == r7) goto L2d
            r7 = 2
            if (r6 == r7) goto L28
            r7 = 3
            if (r6 == r7) goto L23
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L8
        L23:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L8
        L28:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r9, r5)
            goto L8
        L2d:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r5)
            goto L8
        L32:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.measurement.internal.zzov r9 = new com.google.android.gms.measurement.internal.zzov
            r9.<init>(r4, r2, r1)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzov[] r1 = new com.google.android.gms.measurement.internal.zzov[r1]
            return r1
    }
}
