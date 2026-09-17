package com.google.firebase.crashlytics;

/* loaded from: classes2.dex */
class CrashlyticsAnalyticsListener implements com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener {
    private com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver breadcrumbEventReceiver;
    private com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver crashlyticsOriginEventReceiver;

    CrashlyticsAnalyticsListener() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void notifyEventReceiver(com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver r0, java.lang.String r1, android.os.Bundle r2) {
            if (r0 != 0) goto L3
            return
        L3:
            UX.aTqO5.a()
            return
    }

    private void notifyEventReceivers(java.lang.String r3, android.os.Bundle r4) {
            r2 = this;
            java.lang.String r0 = "_o"
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r1 = "clx"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver r0 = r2.crashlyticsOriginEventReceiver
            goto L13
        L11:
            com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver r0 = r2.breadcrumbEventReceiver
        L13:
            notifyEventReceiver(r0, r3, r4)
            return
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int r5, android.os.Bundle r6) {
            r4 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.String r5 = "Analytics listener received message. ID: %d, Extras: %s"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.v(r5)
            if (r6 != 0) goto L1f
            return
        L1f:
            java.lang.String r5 = "name"
            java.lang.String r5 = r6.getString(r5)
            if (r5 == 0) goto L37
            java.lang.String r0 = "params"
            android.os.Bundle r6 = r6.getBundle(r0)
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L34:
            r4.notifyEventReceivers(r5, r6)
        L37:
            return
    }

    public void setBreadcrumbEventReceiver(com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver r1) {
            r0 = this;
            r0.breadcrumbEventReceiver = r1
            return
    }

    public void setCrashlyticsOriginEventReceiver(com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver r1) {
            r0 = this;
            r0.crashlyticsOriginEventReceiver = r1
            return
    }
}
