package com.google.android.datatransport.runtime.scheduling.jobscheduling;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class Uploader_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> backendRegistryProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;
    private final javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> guardProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> uptimeClockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r4, javax.inject.Provider<java.util.concurrent.Executor> r5, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r6, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r7, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r8, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore> r9) {
            r0 = this;
            r0.<init>()
            r0.contextProvider = r1
            r0.backendRegistryProvider = r2
            r0.eventStoreProvider = r3
            r0.workSchedulerProvider = r4
            r0.executorProvider = r5
            r0.guardProvider = r6
            r0.clockProvider = r7
            r0.uptimeClockProvider = r8
            r0.clientHealthMetricsStoreProvider = r9
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory create(javax.inject.Provider<android.content.Context> r11, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r12, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r13, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r14, javax.inject.Provider<java.util.concurrent.Executor> r15, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r16, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r17, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r18, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore> r19) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory r10 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader newInstance(android.content.Context r11, com.google.android.datatransport.runtime.backends.BackendRegistry r12, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r13, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r14, java.util.concurrent.Executor r15, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r16, com.google.android.datatransport.runtime.time.Clock r17, com.google.android.datatransport.runtime.time.Clock r18, com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore r19) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r10 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader get() {
            r10 = this;
            javax.inject.Provider<android.content.Context> r0 = r10.contextProvider
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r0 = r10.backendRegistryProvider
            java.lang.Object r0 = r0.get()
            r2 = r0
            com.google.android.datatransport.runtime.backends.BackendRegistry r2 = (com.google.android.datatransport.runtime.backends.BackendRegistry) r2
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r0 = r10.eventStoreProvider
            java.lang.Object r0 = r0.get()
            r3 = r0
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r3 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStore) r3
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r0 = r10.workSchedulerProvider
            java.lang.Object r0 = r0.get()
            r4 = r0
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r4 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler) r4
            javax.inject.Provider<java.util.concurrent.Executor> r0 = r10.executorProvider
            java.lang.Object r0 = r0.get()
            r5 = r0
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r0 = r10.guardProvider
            java.lang.Object r0 = r0.get()
            r6 = r0
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r6 = (com.google.android.datatransport.runtime.synchronization.SynchronizationGuard) r6
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r10.clockProvider
            java.lang.Object r0 = r0.get()
            r7 = r0
            com.google.android.datatransport.runtime.time.Clock r7 = (com.google.android.datatransport.runtime.time.Clock) r7
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r10.uptimeClockProvider
            java.lang.Object r0 = r0.get()
            r8 = r0
            com.google.android.datatransport.runtime.time.Clock r8 = (com.google.android.datatransport.runtime.time.Clock) r8
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore> r0 = r10.clientHealthMetricsStoreProvider
            java.lang.Object r0 = r0.get()
            r9 = r0
            com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore r9 = (com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore) r9
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = newInstance(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = r1.get()
            return r0
    }
}
