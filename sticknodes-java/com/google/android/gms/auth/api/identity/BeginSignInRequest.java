package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "BeginSignInRequestCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class BeginSignInRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPasswordRequestOptions", id = 1)
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions zbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final java.lang.String zbc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isAutoSelectEnabled", id = 4)
    private final boolean zbd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTheme", id = 5)
    private final int zbe;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPasskeysRequestOptions", id = 6)
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions zbf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPasskeyJsonRequestOptions", id = 7)
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions zbg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "false", getter = "getPreferImmediatelyAvailableCredentials", id = 8)
    private final boolean zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    @java.lang.Deprecated
    public static final class Builder {
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions zba;
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions zbb;
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions zbc;
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions zbd;
        private java.lang.String zbe;
        private boolean zbf;
        private int zbg;
        private boolean zbh;

        public Builder() {
                r2 = this;
                r2.<init>()
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$Builder r0 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.builder()
                r1 = 0
                r0.setSupported(r1)
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r0 = r0.build()
                r2.zba = r0
                com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder r0 = com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                r0.setSupported(r1)
                com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r0 = r0.build()
                r2.zbb = r0
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder r0 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.builder()
                r0.setSupported(r1)
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r0 = r0.build()
                r2.zbc = r0
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder r0 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.builder()
                r0.setSupported(r1)
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r0 = r0.build()
                r2.zbd = r0
                return
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest build() {
                r10 = this;
                com.google.android.gms.auth.api.identity.BeginSignInRequest r9 = new com.google.android.gms.auth.api.identity.BeginSignInRequest
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r1 = r10.zba
                com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r2 = r10.zbb
                java.lang.String r3 = r10.zbe
                boolean r4 = r10.zbf
                int r5 = r10.zbg
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r6 = r10.zbc
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r7 = r10.zbd
                boolean r8 = r10.zbh
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setAutoSelectEnabled(boolean r1) {
                r0 = this;
                r0.zbf = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setGoogleIdTokenRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r1 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) r1
                r0.zbb = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setPasskeyJsonSignInRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r1 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions) r1
                r0.zbd = r1
                return r0
        }

        @java.lang.Deprecated
        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setPasskeysSignInRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r1 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) r1
                r0.zbc = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setPasswordRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r1 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) r1
                r0.zba = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setPreferImmediatelyAvailableCredentials(boolean r1) {
                r0 = this;
                r0.zbh = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba(java.lang.String r1) {
                r0 = this;
                r0.zbe = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zbb(int r1) {
                r0 = this;
                r0.zbg = r1
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    @java.lang.Deprecated
    public static final class GoogleIdTokenRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions> CREATOR = null;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getServerClientId", id = 2)
        private final java.lang.String zbb;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getNonce", id = 3)
        private final java.lang.String zbc;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean zbd;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLinkedServiceId", id = 5)
        private final java.lang.String zbe;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIdTokenDepositionScopes", id = 6)
        private final java.util.List zbf;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", id = 7)
        private final boolean zbg;

        /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
        public static final class Builder {
            private boolean zba;
            private java.lang.String zbb;
            private java.lang.String zbc;
            private boolean zbd;
            private java.lang.String zbe;
            private java.util.List zbf;
            private boolean zbg;

            public Builder() {
                    r3 = this;
                    r3.<init>()
                    r0 = 0
                    r3.zba = r0
                    r1 = 0
                    r3.zbb = r1
                    r3.zbc = r1
                    r2 = 1
                    r3.zbd = r2
                    r3.zbe = r1
                    r3.zbf = r1
                    r3.zbg = r0
                    return
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder associateLinkedAccounts(java.lang.String r2, java.util.List<java.lang.String> r3) {
                    r1 = this;
                    java.lang.String r0 = "linkedServiceId must be provided if you want to associate linked accounts."
                    java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                    java.lang.String r2 = (java.lang.String) r2
                    r1.zbe = r2
                    r1.zbf = r3
                    return r1
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions build() {
                    r9 = this;
                    com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r8 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions
                    boolean r1 = r9.zba
                    java.lang.String r2 = r9.zbb
                    java.lang.String r3 = r9.zbc
                    boolean r4 = r9.zbd
                    java.lang.String r5 = r9.zbe
                    java.util.List r6 = r9.zbf
                    boolean r7 = r9.zbg
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                    return r8
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setFilterByAuthorizedAccounts(boolean r1) {
                    r0 = this;
                    r0.zbd = r1
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setNonce(java.lang.String r1) {
                    r0 = this;
                    r0.zbc = r1
                    return r0
            }

            @java.lang.Deprecated
            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setRequestVerifiedPhoneNumber(boolean r1) {
                    r0 = this;
                    r0.zbg = r1
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setServerClientId(java.lang.String r1) {
                    r0 = this;
                    java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
                    r0.zbb = r1
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setSupported(boolean r1) {
                    r0 = this;
                    r0.zba = r1
                    return r0
            }
        }

        static {
                com.google.android.gms.auth.api.identity.zbl r0 = new com.google.android.gms.auth.api.identity.zbl
                r0.<init>()
                com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR = r0
                return
        }

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
        GoogleIdTokenRequestOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.util.List r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) boolean r9) {
                r2 = this;
                r2.<init>()
                r0 = 1
                if (r6 == 0) goto La
                if (r9 != 0) goto L9
                goto La
            L9:
                r0 = 0
            La:
                java.lang.String r1 = "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                r2.zba = r3
                if (r3 == 0) goto L18
                java.lang.String r3 = "serverClientId must be provided if Google ID tokens are requested"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r3)
            L18:
                r2.zbb = r4
                r2.zbc = r5
                r2.zbd = r6
                android.os.Parcelable$Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest> r3 = com.google.android.gms.auth.api.identity.BeginSignInRequest.CREATOR
                r3 = 0
                if (r8 == 0) goto L32
                boolean r4 = r8.isEmpty()
                if (r4 == 0) goto L2a
                goto L32
            L2a:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r8)
                java.util.Collections.sort(r3)
            L32:
                r2.zbf = r3
                r2.zbe = r7
                r2.zbg = r9
                return
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder() {
                com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder r0 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder
                r0.<init>()
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r4 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) r4
                boolean r0 = r3.zba
                boolean r2 = r4.zba
                if (r0 != r2) goto L44
                java.lang.String r0 = r3.zbb
                java.lang.String r2 = r4.zbb
                boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
                if (r0 == 0) goto L44
                java.lang.String r0 = r3.zbc
                java.lang.String r2 = r4.zbc
                boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
                if (r0 == 0) goto L44
                boolean r0 = r3.zbd
                boolean r2 = r4.zbd
                if (r0 != r2) goto L44
                java.lang.String r0 = r3.zbe
                java.lang.String r2 = r4.zbe
                boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
                if (r0 == 0) goto L44
                java.util.List r0 = r3.zbf
                java.util.List r2 = r4.zbf
                boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
                if (r0 == 0) goto L44
                boolean r0 = r3.zbg
                boolean r4 = r4.zbg
                if (r0 != r4) goto L44
                r4 = 1
                return r4
            L44:
                return r1
        }

        public boolean filterByAuthorizedAccounts() {
                r1 = this;
                boolean r0 = r1.zbd
                return r0
        }

        public java.util.List<java.lang.String> getIdTokenDepositionScopes() {
                r1 = this;
                java.util.List r0 = r1.zbf
                return r0
        }

        public java.lang.String getLinkedServiceId() {
                r1 = this;
                java.lang.String r0 = r1.zbe
                return r0
        }

        public java.lang.String getNonce() {
                r1 = this;
                java.lang.String r0 = r1.zbc
                return r0
        }

        public java.lang.String getServerClientId() {
                r1 = this;
                java.lang.String r0 = r1.zbb
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 7
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r1 = r3.zba
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = r3.zbb
                r2 = 1
                r0[r2] = r1
                java.lang.String r1 = r3.zbc
                r2 = 2
                r0[r2] = r1
                boolean r1 = r3.zbd
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 3
                r0[r2] = r1
                java.lang.String r1 = r3.zbe
                r2 = 4
                r0[r2] = r1
                java.util.List r1 = r3.zbf
                r2 = 5
                r0[r2] = r1
                boolean r1 = r3.zbg
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 6
                r0[r2] = r1
                int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
                return r0
        }

        public boolean isSupported() {
                r1 = this;
                boolean r0 = r1.zba
                return r0
        }

        @java.lang.Deprecated
        public boolean requestVerifiedPhoneNumber() {
                r1 = this;
                boolean r0 = r1.zbg
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r4, int r5) {
                r3 = this;
                int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
                boolean r0 = r3.isSupported()
                r1 = 1
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
                java.lang.String r0 = r3.getServerClientId()
                r1 = 2
                r2 = 0
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
                java.lang.String r0 = r3.getNonce()
                r1 = 3
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
                boolean r0 = r3.filterByAuthorizedAccounts()
                r1 = 4
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
                java.lang.String r0 = r3.getLinkedServiceId()
                r1 = 5
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
                java.util.List r0 = r3.getIdTokenDepositionScopes()
                r1 = 6
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
                boolean r0 = r3.requestVerifiedPhoneNumber()
                r1 = 7
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PasskeyJsonRequestOptionsCreator")
    @java.lang.Deprecated
    public static final class PasskeyJsonRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions> CREATOR = null;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestJson", id = 2)
        private final java.lang.String zbb;

        /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
        public static final class Builder {
            private boolean zba;
            private java.lang.String zbb;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.zba = r0
                    return
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions build() {
                    r3 = this;
                    com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r0 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions
                    boolean r1 = r3.zba
                    java.lang.String r2 = r3.zbb
                    r0.<init>(r1, r2)
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder setRequestJson(java.lang.String r1) {
                    r0 = this;
                    r0.zbb = r1
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder setSupported(boolean r1) {
                    r0 = this;
                    r0.zba = r1
                    return r0
            }
        }

        static {
                com.google.android.gms.auth.api.identity.zbm r0 = new com.google.android.gms.auth.api.identity.zbm
                r0.<init>()
                com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR = r0
                return
        }

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
        PasskeyJsonRequestOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto L8
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            L8:
                r0.zba = r1
                r0.zbb = r2
                return
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder builder() {
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder r0 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder
                r0.<init>()
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r5 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions) r5
                boolean r1 = r4.zba
                boolean r3 = r5.zba
                if (r1 != r3) goto L1d
                java.lang.String r1 = r4.zbb
                java.lang.String r5 = r5.zbb
                boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
                if (r5 == 0) goto L1d
                return r0
            L1d:
                return r2
        }

        public java.lang.String getRequestJson() {
                r1 = this;
                java.lang.String r0 = r1.zbb
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r1 = r3.zba
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = r3.zbb
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
                return r0
        }

        public boolean isSupported() {
                r1 = this;
                boolean r0 = r1.zba
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r4, int r5) {
                r3 = this;
                int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
                boolean r0 = r3.isSupported()
                r1 = 1
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
                java.lang.String r0 = r3.getRequestJson()
                r1 = 2
                r2 = 0
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PasskeysRequestOptionsCreator")
    @java.lang.Deprecated
    public static final class PasskeysRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions> CREATOR = null;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getChallenge", id = 2)
        private final byte[] zbb;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRpId", id = 3)
        private final java.lang.String zbc;

        /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
        public static final class Builder {
            private boolean zba;
            private byte[] zbb;
            private java.lang.String zbc;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.zba = r0
                    return
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions build() {
                    r4 = this;
                    com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r0 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions
                    boolean r1 = r4.zba
                    byte[] r2 = r4.zbb
                    java.lang.String r3 = r4.zbc
                    r0.<init>(r1, r2, r3)
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder setChallenge(byte[] r1) {
                    r0 = this;
                    r0.zbb = r1
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder setRpId(java.lang.String r1) {
                    r0 = this;
                    r0.zbc = r1
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder setSupported(boolean r1) {
                    r0 = this;
                    r0.zba = r1
                    return r0
            }
        }

        static {
                com.google.android.gms.auth.api.identity.zbn r0 = new com.google.android.gms.auth.api.identity.zbn
                r0.<init>()
                com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.CREATOR = r0
                return
        }

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
        PasskeysRequestOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto Lb
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            Lb:
                r0.zba = r1
                r0.zbb = r2
                r0.zbc = r3
                return
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder builder() {
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder r0 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder
                r0.<init>()
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r5 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) r5
                boolean r1 = r4.zba
                boolean r3 = r5.zba
                if (r1 != r3) goto L27
                byte[] r1 = r4.zbb
                byte[] r3 = r5.zbb
                boolean r1 = java.util.Arrays.equals(r1, r3)
                if (r1 == 0) goto L27
                java.lang.String r1 = r4.zbc
                java.lang.String r5 = r5.zbc
                boolean r5 = java.util.Objects.equals(r1, r5)
                if (r5 == 0) goto L27
                return r0
            L27:
                return r2
        }

        public byte[] getChallenge() {
                r1 = this;
                byte[] r0 = r1.zbb
                return r0
        }

        public java.lang.String getRpId() {
                r1 = this;
                java.lang.String r0 = r1.zbc
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r1 = r3.zba
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = r3.zbc
                r2 = 1
                r0[r2] = r1
                int r0 = java.util.Objects.hash(r0)
                int r0 = r0 * 31
                byte[] r1 = r3.zbb
                int r1 = java.util.Arrays.hashCode(r1)
                int r0 = r0 + r1
                return r0
        }

        public boolean isSupported() {
                r1 = this;
                boolean r0 = r1.zba
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r4, int r5) {
                r3 = this;
                int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
                boolean r0 = r3.isSupported()
                r1 = 1
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
                byte[] r0 = r3.getChallenge()
                r1 = 2
                r2 = 0
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
                java.lang.String r0 = r3.getRpId()
                r1 = 3
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    @java.lang.Deprecated
    public static final class PasswordRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions> CREATOR = null;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
        public static final class Builder {
            private boolean zba;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.zba = r0
                    return
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions build() {
                    r2 = this;
                    com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r0 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions
                    boolean r1 = r2.zba
                    r0.<init>(r1)
                    return r0
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder setSupported(boolean r1) {
                    r0 = this;
                    r0.zba = r1
                    return r0
            }
        }

        static {
                com.google.android.gms.auth.api.identity.zbo r0 = new com.google.android.gms.auth.api.identity.zbo
                r0.<init>()
                com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.CREATOR = r0
                return
        }

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
        PasswordRequestOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1) {
                r0 = this;
                r0.<init>()
                r0.zba = r1
                return
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder builder() {
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$Builder r0 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$Builder
                r0.<init>()
                return r0
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r3 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) r3
                boolean r0 = r2.zba
                boolean r3 = r3.zba
                if (r0 != r3) goto L10
                r3 = 1
                return r3
            L10:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r1 = r3.zba
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
                return r0
        }

        public boolean isSupported() {
                r1 = this;
                boolean r0 = r1.zba
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
                boolean r0 = r2.isSupported()
                r1 = 1
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
                return
        }
    }

    static {
            com.google.android.gms.auth.api.identity.zbf r0 = new com.google.android.gms.auth.api.identity.zbf
            r0.<init>()
            com.google.android.gms.auth.api.identity.BeginSignInRequest.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    BeginSignInRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r8) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r1 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) r1
            r0.zba = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r1 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) r1
            r0.zbb = r1
            r0.zbc = r3
            r0.zbd = r4
            r0.zbe = r5
            r1 = 0
            if (r6 != 0) goto L27
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder r2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.builder()
            r2.setSupported(r1)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r6 = r2.build()
        L27:
            r0.zbf = r6
            if (r7 != 0) goto L36
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder r2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.builder()
            r2.setSupported(r1)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r7 = r2.build()
        L36:
            r0.zbg = r7
            r0.zbh = r8
            return
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder builder() {
            com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder r0 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder
            r0.<init>()
            return r0
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba(com.google.android.gms.auth.api.identity.BeginSignInRequest r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder r0 = builder()
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r1 = r2.getGoogleIdTokenRequestOptions()
            r0.setGoogleIdTokenRequestOptions(r1)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r1 = r2.getPasswordRequestOptions()
            r0.setPasswordRequestOptions(r1)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r1 = r2.getPasskeysRequestOptions()
            r0.setPasskeysSignInRequestOptions(r1)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r1 = r2.getPasskeyJsonRequestOptions()
            r0.setPasskeyJsonSignInRequestOptions(r1)
            boolean r1 = r2.zbd
            r0.setAutoSelectEnabled(r1)
            int r1 = r2.zbe
            r0.zbb(r1)
            boolean r1 = r2.zbh
            r0.setPreferImmediatelyAvailableCredentials(r1)
            java.lang.String r2 = r2.zbc
            if (r2 == 0) goto L39
            r0.zba(r2)
        L39:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.identity.BeginSignInRequest r4 = (com.google.android.gms.auth.api.identity.BeginSignInRequest) r4
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r0 = r3.zba
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r2 = r4.zba
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4e
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r0 = r3.zbb
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r2 = r4.zbb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4e
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r0 = r3.zbf
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r2 = r4.zbf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4e
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r0 = r3.zbg
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r2 = r4.zbg
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4e
            java.lang.String r0 = r3.zbc
            java.lang.String r2 = r4.zbc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L4e
            boolean r0 = r3.zbd
            boolean r2 = r4.zbd
            if (r0 != r2) goto L4e
            int r0 = r3.zbe
            int r2 = r4.zbe
            if (r0 != r2) goto L4e
            boolean r0 = r3.zbh
            boolean r4 = r4.zbh
            if (r0 != r4) goto L4e
            r4 = 1
            return r4
        L4e:
            return r1
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
            r1 = this;
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r0 = r1.zbb
            return r0
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions getPasskeyJsonRequestOptions() {
            r1 = this;
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r0 = r1.zbg
            return r0
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions getPasskeysRequestOptions() {
            r1 = this;
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r0 = r1.zbf
            return r0
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions getPasswordRequestOptions() {
            r1 = this;
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r0 = r1.zba
            return r0
    }

    public boolean getPreferImmediatelyAvailableCredentials() {
            r1 = this;
            boolean r0 = r1.zbh
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r0 = r3.zba
            r1 = 8
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r0 = r3.zbb
            r2 = 1
            r1[r2] = r0
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r0 = r3.zbf
            r2 = 2
            r1[r2] = r0
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r0 = r3.zbg
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = r3.zbc
            r2 = 4
            r1[r2] = r0
            boolean r0 = r3.zbd
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 5
            r1[r2] = r0
            int r0 = r3.zbe
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 6
            r1[r2] = r0
            boolean r0 = r3.zbh
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 7
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    public boolean isAutoSelectEnabled() {
            r1 = this;
            boolean r0 = r1.zbd
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r1 = r4.getPasswordRequestOptions()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r1 = r4.getGoogleIdTokenRequestOptions()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.zbc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            boolean r1 = r4.isAutoSelectEnabled()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r1)
            int r1 = r4.zbe
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r1 = r4.getPasskeysRequestOptions()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions r1 = r4.getPasskeyJsonRequestOptions()
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.getPreferImmediatelyAvailableCredentials()
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
