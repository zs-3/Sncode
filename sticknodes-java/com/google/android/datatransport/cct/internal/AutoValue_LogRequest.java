package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_LogRequest extends com.google.android.datatransport.cct.internal.LogRequest {
    private final com.google.android.datatransport.cct.internal.ClientInfo clientInfo;
    private final java.util.List<com.google.android.datatransport.cct.internal.LogEvent> logEvents;
    private final java.lang.Integer logSource;
    private final java.lang.String logSourceName;
    private final com.google.android.datatransport.cct.internal.QosTier qosTier;
    private final long requestTimeMs;
    private final long requestUptimeMs;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_LogRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.LogRequest.Builder {
        private com.google.android.datatransport.cct.internal.ClientInfo clientInfo;
        private java.util.List<com.google.android.datatransport.cct.internal.LogEvent> logEvents;
        private java.lang.Integer logSource;
        private java.lang.String logSourceName;
        private com.google.android.datatransport.cct.internal.QosTier qosTier;
        private java.lang.Long requestTimeMs;
        private java.lang.Long requestUptimeMs;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest build() {
                r13 = this;
                java.lang.Long r0 = r13.requestTimeMs
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " requestTimeMs"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Long r0 = r13.requestUptimeMs
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " requestUptimeMs"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L50
                com.google.android.datatransport.cct.internal.AutoValue_LogRequest r0 = new com.google.android.datatransport.cct.internal.AutoValue_LogRequest
                java.lang.Long r1 = r13.requestTimeMs
                long r3 = r1.longValue()
                java.lang.Long r1 = r13.requestUptimeMs
                long r5 = r1.longValue()
                com.google.android.datatransport.cct.internal.ClientInfo r7 = r13.clientInfo
                java.lang.Integer r8 = r13.logSource
                java.lang.String r9 = r13.logSourceName
                java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r10 = r13.logEvents
                com.google.android.datatransport.cct.internal.QosTier r11 = r13.qosTier
                r12 = 0
                r2 = r0
                r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)
                return r0
            L50:
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

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setClientInfo(com.google.android.datatransport.cct.internal.ClientInfo r1) {
                r0 = this;
                r0.clientInfo = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setLogEvents(java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r1) {
                r0 = this;
                r0.logEvents = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSource(java.lang.Integer r1) {
                r0 = this;
                r0.logSource = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSourceName(java.lang.String r1) {
                r0 = this;
                r0.logSourceName = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setQosTier(com.google.android.datatransport.cct.internal.QosTier r1) {
                r0 = this;
                r0.qosTier = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestTimeMs(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.requestTimeMs = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestUptimeMs(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.requestUptimeMs = r1
                return r0
        }
    }

    private AutoValue_LogRequest(long r1, long r3, com.google.android.datatransport.cct.internal.ClientInfo r5, java.lang.Integer r6, java.lang.String r7, java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r8, com.google.android.datatransport.cct.internal.QosTier r9) {
            r0 = this;
            r0.<init>()
            r0.requestTimeMs = r1
            r0.requestUptimeMs = r3
            r0.clientInfo = r5
            r0.logSource = r6
            r0.logSourceName = r7
            r0.logEvents = r8
            r0.qosTier = r9
            return
    }

    /* synthetic */ AutoValue_LogRequest(long r1, long r3, com.google.android.datatransport.cct.internal.ClientInfo r5, java.lang.Integer r6, java.lang.String r7, java.util.List r8, com.google.android.datatransport.cct.internal.QosTier r9, com.google.android.datatransport.cct.internal.AutoValue_LogRequest.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r3, r5, r6, r7, r8, r9)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.cct.internal.LogRequest
            r2 = 0
            if (r1 == 0) goto L8b
            com.google.android.datatransport.cct.internal.LogRequest r8 = (com.google.android.datatransport.cct.internal.LogRequest) r8
            long r3 = r7.requestTimeMs
            long r5 = r8.getRequestTimeMs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L89
            long r3 = r7.requestUptimeMs
            long r5 = r8.getRequestUptimeMs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L89
            com.google.android.datatransport.cct.internal.ClientInfo r1 = r7.clientInfo
            if (r1 != 0) goto L2a
            com.google.android.datatransport.cct.internal.ClientInfo r1 = r8.getClientInfo()
            if (r1 != 0) goto L89
            goto L34
        L2a:
            com.google.android.datatransport.cct.internal.ClientInfo r3 = r8.getClientInfo()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L34:
            java.lang.Integer r1 = r7.logSource
            if (r1 != 0) goto L3f
            java.lang.Integer r1 = r8.getLogSource()
            if (r1 != 0) goto L89
            goto L49
        L3f:
            java.lang.Integer r3 = r8.getLogSource()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L49:
            java.lang.String r1 = r7.logSourceName
            if (r1 != 0) goto L54
            java.lang.String r1 = r8.getLogSourceName()
            if (r1 != 0) goto L89
            goto L5e
        L54:
            java.lang.String r3 = r8.getLogSourceName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L5e:
            java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r1 = r7.logEvents
            if (r1 != 0) goto L69
            java.util.List r1 = r8.getLogEvents()
            if (r1 != 0) goto L89
            goto L73
        L69:
            java.util.List r3 = r8.getLogEvents()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L73:
            com.google.android.datatransport.cct.internal.QosTier r1 = r7.qosTier
            if (r1 != 0) goto L7e
            com.google.android.datatransport.cct.internal.QosTier r8 = r8.getQosTier()
            if (r8 != 0) goto L89
            goto L8a
        L7e:
            com.google.android.datatransport.cct.internal.QosTier r8 = r8.getQosTier()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L89
            goto L8a
        L89:
            r0 = 0
        L8a:
            return r0
        L8b:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public com.google.android.datatransport.cct.internal.ClientInfo getClientInfo() {
            r1 = this;
            com.google.android.datatransport.cct.internal.ClientInfo r0 = r1.clientInfo
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public java.util.List<com.google.android.datatransport.cct.internal.LogEvent> getLogEvents() {
            r1 = this;
            java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r0 = r1.logEvents
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public java.lang.Integer getLogSource() {
            r1 = this;
            java.lang.Integer r0 = r1.logSource
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public java.lang.String getLogSourceName() {
            r1 = this;
            java.lang.String r0 = r1.logSourceName
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public com.google.android.datatransport.cct.internal.QosTier getQosTier() {
            r1 = this;
            com.google.android.datatransport.cct.internal.QosTier r0 = r1.qosTier
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestTimeMs() {
            r2 = this;
            long r0 = r2.requestTimeMs
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestUptimeMs() {
            r2 = this;
            long r0 = r2.requestUptimeMs
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.requestTimeMs
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.requestUptimeMs
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            com.google.android.datatransport.cct.internal.ClientInfo r2 = r7.clientInfo
            r3 = 0
            if (r2 != 0) goto L1f
            r2 = 0
            goto L23
        L1f:
            int r2 = r2.hashCode()
        L23:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            java.lang.Integer r2 = r7.logSource
            if (r2 != 0) goto L2c
            r2 = 0
            goto L30
        L2c:
            int r2 = r2.hashCode()
        L30:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            java.lang.String r2 = r7.logSourceName
            if (r2 != 0) goto L39
            r2 = 0
            goto L3d
        L39:
            int r2 = r2.hashCode()
        L3d:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r2 = r7.logEvents
            if (r2 != 0) goto L46
            r2 = 0
            goto L4a
        L46:
            int r2 = r2.hashCode()
        L4a:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            com.google.android.datatransport.cct.internal.QosTier r0 = r7.qosTier
            if (r0 != 0) goto L52
            goto L56
        L52:
            int r3 = r0.hashCode()
        L56:
            r0 = r1 ^ r3
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LogRequest{requestTimeMs="
            r0.append(r1)
            long r1 = r3.requestTimeMs
            r0.append(r1)
            java.lang.String r1 = ", requestUptimeMs="
            r0.append(r1)
            long r1 = r3.requestUptimeMs
            r0.append(r1)
            java.lang.String r1 = ", clientInfo="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.ClientInfo r1 = r3.clientInfo
            r0.append(r1)
            java.lang.String r1 = ", logSource="
            r0.append(r1)
            java.lang.Integer r1 = r3.logSource
            r0.append(r1)
            java.lang.String r1 = ", logSourceName="
            r0.append(r1)
            java.lang.String r1 = r3.logSourceName
            r0.append(r1)
            java.lang.String r1 = ", logEvents="
            r0.append(r1)
            java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r1 = r3.logEvents
            r0.append(r1)
            java.lang.String r1 = ", qosTier="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.QosTier r1 = r3.qosTier
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
