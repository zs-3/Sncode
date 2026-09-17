package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "BrowserPublicKeyCredentialRequestOptionsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class BrowserPublicKeyCredentialRequestOptions extends com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPublicKeyCredentialRequestOptions", id = 2)
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOrigin", id = 3)
    private final android.net.Uri zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getClientDataHash", id = 4)
    private final byte[] zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions zza;
        private android.net.Uri zzb;
        private byte[] zzc;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions build() {
                r4 = this;
                com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions r0 = new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1 = r4.zza
                android.net.Uri r2 = r4.zzb
                byte[] r3 = r4.zzc
                r0.<init>(r1, r2, r3)
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setClientDataHash(byte[] r1) {
                r0 = this;
                com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(r1)
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setOrigin(android.net.Uri r1) {
                r0 = this;
                com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(r1)
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setPublicKeyCredentialRequestOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) r1
                r0.zza = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzo r0 = new com.google.android.gms.fido.fido2.api.common.zzo
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    BrowserPublicKeyCredentialRequestOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.net.Uri r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) r1
            r0.zza = r1
            zzc(r2)
            r0.zzb = r2
            zzd(r3)
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions deserializeFromBytes(byte[] r1) {
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions> r0 = com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions r1 = (com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions) r1
            return r1
    }

    static /* bridge */ /* synthetic */ android.net.Uri zza(android.net.Uri r0) {
            zzc(r0)
            return r0
    }

    static /* bridge */ /* synthetic */ byte[] zzb(byte[] r0) {
            zzd(r0)
            return r0
    }

    private static android.net.Uri zzc(android.net.Uri r4) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r0 = r4.getScheme()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r3 = "origin scheme must be non-empty"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
            java.lang.String r0 = r4.getAuthority()
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            java.lang.String r0 = "origin authority must be non-empty"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            return r4
    }

    private static byte[] zzd(byte[] r3) {
            r0 = 1
            if (r3 == 0) goto La
            int r1 = r3.length
            r2 = 32
            if (r1 != r2) goto L9
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "clientDataHash must be 32 bytes long"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            return r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions r4 = (com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions) r4
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r0 = r3.zza
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L1e
            android.net.Uri r0 = r3.zzb
            android.net.Uri r4 = r4.zzb
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r0 = r1.zza
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r0 = r0.getAuthenticationExtensions()
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r0 = r1.zza
            byte[] r0 = r0.getChallenge()
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public byte[] getClientDataHash() {
            r1 = this;
            byte[] r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public android.net.Uri getOrigin() {
            r1 = this;
            android.net.Uri r0 = r1.zzb
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions getPublicKeyCredentialRequestOptions() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Integer getRequestId() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r0 = r1.zza
            java.lang.Integer r0 = r0.getRequestId()
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Double getTimeoutSeconds() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r0 = r1.zza
            java.lang.Double r0 = r0.getTimeoutSeconds()
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r0 = r1.zza
            com.google.android.gms.fido.fido2.api.common.TokenBinding r0 = r0.getTokenBinding()
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            android.net.Uri r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
            r1 = this;
            byte[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1 = r4.getPublicKeyCredentialRequestOptions()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            android.net.Uri r1 = r4.getOrigin()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            byte[] r6 = r4.getClientDataHash()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
