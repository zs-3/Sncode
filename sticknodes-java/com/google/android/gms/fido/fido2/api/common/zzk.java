package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzk implements android.os.Parcelable.Creator {
    public zzk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3a
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 2
            if (r6 == r7) goto L35
            r7 = 3
            if (r6 == r7) goto L30
            r7 = 4
            if (r6 == r7) goto L2b
            r7 = 5
            if (r6 == r7) goto L26
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L8
        L26:
            java.lang.String[] r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r9, r5)
            goto L8
        L2b:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r9, r5)
            goto L8
        L30:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r9, r5)
            goto L8
        L35:
            byte[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r9, r5)
            goto L8
        L3a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r9 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse
            r9.<init>(r1, r2, r3, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse[] r1 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse[r1]
            return r1
    }
}
