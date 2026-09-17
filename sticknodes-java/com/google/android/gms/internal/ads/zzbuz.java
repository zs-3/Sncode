package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbuz implements android.os.Parcelable.Creator {
    public zzbuz() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.google.android.gms.internal.ads.zzbuy zza(android.os.Parcel r68) {
            r0 = r68
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r68)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r28 = r2
            r35 = r28
            r9 = r6
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r21 = r19
            r22 = r21
            r27 = r22
            r30 = r27
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r37 = r34
            r43 = r37
            r44 = r43
            r47 = r44
            r48 = r47
            r49 = r48
            r51 = r49
            r52 = r51
            r53 = r52
            r54 = r53
            r56 = r54
            r57 = r56
            r58 = r57
            r63 = r58
            r64 = r63
            r65 = r64
            r66 = r65
            r67 = r66
            r8 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r45 = 0
            r46 = 0
            r50 = 0
            r55 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
        L77:
            int r2 = r68.dataPosition()
            if (r2 >= r1) goto L266
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r68)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L25f;
                case 2: goto L258;
                case 3: goto L24d;
                case 4: goto L242;
                case 5: goto L23b;
                case 6: goto L230;
                case 7: goto L225;
                case 8: goto L21e;
                case 9: goto L216;
                case 10: goto L20e;
                case 11: goto L202;
                case 12: goto L1fa;
                case 13: goto L1f2;
                case 14: goto L1ea;
                case 15: goto L1e2;
                case 16: goto L1da;
                case 17: goto L88;
                case 18: goto L1d2;
                case 19: goto L1ca;
                case 20: goto L1c2;
                case 21: goto L1ba;
                case 22: goto L88;
                case 23: goto L88;
                case 24: goto L88;
                case 25: goto L1b2;
                case 26: goto L1aa;
                case 27: goto L1a2;
                case 28: goto L19a;
                case 29: goto L18e;
                case 30: goto L186;
                case 31: goto L17e;
                case 32: goto L88;
                case 33: goto L176;
                case 34: goto L16e;
                case 35: goto L166;
                case 36: goto L15e;
                case 37: goto L156;
                case 38: goto L88;
                case 39: goto L14e;
                case 40: goto L146;
                case 41: goto L13e;
                case 42: goto L136;
                case 43: goto L12e;
                case 44: goto L126;
                case 45: goto L11e;
                case 46: goto L112;
                case 47: goto L10a;
                case 48: goto L102;
                case 49: goto Lfa;
                case 50: goto Lf2;
                case 51: goto Leb;
                case 52: goto Le4;
                case 53: goto Ldd;
                case 54: goto Ld6;
                case 55: goto Lcf;
                case 56: goto Lc8;
                case 57: goto Lc1;
                case 58: goto Lba;
                case 59: goto Lb3;
                case 60: goto Lac;
                case 61: goto La5;
                case 62: goto L88;
                case 63: goto L9a;
                case 64: goto L93;
                case 65: goto L8c;
                default: goto L88;
            }
        L88:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L77
        L8c:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r67 = r2
            goto L77
        L93:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r66 = r2
            goto L77
        L9a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbmg> r3 = com.google.android.gms.internal.ads.zzbmg.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.internal.ads.zzbmg r2 = (com.google.android.gms.internal.ads.zzbmg) r2
            r65 = r2
            goto L77
        La5:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r64 = r2
            goto L77
        Lac:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r63 = r2
            goto L77
        Lb3:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r62 = r2
            goto L77
        Lba:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r61 = r2
            goto L77
        Lc1:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r60 = r2
            goto L77
        Lc8:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r59 = r2
            goto L77
        Lcf:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r58 = r2
            goto L77
        Ld6:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r57 = r2
            goto L77
        Ldd:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntegerList(r0, r2)
            r56 = r2
            goto L77
        Le4:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r55 = r2
            goto L77
        Leb:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r54 = r2
            goto L77
        Lf2:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r53 = r2
            goto L77
        Lfa:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r52 = r2
            goto L77
        L102:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r51 = r2
            goto L77
        L10a:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r50 = r2
            goto L77
        L112:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzef> r3 = com.google.android.gms.ads.internal.client.zzef.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.client.zzef r2 = (com.google.android.gms.ads.internal.client.zzef) r2
            r49 = r2
            goto L77
        L11e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r48 = r2
            goto L77
        L126:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r47 = r2
            goto L77
        L12e:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r46 = r2
            goto L77
        L136:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r45 = r2
            goto L77
        L13e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r44 = r2
            goto L77
        L146:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r39 = r2
            goto L77
        L14e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r43 = r2
            goto L77
        L156:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r42 = r2
            goto L77
        L15e:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r41 = r2
            goto L77
        L166:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r40 = r2
            goto L77
        L16e:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r38 = r2
            goto L77
        L176:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r37 = r2
            goto L77
        L17e:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r35 = r2
            goto L77
        L186:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r34 = r2
            goto L77
        L18e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfr> r3 = com.google.android.gms.internal.ads.zzbfr.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.internal.ads.zzbfr r2 = (com.google.android.gms.internal.ads.zzbfr) r2
            r33 = r2
            goto L77
        L19a:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r32 = r2
            goto L77
        L1a2:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r31 = r2
            goto L77
        L1aa:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r30 = r2
            goto L77
        L1b2:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r28 = r2
            goto L77
        L1ba:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r27 = r2
            goto L77
        L1c2:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r26 = r2
            goto L77
        L1ca:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r25 = r2
            goto L77
        L1d2:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r24 = r2
            goto L77
        L1da:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r23 = r2
            goto L77
        L1e2:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r22 = r2
            goto L77
        L1ea:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r21 = r2
            goto L77
        L1f2:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r20 = r2
            goto L77
        L1fa:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r19 = r2
            goto L77
        L202:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) r2
            r18 = r2
            goto L77
        L20e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r17 = r2
            goto L77
        L216:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r16 = r2
            goto L77
        L21e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r15 = r2
            goto L77
        L225:
            android.os.Parcelable$Creator r3 = android.content.pm.PackageInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            r14 = r2
            goto L77
        L230:
            android.os.Parcelable$Creator r3 = android.content.pm.ApplicationInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.content.pm.ApplicationInfo r2 = (android.content.pm.ApplicationInfo) r2
            r13 = r2
            goto L77
        L23b:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r12 = r2
            goto L77
        L242:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r3 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.client.zzs r2 = (com.google.android.gms.ads.internal.client.zzs) r2
            r11 = r2
            goto L77
        L24d:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.client.zzm r2 = (com.google.android.gms.ads.internal.client.zzm) r2
            r10 = r2
            goto L77
        L258:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r9 = r2
            goto L77
        L25f:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r8 = r2
            goto L77
        L266:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.ads.zzbuy r0 = new com.google.android.gms.internal.ads.zzbuy
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbuy r1 = zza(r1)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbuy[] r1 = new com.google.android.gms.internal.ads.zzbuy[r1]
            return r1
    }
}
