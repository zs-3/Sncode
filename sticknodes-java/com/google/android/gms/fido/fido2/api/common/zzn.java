package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzn implements android.os.Parcelable.Creator {
    public zzn() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r8)
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L39
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 2
            if (r5 == r6) goto L30
            r6 = 3
            if (r5 == r6) goto L27
            r6 = 4
            if (r5 == r6) goto L22
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L7
        L22:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r8, r4)
            goto L7
        L27:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r8, r4, r2)
            android.net.Uri r2 = (android.net.Uri) r2
            goto L7
        L30:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions> r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r8, r4, r1)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) r1
            goto L7
        L39:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r0)
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions r8 = new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions[] r1 = new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions[r1]
            return r1
    }
}
