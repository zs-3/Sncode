package com.google.firebase.installations.remote;

/* loaded from: classes2.dex */
final class AutoValue_InstallationResponse extends com.google.firebase.installations.remote.InstallationResponse {
    private final com.google.firebase.installations.remote.TokenResult authToken;
    private final java.lang.String fid;
    private final java.lang.String refreshToken;
    private final com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode;
    private final java.lang.String uri;

    /* renamed from: com.google.firebase.installations.remote.AutoValue_InstallationResponse$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.installations.remote.InstallationResponse.Builder {
        private com.google.firebase.installations.remote.TokenResult authToken;
        private java.lang.String fid;
        private java.lang.String refreshToken;
        private com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode;
        private java.lang.String uri;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse build() {
                r8 = this;
                com.google.firebase.installations.remote.AutoValue_InstallationResponse r7 = new com.google.firebase.installations.remote.AutoValue_InstallationResponse
                java.lang.String r1 = r8.uri
                java.lang.String r2 = r8.fid
                java.lang.String r3 = r8.refreshToken
                com.google.firebase.installations.remote.TokenResult r4 = r8.authToken
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r5 = r8.responseCode
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setAuthToken(com.google.firebase.installations.remote.TokenResult r1) {
                r0 = this;
                r0.authToken = r1
                return r0
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setFid(java.lang.String r1) {
                r0 = this;
                r0.fid = r1
                return r0
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setRefreshToken(java.lang.String r1) {
                r0 = this;
                r0.refreshToken = r1
                return r0
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode r1) {
                r0 = this;
                r0.responseCode = r1
                return r0
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setUri(java.lang.String r1) {
                r0 = this;
                r0.uri = r1
                return r0
        }
    }

    private AutoValue_InstallationResponse(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.google.firebase.installations.remote.TokenResult r4, com.google.firebase.installations.remote.InstallationResponse.ResponseCode r5) {
            r0 = this;
            r0.<init>()
            r0.uri = r1
            r0.fid = r2
            r0.refreshToken = r3
            r0.authToken = r4
            r0.responseCode = r5
            return
    }

    /* synthetic */ AutoValue_InstallationResponse(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.google.firebase.installations.remote.TokenResult r4, com.google.firebase.installations.remote.InstallationResponse.ResponseCode r5, com.google.firebase.installations.remote.AutoValue_InstallationResponse.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.installations.remote.InstallationResponse
            r2 = 0
            if (r1 == 0) goto L77
            com.google.firebase.installations.remote.InstallationResponse r5 = (com.google.firebase.installations.remote.InstallationResponse) r5
            java.lang.String r1 = r4.uri
            if (r1 != 0) goto L16
            java.lang.String r1 = r5.getUri()
            if (r1 != 0) goto L75
            goto L20
        L16:
            java.lang.String r3 = r5.getUri()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L75
        L20:
            java.lang.String r1 = r4.fid
            if (r1 != 0) goto L2b
            java.lang.String r1 = r5.getFid()
            if (r1 != 0) goto L75
            goto L35
        L2b:
            java.lang.String r3 = r5.getFid()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L75
        L35:
            java.lang.String r1 = r4.refreshToken
            if (r1 != 0) goto L40
            java.lang.String r1 = r5.getRefreshToken()
            if (r1 != 0) goto L75
            goto L4a
        L40:
            java.lang.String r3 = r5.getRefreshToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L75
        L4a:
            com.google.firebase.installations.remote.TokenResult r1 = r4.authToken
            if (r1 != 0) goto L55
            com.google.firebase.installations.remote.TokenResult r1 = r5.getAuthToken()
            if (r1 != 0) goto L75
            goto L5f
        L55:
            com.google.firebase.installations.remote.TokenResult r3 = r5.getAuthToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L75
        L5f:
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r1 = r4.responseCode
            if (r1 != 0) goto L6a
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r5 = r5.getResponseCode()
            if (r5 != 0) goto L75
            goto L76
        L6a:
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r5 = r5.getResponseCode()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L75
            goto L76
        L75:
            r0 = 0
        L76:
            return r0
        L77:
            return r2
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public com.google.firebase.installations.remote.TokenResult getAuthToken() {
            r1 = this;
            com.google.firebase.installations.remote.TokenResult r0 = r1.authToken
            return r0
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public java.lang.String getFid() {
            r1 = this;
            java.lang.String r0 = r1.fid
            return r0
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public java.lang.String getRefreshToken() {
            r1 = this;
            java.lang.String r0 = r1.refreshToken
            return r0
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public com.google.firebase.installations.remote.InstallationResponse.ResponseCode getResponseCode() {
            r1 = this;
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r0 = r1.responseCode
            return r0
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public java.lang.String getUri() {
            r1 = this;
            java.lang.String r0 = r1.uri
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.uri
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
            java.lang.String r3 = r4.fid
            if (r3 != 0) goto L17
            r3 = 0
            goto L1b
        L17:
            int r3 = r3.hashCode()
        L1b:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r4.refreshToken
            if (r3 != 0) goto L24
            r3 = 0
            goto L28
        L24:
            int r3 = r3.hashCode()
        L28:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            com.google.firebase.installations.remote.TokenResult r3 = r4.authToken
            if (r3 != 0) goto L31
            r3 = 0
            goto L35
        L31:
            int r3 = r3.hashCode()
        L35:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = r4.responseCode
            if (r2 != 0) goto L3d
            goto L41
        L3d:
            int r1 = r2.hashCode()
        L41:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InstallationResponse{uri="
            r0.append(r1)
            java.lang.String r1 = r2.uri
            r0.append(r1)
            java.lang.String r1 = ", fid="
            r0.append(r1)
            java.lang.String r1 = r2.fid
            r0.append(r1)
            java.lang.String r1 = ", refreshToken="
            r0.append(r1)
            java.lang.String r1 = r2.refreshToken
            r0.append(r1)
            java.lang.String r1 = ", authToken="
            r0.append(r1)
            com.google.firebase.installations.remote.TokenResult r1 = r2.authToken
            r0.append(r1)
            java.lang.String r1 = ", responseCode="
            r0.append(r1)
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r1 = r2.responseCode
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
