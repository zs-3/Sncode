package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzs implements android.os.Parcelable.Creator {
    public zzs() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.games.PlayerEntity r1 = r0.zza(r1)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.PlayerEntity[] r1 = new com.google.android.gms.games.PlayerEntity[r1]
            return r1
    }

    public com.google.android.gms.games.PlayerEntity zza(android.os.Parcel r38) {
            r37 = this;
            r0 = r38
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r38)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = -1
            r13 = r2
            r16 = r13
            r9 = r5
            r10 = r9
            r11 = r10
            r12 = r11
            r18 = r12
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r25 = r22
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r33 = r30
            r34 = r33
            r36 = r34
            r31 = r6
            r15 = 0
            r23 = 0
            r24 = 0
            r35 = 0
        L38:
            int r2 = r38.dataPosition()
            if (r2 >= r1) goto L122
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r38)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L11b;
                case 2: goto L114;
                case 3: goto L109;
                case 4: goto Lfe;
                case 5: goto Lf7;
                case 6: goto Lf0;
                case 7: goto Le8;
                case 8: goto Le0;
                case 9: goto Ld8;
                case 10: goto L49;
                case 11: goto L49;
                case 12: goto L49;
                case 13: goto L49;
                case 14: goto Ld0;
                case 15: goto Lc4;
                case 16: goto Lb8;
                case 17: goto L49;
                case 18: goto Lb1;
                case 19: goto Laa;
                case 20: goto La3;
                case 21: goto L9c;
                case 22: goto L91;
                case 23: goto L8a;
                case 24: goto L7f;
                case 25: goto L78;
                case 26: goto L49;
                case 27: goto L49;
                case 28: goto L49;
                case 29: goto L71;
                case 30: goto L49;
                case 31: goto L49;
                case 32: goto L49;
                case 33: goto L66;
                case 34: goto L49;
                case 35: goto L5b;
                case 36: goto L54;
                case 37: goto L4d;
                default: goto L49;
            }
        L49:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L38
        L4d:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r36 = r2
            goto L38
        L54:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r35 = r2
            goto L38
        L5b:
            android.os.Parcelable$Creator<com.google.android.gms.games.zza> r3 = com.google.android.gms.games.zza.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.zza r2 = (com.google.android.gms.games.zza) r2
            r34 = r2
            goto L38
        L66:
            android.os.Parcelable$Creator<com.google.android.gms.games.zzv> r3 = com.google.android.gms.games.zzv.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.zzv r2 = (com.google.android.gms.games.zzv) r2
            r33 = r2
            goto L38
        L71:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r31 = r2
            goto L38
        L78:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r30 = r2
            goto L38
        L7f:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r29 = r2
            goto L38
        L8a:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r28 = r2
            goto L38
        L91:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r27 = r2
            goto L38
        L9c:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r26 = r2
            goto L38
        La3:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r25 = r2
            goto L38
        Laa:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r24 = r2
            goto L38
        Lb1:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r23 = r2
            goto L38
        Lb8:
            android.os.Parcelable$Creator<com.google.android.gms.games.PlayerLevelInfo> r3 = com.google.android.gms.games.PlayerLevelInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.PlayerLevelInfo r2 = (com.google.android.gms.games.PlayerLevelInfo) r2
            r22 = r2
            goto L38
        Lc4:
            android.os.Parcelable$Creator<com.google.android.gms.games.internal.player.MostRecentGameInfoEntity> r3 = com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r2 = (com.google.android.gms.games.internal.player.MostRecentGameInfoEntity) r2
            r21 = r2
            goto L38
        Ld0:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r20 = r2
            goto L38
        Ld8:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r19 = r2
            goto L38
        Le0:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r18 = r2
            goto L38
        Le8:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r16 = r2
            goto L38
        Lf0:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r15 = r2
            goto L38
        Lf7:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r13 = r2
            goto L38
        Lfe:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r12 = r2
            goto L38
        L109:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r11 = r2
            goto L38
        L114:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r10 = r2
            goto L38
        L11b:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r9 = r2
            goto L38
        L122:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.games.PlayerEntity r0 = new com.google.android.gms.games.PlayerEntity
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36)
            return r0
    }
}
