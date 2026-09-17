package com.google.android.datatransport.runtime.scheduling.persistence;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes.dex */
public abstract class EventStoreModule {
    public EventStoreModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static java.lang.String dbName() {
            java.lang.String r0 = "com.google.android.datatransport.events"
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static java.lang.String packageName(android.content.Context r0) {
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static int schemaVersion() {
            int r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.SCHEMA_VERSION
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig storeConfig() {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.DEFAULT
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore clientHealthMetricsStore(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r1);

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r1);

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r1);
}
