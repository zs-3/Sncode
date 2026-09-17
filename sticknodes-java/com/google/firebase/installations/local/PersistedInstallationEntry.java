package com.google.firebase.installations.local;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class PersistedInstallationEntry {
    public static com.google.firebase.installations.local.PersistedInstallationEntry INSTANCE;

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry build();

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setAuthToken(java.lang.String r1);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setExpiresInSecs(long r1);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFirebaseInstallationId(java.lang.String r1);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFisError(java.lang.String r1);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRefreshToken(java.lang.String r1);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus r1);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long r1);
    }

    static {
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = builder()
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.build()
            com.google.firebase.installations.local.PersistedInstallationEntry.INSTANCE = r0
            return
    }

    public PersistedInstallationEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.installations.local.PersistedInstallationEntry.Builder builder() {
            com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry$Builder r0 = new com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry$Builder
            r0.<init>()
            r1 = 0
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r0.setTokenCreationEpochInSecs(r1)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r0.setRegistrationStatus(r3)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r0.setExpiresInSecs(r1)
            return r0
    }

    public abstract java.lang.String getAuthToken();

    public abstract long getExpiresInSecs();

    public abstract java.lang.String getFirebaseInstallationId();

    public abstract java.lang.String getFisError();

    public abstract java.lang.String getRefreshToken();

    public abstract com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r2.getRegistrationStatus()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean isNotGenerated() {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r2.getRegistrationStatus()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED
            if (r0 == r1) goto L13
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r2.getRegistrationStatus()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            if (r0 != r1) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    public boolean isRegistered() {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r2.getRegistrationStatus()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean isUnregistered() {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r2.getRegistrationStatus()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean shouldAttemptMigration() {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = r2.getRegistrationStatus()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder toBuilder();

    public com.google.firebase.installations.local.PersistedInstallationEntry withAuthToken(java.lang.String r2, long r3, long r5) {
            r1 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r1.toBuilder()
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r0.setAuthToken(r2)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setExpiresInSecs(r3)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setTokenCreationEpochInSecs(r5)
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.build()
            return r2
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withClearedAuthToken() {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r2.toBuilder()
            r1 = 0
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r0.setAuthToken(r1)
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.build()
            return r0
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withFisError(java.lang.String r2) {
            r1 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r1.toBuilder()
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r0.setFisError(r2)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setRegistrationStatus(r0)
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.build()
            return r2
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withNoGeneratedFid() {
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r2.toBuilder()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r0.setRegistrationStatus(r1)
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.build()
            return r0
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withRegisteredFid(java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6, long r7) {
            r1 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r1.toBuilder()
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r0.setFirebaseInstallationId(r2)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setRegistrationStatus(r0)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setAuthToken(r6)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setRefreshToken(r3)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setExpiresInSecs(r7)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setTokenCreationEpochInSecs(r4)
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.build()
            return r2
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withUnregisteredFid(java.lang.String r2) {
            r1 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r1.toBuilder()
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r0.setFirebaseInstallationId(r2)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.setRegistrationStatus(r0)
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.build()
            return r2
    }
}
