package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzu implements android.os.Parcelable.Creator {
    public zzu() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = 0
            r9 = r1
            r10 = r9
            r5 = r2
            r7 = r5
        Lb:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L49
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L43
            r3 = 2
            if (r2 == r3) goto L3d
            r3 = 3
            if (r2 == r3) goto L33
            r3 = 4
            if (r2 == r3) goto L29
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto Lb
        L29:
            android.os.Parcelable$Creator<com.google.android.gms.games.PlayerLevel> r2 = com.google.android.gms.games.PlayerLevel.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            com.google.android.gms.games.PlayerLevel r1 = (com.google.android.gms.games.PlayerLevel) r1
            r10 = r1
            goto Lb
        L33:
            android.os.Parcelable$Creator<com.google.android.gms.games.PlayerLevel> r2 = com.google.android.gms.games.PlayerLevel.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            com.google.android.gms.games.PlayerLevel r1 = (com.google.android.gms.games.PlayerLevel) r1
            r9 = r1
            goto Lb
        L3d:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r12, r1)
            r7 = r1
            goto Lb
        L43:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r12, r1)
            r5 = r1
            goto Lb
        L49:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.games.PlayerLevelInfo r12 = new com.google.android.gms.games.PlayerLevelInfo
            r4 = r12
            r4.<init>(r5, r7, r9, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.PlayerLevelInfo[] r1 = new com.google.android.gms.games.PlayerLevelInfo[r1]
            return r1
    }
}
