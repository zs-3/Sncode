package com.google.firebase.installations;

/* loaded from: classes2.dex */
final class AutoValue_InstallationTokenResult extends com.google.firebase.installations.InstallationTokenResult {
    private final java.lang.String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    /* renamed from: com.google.firebase.installations.AutoValue_InstallationTokenResult$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.installations.InstallationTokenResult.Builder {
        private java.lang.String token;
        private java.lang.Long tokenCreationTimestamp;
        private java.lang.Long tokenExpirationTimestamp;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public com.google.firebase.installations.InstallationTokenResult build() {
                r9 = this;
                java.lang.String r0 = r9.token
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " token"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Long r0 = r9.tokenExpirationTimestamp
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " tokenExpirationTimestamp"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Long r0 = r9.tokenCreationTimestamp
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " tokenCreationTimestamp"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L5d
                com.google.firebase.installations.AutoValue_InstallationTokenResult r0 = new com.google.firebase.installations.AutoValue_InstallationTokenResult
                java.lang.String r3 = r9.token
                java.lang.Long r1 = r9.tokenExpirationTimestamp
                long r4 = r1.longValue()
                java.lang.Long r1 = r9.tokenCreationTimestamp
                long r6 = r1.longValue()
                r8 = 0
                r2 = r0
                r2.<init>(r3, r4, r6, r8)
                return r0
            L5d:
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

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public com.google.firebase.installations.InstallationTokenResult.Builder setToken(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null token"
                java.util.Objects.requireNonNull(r2, r0)
                r1.token = r2
                return r1
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public com.google.firebase.installations.InstallationTokenResult.Builder setTokenCreationTimestamp(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.tokenCreationTimestamp = r1
                return r0
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public com.google.firebase.installations.InstallationTokenResult.Builder setTokenExpirationTimestamp(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.tokenExpirationTimestamp = r1
                return r0
        }
    }

    private AutoValue_InstallationTokenResult(java.lang.String r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.token = r1
            r0.tokenExpirationTimestamp = r2
            r0.tokenCreationTimestamp = r4
            return
    }

    /* synthetic */ AutoValue_InstallationTokenResult(java.lang.String r1, long r2, long r4, com.google.firebase.installations.AutoValue_InstallationTokenResult.AnonymousClass1 r6) {
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
            boolean r1 = r8 instanceof com.google.firebase.installations.InstallationTokenResult
            r2 = 0
            if (r1 == 0) goto L2e
            com.google.firebase.installations.InstallationTokenResult r8 = (com.google.firebase.installations.InstallationTokenResult) r8
            java.lang.String r1 = r7.token
            java.lang.String r3 = r8.getToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            long r3 = r7.tokenExpirationTimestamp
            long r5 = r8.getTokenExpirationTimestamp()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            long r3 = r7.tokenCreationTimestamp
            long r5 = r8.getTokenCreationTimestamp()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            return r2
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public java.lang.String getToken() {
            r1 = this;
            java.lang.String r0 = r1.token
            return r0
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenCreationTimestamp() {
            r2 = this;
            long r0 = r2.tokenCreationTimestamp
            return r0
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenExpirationTimestamp() {
            r2 = this;
            long r0 = r2.tokenExpirationTimestamp
            return r0
    }

    public int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.token
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            long r2 = r7.tokenExpirationTimestamp
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r1 = r7.tokenCreationTimestamp
            long r3 = r1 >>> r4
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InstallationTokenResult{token="
            r0.append(r1)
            java.lang.String r1 = r3.token
            r0.append(r1)
            java.lang.String r1 = ", tokenExpirationTimestamp="
            r0.append(r1)
            long r1 = r3.tokenExpirationTimestamp
            r0.append(r1)
            java.lang.String r1 = ", tokenCreationTimestamp="
            r0.append(r1)
            long r1 = r3.tokenCreationTimestamp
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
