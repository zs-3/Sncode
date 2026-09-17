package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzo implements android.os.Parcelable.Creator {
    public zzo() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r33) {
            r32 = this;
            r0 = r33
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r33)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r3
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
            r18 = r15
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r30 = r4
            r13 = 0
            r16 = 0
            r17 = 0
            r29 = 0
        L31:
            int r2 = r33.dataPosition()
            if (r2 >= r1) goto Lfb
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r33)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 2: goto Lf0;
                case 3: goto Le9;
                case 4: goto Le2;
                case 5: goto Ldb;
                case 6: goto Ld4;
                case 7: goto Lcd;
                case 8: goto Lc6;
                case 9: goto Lbf;
                case 10: goto Lb8;
                case 11: goto Lb0;
                case 12: goto La9;
                case 13: goto La2;
                case 14: goto L97;
                case 15: goto L42;
                case 16: goto L90;
                case 17: goto L85;
                case 18: goto L7e;
                case 19: goto L77;
                case 20: goto L42;
                case 21: goto L42;
                case 22: goto L42;
                case 23: goto L42;
                case 24: goto L70;
                case 25: goto L69;
                case 26: goto L62;
                case 27: goto L5b;
                case 28: goto L54;
                case 29: goto L4d;
                case 30: goto L46;
                default: goto L42;
            }
        L42:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L31
        L46:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r30 = r2
            goto L31
        L4d:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r29 = r2
            goto L31
        L54:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r28 = r2
            goto L31
        L5b:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r27 = r2
            goto L31
        L62:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r26 = r2
            goto L31
        L69:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r25 = r2
            goto L31
        L70:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r24 = r2
            goto L31
        L77:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r23 = r2
            goto L31
        L7e:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r22 = r2
            goto L31
        L85:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.zzk> r3 = com.google.android.gms.ads.internal.zzk.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.zzk r2 = (com.google.android.gms.ads.internal.zzk) r2
            r21 = r2
            goto L31
        L90:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r20 = r2
            goto L31
        L97:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) r2
            r19 = r2
            goto L31
        La2:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r18 = r2
            goto L31
        La9:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r17 = r2
            goto L31
        Lb0:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r16 = r2
            goto L31
        Lb8:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r15 = r2
            goto L31
        Lbf:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r14 = r2
            goto L31
        Lc6:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r13 = r2
            goto L31
        Lcd:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r12 = r2
            goto L31
        Ld4:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r11 = r2
            goto L31
        Ldb:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r10 = r2
            goto L31
        Le2:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r9 = r2
            goto L31
        Le9:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r8 = r2
            goto L31
        Lf0:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.overlay.zzc> r3 = com.google.android.gms.ads.internal.overlay.zzc.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.overlay.zzc r2 = (com.google.android.gms.ads.internal.overlay.zzc) r2
            r7 = r2
            goto L31
        Lfb:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel[] r1 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel[r1]
            return r1
    }
}
