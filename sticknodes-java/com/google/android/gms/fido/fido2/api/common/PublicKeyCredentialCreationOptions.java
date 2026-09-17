package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PublicKeyCredentialCreationOptionsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRp", id = 2)
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUser", id = 3)
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getChallenge", id = 4)
    private final byte[] zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getParameters", id = 5)
    private final java.util.List zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTimeoutSeconds", id = 6)
    private final java.lang.Double zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getExcludeList", id = 7)
    private final java.util.List zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAuthenticatorSelection", id = 8)
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestId", id = 9)
    private final java.lang.Integer zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTokenBinding", id = 10)
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAttestationConveyancePreferenceAsString", id = 11, type = "java.lang.String")
    private final com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAuthenticationExtensions", id = 12)
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzk;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity zza;
        private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity zzb;
        private byte[] zzc;
        private java.util.List zzd;
        private java.lang.Double zze;
        private java.util.List zzf;
        private com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria zzg;
        private java.lang.Integer zzh;
        private com.google.android.gms.fido.fido2.api.common.TokenBinding zzi;
        private com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference zzj;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzk;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions build() {
                r13 = this;
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r12 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r1 = r13.zza
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r2 = r13.zzb
                byte[] r3 = r13.zzc
                java.util.List r4 = r13.zzd
                java.lang.Double r5 = r13.zze
                java.util.List r6 = r13.zzf
                com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r7 = r13.zzg
                java.lang.Integer r8 = r13.zzh
                com.google.android.gms.fido.fido2.api.common.TokenBinding r9 = r13.zzi
                com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r0 = r13.zzj
                if (r0 != 0) goto L1a
                r0 = 0
                goto L1e
            L1a:
                java.lang.String r0 = r0.toString()
            L1e:
                r10 = r0
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r11 = r13.zzk
                r0 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r12
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAttestationConveyancePreference(com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r1) {
                r0 = this;
                r0.zzj = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r1) {
                r0 = this;
                r0.zzk = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setAuthenticatorSelection(com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r1) {
                r0 = this;
                r0.zzg = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setChallenge(byte[] r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                byte[] r1 = (byte[]) r1
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setExcludeList(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> r1) {
                r0 = this;
                r0.zzf = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setParameters(java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                java.util.List r1 = (java.util.List) r1
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setRequestId(java.lang.Integer r1) {
                r0 = this;
                r0.zzh = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setRp(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) r1
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setTimeoutSeconds(java.lang.Double r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setTokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding r1) {
                r0 = this;
                r0.zzi = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder setUser(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) r1
                r0.zzb = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzak r0 = new com.google.android.gms.fido.fido2.api.common.zzak
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    PublicKeyCredentialCreationOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.util.List r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.Double r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.util.List r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) java.lang.Integer r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) com.google.android.gms.fido.fido2.api.common.TokenBinding r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) java.lang.String r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r11) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) r1
            r0.zza = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) r1
            r0.zzb = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r1 = (byte[]) r1
            r0.zzc = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.util.List r1 = (java.util.List) r1
            r0.zzd = r1
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            if (r10 == 0) goto L3d
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r1 = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.fromString(r10)     // Catch: com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException -> L36
            r0.zzj = r1     // Catch: com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException -> L36
            goto L40
        L36:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L3d:
            r1 = 0
            r0.zzj = r1
        L40:
            r0.zzk = r11
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions deserializeFromBytes(byte[] r1) {
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions> r0 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r4 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) r4
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r0 = r3.zza
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L96
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r0 = r3.zzb
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L96
            byte[] r0 = r3.zzc
            byte[] r2 = r4.zzc
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L96
            java.lang.Double r0 = r3.zze
            java.lang.Double r2 = r4.zze
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L96
            java.util.List r0 = r3.zzd
            java.util.List r2 = r4.zzd
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L96
            java.util.List r0 = r4.zzd
            java.util.List r2 = r3.zzd
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L96
            java.util.List r0 = r3.zzf
            if (r0 != 0) goto L4c
            java.util.List r2 = r4.zzf
            if (r2 == 0) goto L62
        L4c:
            if (r0 == 0) goto L96
            java.util.List r2 = r4.zzf
            if (r2 == 0) goto L96
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L96
            java.util.List r0 = r4.zzf
            java.util.List r2 = r3.zzf
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L96
        L62:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r0 = r3.zzg
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r2 = r4.zzg
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L96
            java.lang.Integer r0 = r3.zzh
            java.lang.Integer r2 = r4.zzh
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L96
            com.google.android.gms.fido.fido2.api.common.TokenBinding r0 = r3.zzi
            com.google.android.gms.fido.fido2.api.common.TokenBinding r2 = r4.zzi
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L96
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r0 = r3.zzj
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r2 = r4.zzj
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L96
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r0 = r3.zzk
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r4 = r4.zzk
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L96
            r4 = 1
            return r4
        L96:
            return r1
    }

    public com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference getAttestationConveyancePreference() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r0 = r1.zzj
            return r0
    }

    public java.lang.String getAttestationConveyancePreferenceAsString() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r0 = r1.zzj
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r0 = r1.zzk
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria getAuthenticatorSelection() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
            r1 = this;
            byte[] r0 = r1.zzc
            return r0
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> getExcludeList() {
            r1 = this;
            java.util.List r0 = r1.zzf
            return r0
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters> getParameters() {
            r1 = this;
            java.util.List r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Integer getRequestId() {
            r1 = this;
            java.lang.Integer r0 = r1.zzh
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity getRp() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public java.lang.Double getTimeoutSeconds() {
            r1 = this;
            java.lang.Double r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.TokenBinding r0 = r1.zzi
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity getUser() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 11
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.zzc
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.util.List r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            java.lang.Double r1 = r3.zze
            r2 = 4
            r0[r2] = r1
            java.util.List r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r1 = r3.zzg
            r2 = 6
            r0[r2] = r1
            java.lang.Integer r1 = r3.zzh
            r2 = 7
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.TokenBinding r1 = r3.zzi
            r2 = 8
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r1 = r3.zzj
            r2 = 9
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r1 = r3.zzk
            r2 = 10
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
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r1 = r4.getRp()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r1 = r4.getUser()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            byte[] r1 = r4.getChallenge()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r5, r2, r1, r3)
            java.util.List r1 = r4.getParameters()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r2, r1, r3)
            java.lang.Double r1 = r4.getTimeoutSeconds()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(r5, r2, r1, r3)
            java.util.List r1 = r4.getExcludeList()
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r2, r1, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r1 = r4.getAuthenticatorSelection()
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.Integer r1 = r4.getRequestId()
            r2 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(r5, r2, r1, r3)
            com.google.android.gms.fido.fido2.api.common.TokenBinding r1 = r4.getTokenBinding()
            r2 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.getAttestationConveyancePreferenceAsString()
            r2 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r1 = r4.getAuthenticationExtensions()
            r2 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
