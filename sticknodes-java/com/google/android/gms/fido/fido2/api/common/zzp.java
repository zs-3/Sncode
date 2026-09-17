package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzp implements android.os.Parcelable.Creator {
    zzp() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            int r2 = r2.readInt()
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r2 = com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.fromCoseValue(r2)     // Catch: com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException -> L9
            return r2
        L9:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier[] r1 = new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier[r1]
            return r1
    }
}
