package com.google.firebase.installations;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class InstallationTokenResult {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.firebase.installations.InstallationTokenResult build();

        public abstract com.google.firebase.installations.InstallationTokenResult.Builder setToken(java.lang.String r1);

        public abstract com.google.firebase.installations.InstallationTokenResult.Builder setTokenCreationTimestamp(long r1);

        public abstract com.google.firebase.installations.InstallationTokenResult.Builder setTokenExpirationTimestamp(long r1);
    }

    public InstallationTokenResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.installations.InstallationTokenResult.Builder builder() {
            com.google.firebase.installations.AutoValue_InstallationTokenResult$Builder r0 = new com.google.firebase.installations.AutoValue_InstallationTokenResult$Builder
            r0.<init>()
            return r0
    }

    public abstract java.lang.String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();
}
