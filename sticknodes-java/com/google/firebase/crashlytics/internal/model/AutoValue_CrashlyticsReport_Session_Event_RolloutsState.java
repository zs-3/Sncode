package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState {
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder {
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState build() {
                r3 = this;
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment> r0 = r3.rolloutAssignments
                if (r0 == 0) goto Lb
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState r1 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState
                r2 = 0
                r1.<init>(r0, r2)
                return r1
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Missing required properties:"
                r1.append(r2)
                java.lang.String r2 = " rolloutAssignments"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> r2) {
                r1 = this;
                java.lang.String r0 = "Null rolloutAssignments"
                java.util.Objects.requireNonNull(r2, r0)
                r1.rolloutAssignments = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutsState(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> r1) {
            r0 = this;
            r0.<init>()
            r0.rolloutAssignments = r1
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_RolloutsState(java.util.List r1, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
            if (r0 == 0) goto L15
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r2 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState) r2
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment> r0 = r1.rolloutAssignments
            java.util.List r2 = r2.getRolloutAssignments()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments() {
            r1 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment> r0 = r1.rolloutAssignments
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment> r0 = r2.rolloutAssignments
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RolloutsState{rolloutAssignments="
            r0.append(r1)
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment> r1 = r2.rolloutAssignments
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
