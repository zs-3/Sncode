package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzv implements android.os.Parcelable.Creator {
    public zzv() {
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
            r4 = 0
            r9 = r2
            r8 = r4
            r6 = 0
            r7 = 0
        Lc:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L42
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L3c
            r3 = 2
            if (r2 == r3) goto L36
            r3 = 3
            if (r2 == r3) goto L30
            r3 = 4
            if (r2 == r3) goto L2a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto Lc
        L2a:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r12, r1)
            r9 = r1
            goto Lc
        L30:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            r8 = r1
            goto Lc
        L36:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            r7 = r1
            goto Lc
        L3c:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            r6 = r1
            goto Lc
        L42:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.ads.internal.client.zzu r12 = new com.google.android.gms.ads.internal.client.zzu
            r5 = r12
            r5.<init>(r6, r7, r8, r9)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.ads.internal.client.zzu[] r1 = new com.google.android.gms.ads.internal.client.zzu[r1]
            return r1
    }
}
