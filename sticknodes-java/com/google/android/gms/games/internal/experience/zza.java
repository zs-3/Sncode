package com.google.android.gms.games.internal.experience;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator {
    public zza() {
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
            r3 = 0
            r5 = 0
            r13 = r3
            r15 = r13
            r17 = r15
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r19 = 0
            r20 = 0
        L18:
            int r2 = r22.dataPosition()
            if (r2 >= r1) goto L7a
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r22)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L74;
                case 2: goto L6a;
                case 3: goto L64;
                case 4: goto L5e;
                case 5: goto L58;
                case 6: goto L4e;
                case 7: goto L48;
                case 8: goto L42;
                case 9: goto L3b;
                case 10: goto L34;
                case 11: goto L2d;
                default: goto L29;
            }
        L29:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L18
        L2d:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r20 = r2
            goto L18
        L34:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r19 = r2
            goto L18
        L3b:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r17 = r2
            goto L18
        L42:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r15 = r2
            goto L18
        L48:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r13 = r2
            goto L18
        L4e:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r12 = r2
            goto L18
        L58:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r11 = r2
            goto L18
        L5e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r10 = r2
            goto L18
        L64:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r9 = r2
            goto L18
        L6a:
            android.os.Parcelable$Creator<com.google.android.gms.games.GameEntity> r3 = com.google.android.gms.games.GameEntity.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.GameEntity r2 = (com.google.android.gms.games.GameEntity) r2
            r8 = r2
            goto L18
        L74:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r7 = r2
            goto L18
        L7a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.games.internal.experience.ExperienceEventEntity r0 = new com.google.android.gms.games.internal.experience.ExperienceEventEntity
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r17, r19, r20)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.internal.experience.ExperienceEventEntity[] r1 = new com.google.android.gms.games.internal.experience.ExperienceEventEntity[r1]
            return r1
    }
}
