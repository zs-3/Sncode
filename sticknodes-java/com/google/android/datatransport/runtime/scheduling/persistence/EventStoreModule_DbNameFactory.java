package com.google.android.datatransport.runtime.scheduling.persistence;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class EventStoreModule_DbNameFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.lang.String> {

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory r0 = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory
                r0.<init>()
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory access$000() {
                com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public EventStoreModule_DbNameFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory create() {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.InstanceHolder.access$000()
            return r0
    }

    public static java.lang.String dbName() {
            java.lang.String r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.dbName()
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.lang.String r0 = r1.get()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public java.lang.String get() {
            r1 = this;
            java.lang.String r0 = dbName()
            return r0
    }
}
