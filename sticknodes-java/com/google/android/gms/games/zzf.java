package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzf implements android.os.Parcelable.Creator {
    public zzf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.games.GameEntity r1 = r0.zza(r1)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.GameEntity[] r1 = new com.google.android.gms.games.GameEntity[r1]
            return r1
    }

    public com.google.android.gms.games.GameEntity zza(android.os.Parcel r31) {
            r30 = this;
            r0 = r31
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r31)
            r2 = 0
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r22 = r16
            r23 = r22
            r24 = r23
            r28 = r24
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L2f:
            int r2 = r31.dataPosition()
            if (r2 >= r1) goto Lfe
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r31)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto Lf7;
                case 2: goto Lf0;
                case 3: goto Le9;
                case 4: goto Le2;
                case 5: goto Ldb;
                case 6: goto Ld4;
                case 7: goto Lc9;
                case 8: goto Lbe;
                case 9: goto Lb3;
                case 10: goto Lac;
                case 11: goto La6;
                case 12: goto L9f;
                case 13: goto L98;
                case 14: goto L91;
                case 15: goto L8a;
                case 16: goto L83;
                case 17: goto L7c;
                case 18: goto L75;
                case 19: goto L6e;
                case 20: goto L67;
                case 21: goto L60;
                case 22: goto L59;
                case 23: goto L52;
                case 24: goto L4b;
                case 25: goto L44;
                default: goto L40;
            }
        L40:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L2f
        L44:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r29 = r2
            goto L2f
        L4b:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r28 = r2
            goto L2f
        L52:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r27 = r2
            goto L2f
        L59:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r26 = r2
            goto L2f
        L60:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r25 = r2
            goto L2f
        L67:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r24 = r2
            goto L2f
        L6e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r23 = r2
            goto L2f
        L75:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r22 = r2
            goto L2f
        L7c:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r21 = r2
            goto L2f
        L83:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r20 = r2
            goto L2f
        L8a:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r19 = r2
            goto L2f
        L91:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r18 = r2
            goto L2f
        L98:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r17 = r2
            goto L2f
        L9f:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r16 = r2
            goto L2f
        La6:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r15 = r2
            goto L2f
        Lac:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r14 = r2
            goto L2f
        Lb3:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r13 = r2
            goto L2f
        Lbe:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r12 = r2
            goto L2f
        Lc9:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r11 = r2
            goto L2f
        Ld4:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r10 = r2
            goto L2f
        Ldb:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r9 = r2
            goto L2f
        Le2:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r8 = r2
            goto L2f
        Le9:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r7 = r2
            goto L2f
        Lf0:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r6 = r2
            goto L2f
        Lf7:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r5 = r2
            goto L2f
        Lfe:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.games.GameEntity r0 = new com.google.android.gms.games.GameEntity
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
    }
}
