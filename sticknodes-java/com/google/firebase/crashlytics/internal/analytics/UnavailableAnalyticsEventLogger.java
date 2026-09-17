package com.google.firebase.crashlytics.internal.analytics;

/* loaded from: classes2.dex */
public class UnavailableAnalyticsEventLogger implements com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger {
    public UnavailableAnalyticsEventLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Skipping logging Crashlytics event to Firebase, no Firebase Analytics"
            r1.d(r2)
            return
    }
}
