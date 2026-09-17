package com.google.firebase.installations.remote;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class TokenResult {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.firebase.installations.remote.TokenResult build();

        public abstract com.google.firebase.installations.remote.TokenResult.Builder setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode r1);

        public abstract com.google.firebase.installations.remote.TokenResult.Builder setToken(java.lang.String r1);

        public abstract com.google.firebase.installations.remote.TokenResult.Builder setTokenExpirationTimestamp(long r1);
    }

    public enum ResponseCode extends java.lang.Enum<com.google.firebase.installations.remote.TokenResult.ResponseCode> {
        private static final /* synthetic */ com.google.firebase.installations.remote.TokenResult.ResponseCode[] $VALUES = null;
        public static final com.google.firebase.installations.remote.TokenResult.ResponseCode AUTH_ERROR = null;
        public static final com.google.firebase.installations.remote.TokenResult.ResponseCode BAD_CONFIG = null;
        public static final com.google.firebase.installations.remote.TokenResult.ResponseCode OK = null;

        private static /* synthetic */ com.google.firebase.installations.remote.TokenResult.ResponseCode[] $values() {
                r0 = 3
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = new com.google.firebase.installations.remote.TokenResult.ResponseCode[r0]
                com.google.firebase.installations.remote.TokenResult$ResponseCode r1 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK
                r2 = 0
                r0[r2] = r1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r1 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG
                r2 = 1
                r0[r2] = r1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r1 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                com.google.firebase.installations.remote.TokenResult$ResponseCode r0 = new com.google.firebase.installations.remote.TokenResult$ResponseCode
                java.lang.String r1 = "OK"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.firebase.installations.remote.TokenResult.ResponseCode.OK = r0
                com.google.firebase.installations.remote.TokenResult$ResponseCode r0 = new com.google.firebase.installations.remote.TokenResult$ResponseCode
                java.lang.String r1 = "BAD_CONFIG"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG = r0
                com.google.firebase.installations.remote.TokenResult$ResponseCode r0 = new com.google.firebase.installations.remote.TokenResult$ResponseCode
                java.lang.String r1 = "AUTH_ERROR"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR = r0
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = $values()
                com.google.firebase.installations.remote.TokenResult.ResponseCode.$VALUES = r0
                return
        }

        ResponseCode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.firebase.installations.remote.TokenResult.ResponseCode valueOf(java.lang.String r1) {
                java.lang.Class<com.google.firebase.installations.remote.TokenResult$ResponseCode> r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.firebase.installations.remote.TokenResult$ResponseCode r1 = (com.google.firebase.installations.remote.TokenResult.ResponseCode) r1
                return r1
        }

        public static com.google.firebase.installations.remote.TokenResult.ResponseCode[] values() {
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = (com.google.firebase.installations.remote.TokenResult.ResponseCode[]) r0
                return r0
        }
    }

    public TokenResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.installations.remote.TokenResult.Builder builder() {
            com.google.firebase.installations.remote.AutoValue_TokenResult$Builder r0 = new com.google.firebase.installations.remote.AutoValue_TokenResult$Builder
            r0.<init>()
            r1 = 0
            com.google.firebase.installations.remote.TokenResult$Builder r0 = r0.setTokenExpirationTimestamp(r1)
            return r0
    }

    public abstract com.google.firebase.installations.remote.TokenResult.ResponseCode getResponseCode();

    public abstract java.lang.String getToken();

    public abstract long getTokenExpirationTimestamp();
}
