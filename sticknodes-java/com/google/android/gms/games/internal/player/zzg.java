package com.google.android.gms.games.internal.player;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzg implements android.os.Parcelable.Creator {
    public zzg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
            r19 = this;
            r0 = r20
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r20)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r10 = r6
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L19:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L8d
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r20)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L83;
                case 2: goto L7d;
                case 3: goto L77;
                case 4: goto L71;
                case 5: goto L6b;
                case 6: goto L61;
                case 7: goto L5b;
                case 8: goto L55;
                case 9: goto L4f;
                case 10: goto L49;
                case 11: goto L43;
                case 12: goto L3c;
                case 13: goto L35;
                case 14: goto L2e;
                default: goto L2a;
            }
        L2a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L19
        L2e:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r18 = r2
            goto L19
        L35:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r17 = r2
            goto L19
        L3c:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r16 = r2
            goto L19
        L43:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r15 = r2
            goto L19
        L49:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r14 = r2
            goto L19
        L4f:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r13 = r2
            goto L19
        L55:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r12 = r2
            goto L19
        L5b:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r11 = r2
            goto L19
        L61:
            android.os.Parcelable$Creator<com.google.android.gms.games.internal.player.StockProfileImageEntity> r3 = com.google.android.gms.games.internal.player.StockProfileImageEntity.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.internal.player.StockProfileImageEntity r2 = (com.google.android.gms.games.internal.player.StockProfileImageEntity) r2
            r10 = r2
            goto L19
        L6b:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r9 = r2
            goto L19
        L71:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r8 = r2
            goto L19
        L77:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r7 = r2
            goto L19
        L7d:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r6 = r2
            goto L19
        L83:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r3 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            r5 = r2
            goto L19
        L8d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.games.internal.player.ProfileSettingsEntity r0 = new com.google.android.gms.games.internal.player.ProfileSettingsEntity
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.internal.player.ProfileSettingsEntity[] r1 = new com.google.android.gms.games.internal.player.ProfileSettingsEntity[r1]
            return r1
    }
}
