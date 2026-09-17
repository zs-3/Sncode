package com.google.android.datatransport.runtime;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class TransportRuntime_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.TransportRuntime> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> eventClockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> initializerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> schedulerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> uploaderProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> uptimeClockProvider;

    public TransportRuntime_Factory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> r4, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> r5) {
            r0 = this;
            r0.<init>()
            r0.eventClockProvider = r1
            r0.uptimeClockProvider = r2
            r0.schedulerProvider = r3
            r0.uploaderProvider = r4
            r0.initializerProvider = r5
            return
    }

    public static com.google.android.datatransport.runtime.TransportRuntime_Factory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r7, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r8, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> r9, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> r10, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> r11) {
            com.google.android.datatransport.runtime.TransportRuntime_Factory r6 = new com.google.android.datatransport.runtime.TransportRuntime_Factory
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static com.google.android.datatransport.runtime.TransportRuntime newInstance(com.google.android.datatransport.runtime.time.Clock r7, com.google.android.datatransport.runtime.time.Clock r8, com.google.android.datatransport.runtime.scheduling.Scheduler r9, com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r10, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r11) {
            com.google.android.datatransport.runtime.TransportRuntime r6 = new com.google.android.datatransport.runtime.TransportRuntime
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
    public com.google.android.datatransport.runtime.TransportRuntime get() {
            r5 = this;
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r5.eventClockProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.runtime.time.Clock r0 = (com.google.android.datatransport.runtime.time.Clock) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1 = r5.uptimeClockProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.time.Clock r1 = (com.google.android.datatransport.runtime.time.Clock) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> r2 = r5.schedulerProvider
            java.lang.Object r2 = r2.get()
            com.google.android.datatransport.runtime.scheduling.Scheduler r2 = (com.google.android.datatransport.runtime.scheduling.Scheduler) r2
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> r3 = r5.uploaderProvider
            java.lang.Object r3 = r3.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r3 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader) r3
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> r4 = r5.initializerProvider
            java.lang.Object r4 = r4.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r4 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer) r4
            com.google.android.datatransport.runtime.TransportRuntime r0 = newInstance(r0, r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.TransportRuntime r0 = r1.get()
            return r0
    }
}
