package com.google.android.gms.games.achievement;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r29) {
            r28 = this;
            r0 = r29
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r29)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r22 = r2
            r24 = r22
            r8 = r5
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r17 = r15
            r18 = r17
            r21 = r18
            r27 = r21
            r9 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
        L28:
            int r2 = r29.dataPosition()
            if (r2 >= r1) goto Lc3
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r29)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto Lbc;
                case 2: goto Lb5;
                case 3: goto Lae;
                case 4: goto La7;
                case 5: goto L9d;
                case 6: goto L97;
                case 7: goto L8d;
                case 8: goto L87;
                case 9: goto L80;
                case 10: goto L79;
                case 11: goto L6e;
                case 12: goto L67;
                case 13: goto L60;
                case 14: goto L59;
                case 15: goto L52;
                case 16: goto L4b;
                case 17: goto L44;
                case 18: goto L3d;
                default: goto L39;
            }
        L39:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L28
        L3d:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r27 = r2
            goto L28
        L44:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r26 = r2
            goto L28
        L4b:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r24 = r2
            goto L28
        L52:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r22 = r2
            goto L28
        L59:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r21 = r2
            goto L28
        L60:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r20 = r2
            goto L28
        L67:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r19 = r2
            goto L28
        L6e:
            android.os.Parcelable$Creator<com.google.android.gms.games.PlayerEntity> r3 = com.google.android.gms.games.PlayerEntity.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.PlayerEntity r2 = (com.google.android.gms.games.PlayerEntity) r2
            r18 = r2
            goto L28
        L79:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r17 = r2
            goto L28
        L80:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r16 = r2
            goto L28
        L87:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r15 = r2
            goto L28
        L8d:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r14 = r2
            goto L28
        L97:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r13 = r2
            goto L28
        L9d:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r12 = r2
            goto L28
        La7:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r11 = r2
            goto L28
        Lae:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r10 = r2
            goto L28
        Lb5:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r9 = r2
            goto L28
        Lbc:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r8 = r2
            goto L28
        Lc3:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.games.achievement.AchievementEntity r0 = new com.google.android.gms.games.achievement.AchievementEntity
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r27)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.achievement.AchievementEntity[] r1 = new com.google.android.gms.games.achievement.AchievementEntity[r1]
            return r1
    }
}
