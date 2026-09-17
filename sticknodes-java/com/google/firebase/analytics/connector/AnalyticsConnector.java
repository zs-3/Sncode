package com.google.firebase.analytics.connector;

/* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
/* loaded from: classes2.dex */
public interface AnalyticsConnector {

    /* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface AnalyticsConnectorHandle {
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface AnalyticsConnectorListener {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onMessageTriggered(int r1, android.os.Bundle r2);
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    void logEvent(java.lang.String r1, java.lang.String r2, android.os.Bundle r3);

    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(java.lang.String r1, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener r2);
}
