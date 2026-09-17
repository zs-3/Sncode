package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
public class TransportRuntime implements com.google.android.datatransport.runtime.TransportInternal {
    private static volatile com.google.android.datatransport.runtime.TransportRuntimeComponent instance;
    private final com.google.android.datatransport.runtime.time.Clock eventClock;
    private final com.google.android.datatransport.runtime.scheduling.Scheduler scheduler;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader;
    private final com.google.android.datatransport.runtime.time.Clock uptimeClock;

    static {
            return
    }

    TransportRuntime(@com.google.android.datatransport.runtime.time.WallTime com.google.android.datatransport.runtime.time.Clock r1, @com.google.android.datatransport.runtime.time.Monotonic com.google.android.datatransport.runtime.time.Clock r2, com.google.android.datatransport.runtime.scheduling.Scheduler r3, com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r4, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r5) {
            r0 = this;
            r0.<init>()
            r0.eventClock = r1
            r0.uptimeClock = r2
            r0.scheduler = r3
            r0.uploader = r4
            r5.ensureContextsScheduled()
            return
    }

    private com.google.android.datatransport.runtime.EventInternal convert(com.google.android.datatransport.runtime.SendRequest r5) {
            r4 = this;
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = com.google.android.datatransport.runtime.EventInternal.builder()
            com.google.android.datatransport.runtime.time.Clock r1 = r4.eventClock
            long r1 = r1.getTime()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setEventMillis(r1)
            com.google.android.datatransport.runtime.time.Clock r1 = r4.uptimeClock
            long r1 = r1.getTime()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setUptimeMillis(r1)
            java.lang.String r1 = r5.getTransportName()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setTransportName(r1)
            com.google.android.datatransport.runtime.EncodedPayload r1 = new com.google.android.datatransport.runtime.EncodedPayload
            com.google.android.datatransport.Encoding r2 = r5.getEncoding()
            byte[] r3 = r5.getPayload()
            r1.<init>(r2, r3)
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setEncodedPayload(r1)
            com.google.android.datatransport.Event r1 = r5.getEvent()
            java.lang.Integer r1 = r1.getCode()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setCode(r1)
            com.google.android.datatransport.Event r1 = r5.getEvent()
            com.google.android.datatransport.ProductData r1 = r1.getProductData()
            if (r1 == 0) goto L64
            com.google.android.datatransport.Event r1 = r5.getEvent()
            com.google.android.datatransport.ProductData r1 = r1.getProductData()
            java.lang.Integer r1 = r1.getProductId()
            if (r1 == 0) goto L64
            com.google.android.datatransport.Event r1 = r5.getEvent()
            com.google.android.datatransport.ProductData r1 = r1.getProductData()
            java.lang.Integer r1 = r1.getProductId()
            r0.setProductId(r1)
        L64:
            com.google.android.datatransport.Event r1 = r5.getEvent()
            com.google.android.datatransport.EventContext r1 = r1.getEventContext()
            if (r1 == 0) goto L9d
            com.google.android.datatransport.Event r5 = r5.getEvent()
            com.google.android.datatransport.EventContext r5 = r5.getEventContext()
            java.lang.String r1 = r5.getPseudonymousId()
            if (r1 == 0) goto L83
            java.lang.String r1 = r5.getPseudonymousId()
            r0.setPseudonymousId(r1)
        L83:
            byte[] r1 = r5.getExperimentIdsClear()
            if (r1 == 0) goto L90
            byte[] r1 = r5.getExperimentIdsClear()
            r0.setExperimentIdsClear(r1)
        L90:
            byte[] r1 = r5.getExperimentIdsEncrypted()
            if (r1 == 0) goto L9d
            byte[] r5 = r5.getExperimentIdsEncrypted()
            r0.setExperimentIdsEncrypted(r5)
        L9d:
            com.google.android.datatransport.runtime.EventInternal r5 = r0.build()
            return r5
    }

    public static com.google.android.datatransport.runtime.TransportRuntime getInstance() {
            com.google.android.datatransport.runtime.TransportRuntimeComponent r0 = com.google.android.datatransport.runtime.TransportRuntime.instance
            if (r0 == 0) goto L9
            com.google.android.datatransport.runtime.TransportRuntime r0 = r0.getTransportRuntime()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized!"
            r0.<init>(r1)
            throw r0
    }

    private static java.util.Set<com.google.android.datatransport.Encoding> getSupportedEncodings(com.google.android.datatransport.runtime.Destination r1) {
            boolean r0 = r1 instanceof com.google.android.datatransport.runtime.EncodedDestination
            if (r0 == 0) goto Lf
            com.google.android.datatransport.runtime.EncodedDestination r1 = (com.google.android.datatransport.runtime.EncodedDestination) r1
            java.util.Set r1 = r1.getSupportedEncodings()
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            return r1
        Lf:
            java.lang.String r1 = "proto"
            com.google.android.datatransport.Encoding r1 = com.google.android.datatransport.Encoding.of(r1)
            java.util.Set r1 = java.util.Collections.singleton(r1)
            return r1
    }

