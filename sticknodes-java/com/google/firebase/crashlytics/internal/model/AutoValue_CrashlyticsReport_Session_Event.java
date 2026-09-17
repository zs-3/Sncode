package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application app;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rollouts;
    private final long timestamp;
    private final java.lang.String type;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder {
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application app;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rollouts;
        private byte set$0;
        private long timestamp;
        private java.lang.String type;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r3) {
                r2 = this;
                r2.<init>()
                long r0 = r3.getTimestamp()
                r2.timestamp = r0
                java.lang.String r0 = r3.getType()
                r2.type = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r0 = r3.getApp()
                r2.app = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r0 = r3.getDevice()
                r2.device = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r0 = r3.getLog()
                r2.log = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r3 = r3.getRollouts()
                r2.rollouts = r3
                r3 = 1
                r2.set$0 = r3
                return
        }

        /* synthetic */ Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r1, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event build() {
                r11 = this;
                byte r0 = r11.set$0
                r1 = 1
                if (r0 != r1) goto L20
                java.lang.String r5 = r11.type
                if (r5 == 0) goto L20
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r6 = r11.app
                if (r6 == 0) goto L20
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r7 = r11.device
                if (r7 != 0) goto L12
                goto L20
            L12:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event
                long r3 = r11.timestamp
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r8 = r11.log
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r9 = r11.rollouts
                r10 = 0
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r8, r9, r10)
                return r0
            L20:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                byte r2 = r11.set$0
                r1 = r1 & r2
                if (r1 != 0) goto L2f
                java.lang.String r1 = " timestamp"
                r0.append(r1)
            L2f:
                java.lang.String r1 = r11.type
                if (r1 != 0) goto L38
                java.lang.String r1 = " type"
                r0.append(r1)
            L38:
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r1 = r11.app
                if (r1 != 0) goto L41
                java.lang.String r1 = " app"
                r0.append(r1)
            L41:
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r1 = r11.device
                if (r1 != 0) goto L4a
                java.lang.String r1 = " device"
                r0.append(r1)
            L4a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application r2) {
                r1 = this;
                java.lang.String r0 = "Null app"
                java.util.Objects.requireNonNull(r2, r0)
                r1.app = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device r2) {
                r1 = this;
                java.lang.String r0 = "Null device"
                java.util.Objects.requireNonNull(r2, r0)
                r1.device = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setLog(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log r1) {
                r0 = this;
                r0.log = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setRollouts(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState r1) {
                r0 = this;
                r0.rollouts = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setTimestamp(long r1) {
                r0 = this;
                r0.timestamp = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setType(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null type"
                java.util.Objects.requireNonNull(r2, r0)
                r1.type = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event(long r1, java.lang.String r3, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application r4, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device r5, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log r6, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState r7) {
            r0 = this;
            r0.<init>()
            r0.timestamp = r1
            r0.type = r3
            r0.app = r4
            r0.device = r5
            r0.log = r6
            r0.rollouts = r7
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event(long r1, java.lang.String r3, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application r4, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device r5, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log r6, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState r7, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5, r6, r7)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
            r2 = 0
            if (r1 == 0) goto L66
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event) r8
            long r3 = r7.timestamp
            long r5 = r8.getTimestamp()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            java.lang.String r1 = r7.type
            java.lang.String r3 = r8.getType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r1 = r7.app
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r3 = r8.getApp()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r1 = r7.device
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r3 = r8.getDevice()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r1 = r7.log
            if (r1 != 0) goto L44
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r1 = r8.getLog()
            if (r1 != 0) goto L64
            goto L4e
        L44:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r3 = r8.getLog()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
        L4e:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r1 = r7.rollouts
            if (r1 != 0) goto L59
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r8 = r8.getRollouts()
            if (r8 != 0) goto L64
            goto L65
        L59:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r8 = r8.getRollouts()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L64
            goto L65
        L64:
            r0 = 0
        L65:
            return r0
        L66:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application getApp() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r0 = r1.app
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device getDevice() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r0 = r1.device
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log getLog() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r0 = r1.log
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState getRollouts() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r0 = r1.rollouts
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public long getTimestamp() {
            r2 = this;
            long r0 = r2.timestamp
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.timestamp
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            java.lang.String r2 = r4.type
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r2 = r4.app
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r2 = r4.device
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r2 = r4.log
            r3 = 0
            if (r2 != 0) goto L30
            r2 = 0
            goto L34
        L30:
            int r2 = r2.hashCode()
        L34:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r0 = r4.rollouts
            if (r0 != 0) goto L3c
            goto L40
        L3c:
            int r3 = r0.hashCode()
        L40:
            r0 = r1 ^ r3
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder toBuilder() {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Event{timestamp="
            r0.append(r1)
            long r1 = r3.timestamp
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            java.lang.String r1 = r3.type
            r0.append(r1)
            java.lang.String r1 = ", app="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r1 = r3.app
            r0.append(r1)
            java.lang.String r1 = ", device="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r1 = r3.device
            r0.append(r1)
            java.lang.String r1 = ", log="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r1 = r3.log
            r0.append(r1)
            java.lang.String r1 = ", rollouts="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r1 = r3.rollouts
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
