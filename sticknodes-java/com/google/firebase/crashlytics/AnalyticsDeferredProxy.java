package com.google.firebase.crashlytics;

/* loaded from: classes2.dex */
public class AnalyticsDeferredProxy {
    private final com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> analyticsConnectorDeferred;
    private volatile com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger;
    private final java.util.List<com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler> breadcrumbHandlerList;
    private volatile com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource breadcrumbSource;

    /* renamed from: $r8$lambda$La2k-FPhuF7YvsGTThH2cGQQb48, reason: not valid java name */
    public static /* synthetic */ void m48$r8$lambda$La2kFPhuF7YvsGTThH2cGQQb48(com.google.firebase.crashlytics.AnalyticsDeferredProxy r0, com.google.firebase.inject.Provider r1) {
            r0.lambda$init$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$coUGc_ajgUQ0irmwlH5XF0vy_0g(com.google.firebase.crashlytics.AnalyticsDeferredProxy r0, java.lang.String r1, android.os.Bundle r2) {
            r0.lambda$getAnalyticsEventLogger$1(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$r6YOZKphPGa7evPx_bIfwycOmMM(com.google.firebase.crashlytics.AnalyticsDeferredProxy r0, com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler r1) {
            r0.lambda$getDeferredBreadcrumbSource$0(r1)
            return
    }

    public AnalyticsDeferredProxy(com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource r0 = new com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource
            r0.<init>()
            com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger r1 = new com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger
            r1.<init>()
            r2.<init>(r3, r0, r1)
            return
    }

    public AnalyticsDeferredProxy(com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> r1, com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource r2, com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger r3) {
            r0 = this;
            r0.<init>()
            r0.analyticsConnectorDeferred = r1
            r0.breadcrumbSource = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.breadcrumbHandlerList = r1
            r0.analyticsEventLogger = r3
            r0.init()
            return
    }

    private void init() {
            r2 = this;
            com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> r0 = r2.analyticsConnectorDeferred
            com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda2 r1 = new com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda2
            r1.<init>(r2)
            r0.whenAvailable(r1)
            return
    }

    private /* synthetic */ void lambda$getAnalyticsEventLogger$1(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger r0 = r1.analyticsEventLogger
            r0.logEvent(r2, r3)
            return
    }

    private /* synthetic */ void lambda$getDeferredBreadcrumbSource$0(com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource r0 = r1.breadcrumbSource     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0 instanceof com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lc
            java.util.List<com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler> r0 = r1.breadcrumbHandlerList     // Catch: java.lang.Throwable -> L13
            r0.add(r2)     // Catch: java.lang.Throwable -> L13
        Lc:
            com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource r0 = r1.breadcrumbSource     // Catch: java.lang.Throwable -> L13
            r0.registerBreadcrumbHandler(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    private /* synthetic */ void lambda$init$2(com.google.firebase.inject.Provider r6) {
            r5 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "AnalyticsConnector now available."
            r0.d(r1)
            java.lang.Object r6 = r6.get()
            com.google.firebase.analytics.connector.AnalyticsConnector r6 = (com.google.firebase.analytics.connector.AnalyticsConnector) r6
            com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger r0 = new com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger
            r0.<init>(r6)
            com.google.firebase.crashlytics.CrashlyticsAnalyticsListener r1 = new com.google.firebase.crashlytics.CrashlyticsAnalyticsListener
            r1.<init>()
            com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle r6 = subscribeToAnalyticsEvents(r6, r1)
            if (r6 == 0) goto L5c
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Registered Firebase Analytics listener."
            r6.d(r2)
            com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver r6 = new com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver
            r6.<init>()
            com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger r2 = new com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger
            r3 = 500(0x1f4, float:7.0E-43)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.<init>(r0, r3, r4)
            monitor-enter(r5)
            java.util.List<com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler> r0 = r5.breadcrumbHandlerList     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L59
        L3d:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L59
            com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler r3 = (com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler) r3     // Catch: java.lang.Throwable -> L59
            r6.registerBreadcrumbHandler(r3)     // Catch: java.lang.Throwable -> L59
            goto L3d
        L4d:
            r1.setBreadcrumbEventReceiver(r6)     // Catch: java.lang.Throwable -> L59
            r1.setCrashlyticsOriginEventReceiver(r2)     // Catch: java.lang.Throwable -> L59
            r5.breadcrumbSource = r6     // Catch: java.lang.Throwable -> L59
            r5.analyticsEventLogger = r2     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            goto L65
        L59:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            throw r6
        L5c:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Could not register Firebase Analytics listener; a listener is already registered."
            r6.w(r0)
        L65:
            return
    }

    private static com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle subscribeToAnalyticsEvents(com.google.firebase.analytics.connector.AnalyticsConnector r2, com.google.firebase.crashlytics.CrashlyticsAnalyticsListener r3) {
            java.lang.String r0 = "clx"
            com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle r0 = r2.registerAnalyticsConnectorListener(r0, r3)
            if (r0 != 0) goto L22
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Could not register AnalyticsConnectorListener with Crashlytics origin."
            r0.d(r1)
            java.lang.String r0 = "crash"
            com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle r0 = r2.registerAnalyticsConnectorListener(r0, r3)
            if (r0 == 0) goto L22
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."
            r2.w(r3)
        L22:
            return r0
    }

    public com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger getAnalyticsEventLogger() {
            r1 = this;
            com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda0 r0 = new com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    public com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource getDeferredBreadcrumbSource() {
            r1 = this;
            com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda1 r0 = new com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda1
            r0.<init>(r1)
            return r0
    }
}
