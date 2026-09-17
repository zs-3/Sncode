package com.google.android.datatransport.runtime.backends;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes.dex */
public abstract class BackendRegistryModule {
    public BackendRegistryModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry r1);
}
