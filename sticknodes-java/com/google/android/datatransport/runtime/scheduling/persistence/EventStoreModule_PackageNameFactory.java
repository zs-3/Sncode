package com.google.android.datatransport.runtime.scheduling.persistence;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class EventStoreModule_PackageNameFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.lang.String> {
    private final javax.inject.Provider<android.content.Context> contextProvider;

    public EventStoreModule_PackageNameFactory(javax.inject.Provider<android.content.Context> r1) {
            r0 = this;
            r0.<init>()
            r0.contextProvider = r1
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory create(javax.inject.Provider<android.content.Context> r1) {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory r0 = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String packageName(android.content.Context r0) {
            java.lang.String r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.packageName(r0)
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
            javax.inject.Provider<android.content.Context> r0 = r1.contextProvider
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r0 = packageName(r0)
            return r0
    }
}
