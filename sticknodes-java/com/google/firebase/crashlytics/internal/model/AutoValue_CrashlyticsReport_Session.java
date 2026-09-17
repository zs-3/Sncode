package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application app;
    private final java.lang.String appQualitySessionId;
    private final boolean crashed;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device;
    private final java.lang.Long endedAt;
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> events;
    private final java.lang.String generator;
    private final int generatorType;
    private final java.lang.String identifier;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem os;
    private final long startedAt;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder {
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application app;
        private java.lang.String appQualitySessionId;
        private boolean crashed;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device;
        private java.lang.Long endedAt;
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> events;
        private java.lang.String generator;
        private int generatorType;
        private java.lang.String identifier;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem os;
        private byte set$0;
        private long startedAt;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.getGenerator()
                r2.generator = r0
                java.lang.String r0 = r3.getIdentifier()
                r2.identifier = r0
                java.lang.String r0 = r3.getAppQualitySessionId()
                r2.appQualitySessionId = r0
                long r0 = r3.getStartedAt()
                r2.startedAt = r0
                java.lang.Long r0 = r3.getEndedAt()
                r2.endedAt = r0
                boolean r0 = r3.isCrashed()
                r2.crashed = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r0 = r3.getApp()
                r2.app = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r0 = r3.getUser()
                r2.user = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r0 = r3.getOs()
                r2.os = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r0 = r3.getDevice()
                r2.device = r0
                java.util.List r0 = r3.getEvents()
                r2.events = r0
                int r3 = r3.getGeneratorType()
                r2.generatorType = r3
                r3 = 7
                r2.set$0 = r3
                return
        }

        /* synthetic */ Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session r1, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session build() {
                r18 = this;
                r0 = r18
                byte r1 = r0.set$0
                r2 = 7
                if (r1 != r2) goto L31
                java.lang.String r4 = r0.generator
                if (r4 == 0) goto L31
                java.lang.String r5 = r0.identifier
                if (r5 == 0) goto L31
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r11 = r0.app
                if (r11 != 0) goto L14
                goto L31
            L14:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session r1 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session
                java.lang.String r6 = r0.appQualitySessionId
                long r7 = r0.startedAt
                java.lang.Long r9 = r0.endedAt
                boolean r10 = r0.crashed
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r12 = r0.user
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r13 = r0.os
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r14 = r0.device
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event> r15 = r0.events
                int r2 = r0.generatorType
                r17 = 0
                r3 = r1
                r16 = r2
                r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return r1
            L31:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r0.generator
                if (r2 != 0) goto L3f
                java.lang.String r2 = " generator"
                r1.append(r2)
            L3f:
                java.lang.String r2 = r0.identifier
                if (r2 != 0) goto L48
                java.lang.String r2 = " identifier"
                r1.append(r2)
            L48:
                byte r2 = r0.set$0
                r2 = r2 & 1
                if (r2 != 0) goto L53
                java.lang.String r2 = " startedAt"
                r1.append(r2)
            L53:
                byte r2 = r0.set$0
                r2 = r2 & 2
                if (r2 != 0) goto L5e
                java.lang.String r2 = " crashed"
                r1.append(r2)
            L5e:
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r2 = r0.app
                if (r2 != 0) goto L67
                java.lang.String r2 = " app"
                r1.append(r2)
            L67:
                byte r2 = r0.set$0
                r2 = r2 & 4
                if (r2 != 0) goto L72
                java.lang.String r2 = " generatorType"
                r1.append(r2)
            L72:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application r2) {
                r1 = this;
                java.lang.String r0 = "Null app"
                java.util.Objects.requireNonNull(r2, r0)
                r1.app = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setAppQualitySessionId(java.lang.String r1) {
                r0 = this;
                r0.appQualitySessionId = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setCrashed(boolean r1) {
                r0 = this;
                r0.crashed = r1
                byte r1 = r0.set$0
                r1 = r1 | 2
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device r1) {
                r0 = this;
                r0.device = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEndedAt(java.lang.Long r1) {
                r0 = this;
                r0.endedAt = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEvents(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> r1) {
                r0 = this;
                r0.events = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGenerator(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null generator"
                java.util.Objects.requireNonNull(r2, r0)
                r1.generator = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGeneratorType(int r1) {
                r0 = this;
                r0.generatorType = r1
                byte r1 = r0.set$0
                r1 = r1 | 4
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setIdentifier(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null identifier"
                java.util.Objects.requireNonNull(r2, r0)
                r1.identifier = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setOs(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem r1) {
                r0 = this;
                r0.os = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setStartedAt(long r1) {
                r0 = this;
                r0.startedAt = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setUser(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User r1) {
                r0 = this;
                r0.user = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport_Session(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.Long r6, boolean r7, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application r8, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User r9, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem r10, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device r11, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> r12, int r13) {
            r0 = this;
            r0.<init>()
            r0.generator = r1
            r0.identifier = r2
            r0.appQualitySessionId = r3
            r0.startedAt = r4
            r0.endedAt = r6
            r0.crashed = r7
            r0.app = r8
            r0.user = r9
            r0.os = r10
            r0.device = r11
            r0.events = r12
            r0.generatorType = r13
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.Long r6, boolean r7, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application r8, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User r9, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem r10, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device r11, java.util.List r12, int r13, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.AnonymousClass1 r14) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
            r2 = 0
            if (r1 == 0) goto Lca
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session) r8
            java.lang.String r1 = r7.generator
            java.lang.String r3 = r8.getGenerator()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
            java.lang.String r1 = r7.identifier
            java.lang.String r3 = r8.getIdentifier()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
            java.lang.String r1 = r7.appQualitySessionId
            if (r1 != 0) goto L2e
            java.lang.String r1 = r8.getAppQualitySessionId()
            if (r1 != 0) goto Lc8
            goto L38
        L2e:
            java.lang.String r3 = r8.getAppQualitySessionId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
        L38:
            long r3 = r7.startedAt
            long r5 = r8.getStartedAt()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lc8
            java.lang.Long r1 = r7.endedAt
            if (r1 != 0) goto L4d
            java.lang.Long r1 = r8.getEndedAt()
            if (r1 != 0) goto Lc8
            goto L57
        L4d:
            java.lang.Long r3 = r8.getEndedAt()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
        L57:
            boolean r1 = r7.crashed
            boolean r3 = r8.isCrashed()
            if (r1 != r3) goto Lc8
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r1 = r7.app
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r3 = r8.getApp()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = r7.user
            if (r1 != 0) goto L76
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = r8.getUser()
            if (r1 != 0) goto Lc8
            goto L80
        L76:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r3 = r8.getUser()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
        L80:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = r7.os
            if (r1 != 0) goto L8b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = r8.getOs()
            if (r1 != 0) goto Lc8
            goto L95
        L8b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r3 = r8.getOs()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
        L95:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = r7.device
            if (r1 != 0) goto La0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = r8.getDevice()
            if (r1 != 0) goto Lc8
            goto Laa
        La0:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r3 = r8.getDevice()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
        Laa:
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event> r1 = r7.events
            if (r1 != 0) goto Lb5
            java.util.List r1 = r8.getEvents()
            if (r1 != 0) goto Lc8
            goto Lbf
        Lb5:
            java.util.List r3 = r8.getEvents()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc8
        Lbf:
            int r1 = r7.generatorType
            int r8 = r8.getGeneratorType()
            if (r1 != r8) goto Lc8
            goto Lc9
        Lc8:
            r0 = 0
        Lc9:
            return r0
        Lca:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application getApp() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r0 = r1.app
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.lang.String getAppQualitySessionId() {
            r1 = this;
            java.lang.String r0 = r1.appQualitySessionId
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device getDevice() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r0 = r1.device
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.lang.Long getEndedAt() {
            r1 = this;
            java.lang.Long r0 = r1.endedAt
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> getEvents() {
            r1 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event> r0 = r1.events
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.lang.String getGenerator() {
            r1 = this;
            java.lang.String r0 = r1.generator
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int getGeneratorType() {
            r1 = this;
            int r0 = r1.generatorType
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public java.lang.String getIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.identifier
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem getOs() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r0 = r1.os
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long getStartedAt() {
            r2 = this;
            long r0 = r2.startedAt
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User getUser() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r0 = r1.user
            return r0
    }

    public int hashCode() {
            r8 = this;
            java.lang.String r0 = r8.generator
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r8.identifier
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r8.appQualitySessionId
            r3 = 0
            if (r2 != 0) goto L1c
            r2 = 0
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r4 = r8.startedAt
            r2 = 32
            long r6 = r4 >>> r2
            long r4 = r4 ^ r6
            int r2 = (int) r4
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.Long r2 = r8.endedAt
            if (r2 != 0) goto L34
            r2 = 0
            goto L38
        L34:
            int r2 = r2.hashCode()
        L38:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r8.crashed
            if (r2 == 0) goto L42
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L44
        L42:
            r2 = 1237(0x4d5, float:1.733E-42)
        L44:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r2 = r8.app
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r2 = r8.user
            if (r2 != 0) goto L56
            r2 = 0
            goto L5a
        L56:
            int r2 = r2.hashCode()
        L5a:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r2 = r8.os
            if (r2 != 0) goto L63
            r2 = 0
            goto L67
        L63:
            int r2 = r2.hashCode()
        L67:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r2 = r8.device
            if (r2 != 0) goto L70
            r2 = 0
            goto L74
        L70:
            int r2 = r2.hashCode()
        L74:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event> r2 = r8.events
            if (r2 != 0) goto L7c
            goto L80
        L7c:
            int r3 = r2.hashCode()
        L80:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            int r1 = r8.generatorType
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean isCrashed() {
            r1 = this;
            boolean r0 = r1.crashed
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder toBuilder() {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Session{generator="
            r0.append(r1)
            java.lang.String r1 = r3.generator
            r0.append(r1)
            java.lang.String r1 = ", identifier="
            r0.append(r1)
            java.lang.String r1 = r3.identifier
            r0.append(r1)
            java.lang.String r1 = ", appQualitySessionId="
            r0.append(r1)
            java.lang.String r1 = r3.appQualitySessionId
            r0.append(r1)
            java.lang.String r1 = ", startedAt="
            r0.append(r1)
            long r1 = r3.startedAt
            r0.append(r1)
            java.lang.String r1 = ", endedAt="
            r0.append(r1)
            java.lang.Long r1 = r3.endedAt
            r0.append(r1)
            java.lang.String r1 = ", crashed="
            r0.append(r1)
            boolean r1 = r3.crashed
            r0.append(r1)
            java.lang.String r1 = ", app="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r1 = r3.app
            r0.append(r1)
            java.lang.String r1 = ", user="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = r3.user
            r0.append(r1)
            java.lang.String r1 = ", os="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = r3.os
            r0.append(r1)
            java.lang.String r1 = ", device="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = r3.device
            r0.append(r1)
            java.lang.String r1 = ", events="
            r0.append(r1)
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event> r1 = r3.events
            r0.append(r1)
            java.lang.String r1 = ", generatorType="
            r0.append(r1)
            int r1 = r3.generatorType
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
