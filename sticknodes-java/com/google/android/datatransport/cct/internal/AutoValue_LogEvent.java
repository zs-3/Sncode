package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_LogEvent extends com.google.android.datatransport.cct.internal.LogEvent {
    private final com.google.android.datatransport.cct.internal.ComplianceData complianceData;
    private final java.lang.Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final com.google.android.datatransport.cct.internal.ExperimentIds experimentIds;
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final java.lang.String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_LogEvent$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.LogEvent.Builder {
        private com.google.android.datatransport.cct.internal.ComplianceData complianceData;
        private java.lang.Integer eventCode;
        private java.lang.Long eventTimeMs;
        private java.lang.Long eventUptimeMs;
        private com.google.android.datatransport.cct.internal.ExperimentIds experimentIds;
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
        private byte[] sourceExtension;
        private java.lang.String sourceExtensionJsonProto3;
        private java.lang.Long timezoneOffsetSeconds;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent build() {
                r17 = this;
                r0 = r17
                java.lang.Long r1 = r0.eventTimeMs
                java.lang.String r2 = ""
                if (r1 != 0) goto L19
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " eventTimeMs"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L19:
                java.lang.Long r1 = r0.eventUptimeMs
                if (r1 != 0) goto L2e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " eventUptimeMs"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L2e:
                java.lang.Long r1 = r0.timezoneOffsetSeconds
                if (r1 != 0) goto L43
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " timezoneOffsetSeconds"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L43:
                boolean r1 = r2.isEmpty()
                if (r1 == 0) goto L70
                com.google.android.datatransport.cct.internal.AutoValue_LogEvent r1 = new com.google.android.datatransport.cct.internal.AutoValue_LogEvent
                java.lang.Long r2 = r0.eventTimeMs
                long r4 = r2.longValue()
                java.lang.Integer r6 = r0.eventCode
                com.google.android.datatransport.cct.internal.ComplianceData r7 = r0.complianceData
                java.lang.Long r2 = r0.eventUptimeMs
                long r8 = r2.longValue()
                byte[] r10 = r0.sourceExtension
                java.lang.String r11 = r0.sourceExtensionJsonProto3
                java.lang.Long r2 = r0.timezoneOffsetSeconds
                long r12 = r2.longValue()
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo r14 = r0.networkConnectionInfo
                com.google.android.datatransport.cct.internal.ExperimentIds r15 = r0.experimentIds
                r16 = 0
                r3 = r1
                r3.<init>(r4, r6, r7, r8, r10, r11, r12, r14, r15, r16)
                return r1
            L70:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Missing required properties:"
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setComplianceData(com.google.android.datatransport.cct.internal.ComplianceData r1) {
                r0 = this;
                r0.complianceData = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventCode(java.lang.Integer r1) {
                r0 = this;
                r0.eventCode = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventTimeMs(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.eventTimeMs = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventUptimeMs(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.eventUptimeMs = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setExperimentIds(com.google.android.datatransport.cct.internal.ExperimentIds r1) {
                r0 = this;
                r0.experimentIds = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setNetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1) {
                r0 = this;
                r0.networkConnectionInfo = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtension(byte[] r1) {
                r0 = this;
                r0.sourceExtension = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtensionJsonProto3(java.lang.String r1) {
                r0 = this;
                r0.sourceExtensionJsonProto3 = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setTimezoneOffsetSeconds(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.timezoneOffsetSeconds = r1
                return r0
        }
    }

    private AutoValue_LogEvent(long r1, java.lang.Integer r3, com.google.android.datatransport.cct.internal.ComplianceData r4, long r5, byte[] r7, java.lang.String r8, long r9, com.google.android.datatransport.cct.internal.NetworkConnectionInfo r11, com.google.android.datatransport.cct.internal.ExperimentIds r12) {
            r0 = this;
            r0.<init>()
            r0.eventTimeMs = r1
            r0.eventCode = r3
            r0.complianceData = r4
            r0.eventUptimeMs = r5
            r0.sourceExtension = r7
            r0.sourceExtensionJsonProto3 = r8
            r0.timezoneOffsetSeconds = r9
            r0.networkConnectionInfo = r11
            r0.experimentIds = r12
            return
    }

    /* synthetic */ AutoValue_LogEvent(long r1, java.lang.Integer r3, com.google.android.datatransport.cct.internal.ComplianceData r4, long r5, byte[] r7, java.lang.String r8, long r9, com.google.android.datatransport.cct.internal.NetworkConnectionInfo r11, com.google.android.datatransport.cct.internal.ExperimentIds r12, com.google.android.datatransport.cct.internal.AutoValue_LogEvent.AnonymousClass1 r13) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5, r7, r8, r9, r11, r12)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.cct.internal.LogEvent
            r2 = 0
            if (r1 == 0) goto Lab
            com.google.android.datatransport.cct.internal.LogEvent r8 = (com.google.android.datatransport.cct.internal.LogEvent) r8
            long r3 = r7.eventTimeMs
            long r5 = r8.getEventTimeMs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto La9
            java.lang.Integer r1 = r7.eventCode
            if (r1 != 0) goto L20
            java.lang.Integer r1 = r8.getEventCode()
            if (r1 != 0) goto La9
            goto L2a
        L20:
            java.lang.Integer r3 = r8.getEventCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
        L2a:
            com.google.android.datatransport.cct.internal.ComplianceData r1 = r7.complianceData
            if (r1 != 0) goto L35
            com.google.android.datatransport.cct.internal.ComplianceData r1 = r8.getComplianceData()
            if (r1 != 0) goto La9
            goto L3f
        L35:
            com.google.android.datatransport.cct.internal.ComplianceData r3 = r8.getComplianceData()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
        L3f:
            long r3 = r7.eventUptimeMs
            long r5 = r8.getEventUptimeMs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto La9
            byte[] r1 = r7.sourceExtension
            boolean r3 = r8 instanceof com.google.android.datatransport.cct.internal.AutoValue_LogEvent
            if (r3 == 0) goto L55
            r3 = r8
            com.google.android.datatransport.cct.internal.AutoValue_LogEvent r3 = (com.google.android.datatransport.cct.internal.AutoValue_LogEvent) r3
            byte[] r3 = r3.sourceExtension
            goto L59
        L55:
            byte[] r3 = r8.getSourceExtension()
        L59:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto La9
            java.lang.String r1 = r7.sourceExtensionJsonProto3
            if (r1 != 0) goto L6a
            java.lang.String r1 = r8.getSourceExtensionJsonProto3()
            if (r1 != 0) goto La9
            goto L74
        L6a:
            java.lang.String r3 = r8.getSourceExtensionJsonProto3()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
        L74:
            long r3 = r7.timezoneOffsetSeconds
            long r5 = r8.getTimezoneOffsetSeconds()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto La9
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = r7.networkConnectionInfo
            if (r1 != 0) goto L89
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = r8.getNetworkConnectionInfo()
            if (r1 != 0) goto La9
            goto L93
        L89:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r3 = r8.getNetworkConnectionInfo()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
        L93:
            com.google.android.datatransport.cct.internal.ExperimentIds r1 = r7.experimentIds
            if (r1 != 0) goto L9e
            com.google.android.datatransport.cct.internal.ExperimentIds r8 = r8.getExperimentIds()
            if (r8 != 0) goto La9
            goto Laa
        L9e:
            com.google.android.datatransport.cct.internal.ExperimentIds r8 = r8.getExperimentIds()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto La9
            goto Laa
        La9:
            r0 = 0
        Laa:
            return r0
        Lab:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public com.google.android.datatransport.cct.internal.ComplianceData getComplianceData() {
            r1 = this;
            com.google.android.datatransport.cct.internal.ComplianceData r0 = r1.complianceData
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public java.lang.Integer getEventCode() {
            r1 = this;
            java.lang.Integer r0 = r1.eventCode
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventTimeMs() {
            r2 = this;
            long r0 = r2.eventTimeMs
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventUptimeMs() {
            r2 = this;
            long r0 = r2.eventUptimeMs
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public com.google.android.datatransport.cct.internal.ExperimentIds getExperimentIds() {
            r1 = this;
            com.google.android.datatransport.cct.internal.ExperimentIds r0 = r1.experimentIds
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public com.google.android.datatransport.cct.internal.NetworkConnectionInfo getNetworkConnectionInfo() {
            r1 = this;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r0 = r1.networkConnectionInfo
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public byte[] getSourceExtension() {
            r1 = this;
            byte[] r0 = r1.sourceExtension
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public java.lang.String getSourceExtensionJsonProto3() {
            r1 = this;
            java.lang.String r0 = r1.sourceExtensionJsonProto3
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getTimezoneOffsetSeconds() {
            r2 = this;
            long r0 = r2.timezoneOffsetSeconds
            return r0
    }

    public int hashCode() {
            r9 = this;
            long r0 = r9.eventTimeMs
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            java.lang.Integer r3 = r9.eventCode
            r4 = 0
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            com.google.android.datatransport.cct.internal.ComplianceData r3 = r9.complianceData
            if (r3 != 0) goto L22
            r3 = 0
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r5 = r9.eventUptimeMs
            long r7 = r5 >>> r2
            long r5 = r5 ^ r7
            int r3 = (int) r5
            r1 = r1 ^ r3
            int r1 = r1 * r0
            byte[] r3 = r9.sourceExtension
            int r3 = java.util.Arrays.hashCode(r3)
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.lang.String r3 = r9.sourceExtensionJsonProto3
            if (r3 != 0) goto L41
            r3 = 0
            goto L45
        L41:
            int r3 = r3.hashCode()
        L45:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r5 = r9.timezoneOffsetSeconds
            long r2 = r5 >>> r2
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r2 = r9.networkConnectionInfo
            if (r2 != 0) goto L57
            r2 = 0
            goto L5b
        L57:
            int r2 = r2.hashCode()
        L5b:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            com.google.android.datatransport.cct.internal.ExperimentIds r0 = r9.experimentIds
            if (r0 != 0) goto L63
            goto L67
        L63:
            int r4 = r0.hashCode()
        L67:
            r0 = r1 ^ r4
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LogEvent{eventTimeMs="
            r0.append(r1)
            long r1 = r3.eventTimeMs
            r0.append(r1)
            java.lang.String r1 = ", eventCode="
            r0.append(r1)
            java.lang.Integer r1 = r3.eventCode
            r0.append(r1)
            java.lang.String r1 = ", complianceData="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.ComplianceData r1 = r3.complianceData
            r0.append(r1)
            java.lang.String r1 = ", eventUptimeMs="
            r0.append(r1)
            long r1 = r3.eventUptimeMs
            r0.append(r1)
            java.lang.String r1 = ", sourceExtension="
            r0.append(r1)
            byte[] r1 = r3.sourceExtension
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", sourceExtensionJsonProto3="
            r0.append(r1)
            java.lang.String r1 = r3.sourceExtensionJsonProto3
            r0.append(r1)
            java.lang.String r1 = ", timezoneOffsetSeconds="
            r0.append(r1)
            long r1 = r3.timezoneOffsetSeconds
            r0.append(r1)
            java.lang.String r1 = ", networkConnectionInfo="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = r3.networkConnectionInfo
            r0.append(r1)
            java.lang.String r1 = ", experimentIds="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.ExperimentIds r1 = r3.experimentIds
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
