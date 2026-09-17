package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
public class WorkInitializer {
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler scheduler;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore store;

    /* renamed from: $r8$lambda$9qDRtwUbk8Lu0d-4AfNJqExglzE, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m26$r8$lambda$9qDRtwUbk8Lu0d4AfNJqExglzE(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r0) {
            java.lang.Object r0 = r0.lambda$ensureContextsScheduled$0()
            return r0
    }

    public static /* synthetic */ void $r8$lambda$IZdbY5oNmKQf7_hQvjCC3nA27Mo(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r0) {
            r0.lambda$ensureContextsScheduled$1()
            return
    }

    WorkInitializer(java.util.concurrent.Executor r1, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r3, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r4) {
            r0 = this;
            r0.<init>()
            r0.executor = r1
            r0.store = r2
            r0.scheduler = r3
            r0.guard = r4
            return
    }

    private /* synthetic */ java.lang.Object lambda$ensureContextsScheduled$0() {
            r4 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r4.store
            java.lang.Iterable r0 = r0.loadActiveContexts()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.android.datatransport.runtime.TransportContext r1 = (com.google.android.datatransport.runtime.TransportContext) r1
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r2 = r4.scheduler
            r3 = 1
            r2.schedule(r1, r3)
            goto La
        L1d:
            r0 = 0
            return r0
    }

    private /* synthetic */ void lambda$ensureContextsScheduled$1() {
            r2 = this;
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r2.guard
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$ExternalSyntheticLambda0 r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.runCriticalSection(r1)
            return
    }

    public void ensureContextsScheduled() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.executor
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$ExternalSyntheticLambda1 r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.execute(r1)
            return
    }
}
