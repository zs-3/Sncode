package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PublicKeyCredentialCreator")
/* loaded from: classes.dex */
public class PublicKeyCredential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredential> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getId", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRawId", id = 3)
    private final byte[] zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegisterResponse", id = 4)
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSignResponse", id = 5)
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorResponse", id = 6)
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getClientExtensionResults", id = 7)
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAuthenticatorAttachment", id = 8)
    private final java.lang.String zzh;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class Builder {
        private java.lang.String zza;
        private byte[] zzb;
        private com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse zzc;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs zzd;
        private java.lang.String zze;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential build() {
                r12 = this;
                com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse r0 = r12.zzc
                boolean r1 = r0 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse
                r2 = 0
                if (r1 == 0) goto Lc
                r1 = r0
                com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r1 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) r1
                r7 = r1
                goto Ld
            Lc:
                r7 = r2
            Ld:
                boolean r1 = r0 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse
                if (r1 == 0) goto L16
                r1 = r0
                com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r1 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) r1
                r8 = r1
                goto L17
            L16:
                r8 = r2
            L17:
                boolean r1 = r0 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse
                if (r1 == 0) goto L1e
                r2 = r0
                com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r2 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) r2
            L1e:
                r9 = r2
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r0 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential
                java.lang.String r4 = r12.zza
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.PUBLIC_KEY
                java.lang.String r5 = r1.toString()
                byte[] r6 = r12.zzb
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r10 = r12.zzd
                java.lang.String r11 = r12.zze
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setAuthenticationExtensionsClientOutputs(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setAuthenticatorAttachment(java.lang.String r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setId(java.lang.String r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setRawId(byte[] r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.Builder setResponse(com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzal r0 = new com.google.android.gms.fido.fido2.api.common.zzal
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    PublicKeyCredential(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) byte[] r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r10) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lb
            if (r7 != 0) goto Lb
            if (r8 == 0) goto L19
        Lb:
            if (r6 != 0) goto L11
            if (r7 == 0) goto L11
            if (r8 == 0) goto L19
        L11:
            if (r6 != 0) goto L18
            if (r7 != 0) goto L18
            if (r8 == 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            r2.zzf = r8
            r2.zzg = r9
            r2.zzh = r10
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredential deserializeFromBytes(byte[] r1) {
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredential> r0 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredential
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r4 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) r4
            java.lang.String r0 = r3.zza
            java.lang.String r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r3.zzb
            java.lang.String r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L5a
            byte[] r0 = r3.zzc
            byte[] r2 = r4.zzc
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L5a
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r0 = r3.zzd
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r2 = r4.zzd
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L5a
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r0 = r3.zze
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r2 = r4.zze
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L5a
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r0 = r3.zzf
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r2 = r4.zzf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L5a
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r0 = r3.zzg
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r2 = r4.zzg
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r3.zzh
            java.lang.String r4 = r4.zzh
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L5a
            r4 = 1
            return r4
        L5a:
            return r1
    }

    public java.lang.String getAuthenticatorAttachment() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs getClientExtensionResults() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r0 = r1.zzg
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public byte[] getRawId() {
            r1 = this;
            byte[] r0 = r1.zzc
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse getResponse() {
            r2 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r0 = r2.zzd
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r0 = r2.zze
            if (r0 == 0) goto La
            return r0
        La:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r0 = r2.zzf
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No response set."
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r1 = r3.zze
            r2 = 3
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r1 = r3.zzd
            r2 = 4
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r1 = r3.zzg
            r2 = 6
            r0[r2] = r1
            java.lang.String r1 = r3.zzh
            r2 = 7
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public byte[] serializeToBytes() {
            r1 = this;
            byte[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.getId()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getType()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            byte[] r1 = r4.getRawId()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r5, r2, r1, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r1 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r1 = r4.zze
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r1 = r4.zzf
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r1 = r4.getClientExtensionResults()
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.getAuthenticatorAttachment()
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
