package com.google.android.datatransport.runtime.scheduling;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class DefaultScheduler_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.DefaultScheduler> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> backendRegistryProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;
    private final javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> guardProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(javax.inject.Provider<java.util.concurrent.Executor> r1, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r4, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r5) {
            r0 = this;
            r0.<init>()
            r0.executorProvider = r1
            r0.backendRegistryProvider = r2
            r0.workSchedulerProvider = r3
            r0.eventStoreProvider = r4
            r0.guardProvider = r5
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory create(javax.inject.Provider<java.util.concurrent.Executor> r7, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r8, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r9, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r10, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r11) {
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory r6 = new com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static com.google.android.datatransport.runtime.scheduling.DefaultScheduler newInstance(java.util.concurrent.Executor r7, com.google.android.datatransport.runtime.backends.BackendRegistry r8, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r9, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r10, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r11) {
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler r6 = new com.google.android.datatransport.runtime.scheduling.DefaultScheduler
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.DefaultScheduler get() {
            r5 = this;
            javax.inject.Provider<java.util.concurrent.Executor> r0 = r5.executorProvider
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r1 = r5.backendRegistryProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.backends.BackendRegistry r1 = (com.google.android.datatransport.runtime.backends.BackendRegistry) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r2 = r5.workSchedulerProvider
            java.lang.Object r2 = r2.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler) r2
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r3 = r5.eventStoreProvider
            java.lang.Object r3 = r3.get()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r3 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStore) r3
            javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r4 = r5.guardProvider
            java.lang.Object r4 = r4.get()
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r4 = (com.google.android.datatransport.runtime.synchronization.SynchronizationGuard) r4
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler r0 = newInstance(r0, r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler r0 = r1.get()
            return r0
    }
}
