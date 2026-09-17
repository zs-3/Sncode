package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo {
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
    private final int importance;
    private final int pid;
    private final java.lang.String processName;
    private final long pss;
    private final int reasonCode;
    private final long rss;
    private final long timestamp;
    private final java.lang.String traceFile;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder {
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
        private int importance;
        private int pid;
        private java.lang.String processName;
        private long pss;
        private int reasonCode;
        private long rss;
        private byte set$0;
        private long timestamp;
        private java.lang.String traceFile;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo build() {
                r17 = this;
                r0 = r17
                byte r1 = r0.set$0
                r2 = 63
                if (r1 != r2) goto L26
                java.lang.String r5 = r0.processName
                if (r5 != 0) goto Ld
                goto L26
            Ld:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo r1 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo
                int r4 = r0.pid
                int r6 = r0.reasonCode
                int r7 = r0.importance
                long r8 = r0.pss
                long r10 = r0.rss
                long r12 = r0.timestamp
                java.lang.String r14 = r0.traceFile
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch> r15 = r0.buildIdMappingForArch
                r16 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14, r15, r16)
                return r1
            L26:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                byte r2 = r0.set$0
                r2 = r2 & 1
                if (r2 != 0) goto L36
                java.lang.String r2 = " pid"
                r1.append(r2)
            L36:
                java.lang.String r2 = r0.processName
                if (r2 != 0) goto L3f
                java.lang.String r2 = " processName"
                r1.append(r2)
            L3f:
                byte r2 = r0.set$0
                r2 = r2 & 2
                if (r2 != 0) goto L4a
                java.lang.String r2 = " reasonCode"
                r1.append(r2)
            L4a:
                byte r2 = r0.set$0
                r2 = r2 & 4
                if (r2 != 0) goto L55
                java.lang.String r2 = " importance"
                r1.append(r2)
            L55:
                byte r2 = r0.set$0
                r2 = r2 & 8
                if (r2 != 0) goto L60
                java.lang.String r2 = " pss"
                r1.append(r2)
            L60:
                byte r2 = r0.set$0
                r2 = r2 & 16
                if (r2 != 0) goto L6b
                java.lang.String r2 = " rss"
                r1.append(r2)
            L6b:
                byte r2 = r0.set$0
                r2 = r2 & 32
                if (r2 != 0) goto L76
                java.lang.String r2 = " timestamp"
                r1.append(r2)
            L76:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Missing required properties:"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> r1) {
                r0 = this;
                r0.buildIdMappingForArch = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int r1) {
                r0 = this;
                r0.importance = r1
                byte r1 = r0.set$0
                r1 = r1 | 4
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setPid(int r1) {
                r0 = this;
                r0.pid = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null processName"
                java.util.Objects.requireNonNull(r2, r0)
                r1.processName = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setPss(long r1) {
                r0 = this;
                r0.pss = r1
                byte r1 = r0.set$0
                r1 = r1 | 8
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int r1) {
                r0 = this;
                r0.reasonCode = r1
                byte r1 = r0.set$0
                r1 = r1 | 2
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setRss(long r1) {
                r0 = this;
                r0.rss = r1
                byte r1 = r0.set$0
                r1 = r1 | 16
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long r1) {
                r0 = this;
                r0.timestamp = r1
                byte r1 = r0.set$0
                r1 = r1 | 32
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(java.lang.String r1) {
                r0 = this;
                r0.traceFile = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int r1, java.lang.String r2, int r3, int r4, long r5, long r7, long r9, java.lang.String r11, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> r12) {
            r0 = this;
            r0.<init>()
            r0.pid = r1
            r0.processName = r2
            r0.reasonCode = r3
            r0.importance = r4
            r0.pss = r5
            r0.rss = r7
            r0.timestamp = r9
            r0.traceFile = r11
            r0.buildIdMappingForArch = r12
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_ApplicationExitInfo(int r1, java.lang.String r2, int r3, int r4, long r5, long r7, long r9, java.lang.String r11, java.util.List r12, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo.AnonymousClass1 r13) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
            r2 = 0
            if (r1 == 0) goto L7a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo) r8
            int r1 = r7.pid
            int r3 = r8.getPid()
            if (r1 != r3) goto L78
            java.lang.String r1 = r7.processName
            java.lang.String r3 = r8.getProcessName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L78
            int r1 = r7.reasonCode
            int r3 = r8.getReasonCode()
            if (r1 != r3) goto L78
            int r1 = r7.importance
            int r3 = r8.getImportance()
            if (r1 != r3) goto L78
            long r3 = r7.pss
            long r5 = r8.getPss()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L78
            long r3 = r7.rss
            long r5 = r8.getRss()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L78
            long r3 = r7.timestamp
            long r5 = r8.getTimestamp()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L78
            java.lang.String r1 = r7.traceFile
            if (r1 != 0) goto L58
            java.lang.String r1 = r8.getTraceFile()
            if (r1 != 0) goto L78
            goto L62
        L58:
            java.lang.String r3 = r8.getTraceFile()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L78
        L62:
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch> r1 = r7.buildIdMappingForArch
            if (r1 != 0) goto L6d
            java.util.List r8 = r8.getBuildIdMappingForArch()
            if (r8 != 0) goto L78
            goto L79
        L6d:
            java.util.List r8 = r8.getBuildIdMappingForArch()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L78
            goto L79
        L78:
            r0 = 0
        L79:
            return r0
        L7a:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
            r1 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch> r0 = r1.buildIdMappingForArch
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getImportance() {
            r1 = this;
            int r0 = r1.importance
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getPid() {
            r1 = this;
            int r0 = r1.pid
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public java.lang.String getProcessName() {
            r1 = this;
            java.lang.String r0 = r1.processName
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getPss() {
            r2 = this;
            long r0 = r2.pss
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getReasonCode() {
            r1 = this;
            int r0 = r1.reasonCode
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getRss() {
            r2 = this;
            long r0 = r2.rss
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getTimestamp() {
            r2 = this;
            long r0 = r2.timestamp
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public java.lang.String getTraceFile() {
            r1 = this;
            java.lang.String r0 = r1.traceFile
            return r0
    }

    public int hashCode() {
            r7 = this;
            int r0 = r7.pid
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r7.processName
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.reasonCode
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.importance
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.pss
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.rss
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.timestamp
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            java.lang.String r2 = r7.traceFile
            r3 = 0
            if (r2 != 0) goto L3f
            r2 = 0
            goto L43
        L3f:
            int r2 = r2.hashCode()
        L43:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch> r1 = r7.buildIdMappingForArch
            if (r1 != 0) goto L4b
            goto L4f
        L4b:
            int r3 = r1.hashCode()
        L4f:
            r0 = r0 ^ r3
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ApplicationExitInfo{pid="
            r0.append(r1)
            int r1 = r3.pid
            r0.append(r1)
            java.lang.String r1 = ", processName="
            r0.append(r1)
            java.lang.String r1 = r3.processName
            r0.append(r1)
            java.lang.String r1 = ", reasonCode="
            r0.append(r1)
            int r1 = r3.reasonCode
            r0.append(r1)
            java.lang.String r1 = ", importance="
            r0.append(r1)
            int r1 = r3.importance
            r0.append(r1)
            java.lang.String r1 = ", pss="
            r0.append(r1)
            long r1 = r3.pss
            r0.append(r1)
            java.lang.String r1 = ", rss="
            r0.append(r1)
            long r1 = r3.rss
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.timestamp
            r0.append(r1)
            java.lang.String r1 = ", traceFile="
            r0.append(r1)
            java.lang.String r1 = r3.traceFile
            r0.append(r1)
            java.lang.String r1 = ", buildIdMappingForArch="
            r0.append(r1)
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch> r1 = r3.buildIdMappingForArch
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
