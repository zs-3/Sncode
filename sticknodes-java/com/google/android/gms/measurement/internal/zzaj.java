package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzaj implements android.os.Parcelable.Creator {
    public zzaj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r22) {
            r21 = this;
            r0 = r22
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r22)
            r2 = 0
            r4 = 0
            r5 = 0
            r10 = r2
            r15 = r10
            r18 = r15
            r7 = r4
            r8 = r7
            r9 = r8
            r13 = r9
            r14 = r13
            r17 = r14
            r20 = r17
            r12 = 0
        L18:
            int r2 = r22.dataPosition()
            if (r2 >= r1) goto L82
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r22)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 2: goto L7c;
                case 3: goto L76;
                case 4: goto L6c;
                case 5: goto L66;
                case 6: goto L60;
                case 7: goto L5a;
                case 8: goto L50;
                case 9: goto L4a;
                case 10: goto L3f;
                case 11: goto L38;
                case 12: goto L2d;
                default: goto L29;
            }
        L29:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L18
        L2d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r3 = com.google.android.gms.measurement.internal.zzbh.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.measurement.internal.zzbh r2 = (com.google.android.gms.measurement.internal.zzbh) r2
            r20 = r2
            goto L18
        L38:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r18 = r2
            goto L18
        L3f:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r3 = com.google.android.gms.measurement.internal.zzbh.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.measurement.internal.zzbh r2 = (com.google.android.gms.measurement.internal.zzbh) r2
            r17 = r2
            goto L18
        L4a:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r15 = r2
            goto L18
        L50:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r3 = com.google.android.gms.measurement.internal.zzbh.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.measurement.internal.zzbh r2 = (com.google.android.gms.measurement.internal.zzbh) r2
            r14 = r2
            goto L18
        L5a:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r13 = r2
            goto L18
        L60:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r12 = r2
            goto L18
        L66:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r10 = r2
            goto L18
        L6c:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzqb> r3 = com.google.android.gms.measurement.internal.zzqb.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.measurement.internal.zzqb r2 = (com.google.android.gms.measurement.internal.zzqb) r2
            r9 = r2
            goto L18
        L76:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r8 = r2
            goto L18
        L7c:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r7 = r2
            goto L18
        L82:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.measurement.internal.zzai r0 = new com.google.android.gms.measurement.internal.zzai
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r20)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzai[] r1 = new com.google.android.gms.measurement.internal.zzai[r1]
            return r1
    }
}
