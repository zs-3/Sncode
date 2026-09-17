package com.google.firebase.installations.remote;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class InstallationResponse {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.firebase.installations.remote.InstallationResponse build();

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setAuthToken(com.google.firebase.installations.remote.TokenResult r1);

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setFid(java.lang.String r1);

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setRefreshToken(java.lang.String r1);

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode r1);

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setUri(java.lang.String r1);
    }

    public enum ResponseCode extends java.lang.Enum<com.google.firebase.installations.remote.InstallationResponse.ResponseCode> {
        private static final /* synthetic */ com.google.firebase.installations.remote.InstallationResponse.ResponseCode[] $VALUES = null;
        public static final com.google.firebase.installations.remote.InstallationResponse.ResponseCode BAD_CONFIG = null;
        public static final com.google.firebase.installations.remote.InstallationResponse.ResponseCode OK = null;

        private static /* synthetic */ com.google.firebase.installations.remote.InstallationResponse.ResponseCode[] $values() {
                r0 = 2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r0 = new com.google.firebase.installations.remote.InstallationResponse.ResponseCode[r0]
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r1 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK
                r2 = 0
                r0[r2] = r1
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r1 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r0 = new com.google.firebase.installations.remote.InstallationResponse$ResponseCode
                java.lang.String r1 = "OK"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK = r0
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r0 = new com.google.firebase.installations.remote.InstallationResponse$ResponseCode
                java.lang.String r1 = "BAD_CONFIG"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG = r0
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r0 = $values()
                com.google.firebase.installations.remote.InstallationResponse.ResponseCode.$VALUES = r0
                return
        }

        ResponseCode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.firebase.installations.remote.InstallationResponse.ResponseCode valueOf(java.lang.String r1) {
                java.lang.Class<com.google.firebase.installations.remote.InstallationResponse$ResponseCode> r0 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r1 = (com.google.firebase.installations.remote.InstallationResponse.ResponseCode) r1
                return r1
        }

        public static com.google.firebase.installations.remote.InstallationResponse.ResponseCode[] values() {
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r0 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r0 = (com.google.firebase.installations.remote.InstallationResponse.ResponseCode[]) r0
                return r0
        }
    }

    public InstallationResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.installations.remote.InstallationResponse.Builder builder() {
            com.google.firebase.installations.remote.AutoValue_InstallationResponse$Builder r0 = new com.google.firebase.installations.remote.AutoValue_InstallationResponse$Builder
            r0.<init>()
            return r0
    }

    public abstract com.google.firebase.installations.remote.TokenResult getAuthToken();

    public abstract java.lang.String getFid();

    public abstract java.lang.String getRefreshToken();

    public abstract com.google.firebase.installations.remote.InstallationResponse.ResponseCode getResponseCode();

    public abstract java.lang.String getUri();
}
