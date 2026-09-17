package com.google.android.gms.games.stats;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    static void zza(com.google.android.gms.games.stats.PlayerStatsEntity r3, android.os.Parcel r4, int r5) {
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            float r0 = r3.getAverageSessionLength()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r4, r1, r0)
            float r0 = r3.getChurnProbability()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r4, r1, r0)
            int r0 = r3.getDaysSinceLastPlayed()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            int r0 = r3.getNumberOfPurchases()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            int r0 = r3.getNumberOfSessions()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            float r0 = r3.getSessionPercentile()
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r4, r1, r0)
            float r0 = r3.getSpendPercentile()
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r4, r1, r0)
            android.os.Bundle r0 = r3.zza()
            r1 = 8
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r4, r1, r0, r2)
            float r0 = r3.getSpendProbability()
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r4, r1, r0)
            float r0 = r3.getHighSpenderProbability()
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r4, r1, r0)
            float r3 = r3.getTotalSpendNext28Days()
            r0 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r4, r0, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r18)
            r2 = 0
            r3 = 0
            r4 = 0
            r13 = r4
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L15:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L6d
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r18)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L67;
                case 2: goto L61;
                case 3: goto L5b;
                case 4: goto L55;
                case 5: goto L4f;
                case 6: goto L49;
                case 7: goto L43;
                case 8: goto L3d;
                case 9: goto L37;
                case 10: goto L31;
                case 11: goto L2a;
                default: goto L26;
            }
        L26:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L15
        L2a:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r16 = r2
            goto L15
        L31:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r15 = r2
            goto L15
        L37:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r14 = r2
            goto L15
        L3d:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r13 = r2
            goto L15
        L43:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r12 = r2
            goto L15
        L49:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r11 = r2
            goto L15
        L4f:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r10 = r2
            goto L15
        L55:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r9 = r2
            goto L15
        L5b:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r8 = r2
            goto L15
        L61:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r7 = r2
            goto L15
        L67:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r6 = r2
            goto L15
        L6d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.games.stats.PlayerStatsEntity r0 = new com.google.android.gms.games.stats.PlayerStatsEntity
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.stats.PlayerStatsEntity[] r1 = new com.google.android.gms.games.stats.PlayerStatsEntity[r1]
            return r1
    }
}
