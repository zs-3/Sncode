package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzpb implements android.os.Parcelable.Creator {
    public zzpb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r17) {
            r16 = this;
            r0 = r17
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r17)
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = r2
            r13 = r7
            r9 = r4
            r10 = r9
            r11 = r10
            r15 = r11
            r12 = 0
        L11:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L50
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r17)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L4a;
                case 2: goto L44;
                case 3: goto L3e;
                case 4: goto L38;
                case 5: goto L32;
                case 6: goto L2c;
                case 7: goto L26;
                default: goto L22;
            }
        L22:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L11
        L26:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r15 = r2
            goto L11
        L2c:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r13 = r2
            goto L11
        L32:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r12 = r2
            goto L11
        L38:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r11 = r2
            goto L11
        L3e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r10 = r2
            goto L11
        L44:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r0, r2)
            r9 = r2
            goto L11
        L4a:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r7 = r2
            goto L11
        L50:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.measurement.internal.zzpa r0 = new com.google.android.gms.measurement.internal.zzpa
            r6 = r0
            r6.<init>(r7, r9, r10, r11, r12, r13, r15)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzpa[] r1 = new com.google.android.gms.measurement.internal.zzpa[r1]
            return r1
    }
}
