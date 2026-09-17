package com.google.android.datatransport.runtime.scheduling;

/* loaded from: classes.dex */
public class DefaultScheduler implements com.google.android.datatransport.runtime.scheduling.Scheduler {
    private static final java.util.logging.Logger LOGGER = null;
    private final com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler;

    public static /* synthetic */ void $r8$lambda$DT3VaFjNTilJSvcr2dFbjD3xxDQ(com.google.android.datatransport.runtime.scheduling.DefaultScheduler r0, com.google.android.datatransport.runtime.TransportContext r1, com.google.android.datatransport.TransportScheduleCallback r2, com.google.android.datatransport.runtime.EventInternal r3) {
            r0.lambda$schedule$1(r1, r2, r3)
            return
    }

    /* renamed from: $r8$lambda$gan_DuQtUIPPXez98St01P-VZPQ, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m20$r8$lambda$gan_DuQtUIPPXez98St01PVZPQ(com.google.android.datatransport.runtime.scheduling.DefaultScheduler r0, com.google.android.datatransport.runtime.TransportContext r1, com.google.android.datatransport.runtime.EventInternal r2) {
            java.lang.Object r0 = r0.lambda$schedule$0(r1, r2)
            return r0
    }

    static {
            java.lang.Class<com.google.android.datatransport.runtime.TransportRuntime> r0 = com.google.android.datatransport.runtime.TransportRuntime.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler.LOGGER = r0
            return
    }

    public DefaultScheduler(java.util.concurrent.Executor r1, com.google.android.datatransport.runtime.backends.BackendRegistry r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r3, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r4, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r5) {
            r0 = this;
            r0.<init>()
            r0.executor = r1
            r0.backendRegistry = r2
            r0.workScheduler = r3
            r0.eventStore = r4
            r0.guard = r5
            return
    }

    private /* synthetic */ java.lang.Object lambda$schedule$0(com.google.android.datatransport.runtime.TransportContext r2, com.google.android.datatransport.runtime.EventInternal r3) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r1.eventStore
            r0.persist(r2, r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r3 = r1.workScheduler
            r0 = 1
            r3.schedule(r2, r0)
            r2 = 0
            return r2
    }

    private /* synthetic */ void lambda$schedule$1(com.google.android.datatransport.runtime.TransportContext r3, com.google.android.datatransport.TransportScheduleCallback r4, com.google.android.datatransport.runtime.EventInternal r5) {
            r2 = this;
            com.google.android.datatransport.runtime.backends.BackendRegistry r0 = r2.backendRegistry     // Catch: java.lang.Exception -> L3d
            java.lang.String r1 = r3.getBackendName()     // Catch: java.lang.Exception -> L3d
            com.google.android.datatransport.runtime.backends.TransportBackend r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L2a
            java.lang.String r5 = "Transport backend '%s' is not registered"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L3d
            r1 = 0
            java.lang.String r3 = r3.getBackendName()     // Catch: java.lang.Exception -> L3d
            r0[r1] = r3     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = java.lang.String.format(r5, r0)     // Catch: java.lang.Exception -> L3d
            java.util.logging.Logger r5 = com.google.android.datatransport.runtime.scheduling.DefaultScheduler.LOGGER     // Catch: java.lang.Exception -> L3d
            r5.warning(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L3d
            r5.<init>(r3)     // Catch: java.lang.Exception -> L3d
            r4.onSchedule(r5)     // Catch: java.lang.Exception -> L3d
            return
        L2a:
            com.google.android.datatransport.runtime.EventInternal r5 = r0.decorate(r5)     // Catch: java.lang.Exception -> L3d
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r2.guard     // Catch: java.lang.Exception -> L3d
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$ExternalSyntheticLambda0 r1 = new com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L3d
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Exception -> L3d
            r0.runCriticalSection(r1)     // Catch: java.lang.Exception -> L3d
            r3 = 0
            r4.onSchedule(r3)     // Catch: java.lang.Exception -> L3d
            goto L5b
        L3d:
            r3 = move-exception
            java.util.logging.Logger r5 = com.google.android.datatransport.runtime.scheduling.DefaultScheduler.LOGGER
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error scheduling event "
            r0.append(r1)
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.warning(r0)
            r4.onSchedule(r3)
        L5b:
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r3, com.google.android.datatransport.runtime.EventInternal r4, com.google.android.datatransport.TransportScheduleCallback r5) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.executor
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$ExternalSyntheticLambda1 r1 = new com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$ExternalSyntheticLambda1
            r1.<init>(r2, r3, r5, r4)
            r0.execute(r1)
            return
    }
}
