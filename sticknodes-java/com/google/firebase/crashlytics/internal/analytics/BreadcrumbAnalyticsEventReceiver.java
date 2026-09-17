package com.google.firebase.crashlytics.internal.analytics;

/* loaded from: classes2.dex */
public class BreadcrumbAnalyticsEventReceiver implements com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver, com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource {
    private com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler breadcrumbHandler;

    public BreadcrumbAnalyticsEventReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String serializeEvent(java.lang.String r5, android.os.Bundle r6) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.Set r2 = r6.keySet()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.get(r3)
            r1.put(r3, r4)
            goto L12
        L26:
            java.lang.String r6 = "name"
            r0.put(r6, r5)
            java.lang.String r5 = "parameters"
            r0.put(r5, r1)
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(java.lang.String r4, android.os.Bundle r5) {
            r3 = this;
            com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler r0 = r3.breadcrumbHandler
            if (r0 == 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L1d
            r1.<init>()     // Catch: org.json.JSONException -> L1d
            java.lang.String r2 = "$A$:"
            r1.append(r2)     // Catch: org.json.JSONException -> L1d
            java.lang.String r4 = serializeEvent(r4, r5)     // Catch: org.json.JSONException -> L1d
            r1.append(r4)     // Catch: org.json.JSONException -> L1d
            java.lang.String r4 = r1.toString()     // Catch: org.json.JSONException -> L1d
            r0.handleBreadcrumb(r4)     // Catch: org.json.JSONException -> L1d
            goto L26
        L1d:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r5 = "Unable to serialize Firebase Analytics event to breadcrumb."
            r4.w(r5)
        L26:
            return
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler r2) {
            r1 = this;
            r1.breadcrumbHandler = r2
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Registered Firebase Analytics event receiver for breadcrumbs"
            r2.d(r0)
            return
    }
}
