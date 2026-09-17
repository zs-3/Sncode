package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzal implements android.os.Parcelable.Creator {
    public zzal() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        Ld:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L5e
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L59;
                case 2: goto L54;
                case 3: goto L4f;
                case 4: goto L45;
                case 5: goto L3b;
                case 6: goto L31;
                case 7: goto L27;
                case 8: goto L22;
                default: goto L1e;
            }
        L1e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto Ld
        L22:
            java.lang.String r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            goto Ld
        L27:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs> r2 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r9 = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r9 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) r9
            goto Ld
        L31:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse> r2 = com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r8 = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r8 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) r8
            goto Ld
        L3b:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse> r2 = com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r7 = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r7 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) r7
            goto Ld
        L45:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse> r2 = com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r6 = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r6 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) r6
            goto Ld
        L4f:
            byte[] r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r12, r1)
            goto Ld
        L54:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            goto Ld
        L59:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            goto Ld
        L5e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r12 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential[] r1 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential[r1]
            return r1
    }
}
