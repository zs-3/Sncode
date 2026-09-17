package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzd implements android.os.Parcelable.Creator {
    public zzd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
            r25 = this;
            r0 = r26
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r26)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r15 = r2
            r17 = r15
            r22 = r17
            r8 = r4
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r20 = r14
            r24 = r20
            r19 = 0
            r21 = 0
        L1f:
            int r2 = r26.dataPosition()
            if (r2 >= r1) goto L9a
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r26)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L90;
                case 2: goto L86;
                case 3: goto L80;
                case 4: goto L30;
                case 5: goto L76;
                case 6: goto L70;
                case 7: goto L6a;
                case 8: goto L64;
                case 9: goto L5e;
                case 10: goto L57;
                case 11: goto L50;
                case 12: goto L49;
                case 13: goto L42;
                case 14: goto L3b;
                case 15: goto L34;
                default: goto L30;
            }
        L30:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L1f
        L34:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r24 = r2
            goto L1f
        L3b:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r22 = r2
            goto L1f
        L42:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r21 = r2
            goto L1f
        L49:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r20 = r2
            goto L1f
        L50:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r19 = r2
            goto L1f
        L57:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r17 = r2
            goto L1f
        L5e:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r15 = r2
            goto L1f
        L64:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r14 = r2
            goto L1f
        L6a:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r13 = r2
            goto L1f
        L70:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r12 = r2
            goto L1f
        L76:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r11 = r2
            goto L1f
        L80:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r10 = r2
            goto L1f
        L86:
            android.os.Parcelable$Creator<com.google.android.gms.games.PlayerEntity> r3 = com.google.android.gms.games.PlayerEntity.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.PlayerEntity r2 = (com.google.android.gms.games.PlayerEntity) r2
            r9 = r2
            goto L1f
        L90:
            android.os.Parcelable$Creator<com.google.android.gms.games.GameEntity> r3 = com.google.android.gms.games.GameEntity.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            com.google.android.gms.games.GameEntity r2 = (com.google.android.gms.games.GameEntity) r2
            r8 = r2
            goto L1f
        L9a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r24)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity[] r1 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity[r1]
            return r1
    }
}
