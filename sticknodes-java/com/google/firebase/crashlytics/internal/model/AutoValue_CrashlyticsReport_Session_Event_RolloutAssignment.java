package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment {
    private final java.lang.String parameterKey;
    private final java.lang.String parameterValue;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
    private final long templateVersion;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder {
        private java.lang.String parameterKey;
        private java.lang.String parameterValue;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
        private byte set$0;
        private long templateVersion;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment build() {
                r9 = this;
                byte r0 = r9.set$0
                r1 = 1
                if (r0 != r1) goto L1c
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r3 = r9.rolloutVariant
                if (r3 == 0) goto L1c
                java.lang.String r4 = r9.parameterKey
                if (r4 == 0) goto L1c
                java.lang.String r5 = r9.parameterValue
                if (r5 != 0) goto L12
                goto L1c
            L12:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment
                long r6 = r9.templateVersion
                r8 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r8)
                return r0
            L1c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r2 = r9.rolloutVariant
                if (r2 != 0) goto L2a
                java.lang.String r2 = " rolloutVariant"
                r0.append(r2)
            L2a:
                java.lang.String r2 = r9.parameterKey
                if (r2 != 0) goto L33
                java.lang.String r2 = " parameterKey"
                r0.append(r2)
            L33:
                java.lang.String r2 = r9.parameterValue
                if (r2 != 0) goto L3c
                java.lang.String r2 = " parameterValue"
                r0.append(r2)
            L3c:
                byte r2 = r9.set$0
                r1 = r1 & r2
                if (r1 != 0) goto L46
                java.lang.String r1 = " templateVersion"
                r0.append(r1)
            L46:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null parameterKey"
                java.util.Objects.requireNonNull(r2, r0)
                r1.parameterKey = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null parameterValue"
                java.util.Objects.requireNonNull(r2, r0)
                r1.parameterValue = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant r2) {
                r1 = this;
                java.lang.String r0 = "Null rolloutVariant"
                java.util.Objects.requireNonNull(r2, r0)
                r1.rolloutVariant = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long r1) {
                r0 = this;
                r0.templateVersion = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.rolloutVariant = r1
            r0.parameterKey = r2
            r0.parameterValue = r3
            r0.templateVersion = r4
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant r1, java.lang.String r2, java.lang.String r3, long r4, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
            r2 = 0
            if (r1 == 0) goto L3c
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment) r8
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r1 = r7.rolloutVariant
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r3 = r8.getRolloutVariant()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            java.lang.String r1 = r7.parameterKey
            java.lang.String r3 = r8.getParameterKey()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            java.lang.String r1 = r7.parameterValue
            java.lang.String r3 = r8.getParameterValue()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            long r3 = r7.templateVersion
            long r5 = r8.getTemplateVersion()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
        L3c:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public java.lang.String getParameterKey() {
            r1 = this;
            java.lang.String r0 = r1.parameterKey
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public java.lang.String getParameterValue() {
            r1 = this;
            java.lang.String r0 = r1.parameterValue
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r0 = r1.rolloutVariant
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public long getTemplateVersion() {
            r2 = this;
            long r0 = r2.templateVersion
            return r0
    }

    public int hashCode() {
            r5 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r0 = r5.rolloutVariant
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r5.parameterKey
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r5.parameterValue
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r1 = r5.templateVersion
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RolloutAssignment{rolloutVariant="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r1 = r3.rolloutVariant
            r0.append(r1)
            java.lang.String r1 = ", parameterKey="
            r0.append(r1)
            java.lang.String r1 = r3.parameterKey
            r0.append(r1)
            java.lang.String r1 = ", parameterValue="
            r0.append(r1)
            java.lang.String r1 = r3.parameterValue
            r0.append(r1)
            java.lang.String r1 = ", templateVersion="
            r0.append(r1)
            long r1 = r3.templateVersion
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
