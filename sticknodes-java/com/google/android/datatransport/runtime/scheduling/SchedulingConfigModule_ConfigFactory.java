package com.google.android.datatransport.runtime.scheduling;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1) {
            r0 = this;
            r0.<init>()
            r0.clockProvider = r1
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config(com.google.android.datatransport.runtime.time.Clock r0) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule.config(r0)
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(r0)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig) r0
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1) {
            com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory r0 = new com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig get() {
            r1 = this;
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r1.clockProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.runtime.time.Clock r0 = (com.google.android.datatransport.runtime.time.Clock) r0
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = config(r0)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = r1.get()
            return r0
    }
}
