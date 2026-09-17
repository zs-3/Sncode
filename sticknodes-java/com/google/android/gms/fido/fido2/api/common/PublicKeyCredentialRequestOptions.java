package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PublicKeyCredentialRequestOptionsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class PublicKeyCredentialRequestOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getChallenge", id = 2)
    private final byte[] zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTimeoutSeconds", id = 3)
    private final java.lang.Double zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRpId", id = 4)
    private final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAllowList", id = 5)
    private final java.util.List zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestId", id = 6)
    private final java.lang.Integer zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTokenBinding", id = 7)
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUserVerificationAsString", id = 8, type = "java.lang.String")
    private final com.google.android.gms.fido.fido2.api.common.zzay zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAuthenticationExtensions", id = 9)
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLongRequestId", id = 10)
    private final java.lang.Long zzi;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private byte[] zza;
        private java.lang.Double zzb;
        private java.lang.String zzc;
        private java.util.List zzd;
        private java.lang.Integer zze;
        private com.google.android.gms.fido.fido2.api.common.TokenBinding zzf;
        private com.google.android.gms.fido.fido2.api.common.zzay zzg;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzh;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public Builder(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L35
                byte[] r0 = r2.getChallenge()
                r1.zza = r0
                java.lang.Double r0 = r2.getTimeoutSeconds()
                r1.zzb = r0
                java.lang.String r0 = r2.getRpId()
                r1.zzc = r0
                java.util.List r0 = r2.getAllowList()
                r1.zzd = r0
                java.lang.Integer r0 = r2.getRequestId()
                r1.zze = r0
                com.google.android.gms.fido.fido2.api.common.TokenBinding r0 = r2.getTokenBinding()
                r1.zzf = r0
                com.google.android.gms.fido.fido2.api.common.zzay r0 = r2.zza()
                r1.zzg = r0
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r2 = r2.getAuthenticationExtensions()
                r1.zzh = r2
            L35:
                return
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions build() {
                r11 = this;
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r10 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions
                byte[] r1 = r11.zza
                java.lang.Double r2 = r11.zzb
                java.lang.String r3 = r11.zzc
                java.util.List r4 = r11.zzd
                java.lang.Integer r5 = r11.zze
                com.google.android.gms.fido.fido2.api.common.TokenBinding r6 = r11.zzf
                com.google.android.gms.fido.fido2.api.common.zzay r0 = r11.zzg
                if (r0 != 0) goto L14
                r0 = 0
                goto L18
            L14:
                java.lang.String r0 = r0.toString()
            L18:
                r7 = r0
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r8 = r11.zzh
                r9 = 0
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r10
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setAllowList(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r1) {
                r0 = this;
                r0.zzh = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setChallenge(byte[] r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                byte[] r1 = (byte[]) r1
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setRequestId(java.lang.Integer r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setRpId(java.lang.String r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                java.lang.String r1 = (java.lang.String) r1
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setTimeoutSeconds(java.lang.Double r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder setTokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding r1) {
                r0 = this;
                r0.zzf = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzao r0 = new com.google.android.gms.fido.fido2.api.common.zzao
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    PublicKeyCredentialRequestOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.Double r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.util.List r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.Integer r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.fido.fido2.api.common.TokenBinding r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) java.lang.Long r9) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            byte[] r1 = (byte[]) r1
            r0.zza = r1
            r0.zzb = r2
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzc = r1
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzi = r9
            if (r7 == 0) goto L2d
            com.google.android.gms.fido.fido2.api.common.zzay r1 = com.google.android.gms.fido.fido2.api.common.zzay.zza(r7)     // Catch: com.google.android.gms.fido.fido2.api.common.zzax -> L26
            r0.zzg = r1     // Catch: com.google.android.gms.fido.fido2.api.common.zzax -> L26
            goto L30
        L26:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L2d:
            r1 = 0
            r0.zzg = r1
        L30:
            r0.zzh = r8
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions deserializeFromBytes(byte[] r1) {
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions> r0 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r4 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) r4
            byte[] r0 = r3.zza
            byte[] r2 = r4.zza
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L78
            java.lang.Double r0 = r3.zzb
            java.lang.Double r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L78
            java.lang.String r0 = r3.zzc
            java.lang.String r2 = r4.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L78
            java.util.List r0 = r3.zzd
            if (r0 != 0) goto L2e
            java.util.List r2 = r4.zzd
            if (r2 == 0) goto L44
        L2e:
            if (r0 == 0) goto L78
            java.util.List r2 = r4.zzd
            if (r2 == 0) goto L78
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L78
            java.util.List r0 = r4.zzd
            java.util.List r2 = r3.zzd
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L78
        L44:
            java.lang.Integer r0 = r3.zze
            java.lang.Integer r2 = r4.zze
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L78
            com.google.android.gms.fido.fido2.api.common.TokenBinding r0 = r3.zzf
            com.google.android.gms.fido.fido2.api.common.TokenBinding r2 = r4.zzf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L78
            com.google.android.gms.fido.fido2.api.common.zzay r0 = r3.zzg
            com.google.android.gms.fido.fido2.api.common.zzay r2 = r4.zzg
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L78
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r0 = r3.zzh
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r2 = r4.zzh
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L78
            java.lang.Long r0 = r3.zzi
            java.lang.Long r4 = r4.zzi
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L78
            r4 = 1
            return r4
        L78:
            return r1
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> getAllowList() {
            r1 = this;
            java.util.List r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
            r1 = this;
            byte[] r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Integer getRequestId() {
            r1 = this;
            java.lang.Integer r0 = r1.zze
            return r0
    }

    public java.lang.String getRpId() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Double getTimeoutSeconds() {
            r1 = this;
            java.lang.Double r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.TokenBinding r0 = r1.zzf
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            byte[] r1 = r3.zza
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.Double r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            java.util.List r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            java.lang.Integer r1 = r3.zze
            r2 = 4
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.TokenBinding r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzay r1 = r3.zzg
            r2 = 6
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r1 = r3.zzh
            r2 = 7
            r0[r2] = r1
            java.lang.Long r1 = r3.zzi
            r2 = 8
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
            byte[] r1 = r4.getChallenge()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r5, r2, r1, r3)
            java.lang.Double r1 = r4.getTimeoutSeconds()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(r5, r2, r1, r3)
            java.lang.String r1 = r4.getRpId()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.util.List r1 = r4.getAllowList()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r2, r1, r3)
            java.lang.Integer r1 = r4.getRequestId()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(r5, r2, r1, r3)
            com.google.android.gms.fido.fido2.api.common.TokenBinding r1 = r4.getTokenBinding()
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzay r1 = r4.zzg
            if (r1 != 0) goto L3b
            r1 = 0
            goto L3f
        L3b:
            java.lang.String r1 = r1.toString()
        L3f:
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            r1 = 9
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r2 = r4.getAuthenticationExtensions()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r6 = 10
            java.lang.Long r1 = r4.zzi
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(r5, r6, r1, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.fido.fido2.api.common.zzay zza() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.zzay r0 = r1.zzg
            return r0
    }
}
