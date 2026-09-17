package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzak implements android.os.Parcelable.Creator {
    public zzak() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r15) {
            r14 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r15)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L10:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L79
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r15)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 2: goto L6f;
                case 3: goto L65;
                case 4: goto L60;
                case 5: goto L59;
                case 6: goto L54;
                case 7: goto L4d;
                case 8: goto L43;
                case 9: goto L3e;
                case 10: goto L34;
                case 11: goto L2f;
                case 12: goto L25;
                default: goto L21;
            }
        L21:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r15, r1)
            goto L10
        L25:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions> r2 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r13 = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r13 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) r13
            goto L10
        L2f:
            java.lang.String r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            goto L10
        L34:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.TokenBinding> r2 = com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r11 = r1
            com.google.android.gms.fido.fido2.api.common.TokenBinding r11 = (com.google.android.gms.fido.fido2.api.common.TokenBinding) r11
            goto L10
        L3e:
            java.lang.Integer r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(r15, r1)
            goto L10
        L43:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria> r2 = com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r9 = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r9 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) r9
            goto L10
        L4d:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> r2 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR
            java.util.ArrayList r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r15, r1, r2)
            goto L10
        L54:
            java.lang.Double r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(r15, r1)
            goto L10
        L59:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> r2 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters.CREATOR
            java.util.ArrayList r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r15, r1, r2)
            goto L10
        L60:
            byte[] r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r15, r1)
            goto L10
        L65:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity> r2 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r4 = r1
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r4 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) r4
            goto L10
        L6f:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity> r2 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            r3 = r1
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r3 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) r3
            goto L10
        L79:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r15, r0)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r15 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions[] r1 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions[r1]
            return r1
    }
}
