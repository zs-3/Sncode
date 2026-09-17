package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReportWithSessionId extends com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport report;
    private final java.io.File reportFile;
    private final java.lang.String sessionId;

    AutoValue_CrashlyticsReportWithSessionId(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2, java.lang.String r3, java.io.File r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null report"
            java.util.Objects.requireNonNull(r2, r0)
            r1.report = r2
            java.lang.String r2 = "Null sessionId"
            java.util.Objects.requireNonNull(r3, r2)
            r1.sessionId = r3
            java.lang.String r2 = "Null reportFile"
            java.util.Objects.requireNonNull(r4, r2)
            r1.reportFile = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
            r2 = 0
            if (r1 == 0) goto L32
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r5 = (com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId) r5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1 = r4.report
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r3 = r5.getReport()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            java.lang.String r1 = r4.sessionId
            java.lang.String r3 = r5.getSessionId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            java.io.File r1 = r4.reportFile
            java.io.File r5 = r5.getReportFile()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
        L32:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport getReport() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r0 = r1.report
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public java.io.File getReportFile() {
            r1 = this;
            java.io.File r0 = r1.reportFile
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public java.lang.String getSessionId() {
            r1 = this;
            java.lang.String r0 = r1.sessionId
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r0 = r3.report
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.sessionId
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.io.File r1 = r3.reportFile
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CrashlyticsReportWithSessionId{report="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1 = r2.report
            r0.append(r1)
            java.lang.String r1 = ", sessionId="
            r0.append(r1)
            java.lang.String r1 = r2.sessionId
            r0.append(r1)
            java.lang.String r1 = ", reportFile="
            r0.append(r1)
            java.io.File r1 = r2.reportFile
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
