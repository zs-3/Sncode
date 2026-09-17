package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzao implements android.os.Parcelable.Creator {
    public zzao() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
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
        Le:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L5c
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 2: goto L57;
                case 3: goto L52;
                case 4: goto L4d;
                case 5: goto L46;
                case 6: goto L41;
                case 7: goto L37;
                case 8: goto L32;
                case 9: goto L28;
                case 10: goto L23;
                default: goto L1f;
            }
        L1f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Le
        L23:
            java.lang.Long r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(r13, r1)
            goto Le
        L28:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions> r2 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r10 = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r10 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) r10
            goto Le
        L32:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto Le
        L37:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.TokenBinding> r2 = com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r8 = r1
            com.google.android.gms.fido.fido2.api.common.TokenBinding r8 = (com.google.android.gms.fido.fido2.api.common.TokenBinding) r8
            goto Le
        L41:
            java.lang.Integer r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(r13, r1)
            goto Le
        L46:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> r2 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR
            java.util.ArrayList r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r13, r1, r2)
            goto Le
        L4d:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto Le
        L52:
            java.lang.Double r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(r13, r1)
            goto Le
        L57:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r1)
            goto Le
        L5c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r13 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions[] r1 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions[r1]
            return r1
    }
}
