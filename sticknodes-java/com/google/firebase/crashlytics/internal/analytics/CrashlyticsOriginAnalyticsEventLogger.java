package com.google.firebase.crashlytics.internal.analytics;

/* loaded from: classes2.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger {
    private final com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector;

    public CrashlyticsOriginAnalyticsEventLogger(com.google.firebase.analytics.connector.AnalyticsConnector r1) {
            r0 = this;
            r0.<init>()
            r0.analyticsConnector = r1
            return
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(java.lang.String r3, android.os.Bundle r4) {
            r2 = this;
            com.google.firebase.analytics.connector.AnalyticsConnector r0 = r2.analyticsConnector
            java.lang.String r1 = "clx"
            r0.logEvent(r1, r3, r4)
            return
    }
}