    public static void initialize(android.content.Context r2) {
            com.google.android.datatransport.runtime.TransportRuntimeComponent r0 = com.google.android.datatransport.runtime.TransportRuntime.instance
            if (r0 != 0) goto L1e
            java.lang.Class<com.google.android.datatransport.runtime.TransportRuntime> r0 = com.google.android.datatransport.runtime.TransportRuntime.class
            monitor-enter(r0)
            com.google.android.datatransport.runtime.TransportRuntimeComponent r1 = com.google.android.datatransport.runtime.TransportRuntime.instance     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L19
            com.google.android.datatransport.runtime.TransportRuntimeComponent$Builder r1 = com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.builder()     // Catch: java.lang.Throwable -> L1b
            com.google.android.datatransport.runtime.TransportRuntimeComponent$Builder r2 = r1.setApplicationContext(r2)     // Catch: java.lang.Throwable -> L1b
            com.google.android.datatransport.runtime.TransportRuntimeComponent r2 = r2.build()     // Catch: java.lang.Throwable -> L1b
            com.google.android.datatransport.runtime.TransportRuntime.instance = r2     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
        L1e:
            return
    }

    static void withInstance(com.google.android.datatransport.runtime.TransportRuntimeComponent r2, java.util.concurrent.Callable<java.lang.Void> r3) throws java.lang.Throwable {
            java.lang.Class<com.google.android.datatransport.runtime.TransportRuntime> r0 = com.google.android.datatransport.runtime.TransportRuntime.class
            monitor-enter(r0)
            com.google.android.datatransport.runtime.TransportRuntimeComponent r1 = com.google.android.datatransport.runtime.TransportRuntime.instance     // Catch: java.lang.Throwable -> L1c
            com.google.android.datatransport.runtime.TransportRuntime.instance = r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r3.call()     // Catch: java.lang.Throwable -> L13
            monitor-enter(r0)
            com.google.android.datatransport.runtime.TransportRuntime.instance = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
        L13:
            r2 = move-exception
            monitor-enter(r0)
            com.google.android.datatransport.runtime.TransportRuntime.instance = r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
        L19:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
        L1c:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r2
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader getUploader() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = r1.uploader
            return r0
    }

    public com.google.android.datatransport.TransportFactory newFactory(com.google.android.datatransport.runtime.Destination r5) {
            r4 = this;
            com.google.android.datatransport.runtime.TransportFactoryImpl r0 = new com.google.android.datatransport.runtime.TransportFactoryImpl
            java.util.Set r1 = getSupportedEncodings(r5)
            com.google.android.datatransport.runtime.TransportContext$Builder r2 = com.google.android.datatransport.runtime.TransportContext.builder()
            java.lang.String r3 = r5.getName()
            com.google.android.datatransport.runtime.TransportContext$Builder r2 = r2.setBackendName(r3)
            byte[] r5 = r5.getExtras()
            com.google.android.datatransport.runtime.TransportContext$Builder r5 = r2.setExtras(r5)
            com.google.android.datatransport.runtime.TransportContext r5 = r5.build()
            r0.<init>(r1, r5, r4)
            return r0
    }

    @java.lang.Deprecated
    public com.google.android.datatransport.TransportFactory newFactory(java.lang.String r4) {
            r3 = this;
            com.google.android.datatransport.runtime.TransportFactoryImpl r0 = new com.google.android.datatransport.runtime.TransportFactoryImpl
            r1 = 0
            java.util.Set r1 = getSupportedEncodings(r1)
            com.google.android.datatransport.runtime.TransportContext$Builder r2 = com.google.android.datatransport.runtime.TransportContext.builder()
            com.google.android.datatransport.runtime.TransportContext$Builder r4 = r2.setBackendName(r4)
            com.google.android.datatransport.runtime.TransportContext r4 = r4.build()
            r0.<init>(r1, r4, r3)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.TransportInternal
    public void send(com.google.android.datatransport.runtime.SendRequest r4, com.google.android.datatransport.TransportScheduleCallback r5) {
            r3 = this;
            com.google.android.datatransport.runtime.scheduling.Scheduler r0 = r3.scheduler
            com.google.android.datatransport.runtime.TransportContext r1 = r4.getTransportContext()
            com.google.android.datatransport.Event r2 = r4.getEvent()
            com.google.android.datatransport.Priority r2 = r2.getPriority()
            com.google.android.datatransport.runtime.TransportContext r1 = r1.withPriority(r2)
            com.google.android.datatransport.runtime.EventInternal r4 = r3.convert(r4)
            r0.schedule(r1, r4, r5)
            return
    }
}
