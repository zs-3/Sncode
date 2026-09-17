package com.google.firebase.crashlytics.internal.send;

/* loaded from: classes2.dex */
final class ReportQueue {
    private final double base;
    private long lastUpdatedMs;
    private final com.google.firebase.crashlytics.internal.common.OnDemandCounter onDemandCounter;
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final java.util.concurrent.ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final com.google.android.datatransport.Transport<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> transport;

    /* renamed from: com.google.firebase.crashlytics.internal.send.ReportQueue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private final class ReportRunnable implements java.lang.Runnable {
        private final com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId reportWithSessionId;
        private final com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> tcs;
        final /* synthetic */ com.google.firebase.crashlytics.internal.send.ReportQueue this$0;

        private ReportRunnable(com.google.firebase.crashlytics.internal.send.ReportQueue r1, com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r2, com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.reportWithSessionId = r2
                r0.tcs = r3
                return
        }

        /* synthetic */ ReportRunnable(com.google.firebase.crashlytics.internal.send.ReportQueue r1, com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r2, com.google.android.gms.tasks.TaskCompletionSource r3, com.google.firebase.crashlytics.internal.send.ReportQueue.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                com.google.firebase.crashlytics.internal.send.ReportQueue r0 = r8.this$0
                com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r1 = r8.reportWithSessionId
                com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> r2 = r8.tcs
                com.google.firebase.crashlytics.internal.send.ReportQueue.access$100(r0, r1, r2)
                com.google.firebase.crashlytics.internal.send.ReportQueue r0 = r8.this$0
                com.google.firebase.crashlytics.internal.common.OnDemandCounter r0 = com.google.firebase.crashlytics.internal.send.ReportQueue.access$200(r0)
                r0.resetDroppedOnDemandExceptions()
                com.google.firebase.crashlytics.internal.send.ReportQueue r0 = r8.this$0
                double r0 = com.google.firebase.crashlytics.internal.send.ReportQueue.access$300(r0)
                com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Delay for: "
                r3.append(r4)
                java.util.Locale r4 = java.util.Locale.US
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r6 = r0 / r6
                java.lang.Double r6 = java.lang.Double.valueOf(r6)
                r7 = 0
                r5[r7] = r6
                java.lang.String r6 = "%.2f"
                java.lang.String r4 = java.lang.String.format(r4, r6, r5)
                r3.append(r4)
                java.lang.String r4 = " s for report: "
                r3.append(r4)
                com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r4 = r8.reportWithSessionId
                java.lang.String r4 = r4.getSessionId()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.d(r3)
                com.google.firebase.crashlytics.internal.send.ReportQueue.access$400(r0)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$Wg2iJeraaj6PNC7KhM5Os0Gridk(com.google.firebase.crashlytics.internal.send.ReportQueue r0, com.google.android.gms.tasks.TaskCompletionSource r1, boolean r2, com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r3, java.lang.Exception r4) {
            r0.lambda$sendReport$1(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$sGV6aXF5ijJp8gd8P34G6CFd3nk(com.google.firebase.crashlytics.internal.send.ReportQueue r0, java.util.concurrent.CountDownLatch r1) {
            r0.lambda$flushScheduledReportsIfAble$0(r1)
            return
    }

    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    ReportQueue(double r1, double r3, long r5, com.google.android.datatransport.Transport<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> r7, com.google.firebase.crashlytics.internal.common.OnDemandCounter r8) {
            r0 = this;
            r0.<init>()
            r0.ratePerMinute = r1
            r0.base = r3
            r0.stepDurationMs = r5
            r0.transport = r7
            r0.onDemandCounter = r8
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.startTimeMs = r3
            int r1 = (int) r1
            r0.queueCapacity = r1
            java.util.concurrent.ArrayBlockingQueue r8 = new java.util.concurrent.ArrayBlockingQueue
            r8.<init>(r1)
            r0.queue = r8
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3 = 1
            r4 = 1
            r5 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r7, r8)
            r0.singleThreadExecutor = r1
            r1 = 0
            r0.step = r1
            r1 = 0
            r0.lastUpdatedMs = r1
            return
    }

    ReportQueue(com.google.android.datatransport.Transport<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> r10, com.google.firebase.crashlytics.internal.settings.Settings r11, com.google.firebase.crashlytics.internal.common.OnDemandCounter r12) {
            r9 = this;
            double r1 = r11.onDemandUploadRatePerMinute
            double r3 = r11.onDemandBackoffBase
            int r11 = r11.onDemandBackoffStepDurationSeconds
            long r5 = (long) r11
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r0 = r9
            r7 = r10
            r8 = r12
            r0.<init>(r1, r3, r5, r7, r8)
            return
    }

    static /* synthetic */ void access$100(com.google.firebase.crashlytics.internal.send.ReportQueue r0, com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0.sendReport(r1, r2)
            return
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.common.OnDemandCounter access$200(com.google.firebase.crashlytics.internal.send.ReportQueue r0) {
            com.google.firebase.crashlytics.internal.common.OnDemandCounter r0 = r0.onDemandCounter
            return r0
    }

    static /* synthetic */ double access$300(com.google.firebase.crashlytics.internal.send.ReportQueue r2) {
            double r0 = r2.calcDelay()
            return r0
    }

    static /* synthetic */ void access$400(double r0) {
            sleep(r0)
            return
    }

    private double calcDelay() {
            r6 = this;
            double r0 = r6.ratePerMinute
            r2 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            double r2 = r2 / r0
            double r0 = r6.base
            int r4 = r6.calcStep()
            double r4 = (double) r4
            double r0 = java.lang.Math.pow(r0, r4)
            double r2 = r2 * r0
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    private int calcStep() {
            r5 = this;
            long r0 = r5.lastUpdatedMs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r0 = r5.now()
            r5.lastUpdatedMs = r0
        Le:
            long r0 = r5.now()
            long r2 = r5.lastUpdatedMs
            long r0 = r0 - r2
            long r2 = r5.stepDurationMs
            long r0 = r0 / r2
            int r1 = (int) r0
            boolean r0 = r5.isQueueFull()
            if (r0 == 0) goto L29
            r0 = 100
            int r2 = r5.step
            int r2 = r2 + r1
            int r0 = java.lang.Math.min(r0, r2)
            goto L31
        L29:
            r0 = 0
            int r2 = r5.step
            int r2 = r2 - r1
            int r0 = java.lang.Math.max(r0, r2)
        L31:
            int r1 = r5.step
            if (r1 == r0) goto L3d
            r5.step = r0
            long r1 = r5.now()
            r5.lastUpdatedMs = r1
        L3d:
            return r0
    }

    private boolean isQueueAvailable() {
            r2 = this;
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r2.queue
            int r0 = r0.size()
            int r1 = r2.queueCapacity
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean isQueueFull() {
            r2 = this;
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r2.queue
            int r0 = r0.size()
            int r1 = r2.queueCapacity
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private /* synthetic */ void lambda$flushScheduledReportsIfAble$0(java.util.concurrent.CountDownLatch r3) {
            r2 = this;
            com.google.android.datatransport.Transport<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> r0 = r2.transport     // Catch: java.lang.Exception -> L7
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.HIGHEST     // Catch: java.lang.Exception -> L7
            com.google.android.datatransport.runtime.ForcedSender.sendBlocking(r0, r1)     // Catch: java.lang.Exception -> L7
        L7:
            r3.countDown()
            return
    }

    private /* synthetic */ void lambda$sendReport$1(com.google.android.gms.tasks.TaskCompletionSource r1, boolean r2, com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r3, java.lang.Exception r4) {
            r0 = this;
            if (r4 == 0) goto L6
            r1.trySetException(r4)
            return
        L6:
            if (r2 == 0) goto Lb
            r0.flushScheduledReportsIfAble()
        Lb:
            r1.trySetResult(r3)
            return
    }

    private long now() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    private void sendReport(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r6, com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> r7) {
            r5 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Sending report through Google DataTransport: "
            r1.append(r2)
            java.lang.String r2 = r6.getSessionId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.startTimeMs
            long r0 = r0 - r2
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            com.google.android.datatransport.Transport<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> r1 = r5.transport
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2 = r6.getReport()
            com.google.android.datatransport.Event r2 = com.google.android.datatransport.Event.ofUrgent(r2)
            com.google.firebase.crashlytics.internal.send.ReportQueue$$ExternalSyntheticLambda0 r3 = new com.google.firebase.crashlytics.internal.send.ReportQueue$$ExternalSyntheticLambda0
            r3.<init>(r5, r7, r0, r6)
            r1.schedule(r2, r3)
            return
    }

    private static void sleep(double r0) {
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L4
        L4:
            return
    }

    com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> enqueueReport(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r5, boolean r6) {
            r4 = this;
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r4.queue
            monitor-enter(r0)
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch: java.lang.Throwable -> La9
            r1.<init>()     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto La4
            com.google.firebase.crashlytics.internal.common.OnDemandCounter r6 = r4.onDemandCounter     // Catch: java.lang.Throwable -> La9
            r6.incrementRecordedOnDemandExceptions()     // Catch: java.lang.Throwable -> La9
            boolean r6 = r4.isQueueAvailable()     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto L7b
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r2.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = "Enqueueing report: "
            r2.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r5.getSessionId()     // Catch: java.lang.Throwable -> La9
            r2.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La9
            r6.d(r2)     // Catch: java.lang.Throwable -> La9
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r2.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = "Queue size: "
            r2.append(r3)     // Catch: java.lang.Throwable -> La9
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r3 = r4.queue     // Catch: java.lang.Throwable -> La9
            int r3 = r3.size()     // Catch: java.lang.Throwable -> La9
            r2.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La9
            r6.d(r2)     // Catch: java.lang.Throwable -> La9
            java.util.concurrent.ThreadPoolExecutor r6 = r4.singleThreadExecutor     // Catch: java.lang.Throwable -> La9
            com.google.firebase.crashlytics.internal.send.ReportQueue$ReportRunnable r2 = new com.google.firebase.crashlytics.internal.send.ReportQueue$ReportRunnable     // Catch: java.lang.Throwable -> La9
            r3 = 0
            r2.<init>(r4, r5, r1, r3)     // Catch: java.lang.Throwable -> La9
            r6.execute(r2)     // Catch: java.lang.Throwable -> La9
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r2.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = "Closing task for report: "
            r2.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r5.getSessionId()     // Catch: java.lang.Throwable -> La9
            r2.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La9
            r6.d(r2)     // Catch: java.lang.Throwable -> La9
            r1.trySetResult(r5)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            return r1
        L7b:
            r4.calcStep()     // Catch: java.lang.Throwable -> La9
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r2.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = "Dropping report due to queue being full: "
            r2.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r5.getSessionId()     // Catch: java.lang.Throwable -> La9
            r2.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La9
            r6.d(r2)     // Catch: java.lang.Throwable -> La9
            com.google.firebase.crashlytics.internal.common.OnDemandCounter r6 = r4.onDemandCounter     // Catch: java.lang.Throwable -> La9
            r6.incrementDroppedOnDemandExceptions()     // Catch: java.lang.Throwable -> La9
            r1.trySetResult(r5)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            return r1
        La4:
            r4.sendReport(r5, r1)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            return r1
        La9:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            throw r5
    }

    @android.annotation.SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void flushScheduledReportsIfAble() {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Thread r1 = new java.lang.Thread
            com.google.firebase.crashlytics.internal.send.ReportQueue$$ExternalSyntheticLambda1 r2 = new com.google.firebase.crashlytics.internal.send.ReportQueue$$ExternalSyntheticLambda1
            r2.<init>(r4, r0)
            r1.<init>(r2)
            r1.start()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 2
            com.google.firebase.crashlytics.internal.common.Utils.awaitUninterruptibly(r0, r2, r1)
            return
    }
}
