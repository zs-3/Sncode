package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzah implements android.os.Parcelable.Creator {
    public zzah() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r1 = 0
            r3 = 0
            r5 = r1
            r8 = r5
            r7 = 0
        La:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L37
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L31
            r3 = 2
            if (r2 == r3) goto L2b
            r3 = 3
            if (r2 == r3) goto L25
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r1)
            goto La
        L25:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r1)
            r8 = r1
            goto La
        L2b:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r1)
            r7 = r1
            goto La
        L31:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r1)
            r5 = r1
            goto La
        L37:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r0)
            com.google.android.gms.measurement.internal.zzag r11 = new com.google.android.gms.measurement.internal.zzag
            r4 = r11
            r4.<init>(r5, r7, r8)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzag[] r1 = new com.google.android.gms.measurement.internal.zzag[r1]
            return r1
    }
}
