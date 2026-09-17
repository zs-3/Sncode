package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
final class AutoValue_RolloutAssignment extends com.google.firebase.crashlytics.internal.metadata.RolloutAssignment {
    private final java.lang.String parameterKey;
    private final java.lang.String parameterValue;
    private final java.lang.String rolloutId;
    private final long templateVersion;
    private final java.lang.String variantId;

    AutoValue_RolloutAssignment(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null rolloutId"
            java.util.Objects.requireNonNull(r2, r0)
            r1.rolloutId = r2
            java.lang.String r2 = "Null parameterKey"
            java.util.Objects.requireNonNull(r3, r2)
            r1.parameterKey = r3
            java.lang.String r2 = "Null parameterValue"
            java.util.Objects.requireNonNull(r4, r2)
            r1.parameterValue = r4
            java.lang.String r2 = "Null variantId"
            java.util.Objects.requireNonNull(r5, r2)
            r1.variantId = r5
            r1.templateVersion = r6
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
            r2 = 0
            if (r1 == 0) goto L48
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignment r8 = (com.google.firebase.crashlytics.internal.metadata.RolloutAssignment) r8
            java.lang.String r1 = r7.rolloutId
            java.lang.String r3 = r8.getRolloutId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L46
            java.lang.String r1 = r7.parameterKey
            java.lang.String r3 = r8.getParameterKey()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L46
            java.lang.String r1 = r7.parameterValue
            java.lang.String r3 = r8.getParameterValue()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L46
            java.lang.String r1 = r7.variantId
            java.lang.String r3 = r8.getVariantId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L46
            long r3 = r7.templateVersion
            long r5 = r8.getTemplateVersion()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L46
            goto L47
        L46:
            r0 = 0
        L47:
            return r0
        L48:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public java.lang.String getParameterKey() {
            r1 = this;
            java.lang.String r0 = r1.parameterKey
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public java.lang.String getParameterValue() {
            r1 = this;
            java.lang.String r0 = r1.parameterValue
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public java.lang.String getRolloutId() {
            r1 = this;
            java.lang.String r0 = r1.rolloutId
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long getTemplateVersion() {
            r2 = this;
            long r0 = r2.templateVersion
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public java.lang.String getVariantId() {
            r1 = this;
            java.lang.String r0 = r1.variantId
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.rolloutId
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
            java.lang.String r2 = r5.variantId
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
            java.lang.String r1 = "RolloutAssignment{rolloutId="
            r0.append(r1)
            java.lang.String r1 = r3.rolloutId
            r0.append(r1)
            java.lang.String r1 = ", parameterKey="
            r0.append(r1)
            java.lang.String r1 = r3.parameterKey
            r0.append(r1)
            java.lang.String r1 = ", parameterValue="
            r0.append(r1)
            java.lang.String r1 = r3.parameterValue
            r0.append(r1)
            java.lang.String r1 = ", variantId="
            r0.append(r1)
            java.lang.String r1 = r3.variantId
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
