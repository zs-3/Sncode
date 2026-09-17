package com.google.firebase.installations.remote;

/* loaded from: classes2.dex */
final class AutoValue_TokenResult extends com.google.firebase.installations.remote.TokenResult {
    private final com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode;
    private final java.lang.String token;
    private final long tokenExpirationTimestamp;

    /* renamed from: com.google.firebase.installations.remote.AutoValue_TokenResult$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.installations.remote.TokenResult.Builder {
        private com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode;
        private java.lang.String token;
        private java.lang.Long tokenExpirationTimestamp;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public com.google.firebase.installations.remote.TokenResult build() {
                r8 = this;
                java.lang.Long r0 = r8.tokenExpirationTimestamp
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " tokenExpirationTimestamp"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L2f
                com.google.firebase.installations.remote.AutoValue_TokenResult r0 = new com.google.firebase.installations.remote.AutoValue_TokenResult
                java.lang.String r3 = r8.token
                java.lang.Long r1 = r8.tokenExpirationTimestamp
                long r4 = r1.longValue()
                com.google.firebase.installations.remote.TokenResult$ResponseCode r6 = r8.responseCode
                r7 = 0
                r2 = r0
                r2.<init>(r3, r4, r6, r7)
                return r0
            L2f:
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

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public com.google.firebase.installations.remote.TokenResult.Builder setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode r1) {
                r0 = this;
                r0.responseCode = r1
                return r0
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public com.google.firebase.installations.remote.TokenResult.Builder setToken(java.lang.String r1) {
                r0 = this;
                r0.token = r1
                return r0
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public com.google.firebase.installations.remote.TokenResult.Builder setTokenExpirationTimestamp(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.tokenExpirationTimestamp = r1
                return r0
        }
    }

    private AutoValue_TokenResult(java.lang.String r1, long r2, com.google.firebase.installations.remote.TokenResult.ResponseCode r4) {
            r0 = this;
            r0.<init>()
            r0.token = r1
            r0.tokenExpirationTimestamp = r2
            r0.responseCode = r4
            return
    }

    /* synthetic */ AutoValue_TokenResult(java.lang.String r1, long r2, com.google.firebase.installations.remote.TokenResult.ResponseCode r4, com.google.firebase.installations.remote.AutoValue_TokenResult.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.installations.remote.TokenResult
            r2 = 0
            if (r1 == 0) goto L42
            com.google.firebase.installations.remote.TokenResult r8 = (com.google.firebase.installations.remote.TokenResult) r8
            java.lang.String r1 = r7.token
            if (r1 != 0) goto L16
            java.lang.String r1 = r8.getToken()
            if (r1 != 0) goto L40
            goto L20
        L16:
            java.lang.String r3 = r8.getToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L40
        L20:
            long r3 = r7.tokenExpirationTimestamp
            long r5 = r8.getTokenExpirationTimestamp()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L40
            com.google.firebase.installations.remote.TokenResult$ResponseCode r1 = r7.responseCode
            if (r1 != 0) goto L35
            com.google.firebase.installations.remote.TokenResult$ResponseCode r8 = r8.getResponseCode()
            if (r8 != 0) goto L40
            goto L41
        L35:
            com.google.firebase.installations.remote.TokenResult$ResponseCode r8 = r8.getResponseCode()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L40
            goto L41
        L40:
            r0 = 0
        L41:
            return r0
        L42:
            return r2
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public com.google.firebase.installations.remote.TokenResult.ResponseCode getResponseCode() {
            r1 = this;
            com.google.firebase.installations.remote.TokenResult$ResponseCode r0 = r1.responseCode
            return r0
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public java.lang.String getToken() {
            r1 = this;
            java.lang.String r0 = r1.token
            return r0
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long getTokenExpirationTimestamp() {
            r2 = this;
            long r0 = r2.tokenExpirationTimestamp
            return r0
    }

    public int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.token
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
            long r3 = r7.tokenExpirationTimestamp
            r5 = 32
            long r5 = r3 >>> r5
            long r3 = r3 ^ r5
            int r4 = (int) r3
            r0 = r0 ^ r4
            int r0 = r0 * r2
            com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = r7.responseCode
            if (r2 != 0) goto L21
            goto L25
        L21:
            int r1 = r2.hashCode()
        L25:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TokenResult{token="
            r0.append(r1)
            java.lang.String r1 = r3.token
            r0.append(r1)
            java.lang.String r1 = ", tokenExpirationTimestamp="
            r0.append(r1)
            long r1 = r3.tokenExpirationTimestamp
            r0.append(r1)
            java.lang.String r1 = ", responseCode="
            r0.append(r1)
            com.google.firebase.installations.remote.TokenResult$ResponseCode r1 = r3.responseCode
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
