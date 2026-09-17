package com.google.firebase.crashlytics.internal.common;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class CrashlyticsReportWithSessionId {
    public CrashlyticsReportWithSessionId() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId create(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1, java.lang.String r2, java.io.File r3) {
            com.google.firebase.crashlytics.internal.common.AutoValue_CrashlyticsReportWithSessionId r0 = new com.google.firebase.crashlytics.internal.common.AutoValue_CrashlyticsReportWithSessionId
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport getReport();

    public abstract java.io.File getReportFile();

    public abstract java.lang.String getSessionId();
}
