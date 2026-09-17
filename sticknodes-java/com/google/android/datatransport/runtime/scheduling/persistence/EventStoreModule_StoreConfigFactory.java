package com.google.android.datatransport.runtime.scheduling.persistence;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class EventStoreModule_StoreConfigFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> {

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory r0 = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory
                r0.<init>()
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory access$000() {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public EventStoreModule_StoreConfigFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory create() {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory.InstanceHolder.access$000()
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig storeConfig() {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.storeConfig()
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(r0)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r0 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r0 = storeConfig()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r0 = r1.get()
            return r0
    }
}
