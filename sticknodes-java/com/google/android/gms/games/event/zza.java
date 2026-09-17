package com.google.android.gms.games.event;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r18)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = r2
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r15 = r12
            r13 = r3
            r16 = 0
        L14:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L68
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r18)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L62;
                case 2: goto L5c;
                case 3: goto L56;
                case 4: goto L4c;
                case 5: goto L46;
                case 6: goto L3c;
                case 7: goto L36;
                case 8: goto L30;
                case 9: goto L29;
                default: goto L25;
            }
        L25:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L14
        L29:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r16 = r2
            goto L14
        L30:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r15 = r2
            goto L14
        L36:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r13 = r2
            goto L14
        L3c:
            android.os.Parcelable$Creator<com.google.android.gms.games.PlayerEntity> r3 = com.google.android.gms.games.PlayerEntity.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.PlayerEntity r2 = (com.google.android.gms.games.PlayerEntity) r2
            r12 = r2
            goto L14
        L46:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r11 = r2
            goto L14
        L4c:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r10 = r2
            goto L14
        L56:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r9 = r2
            goto L14
        L5c:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r8 = r2
            goto L14
        L62:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r7 = r2
            goto L14
        L68:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.games.event.EventEntity r0 = new com.google.android.gms.games.event.EventEntity
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.event.EventEntity[] r1 = new com.google.android.gms.games.event.EventEntity[r1]
            return r1
    }
}
