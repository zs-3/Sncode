package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbh implements android.os.Parcelable.Creator {
    public zzbbh() {
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
            r4 = 0
            r5 = 0
            r8 = r2
            r15 = r8
            r7 = r5
            r10 = r7
            r11 = r10
            r12 = r11
            r13 = r12
            r17 = r13
            r14 = 0
            r18 = 0
        L16:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L69
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r20)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 2: goto L63;
                case 3: goto L5d;
                case 4: goto L57;
                case 5: goto L51;
                case 6: goto L4b;
                case 7: goto L45;
                case 8: goto L3f;
                case 9: goto L39;
                case 10: goto L32;
                case 11: goto L2b;
                default: goto L27;
            }
        L27:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L16
        L2b:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r18 = r2
            goto L16
        L32:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r17 = r2
            goto L16
        L39:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r15 = r2
            goto L16
        L3f:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r14 = r2
            goto L16
        L45:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r13 = r2
            goto L16
        L4b:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r12 = r2
            goto L16
        L51:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r11 = r2
            goto L16
        L57:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r10 = r2
            goto L16
        L5d:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r8 = r2
            goto L16
        L63:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r7 = r2
            goto L16
        L69:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.ads.zzbbg r0 = new com.google.android.gms.internal.ads.zzbbg
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r17, r18)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbbg[] r1 = new com.google.android.gms.internal.ads.zzbbg[r1]
            return r1
    }
}
