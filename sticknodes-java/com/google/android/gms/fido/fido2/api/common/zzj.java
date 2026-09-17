package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzj implements android.os.Parcelable.Creator {
    public zzj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        La:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L44
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 2
            if (r2 == r8) goto L3f
            r8 = 3
            if (r2 == r8) goto L3a
            r8 = 4
            if (r2 == r8) goto L35
            r8 = 5
            if (r2 == r8) goto L30
            r8 = 6
            if (r2 == r8) goto L2b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto La
        L2b:
            byte[] r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r10, r1)
            goto La
        L30:
            byte[] r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r10, r1)
            goto La
        L35:
            byte[] r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r10, r1)
            goto La
        L3a:
            byte[] r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r10, r1)
            goto La
        L3f:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r10, r1)
            goto La
        L44:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r10 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse[] r1 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse[r1]
            return r1
    }
}
