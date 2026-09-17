package com.google.android.datatransport.runtime.scheduling.persistence;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class EventStoreModule_SchemaVersionFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.lang.Integer> {

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory r0 = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory
                r0.<init>()
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory access$000() {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public EventStoreModule_SchemaVersionFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory create() {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.InstanceHolder.access$000()
            return r0
    }

    public static int schemaVersion() {
            int r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.schemaVersion()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public java.lang.Integer get() {
            r1 = this;
            int r0 = schemaVersion()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.lang.Integer r0 = r1.get()
            return r0
    }
}
