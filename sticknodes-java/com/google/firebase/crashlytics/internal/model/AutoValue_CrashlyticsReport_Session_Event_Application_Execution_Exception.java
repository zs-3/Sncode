package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception causedBy;
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
    private final int overflowCount;
    private final java.lang.String reason;
    private final java.lang.String type;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception causedBy;
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
        private int overflowCount;
        private java.lang.String reason;
        private byte set$0;
        private java.lang.String type;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception build() {
                r9 = this;
                byte r0 = r9.set$0
                r1 = 1
                if (r0 != r1) goto L1c
                java.lang.String r3 = r9.type
                if (r3 == 0) goto L1c
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame> r5 = r9.frames
                if (r5 != 0) goto Le
                goto L1c
            Le:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception
                java.lang.String r4 = r9.reason
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r6 = r9.causedBy
                int r7 = r9.overflowCount
                r8 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r0
            L1c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = r9.type
                if (r2 != 0) goto L2a
                java.lang.String r2 = " type"
                r0.append(r2)
            L2a:
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame> r2 = r9.frames
                if (r2 != 0) goto L33
                java.lang.String r2 = " frames"
                r0.append(r2)
            L33:
                byte r2 = r9.set$0
                r1 = r1 & r2
                if (r1 != 0) goto L3d
                java.lang.String r1 = " overflowCount"
                r0.append(r1)
            L3d:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception r1) {
                r0 = this;
                r0.causedBy = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> r2) {
                r1 = this;
                java.lang.String r0 = "Null frames"
                java.util.Objects.requireNonNull(r2, r0)
                r1.frames = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int r1) {
                r0 = this;
                r0.overflowCount = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(java.lang.String r1) {
                r0 = this;
                r0.reason = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null type"
                java.util.Objects.requireNonNull(r2, r0)
                r1.type = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(java.lang.String r1, java.lang.String r2, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> r3, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.reason = r2
            r0.frames = r3
            r0.causedBy = r4
            r0.overflowCount = r5
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(java.lang.String r1, java.lang.String r2, java.util.List r3, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception r4, int r5, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.AnonymousClass1 r6) {
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
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
            r2 = 0
            if (r1 == 0) goto L58
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception) r5
            java.lang.String r1 = r4.type
            java.lang.String r3 = r5.getType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            java.lang.String r1 = r4.reason
            if (r1 != 0) goto L22
            java.lang.String r1 = r5.getReason()
            if (r1 != 0) goto L56
            goto L2c
        L22:
            java.lang.String r3 = r5.getReason()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
        L2c:
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame> r1 = r4.frames
            java.util.List r3 = r5.getFrames()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = r4.causedBy
            if (r1 != 0) goto L43
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = r5.getCausedBy()
            if (r1 != 0) goto L56
            goto L4d
        L43:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r3 = r5.getCausedBy()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
        L4d:
            int r1 = r4.overflowCount
            int r5 = r5.getOverflowCount()
            if (r1 != r5) goto L56
            goto L57
        L56:
            r0 = 0
        L57:
            return r0
        L58:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r0 = r1.causedBy
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
            r1 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame> r0 = r1.frames
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public int getOverflowCount() {
            r1 = this;
            int r0 = r1.overflowCount
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public java.lang.String getReason() {
            r1 = this;
            java.lang.String r0 = r1.reason
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.type
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r4.reason
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame> r2 = r4.frames
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r2 = r4.causedBy
            if (r2 != 0) goto L28
            goto L2c
        L28:
            int r3 = r2.hashCode()
        L2c:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            int r1 = r4.overflowCount
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception{type="
            r0.append(r1)
            java.lang.String r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r1 = r2.reason
            r0.append(r1)
            java.lang.String r1 = ", frames="
            r0.append(r1)
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame> r1 = r2.frames
            r0.append(r1)
            java.lang.String r1 = ", causedBy="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = r2.causedBy
            r0.append(r1)
            java.lang.String r1 = ", overflowCount="
            r0.append(r1)
            int r1 = r2.overflowCount
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
