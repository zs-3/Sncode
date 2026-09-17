package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzqc implements android.os.Parcelable.Creator {
    public zzqc() {
            r0 = this;
            r0.<init>()
            return
    }

    static void zza(com.google.android.gms.measurement.internal.zzqb r5, android.os.Parcel r6, int r7) {
            int r7 = r5.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r1, r7)
            java.lang.String r7 = r5.zzb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r7, r2)
            long r3 = r5.zzc
            r7 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r7, r3)
            java.lang.Long r7 = r5.zzd
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(r6, r1, r7, r2)
            r7 = 5
            r1 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(r6, r7, r1, r2)
            java.lang.String r7 = r5.zze
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r7, r2)
            java.lang.String r7 = r5.zzf
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r7, r2)
            java.lang.Double r5 = r5.zzg
            r7 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(r6, r7, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r17) {
            r16 = this;
            r0 = r17
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r17)
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = r2
            r11 = r8
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r9 = r3
            r7 = 0
        L12:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L57
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r17)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L51;
                case 2: goto L4b;
                case 3: goto L45;
                case 4: goto L3f;
                case 5: goto L39;
                case 6: goto L33;
                case 7: goto L2d;
                case 8: goto L27;
                default: goto L23;
            }
        L23:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L12
        L27:
            java.lang.Double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(r0, r2)
            r15 = r2
            goto L12
        L2d:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r14 = r2
            goto L12
        L33:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r13 = r2
            goto L12
        L39:
            java.lang.Float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(r0, r2)
            r12 = r2
            goto L12
        L3f:
            java.lang.Long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(r0, r2)
            r11 = r2
            goto L12
        L45:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r9 = r2
            goto L12
        L4b:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r8 = r2
            goto L12
        L51:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r7 = r2
            goto L12
        L57:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.measurement.internal.zzqb r0 = new com.google.android.gms.measurement.internal.zzqb
            r6 = r0
            r6.<init>(r7, r8, r9, r11, r12, r13, r14, r15)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzqb[] r1 = new com.google.android.gms.measurement.internal.zzqb[r1]
            return r1
    }
}
