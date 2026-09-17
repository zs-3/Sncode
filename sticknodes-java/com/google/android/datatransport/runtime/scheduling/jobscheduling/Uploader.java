package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
public class Uploader {
    private static final java.lang.String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
    private static final java.lang.String LOG_TAG = "Uploader";
    private final com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry;
    private final com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore clientHealthMetricsStore;
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.time.Clock uptimeClock;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler;

    public static /* synthetic */ void $r8$lambda$DXUaNZ7S78mHsDrcqc_9ECz1Ymg(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, com.google.android.datatransport.runtime.TransportContext r1, int r2, java.lang.Runnable r3) {
            r0.lambda$upload$1(r1, r2, r3)
            return
    }

    /* renamed from: $r8$lambda$H09k0NyVJ8nyzTbBch5HKLFo-RI, reason: not valid java name */
    public static /* synthetic */ java.lang.Boolean m21$r8$lambda$H09k0NyVJ8nyzTbBch5HKLFoRI(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, com.google.android.datatransport.runtime.TransportContext r1) {
            java.lang.Boolean r0 = r0.lambda$logAndUpdateState$2(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$QyGlpZyKXzF9C8IVSfWhdLJUpfE(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, java.util.Map r1) {
            java.lang.Object r0 = r0.lambda$logAndUpdateState$7(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Iterable $r8$lambda$WlL8ZL_7Ts4FrW7MJOx0CJZv3Es(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, com.google.android.datatransport.runtime.TransportContext r1) {
            java.lang.Iterable r0 = r0.lambda$logAndUpdateState$3(r1)
            return r0
    }

    /* renamed from: $r8$lambda$kh6WMyPap03iYRJ0qy-X3ogOyXs, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m22$r8$lambda$kh6WMyPap03iYRJ0qyX3ogOyXs(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, java.lang.Iterable r1, com.google.android.datatransport.runtime.TransportContext r2, long r3) {
            java.lang.Object r0 = r0.lambda$logAndUpdateState$4(r1, r2, r3)
            return r0
    }

    /* renamed from: $r8$lambda$naA8n6abF76C-yjjp7gSihR9wMA, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m23$r8$lambda$naA8n6abF76Cyjjp7gSihR9wMA(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, com.google.android.datatransport.runtime.TransportContext r1, long r2) {
            java.lang.Object r0 = r0.lambda$logAndUpdateState$8(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$sE0URA4dL1HoYpRkW5kh5p1DD4Y(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, java.lang.Iterable r1) {
            java.lang.Object r0 = r0.lambda$logAndUpdateState$5(r1)
            return r0
    }

    /* renamed from: $r8$lambda$sr3vPq_E-juy6AzUzRSaApsvUdw, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m24$r8$lambda$sr3vPq_Ejuy6AzUzRSaApsvUdw(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, com.google.android.datatransport.runtime.TransportContext r1, int r2) {
            java.lang.Object r0 = r0.lambda$upload$0(r1, r2)
            return r0
    }

    /* renamed from: $r8$lambda$yYtoC3FEHPt4Rs-Djjb23Z8Ni7w, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m25$r8$lambda$yYtoC3FEHPt4RsDjjb23Z8Ni7w(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0) {
            java.lang.Object r0 = r0.lambda$logAndUpdateState$6()
            return r0
    }

    public Uploader(android.content.Context r1, com.google.android.datatransport.runtime.backends.BackendRegistry r2, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r3, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r4, java.util.concurrent.Executor r5, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r6, @com.google.android.datatransport.runtime.time.WallTime com.google.android.datatransport.runtime.time.Clock r7, @com.google.android.datatransport.runtime.time.Monotonic com.google.android.datatransport.runtime.time.Clock r8, com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore r9) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.backendRegistry = r2
            r0.eventStore = r3
            r0.workScheduler = r4
            r0.executor = r5
            r0.guard = r6
            r0.clock = r7
            r0.uptimeClock = r8
            r0.clientHealthMetricsStore = r9
            return
    }

    private /* synthetic */ java.lang.Boolean lambda$logAndUpdateState$2(com.google.android.datatransport.runtime.TransportContext r2) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r1.eventStore
            boolean r2 = r0.hasPendingEventsFor(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    private /* synthetic */ java.lang.Iterable lambda$logAndUpdateState$3(com.google.android.datatransport.runtime.TransportContext r2) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r1.eventStore
            java.lang.Iterable r2 = r0.loadBatch(r2)
            return r2
    }

    private /* synthetic */ java.lang.Object lambda$logAndUpdateState$4(java.lang.Iterable r3, com.google.android.datatransport.runtime.TransportContext r4, long r5) {
            r2 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r2.eventStore
            r0.recordFailure(r3)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r3 = r2.eventStore
            com.google.android.datatransport.runtime.time.Clock r0 = r2.clock
            long r0 = r0.getTime()
            long r0 = r0 + r5
            r3.recordNextCallTime(r4, r0)
            r3 = 0
            return r3
    }

    private /* synthetic */ java.lang.Object lambda$logAndUpdateState$5(java.lang.Iterable r2) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r1.eventStore
            r0.recordSuccess(r2)
            r2 = 0
            return r2
    }

    private /* synthetic */ java.lang.Object lambda$logAndUpdateState$6() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore r0 = r1.clientHealthMetricsStore
            r0.resetClientMetrics()
            r0 = 0
            return r0
    }

    private /* synthetic */ java.lang.Object lambda$logAndUpdateState$7(java.util.Map r6) {
            r5 = this;
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore r1 = r5.clientHealthMetricsStore
            java.lang.Object r2 = r0.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r4 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.INVALID_PAYLOD
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1.recordLogEventDropped(r2, r4, r0)
            goto L8
        L2d:
            r6 = 0
            return r6
    }

    private /* synthetic */ java.lang.Object lambda$logAndUpdateState$8(com.google.android.datatransport.runtime.TransportContext r4, long r5) {
            r3 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r3.eventStore
            com.google.android.datatransport.runtime.time.Clock r1 = r3.clock
            long r1 = r1.getTime()
            long r1 = r1 + r5
            r0.recordNextCallTime(r4, r1)
            r4 = 0
            return r4
    }

    private /* synthetic */ java.lang.Object lambda$upload$0(com.google.android.datatransport.runtime.TransportContext r2, int r3) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = r1.workScheduler
            int r3 = r3 + 1
            r0.schedule(r2, r3)
            r2 = 0
            return r2
    }

    private /* synthetic */ void lambda$upload$1(com.google.android.datatransport.runtime.TransportContext r4, int r5, java.lang.Runnable r6) {
            r3 = this;
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r3.guard     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1 = r3.eventStore     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda9 r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda9     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            r0.runCriticalSection(r2)     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            boolean r0 = r3.isNetworkAvailable()     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            if (r0 != 0) goto L20
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r3.guard     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda3 r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda3     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            r0.runCriticalSection(r1)     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            goto L2d
        L20:
            r3.logAndUpdateState(r4, r5)     // Catch: java.lang.Throwable -> L24 com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L26
            goto L2d
        L24:
            r4 = move-exception
            goto L31
        L26:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = r3.workScheduler     // Catch: java.lang.Throwable -> L24
            int r5 = r5 + 1
            r0.schedule(r4, r5)     // Catch: java.lang.Throwable -> L24
        L2d:
            r6.run()
            return
        L31:
            r6.run()
            throw r4
    }

    public com.google.android.datatransport.runtime.EventInternal createMetricsEvent(com.google.android.datatransport.runtime.backends.TransportBackend r5) {
            r4 = this;
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r4.guard
            com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore r1 = r4.clientHealthMetricsStore
            java.util.Objects.requireNonNull(r1)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda8 r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda8
            r2.<init>(r1)
            java.lang.Object r0 = r0.runCriticalSection(r2)
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r0 = (com.google.android.datatransport.runtime.firebase.transport.ClientMetrics) r0
            com.google.android.datatransport.runtime.EventInternal$Builder r1 = com.google.android.datatransport.runtime.EventInternal.builder()
            com.google.android.datatransport.runtime.time.Clock r2 = r4.clock
            long r2 = r2.getTime()
            com.google.android.datatransport.runtime.EventInternal$Builder r1 = r1.setEventMillis(r2)
            com.google.android.datatransport.runtime.time.Clock r2 = r4.uptimeClock
            long r2 = r2.getTime()
            com.google.android.datatransport.runtime.EventInternal$Builder r1 = r1.setUptimeMillis(r2)
            java.lang.String r2 = "GDT_CLIENT_METRICS"
            com.google.android.datatransport.runtime.EventInternal$Builder r1 = r1.setTransportName(r2)
            com.google.android.datatransport.runtime.EncodedPayload r2 = new com.google.android.datatransport.runtime.EncodedPayload
            java.lang.String r3 = "proto"
            com.google.android.datatransport.Encoding r3 = com.google.android.datatransport.Encoding.of(r3)
            byte[] r0 = r0.toByteArray()
            r2.<init>(r3, r0)
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r1.setEncodedPayload(r2)
            com.google.android.datatransport.runtime.EventInternal r0 = r0.build()
            com.google.android.datatransport.runtime.EventInternal r5 = r5.decorate(r0)
            return r5
    }

    boolean isNetworkAvailable() {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L18
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public com.google.android.datatransport.runtime.backends.BackendResponse logAndUpdateState(com.google.android.datatransport.runtime.TransportContext r12, int r13) {
            r11 = this;
            com.google.android.datatransport.runtime.backends.BackendRegistry r0 = r11.backendRegistry
            java.lang.String r1 = r12.getBackendName()
            com.google.android.datatransport.runtime.backends.TransportBackend r0 = r0.get(r1)
            r1 = 0
            com.google.android.datatransport.runtime.backends.BackendResponse r3 = com.google.android.datatransport.runtime.backends.BackendResponse.ok(r1)
        L10:
            r8 = r1
        L11:
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r1 = r11.guard
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda1 r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda1
            r2.<init>(r11, r12)
            java.lang.Object r1 = r1.runCriticalSection(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12a
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r1 = r11.guard
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda2 r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda2
            r2.<init>(r11, r12)
            java.lang.Object r1 = r1.runCriticalSection(r2)
            r6 = r1
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r1 = r6.iterator()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L3d
            return r3
        L3d:
            if (r0 != 0) goto L4c
            java.lang.String r1 = "Uploader"
            java.lang.String r2 = "Unknown backend for %s, deleting event batch for it..."
            com.google.android.datatransport.runtime.logging.Logging.d(r1, r2, r12)
            com.google.android.datatransport.runtime.backends.BackendResponse r1 = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError()
        L4a:
            r3 = r1
            goto L8f
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r6.iterator()
        L55:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.next()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r3 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r3
            com.google.android.datatransport.runtime.EventInternal r3 = r3.getEvent()
            r1.add(r3)
            goto L55
        L69:
            boolean r2 = r12.shouldUploadClientHealthMetrics()
            if (r2 == 0) goto L76
            com.google.android.datatransport.runtime.EventInternal r2 = r11.createMetricsEvent(r0)
            r1.add(r2)
        L76:
            com.google.android.datatransport.runtime.backends.BackendRequest$Builder r2 = com.google.android.datatransport.runtime.backends.BackendRequest.builder()
            com.google.android.datatransport.runtime.backends.BackendRequest$Builder r1 = r2.setEvents(r1)
            byte[] r2 = r12.getExtras()
            com.google.android.datatransport.runtime.backends.BackendRequest$Builder r1 = r1.setExtras(r2)
            com.google.android.datatransport.runtime.backends.BackendRequest r1 = r1.build()
            com.google.android.datatransport.runtime.backends.BackendResponse r1 = r0.send(r1)
            goto L4a
        L8f:
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = r3.getStatus()
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r2 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR
            r10 = 1
            if (r1 != r2) goto Lac
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r11.guard
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda6 r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda6
            r4 = r1
            r5 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8)
            r0.runCriticalSection(r1)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = r11.workScheduler
            int r13 = r13 + r10
            r0.schedule(r12, r13, r10)
            return r3
        Lac:
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r1 = r11.guard
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda5 r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda5
            r2.<init>(r11, r6)
            r1.runCriticalSection(r2)
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = r3.getStatus()
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r2 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK
            if (r1 != r2) goto Ld8
            long r1 = r3.getNextRequestWaitMillis()
            long r1 = java.lang.Math.max(r8, r1)
            boolean r4 = r12.shouldUploadClientHealthMetrics()
            if (r4 == 0) goto L10
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r4 = r11.guard
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda0 r5 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda0
            r5.<init>(r11)
            r4.runCriticalSection(r5)
            goto L10
        Ld8:
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = r3.getStatus()
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r2 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.INVALID_PAYLOAD
            if (r1 != r2) goto L11
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r6.iterator()
        Le9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L11e
            java.lang.Object r4 = r2.next()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r4 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r4
            com.google.android.datatransport.runtime.EventInternal r4 = r4.getEvent()
            java.lang.String r4 = r4.getTransportName()
            boolean r5 = r1.containsKey(r4)
            if (r5 != 0) goto L10b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r1.put(r4, r5)
            goto Le9
        L10b:
            java.lang.Object r5 = r1.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 + r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r4, r5)
            goto Le9
        L11e:
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r2 = r11.guard
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda7 r4 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda7
            r4.<init>(r11, r1)
            r2.runCriticalSection(r4)
            goto L11
        L12a:
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r13 = r11.guard
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda4 r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda4
            r0.<init>(r11, r12, r8)
            r13.runCriticalSection(r0)
            return r3
    }

    public void upload(com.google.android.datatransport.runtime.TransportContext r3, int r4, java.lang.Runnable r5) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.executor
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda10 r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda10
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
    }
}
