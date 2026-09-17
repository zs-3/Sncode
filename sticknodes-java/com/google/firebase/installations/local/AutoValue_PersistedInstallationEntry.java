package com.google.firebase.installations.local;

/* loaded from: classes2.dex */
final class AutoValue_PersistedInstallationEntry extends com.google.firebase.installations.local.PersistedInstallationEntry {
    private final java.lang.String authToken;
    private final long expiresInSecs;
    private final java.lang.String firebaseInstallationId;
    private final java.lang.String fisError;
    private final java.lang.String refreshToken;
    private final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    /* renamed from: com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.installations.local.PersistedInstallationEntry.Builder {
        private java.lang.String authToken;
        private java.lang.Long expiresInSecs;
        private java.lang.String firebaseInstallationId;
        private java.lang.String fisError;
        private java.lang.String refreshToken;
        private com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus;
        private java.lang.Long tokenCreationEpochInSecs;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(com.google.firebase.installations.local.PersistedInstallationEntry r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.getFirebaseInstallationId()
                r2.firebaseInstallationId = r0
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r3.getRegistrationStatus()
                r2.registrationStatus = r0
                java.lang.String r0 = r3.getAuthToken()
                r2.authToken = r0
                java.lang.String r0 = r3.getRefreshToken()
                r2.refreshToken = r0
                long r0 = r3.getExpiresInSecs()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.expiresInSecs = r0
                long r0 = r3.getTokenCreationEpochInSecs()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.tokenCreationEpochInSecs = r0
                java.lang.String r3 = r3.getFisError()
                r2.fisError = r3
                return
        }

        /* synthetic */ Builder(com.google.firebase.installations.local.PersistedInstallationEntry r1, com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry build() {
                r13 = this;
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r13.registrationStatus
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " registrationStatus"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Long r0 = r13.expiresInSecs
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " expiresInSecs"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Long r0 = r13.tokenCreationEpochInSecs
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " tokenCreationEpochInSecs"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L65
                com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry r0 = new com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry
                java.lang.String r3 = r13.firebaseInstallationId
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = r13.registrationStatus
                java.lang.String r5 = r13.authToken
                java.lang.String r6 = r13.refreshToken
                java.lang.Long r1 = r13.expiresInSecs
                long r7 = r1.longValue()
                java.lang.Long r1 = r13.tokenCreationEpochInSecs
                long r9 = r1.longValue()
                java.lang.String r11 = r13.fisError
                r12 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12)
                return r0
            L65:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setAuthToken(java.lang.String r1) {
                r0 = this;
                r0.authToken = r1
                return r0
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setExpiresInSecs(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.expiresInSecs = r1
                return r0
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFirebaseInstallationId(java.lang.String r1) {
                r0 = this;
                r0.firebaseInstallationId = r1
                return r0
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFisError(java.lang.String r1) {
                r0 = this;
                r0.fisError = r1
                return r0
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRefreshToken(java.lang.String r1) {
                r0 = this;
                r0.refreshToken = r1
                return r0
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus r2) {
                r1 = this;
                java.lang.String r0 = "Null registrationStatus"
                java.util.Objects.requireNonNull(r2, r0)
                r1.registrationStatus = r2
                return r1
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.tokenCreationEpochInSecs = r1
                return r0
        }
    }

    private AutoValue_PersistedInstallationEntry(java.lang.String r1, com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus r2, java.lang.String r3, java.lang.String r4, long r5, long r7, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.firebaseInstallationId = r1
            r0.registrationStatus = r2
            r0.authToken = r3
            r0.refreshToken = r4
            r0.expiresInSecs = r5
            r0.tokenCreationEpochInSecs = r7
            r0.fisError = r9
            return
    }

    /* synthetic */ AutoValue_PersistedInstallationEntry(java.lang.String r1, com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus r2, java.lang.String r3, java.lang.String r4, long r5, long r7, java.lang.String r9, com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r9)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.installations.local.PersistedInstallationEntry
            r2 = 0
            if (r1 == 0) goto L82
            com.google.firebase.installations.local.PersistedInstallationEntry r8 = (com.google.firebase.installations.local.PersistedInstallationEntry) r8
            java.lang.String r1 = r7.firebaseInstallationId
            if (r1 != 0) goto L16
            java.lang.String r1 = r8.getFirebaseInstallationId()
            if (r1 != 0) goto L80
            goto L20
        L16:
            java.lang.String r3 = r8.getFirebaseInstallationId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L80
        L20:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = r7.registrationStatus
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r8.getRegistrationStatus()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L80
            java.lang.String r1 = r7.authToken
            if (r1 != 0) goto L37
            java.lang.String r1 = r8.getAuthToken()
            if (r1 != 0) goto L80
            goto L41
        L37:
            java.lang.String r3 = r8.getAuthToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L80
        L41:
            java.lang.String r1 = r7.refreshToken
            if (r1 != 0) goto L4c
            java.lang.String r1 = r8.getRefreshToken()
            if (r1 != 0) goto L80
            goto L56
        L4c:
            java.lang.String r3 = r8.getRefreshToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L80
        L56:
            long r3 = r7.expiresInSecs
            long r5 = r8.getExpiresInSecs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L80
            long r3 = r7.tokenCreationEpochInSecs
            long r5 = r8.getTokenCreationEpochInSecs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L80
            java.lang.String r1 = r7.fisError
            if (r1 != 0) goto L75
            java.lang.String r8 = r8.getFisError()
            if (r8 != 0) goto L80
            goto L81
        L75:
            java.lang.String r8 = r8.getFisError()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L80
            goto L81
        L80:
            r0 = 0
        L81:
            return r0
        L82:
            return r2
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public java.lang.String getAuthToken() {
            r1 = this;
            java.lang.String r0 = r1.authToken
            return r0
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getExpiresInSecs() {
            r2 = this;
            long r0 = r2.expiresInSecs
            return r0
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public java.lang.String getFirebaseInstallationId() {
            r1 = this;
            java.lang.String r0 = r1.firebaseInstallationId
            return r0
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public java.lang.String getFisError() {
            r1 = this;
            java.lang.String r0 = r1.fisError
            return r0
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public java.lang.String getRefreshToken() {
            r1 = this;
            java.lang.String r0 = r1.refreshToken
            return r0
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus getRegistrationStatus() {
            r1 = this;
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r1.registrationStatus
            return r0
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getTokenCreationEpochInSecs() {
            r2 = this;
            long r0 = r2.tokenCreationEpochInSecs
            return r0
    }

    public int hashCode() {
            r8 = this;
            java.lang.String r0 = r8.firebaseInstallationId
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r8.registrationStatus
            int r3 = r3.hashCode()
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r8.authToken
            if (r3 != 0) goto L20
            r3 = 0
            goto L24
        L20:
            int r3 = r3.hashCode()
        L24:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r8.refreshToken
            if (r3 != 0) goto L2d
            r3 = 0
            goto L31
        L2d:
            int r3 = r3.hashCode()
        L31:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            long r3 = r8.expiresInSecs
            r5 = 32
            long r6 = r3 >>> r5
            long r3 = r3 ^ r6
            int r4 = (int) r3
            r0 = r0 ^ r4
            int r0 = r0 * r2
            long r3 = r8.tokenCreationEpochInSecs
            long r5 = r3 >>> r5
            long r3 = r3 ^ r5
            int r4 = (int) r3
            r0 = r0 ^ r4
            int r0 = r0 * r2
            java.lang.String r2 = r8.fisError
            if (r2 != 0) goto L4d
            goto L51
        L4d:
            int r1 = r2.hashCode()
        L51:
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public com.google.firebase.installations.local.PersistedInstallationEntry.Builder toBuilder() {
            r2 = this;
            com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry$Builder r0 = new com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PersistedInstallationEntry{firebaseInstallationId="
            r0.append(r1)
            java.lang.String r1 = r3.firebaseInstallationId
            r0.append(r1)
            java.lang.String r1 = ", registrationStatus="
            r0.append(r1)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = r3.registrationStatus
            r0.append(r1)
            java.lang.String r1 = ", authToken="
            r0.append(r1)
            java.lang.String r1 = r3.authToken
            r0.append(r1)
            java.lang.String r1 = ", refreshToken="
            r0.append(r1)
            java.lang.String r1 = r3.refreshToken
            r0.append(r1)
            java.lang.String r1 = ", expiresInSecs="
            r0.append(r1)
            long r1 = r3.expiresInSecs
            r0.append(r1)
            java.lang.String r1 = ", tokenCreationEpochInSecs="
            r0.append(r1)
            long r1 = r3.tokenCreationEpochInSecs
            r0.append(r1)
            java.lang.String r1 = ", fisError="
            r0.append(r1)
            java.lang.String r1 = r3.fisError
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
