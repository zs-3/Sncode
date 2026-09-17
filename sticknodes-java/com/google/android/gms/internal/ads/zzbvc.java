package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbvc implements android.os.Parcelable.Creator {
    public zzbvc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r14)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r8 = 0
            r11 = 0
            r12 = 0
        Lf:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L5b
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L51;
                case 2: goto L4c;
                case 3: goto L42;
                case 4: goto L3d;
                case 5: goto L38;
                case 6: goto L33;
                case 7: goto L2e;
                case 8: goto L29;
                case 9: goto L24;
                default: goto L20;
            }
        L20:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r1)
            goto Lf
        L24:
            boolean r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r14, r1)
            goto Lf
        L29:
            boolean r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r14, r1)
            goto Lf
        L2e:
            java.util.ArrayList r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r14, r1)
            goto Lf
        L33:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            goto Lf
        L38:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            goto Lf
        L3d:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            goto Lf
        L42:
            android.os.Parcelable$Creator r2 = android.content.pm.PackageInfo.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r6 = r1
            android.content.pm.PackageInfo r6 = (android.content.pm.PackageInfo) r6
            goto Lf
        L4c:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            goto Lf
        L51:
            android.os.Parcelable$Creator r2 = android.content.pm.ApplicationInfo.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r4 = r1
            android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4
            goto Lf
        L5b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.android.gms.internal.ads.zzbvb r14 = new com.google.android.gms.internal.ads.zzbvb
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbvb[] r1 = new com.google.android.gms.internal.ads.zzbvb[r1]
            return r1
    }
}
