package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzo implements android.os.Parcelable.Creator {
    public zzo() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r36) {
            r35 = this;
            r0 = r36
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r36)
            r2 = 0
            r4 = 0
            r5 = 0
            r8 = r2
            r33 = r8
            r10 = r5
            r12 = r10
            r16 = r12
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r26 = r24
            r28 = r26
            r29 = r28
            r31 = r29
            r7 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r25 = 0
            r27 = 0
            r30 = 0
            r32 = 0
        L36:
            int r2 = r36.dataPosition()
            if (r2 >= r1) goto L111
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r36)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L10a;
                case 2: goto L103;
                case 3: goto Lfc;
                case 4: goto Lf5;
                case 5: goto Lee;
                case 6: goto Le7;
                case 7: goto Le0;
                case 8: goto Ld9;
                case 9: goto Ld1;
                case 10: goto Lc5;
                case 11: goto Lb9;
                case 12: goto Lb1;
                case 13: goto Laa;
                case 14: goto La3;
                case 15: goto L9c;
                case 16: goto L95;
                case 17: goto L8e;
                case 18: goto L87;
                case 19: goto L7c;
                case 20: goto L75;
                case 21: goto L6e;
                case 22: goto L67;
                case 23: goto L60;
                case 24: goto L59;
                case 25: goto L52;
                case 26: goto L4b;
                default: goto L47;
            }
        L47:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L36
        L4b:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r33 = r2
            goto L36
        L52:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r32 = r2
            goto L36
        L59:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r31 = r2
            goto L36
        L60:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r30 = r2
            goto L36
        L67:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r29 = r2
            goto L36
        L6e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r28 = r2
            goto L36
        L75:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r27 = r2
            goto L36
        L7c:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzc> r3 = com.google.android.gms.ads.internal.client.zzc.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.client.zzc r2 = (com.google.android.gms.ads.internal.client.zzc) r2
            r26 = r2
            goto L36
        L87:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r25 = r2
            goto L36
        L8e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r24 = r2
            goto L36
        L95:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r23 = r2
            goto L36
        L9c:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r22 = r2
            goto L36
        La3:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r21 = r2
            goto L36
        Laa:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r20 = r2
            goto L36
        Lb1:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r19 = r2
            goto L36
        Lb9:
            android.os.Parcelable$Creator r3 = android.location.Location.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.location.Location r2 = (android.location.Location) r2
            r18 = r2
            goto L36
        Lc5:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzfy> r3 = com.google.android.gms.ads.internal.client.zzfy.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.ads.internal.client.zzfy r2 = (com.google.android.gms.ads.internal.client.zzfy) r2
            r17 = r2
            goto L36
        Ld1:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r16 = r2
            goto L36
        Ld9:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r15 = r2
            goto L36
        Le0:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r14 = r2
            goto L36
        Le7:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r13 = r2
            goto L36
        Lee:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r12 = r2
            goto L36
        Lf5:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r11 = r2
            goto L36
        Lfc:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r10 = r2
            goto L36
        L103:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r8 = r2
            goto L36
        L10a:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r7 = r2
            goto L36
        L111:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.ads.internal.client.zzm r0 = new com.google.android.gms.ads.internal.client.zzm
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.ads.internal.client.zzm[] r1 = new com.google.android.gms.ads.internal.client.zzm[r1]
            return r1
    }
}
