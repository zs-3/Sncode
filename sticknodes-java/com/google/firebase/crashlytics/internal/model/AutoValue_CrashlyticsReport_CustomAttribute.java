package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute {
    private final java.lang.String key;
    private final java.lang.String value;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder {
        private java.lang.String key;
        private java.lang.String value;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute build() {
                r4 = this;
                java.lang.String r0 = r4.key
                if (r0 == 0) goto L10
                java.lang.String r1 = r4.value
                if (r1 != 0) goto L9
                goto L10
            L9:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute r2 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute
                r3 = 0
                r2.<init>(r0, r1, r3)
                return r2
            L10:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r4.key
                if (r1 != 0) goto L1e
                java.lang.String r1 = " key"
                r0.append(r1)
            L1e:
                java.lang.String r1 = r4.value
                if (r1 != 0) goto L27
                java.lang.String r1 = " value"
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setKey(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null key"
                java.util.Objects.requireNonNull(r2, r0)
                r1.key = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setValue(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null value"
                java.util.Objects.requireNonNull(r2, r0)
                r1.value = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_CustomAttribute(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.value = r2
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_CustomAttribute(java.lang.String r1, java.lang.String r2, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute.AnonymousClass1 r3) {
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
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
            r2 = 0
            if (r1 == 0) goto L26
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute) r5
            java.lang.String r1 = r4.key
            java.lang.String r3 = r5.getKey()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.lang.String r1 = r4.value
            java.lang.String r5 = r5.getValue()
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

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.key
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.value
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CustomAttribute{key="
            r0.append(r1)
            java.lang.String r1 = r2.key
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.String r1 = r2.value
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
