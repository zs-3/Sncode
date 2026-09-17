package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator {
    public zza() {
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
            r3 = 0
            r7 = r2
            r11 = r7
            r12 = r11
            r9 = r3
            r6 = 0
            r8 = 0
        Le:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L57
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L51
            r3 = 2
            if (r2 == r3) goto L4b
            r3 = 3
            if (r2 == r3) goto L45
            r3 = 4
            if (r2 == r3) goto L3f
            r3 = 5
            if (r2 == r3) goto L39
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L33
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r1)
            goto Le
        L33:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r6 = r1
            goto Le
        L39:
            android.os.Bundle r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r14, r1)
            r12 = r1
            goto Le
        L3f:
            byte[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r14, r1)
            r11 = r1
            goto Le
        L45:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r14, r1)
            r9 = r1
            goto Le
        L4b:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r8 = r1
            goto Le
        L51:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            r7 = r1
            goto Le
        L57:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.android.gms.auth.api.proxy.ProxyRequest r14 = new com.google.android.gms.auth.api.proxy.ProxyRequest
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r11, r12)
            return r14
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.auth.api.proxy.ProxyRequest[] r1 = new com.google.android.gms.auth.api.proxy.ProxyRequest[r1]
            return r1
    }
}
