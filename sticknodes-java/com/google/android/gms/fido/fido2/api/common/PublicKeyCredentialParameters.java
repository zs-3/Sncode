package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PublicKeyCredentialParametersCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class PublicKeyCredentialParameters extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAlgorithmIdAsInteger", id = 3, type = "java.lang.Integer")
    private final com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier zzb;

    static {
            com.google.android.gms.fido.fido2.api.common.zzan r0 = new com.google.android.gms.fido.fido2.api.common.zzan
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public PublicKeyCredentialParameters(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.fromString(r1)     // Catch: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException -> L21
            r0.zza = r1     // Catch: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException -> L21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r1 = com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.fromCoseValue(r2)     // Catch: com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException -> L1a
            r0.zzb = r1     // Catch: com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException -> L1a
            return
        L1a:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L21:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters r4 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters) r4
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r0 = r3.zza
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r2 = r4.zza
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r0 = r3.zzb
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r4 = r4.zzb
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier getAlgorithm() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r0 = r1.zzb
            return r0
    }

    public int getAlgorithmIdAsInteger() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r0 = r1.zzb
            int r0 = r0.toCoseValue()
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType getType() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r0 = r1.zza
            return r0
    }

    public java.lang.String getTypeAsString() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getTypeAsString()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            int r0 = r3.getAlgorithmIdAsInteger()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
