package com.google.android.datatransport.runtime.scheduling;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> configProvider;
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> r3, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r4) {
            r0 = this;
            r0.<init>()
            r0.contextProvider = r1
            r0.eventStoreProvider = r2
            r0.configProvider = r3
            r0.clockProvider = r4
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory create(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> r3, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r4) {
            com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory r0 = new com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler(android.content.Context r0, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r2, com.google.android.datatransport.runtime.time.Clock r3) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = com.google.android.datatransport.runtime.scheduling.SchedulingModule.workScheduler(r0, r1, r2, r3)
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(r0)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler get() {
            r4 = this;
            javax.inject.Provider<android.content.Context> r0 = r4.contextProvider
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r1 = r4.eventStoreProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStore) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> r2 = r4.configProvider
            java.lang.Object r2 = r2.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig) r2
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r3 = r4.clockProvider
            java.lang.Object r3 = r3.get()
            com.google.android.datatransport.runtime.time.Clock r3 = (com.google.android.datatransport.runtime.time.Clock) r3
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = workScheduler(r0, r1, r2, r3)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = r1.get()
            return r0
    }
}
