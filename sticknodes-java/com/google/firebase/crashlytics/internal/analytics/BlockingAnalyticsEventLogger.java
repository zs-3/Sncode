package com.google.firebase.crashlytics.internal.analytics;

/* loaded from: classes2.dex */
public class BlockingAnalyticsEventLogger implements com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver, com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger {
    private final com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger baseAnalyticsEventLogger;
    private boolean callbackReceived;
    private java.util.concurrent.CountDownLatch eventLatch;
    private final java.lang.Object latchLock;
    private final java.util.concurrent.TimeUnit timeUnit;
    private final int timeout;

    public BlockingAnalyticsEventLogger(com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger r2, int r3, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.latchLock = r0
            r0 = 0
            r1.callbackReceived = r0
            r1.baseAnalyticsEventLogger = r2
            r1.timeout = r3
            r1.timeUnit = r4
            return
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(java.lang.String r6, android.os.Bundle r7) {
            r5 = this;
            java.lang.Object r0 = r5.latchLock
            monitor-enter(r0)
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r2.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6d
            r2.append(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6d
            r2.append(r7)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6d
            r1.v(r2)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L6d
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            r5.eventLatch = r1     // Catch: java.lang.Throwable -> L6d
            r1 = 0
            r5.callbackReceived = r1     // Catch: java.lang.Throwable -> L6d
            com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger r1 = r5.baseAnalyticsEventLogger     // Catch: java.lang.Throwable -> L6d
            r1.logEvent(r6, r7)     // Catch: java.lang.Throwable -> L6d
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.v(r7)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.CountDownLatch r6 = r5.eventLatch     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            int r7 = r5.timeout     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            long r3 = (long) r7     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            java.util.concurrent.TimeUnit r7 = r5.timeUnit     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            boolean r6 = r6.await(r3, r7)     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            if (r6 == 0) goto L55
            r5.callbackReceived = r2     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.v(r7)     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            goto L68
        L55:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.w(r7)     // Catch: java.lang.InterruptedException -> L5f java.lang.Throwable -> L6d
            goto L68
        L5f:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.e(r7)     // Catch: java.lang.Throwable -> L6d
        L68:
            r6 = 0
            r5.eventLatch = r6     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L6d:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r6
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            java.util.concurrent.CountDownLatch r3 = r1.eventLatch
            if (r3 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "_ae"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            r3.countDown()
        L10:
            return
    }
}
