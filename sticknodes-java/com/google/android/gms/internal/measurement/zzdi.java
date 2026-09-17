package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzdi implements android.os.Parcelable.Creator {
    public zzdi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r18)
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = r2
            r9 = r7
            r12 = r4
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r11 = 0
        L13:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L59
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r18)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L53;
                case 2: goto L4d;
                case 3: goto L47;
                case 4: goto L41;
                case 5: goto L3b;
                case 6: goto L35;
                case 7: goto L2f;
                case 8: goto L28;
                default: goto L24;
            }
        L24:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L13
        L28:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r16 = r2
            goto L13
        L2f:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r15 = r2
            goto L13
        L35:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r14 = r2
            goto L13
        L3b:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r13 = r2
            goto L13
        L41:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r12 = r2
            goto L13
        L47:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r11 = r2
            goto L13
        L4d:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r9 = r2
            goto L13
        L53:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r7 = r2
            goto L13
        L59:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.measurement.zzdh r0 = new com.google.android.gms.internal.measurement.zzdh
            r6 = r0
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzdh[] r1 = new com.google.android.gms.internal.measurement.zzdh[r1]
            return r1
    }
}
