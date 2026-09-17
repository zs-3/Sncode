package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzx implements android.os.Parcelable.Creator {
    public zzx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r15) {
            r14 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r15)
            r1 = 0
            r2 = 0
            r5 = r1
            r8 = r5
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r6 = r2
        Lf:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L58
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r15)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L52;
                case 2: goto L4c;
                case 3: goto L42;
                case 4: goto L3c;
                case 5: goto L36;
                case 6: goto L30;
                case 7: goto L2a;
                case 8: goto L24;
                default: goto L20;
            }
        L20:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r15, r1)
            goto Lf
        L24:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            r13 = r1
            goto Lf
        L2a:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            r12 = r1
            goto Lf
        L30:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            r11 = r1
            goto Lf
        L36:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            r10 = r1
            goto Lf
        L3c:
            android.os.Bundle r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r15, r1)
            r9 = r1
            goto Lf
        L42:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r2 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            com.google.android.gms.ads.internal.client.zze r1 = (com.google.android.gms.ads.internal.client.zze) r1
            r8 = r1
            goto Lf
        L4c:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r15, r1)
            r6 = r1
            goto Lf
        L52:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            r5 = r1
            goto Lf
        L58:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r15, r0)
            com.google.android.gms.ads.internal.client.zzw r15 = new com.google.android.gms.ads.internal.client.zzw
            r4 = r15
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13)
            return r15
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.ads.internal.client.zzw[] r1 = new com.google.android.gms.ads.internal.client.zzw[r1]
            return r1
    }
}
