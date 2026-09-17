package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthenticatorAttestationResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final byte[] zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getClientDataJSON", id = 3)
    private final byte[] zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAttestationObject", id = 4)
    private final byte[] zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTransports", id = 5)
    private final java.lang.String[] zzd;

    static {
            com.google.android.gms.fido.fido2.api.common.zzk r0 = new com.google.android.gms.fido.fido2.api.common.zzk
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AuthenticatorAttestationResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) byte[] r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            byte[] r1 = (byte[]) r1
            r0.zza = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            byte[] r1 = (byte[]) r1
            r0.zzb = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r1 = (byte[]) r1
            r0.zzc = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.zzd = r1
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse deserializeFromBytes(byte[] r1) {
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse> r0 = com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r1 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r4 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) r4
            byte[] r0 = r3.zza
            byte[] r2 = r4.zza
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L28
            byte[] r0 = r3.zzb
            byte[] r2 = r4.zzb
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L28
            byte[] r0 = r3.zzc
            byte[] r4 = r4.zzc
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L28
            r4 = 1
            return r4
        L28:
            return r1
    }

    public byte[] getAttestationObject() {
            r1 = this;
            byte[] r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
            r1 = this;
            byte[] r0 = r1.zzb
            return r0
    }

    @java.lang.Deprecated
    public byte[] getKeyHandle() {
            r1 = this;
            byte[] r0 = r1.zza
            return r0
    }

    public java.lang.String[] getTransports() {
            r1 = this;
            java.lang.String[] r0 = r1.zzd
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            byte[] r1 = r3.zza
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            byte[] r1 = r3.zzb
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.zzc
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
            r1 = this;
            byte[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(r1)
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            com.google.android.gms.internal.fido.zzaj r0 = com.google.android.gms.internal.fido.zzak.zza(r5)
            com.google.android.gms.internal.fido.zzbf r1 = com.google.android.gms.internal.fido.zzbf.zzd()
            byte[] r2 = r5.zza
            int r3 = r2.length
            r4 = 0
            java.lang.String r1 = r1.zze(r2, r4, r3)
            java.lang.String r2 = "keyHandle"
            r0.zzb(r2, r1)
            com.google.android.gms.internal.fido.zzbf r1 = com.google.android.gms.internal.fido.zzbf.zzd()
            byte[] r2 = r5.zzb
            int r3 = r2.length
            java.lang.String r1 = r1.zze(r2, r4, r3)
            java.lang.String r2 = "clientDataJSON"
            r0.zzb(r2, r1)
            com.google.android.gms.internal.fido.zzbf r1 = com.google.android.gms.internal.fido.zzbf.zzd()
            byte[] r2 = r5.zzc
            int r3 = r2.length
            java.lang.String r1 = r1.zze(r2, r4, r3)
            java.lang.String r2 = "attestationObject"
            r0.zzb(r2, r1)
            java.lang.String[] r1 = r5.zzd
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r2 = "transports"
            r0.zzb(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            byte[] r0 = r3.getKeyHandle()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            byte[] r0 = r3.getClientDataJSON()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            byte[] r0 = r3.getAttestationObject()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            java.lang.String[] r0 = r3.getTransports()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
