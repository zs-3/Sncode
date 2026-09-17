package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzs implements android.os.Parcelable.Creator {
    public zzs() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r54) {
            r53 = this;
            r0 = r54
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r54)
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 100
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            r37 = r3
            r38 = r37
            r44 = r38
            r49 = r44
            r16 = r5
            r18 = r16
            r26 = r18
            r33 = r26
            r41 = r33
            r46 = r41
            r50 = r46
            r12 = r7
            r13 = r12
            r14 = r13
            r15 = r14
            r20 = r15
            r25 = r20
            r31 = r25
            r32 = r31
            r35 = r32
            r36 = r35
            r39 = r36
            r48 = r39
            r23 = r9
            r21 = 1
            r22 = 0
            r28 = 0
            r29 = 1
            r30 = 0
            r40 = 0
            r43 = 100
            r45 = 0
            r52 = 0
        L50:
            int r2 = r54.dataPosition()
            if (r2 >= r1) goto L15a
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r54)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 2: goto L153;
                case 3: goto L14c;
                case 4: goto L145;
                case 5: goto L13e;
                case 6: goto L136;
                case 7: goto L12e;
                case 8: goto L126;
                case 9: goto L11e;
                case 10: goto L116;
                case 11: goto L10e;
                case 12: goto L106;
                case 13: goto L61;
                case 14: goto Lfe;
                case 15: goto Lf6;
                case 16: goto Lee;
                case 17: goto L61;
                case 18: goto Le6;
                case 19: goto Lde;
                case 20: goto L61;
                case 21: goto Ld6;
                case 22: goto Lce;
                case 23: goto Lc7;
                case 24: goto Lc0;
                case 25: goto Lb9;
                case 26: goto Lb2;
                case 27: goto Lab;
                case 28: goto La4;
                case 29: goto L9d;
                case 30: goto L96;
                case 31: goto L8f;
                case 32: goto L88;
                case 33: goto L61;
                case 34: goto L81;
                case 35: goto L7a;
                case 36: goto L73;
                case 37: goto L6c;
                case 38: goto L65;
                default: goto L61;
            }
        L61:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L50
        L65:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r52 = r2
            goto L50
        L6c:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r50 = r2
            goto L50
        L73:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r49 = r2
            goto L50
        L7a:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r48 = r2
            goto L50
        L81:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r46 = r2
            goto L50
        L88:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r45 = r2
            goto L50
        L8f:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r44 = r2
            goto L50
        L96:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r43 = r2
            goto L50
        L9d:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r41 = r2
            goto L50
        La4:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r40 = r2
            goto L50
        Lab:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r39 = r2
            goto L50
        Lb2:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r38 = r2
            goto L50
        Lb9:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r37 = r2
            goto L50
        Lc0:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r36 = r2
            goto L50
        Lc7:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r35 = r2
            goto L50
        Lce:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r33 = r2
            goto L50
        Ld6:
            java.lang.Boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBooleanObject(r0, r2)
            r32 = r2
            goto L50
        Lde:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r31 = r2
            goto L50
        Le6:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r30 = r2
            goto L50
        Lee:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r29 = r2
            goto L50
        Lf6:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r28 = r2
            goto L50
        Lfe:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r26 = r2
            goto L50
        L106:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r25 = r2
            goto L50
        L10e:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r23 = r2
            goto L50
        L116:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r22 = r2
            goto L50
        L11e:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r21 = r2
            goto L50
        L126:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r20 = r2
            goto L50
        L12e:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r18 = r2
            goto L50
        L136:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r16 = r2
            goto L50
        L13e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r15 = r2
            goto L50
        L145:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r14 = r2
            goto L50
        L14c:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r13 = r2
            goto L50
        L153:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r12 = r2
            goto L50
        L15a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.measurement.internal.zzr r0 = new com.google.android.gms.measurement.internal.zzr
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r48, r49, r50, r52)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzr[] r1 = new com.google.android.gms.measurement.internal.zzr[r1]
            return r1
    }
}
