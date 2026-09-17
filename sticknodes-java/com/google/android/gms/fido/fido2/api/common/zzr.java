package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzr implements android.os.Parcelable.Creator {
    public zzr() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r1 = 0
            r2 = 0
            r7 = r1
            r8 = r7
            r9 = r8
            r5 = r2
        Lb:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L41
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L3b
            r3 = 2
            if (r2 == r3) goto L35
            r3 = 3
            if (r2 == r3) goto L2f
            r3 = 4
            if (r2 == r3) goto L29
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r1)
            goto Lb
        L29:
            byte[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r11, r1)
            r9 = r1
            goto Lb
        L2f:
            byte[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r11, r1)
            r8 = r1
            goto Lb
        L35:
            byte[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r11, r1)
            r7 = r1
            goto Lb
        L3b:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r1)
            r5 = r1
            goto Lb
        L41:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r0)
            com.google.android.gms.fido.fido2.api.common.zzq r11 = new com.google.android.gms.fido.fido2.api.common.zzq
            r4 = r11
            r4.<init>(r5, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.zzq[] r1 = new com.google.android.gms.fido.fido2.api.common.zzq[r1]
            return r1
    }
}
