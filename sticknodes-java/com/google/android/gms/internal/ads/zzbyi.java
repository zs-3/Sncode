package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbyi implements android.os.Parcelable.Creator {
    public zzbyi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r8 = r5
            r11 = r8
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
        Le:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L4b
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 2: goto L46;
                case 3: goto L41;
                case 4: goto L3c;
                case 5: goto L37;
                case 6: goto L32;
                case 7: goto L2d;
                case 8: goto L28;
                case 9: goto L23;
                default: goto L1f;
            }
        L1f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Le
        L23:
            java.util.ArrayList r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r13, r1)
            goto Le
        L28:
            boolean r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto Le
        L2d:
            boolean r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto Le
        L32:
            java.util.ArrayList r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r13, r1)
            goto Le
        L37:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto Le
        L3c:
            boolean r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto Le
        L41:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto Le
        L46:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto Le
        L4b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.internal.ads.zzbyh r13 = new com.google.android.gms.internal.ads.zzbyh
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbyh[] r1 = new com.google.android.gms.internal.ads.zzbyh[r1]
            return r1
    }
}
