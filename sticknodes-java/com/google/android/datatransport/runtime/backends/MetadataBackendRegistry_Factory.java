package com.google.android.datatransport.runtime.backends;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.backends.MetadataBackendRegistry> {
    private final javax.inject.Provider<android.content.Context> applicationContextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.backends.CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<com.google.android.datatransport.runtime.backends.CreationContextFactory> r2) {
            r0 = this;
            r0.<init>()
            r0.applicationContextProvider = r1
            r0.creationContextFactoryProvider = r2
            return
    }

    public static com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory create(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<com.google.android.datatransport.runtime.backends.CreationContextFactory> r2) {
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory r0 = new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.MetadataBackendRegistry newInstance(android.content.Context r1, java.lang.Object r2) {
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry r0 = new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry
            com.google.android.datatransport.runtime.backends.CreationContextFactory r2 = (com.google.android.datatransport.runtime.backends.CreationContextFactory) r2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.backends.MetadataBackendRegistry get() {
            r2 = this;
            javax.inject.Provider<android.content.Context> r0 = r2.applicationContextProvider
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.backends.CreationContextFactory> r1 = r2.creationContextFactoryProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry r0 = newInstance(r0, r1)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry r0 = r1.get()
            return r0
    }
}
