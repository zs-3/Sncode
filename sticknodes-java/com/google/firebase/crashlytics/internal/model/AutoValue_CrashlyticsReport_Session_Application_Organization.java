package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Application_Organization extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization {
    private final java.lang.String clsId;

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
            if (r0 == 0) goto L15
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r2 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization) r2
            java.lang.String r0 = r1.clsId
            java.lang.String r2 = r2.getClsId()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public java.lang.String getClsId() {
            r1 = this;
            java.lang.String r0 = r1.clsId
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.clsId
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Organization{clsId="
            r0.append(r1)
            java.lang.String r1 = r2.clsId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
