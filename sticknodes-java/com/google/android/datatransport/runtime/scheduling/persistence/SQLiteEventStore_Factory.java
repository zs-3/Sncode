package com.google.android.datatransport.runtime.scheduling.persistence;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> configProvider;
    private final javax.inject.Provider<java.lang.String> packageNameProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> schemaManagerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> wallClockProvider;

    public SQLiteEventStore_Factory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> r4, javax.inject.Provider<java.lang.String> r5) {
            r0 = this;
            r0.<init>()
            r0.wallClockProvider = r1
            r0.clockProvider = r2
            r0.configProvider = r3
            r0.schemaManagerProvider = r4
            r0.packageNameProvider = r5
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r7, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r8, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> r9, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> r10, javax.inject.Provider<java.lang.String> r11) {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory r6 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore newInstance(com.google.android.datatransport.runtime.time.Clock r7, com.google.android.datatransport.runtime.time.Clock r8, java.lang.Object r9, java.lang.Object r10, javax.inject.Provider<java.lang.String> r11) {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r6 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore
            r3 = r9
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r3 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) r3
            r4 = r10
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r4 = (com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager) r4
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore get() {
            r5 = this;
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r5.wallClockProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.runtime.time.Clock r0 = (com.google.android.datatransport.runtime.time.Clock) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1 = r5.clockProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.time.Clock r1 = (com.google.android.datatransport.runtime.time.Clock) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> r2 = r5.configProvider
            java.lang.Object r2 = r2.get()
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> r3 = r5.schemaManagerProvider
            java.lang.Object r3 = r3.get()
            javax.inject.Provider<java.lang.String> r4 = r5.packageNameProvider
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0 = newInstance(r0, r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0 = r1.get()
            return r0
    }
}
