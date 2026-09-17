package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {
    private final java.lang.String rolloutId;
    private final java.lang.String variantId;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {
        private java.lang.String rolloutId;
        private java.lang.String variantId;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
                r4 = this;
                java.lang.String r0 = r4.rolloutId
                if (r0 == 0) goto L10
                java.lang.String r1 = r4.variantId
                if (r1 != 0) goto L9
                goto L10
            L9:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant r2 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant
                r3 = 0
                r2.<init>(r0, r1, r3)
                return r2
            L10:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r4.rolloutId
                if (r1 != 0) goto L1e
                java.lang.String r1 = " rolloutId"
                r0.append(r1)
            L1e:
                java.lang.String r1 = r4.variantId
                if (r1 != 0) goto L27
                java.lang.String r1 = " variantId"
                r0.append(r1)
            L27:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null rolloutId"
                java.util.Objects.requireNonNull(r2, r0)
                r1.rolloutId = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null variantId"
                java.util.Objects.requireNonNull(r2, r0)
                r1.variantId = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.rolloutId = r1
            r0.variantId = r2
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(java.lang.String r1, java.lang.String r2, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
            r2 = 0
            if (r1 == 0) goto L26
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) r5
            java.lang.String r1 = r4.rolloutId
            java.lang.String r3 = r5.getRolloutId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.lang.String r1 = r4.variantId
            java.lang.String r5 = r5.getVariantId()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    public java.lang.String getRolloutId() {
            r1 = this;
            java.lang.String r0 = r1.rolloutId
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    public java.lang.String getVariantId() {
            r1 = this;
            java.lang.String r0 = r1.variantId
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.rolloutId
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.variantId
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RolloutVariant{rolloutId="
            r0.append(r1)
            java.lang.String r1 = r2.rolloutId
            r0.append(r1)
            java.lang.String r1 = ", variantId="
            r0.append(r1)
            java.lang.String r1 = r2.variantId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
