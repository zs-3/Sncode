package com.google.android.datatransport.runtime.scheduling.jobscheduling;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class WorkInitializer_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> {
    private final javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> guardProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> schedulerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> storeProvider;

    public WorkInitializer_Factory(javax.inject.Provider<java.util.concurrent.Executor> r1, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r3, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r4) {
            r0 = this;
            r0.<init>()
            r0.executorProvider = r1
            r0.storeProvider = r2
            r0.schedulerProvider = r3
            r0.guardProvider = r4
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory create(javax.inject.Provider<java.util.concurrent.Executor> r1, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r3, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r4) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer newInstance(java.util.concurrent.Executor r1, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r3, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r4) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer get() {
            r4 = this;
            javax.inject.Provider<java.util.concurrent.Executor> r0 = r4.executorProvider
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r1 = r4.storeProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStore) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r2 = r4.schedulerProvider
            java.lang.Object r2 = r2.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler) r2
            javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r3 = r4.guardProvider
            java.lang.Object r3 = r3.get()
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r3 = (com.google.android.datatransport.runtime.synchronization.SynchronizationGuard) r3
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r0 = newInstance(r0, r1, r2, r3)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r0 = r1.get()
            return r0
    }
}
