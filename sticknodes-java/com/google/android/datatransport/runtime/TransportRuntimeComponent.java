package com.google.android.datatransport.runtime;

@com.google.android.datatransport.runtime.dagger.Component(modules = {com.google.android.datatransport.runtime.backends.BackendRegistryModule.class, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.class, com.google.android.datatransport.runtime.ExecutionModule.class, com.google.android.datatransport.runtime.scheduling.SchedulingModule.class, com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule.class, com.google.android.datatransport.runtime.time.TimeModule.class})
/* loaded from: classes.dex */
abstract class TransportRuntimeComponent implements java.io.Closeable {

    @com.google.android.datatransport.runtime.dagger.Component.Builder
    interface Builder {
        com.google.android.datatransport.runtime.TransportRuntimeComponent build();

        @com.google.android.datatransport.runtime.dagger.BindsInstance
        com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder setApplicationContext(android.content.Context r1);
    }

    TransportRuntimeComponent() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r1.getEventStore()
            r0.close()
            return
    }

    abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStore getEventStore();

    abstract com.google.android.datatransport.runtime.TransportRuntime getTransportRuntime();
}
