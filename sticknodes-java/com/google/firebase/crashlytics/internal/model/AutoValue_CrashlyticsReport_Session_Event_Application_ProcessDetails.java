package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails {
    private final boolean defaultProcess;
    private final int importance;
    private final int pid;
    private final java.lang.String processName;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {
        private boolean defaultProcess;
        private int importance;
        private int pid;
        private java.lang.String processName;
        private byte set$0;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails build() {
                r8 = this;
                byte r0 = r8.set$0
                r1 = 7
                if (r0 != r1) goto L18
                java.lang.String r3 = r8.processName
                if (r3 != 0) goto La
                goto L18
            La:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails
                int r4 = r8.pid
                int r5 = r8.importance
                boolean r6 = r8.defaultProcess
                r7 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                return r0
            L18:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r8.processName
                if (r1 != 0) goto L26
                java.lang.String r1 = " processName"
                r0.append(r1)
            L26:
                byte r1 = r8.set$0
                r1 = r1 & 1
                if (r1 != 0) goto L31
                java.lang.String r1 = " pid"
                r0.append(r1)
            L31:
                byte r1 = r8.set$0
                r1 = r1 & 2
                if (r1 != 0) goto L3c
                java.lang.String r1 = " importance"
                r0.append(r1)
            L3c:
                byte r1 = r8.set$0
                r1 = r1 & 4
                if (r1 != 0) goto L47
                java.lang.String r1 = " defaultProcess"
                r0.append(r1)
            L47:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean r1) {
                r0 = this;
                r0.defaultProcess = r1
                byte r1 = r0.set$0
                r1 = r1 | 4
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int r1) {
                r0 = this;
                r0.importance = r1
                byte r1 = r0.set$0
                r1 = r1 | 2
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int r1) {
                r0 = this;
                r0.pid = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null processName"
                java.util.Objects.requireNonNull(r2, r0)
                r1.processName = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(java.lang.String r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.processName = r1
            r0.pid = r2
            r0.importance = r3
            r0.defaultProcess = r4
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(java.lang.String r1, int r2, int r3, boolean r4, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
            r2 = 0
            if (r1 == 0) goto L32
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails) r5
            java.lang.String r1 = r4.processName
            java.lang.String r3 = r5.getProcessName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            int r1 = r4.pid
            int r3 = r5.getPid()
            if (r1 != r3) goto L30
            int r1 = r4.importance
            int r3 = r5.getImportance()
            if (r1 != r3) goto L30
            boolean r1 = r4.defaultProcess
            boolean r5 = r5.isDefaultProcess()
            if (r1 != r5) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
        L32:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getImportance() {
            r1 = this;
            int r0 = r1.importance
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getPid() {
            r1 = this;
            int r0 = r1.pid
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public java.lang.String getProcessName() {
            r1 = this;
            java.lang.String r0 = r1.processName
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.processName
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.pid
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.importance
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r1 = r3.defaultProcess
            if (r1 == 0) goto L1d
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L1f
        L1d:
            r1 = 1237(0x4d5, float:1.733E-42)
        L1f:
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public boolean isDefaultProcess() {
            r1 = this;
            boolean r0 = r1.defaultProcess
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ProcessDetails{processName="
            r0.append(r1)
            java.lang.String r1 = r2.processName
            r0.append(r1)
            java.lang.String r1 = ", pid="
            r0.append(r1)
            int r1 = r2.pid
            r0.append(r1)
            java.lang.String r1 = ", importance="
            r0.append(r1)
            int r1 = r2.importance
            r0.append(r1)
            java.lang.String r1 = ", defaultProcess="
            r0.append(r1)
            boolean r1 = r2.defaultProcess
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
