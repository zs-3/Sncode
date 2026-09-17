package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzbi implements android.os.Parcelable.Creator {
    public zzbi() {
            r0 = this;
            r0.<init>()
            return
    }

    static void zza(com.google.android.gms.measurement.internal.zzbh r4, android.os.Parcel r5, int r6) {
            java.lang.String r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            com.google.android.gms.measurement.internal.zzbf r0 = r4.zzb
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            java.lang.String r6 = r4.zzc
            r0 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r0, r6, r3)
            long r2 = r4.zzd
            r4 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r4, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r2
        Lb:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L45
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L3f
            r3 = 3
            if (r2 == r3) goto L35
            r3 = 4
            if (r2 == r3) goto L2f
            r3 = 5
            if (r2 == r3) goto L29
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r1)
            goto Lb
        L29:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r1)
            r8 = r1
            goto Lb
        L2f:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r1)
            r7 = r1
            goto Lb
        L35:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbf> r2 = com.google.android.gms.measurement.internal.zzbf.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r11, r1, r2)
            com.google.android.gms.measurement.internal.zzbf r1 = (com.google.android.gms.measurement.internal.zzbf) r1
            r6 = r1
            goto Lb
        L3f:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r1)
            r5 = r1
            goto Lb
        L45:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r0)
            com.google.android.gms.measurement.internal.zzbh r11 = new com.google.android.gms.measurement.internal.zzbh
            r4 = r11
            r4.<init>(r5, r6, r7, r8)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzbh[] r1 = new com.google.android.gms.measurement.internal.zzbh[r1]
            return r1
    }
}
