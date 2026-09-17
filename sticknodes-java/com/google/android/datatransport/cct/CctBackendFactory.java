package com.google.android.datatransport.cct;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements com.google.android.datatransport.runtime.backends.BackendFactory {
    public CctBackendFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendFactory
    public com.google.android.datatransport.runtime.backends.TransportBackend create(com.google.android.datatransport.runtime.backends.CreationContext r4) {
            r3 = this;
            com.google.android.datatransport.cct.CctTransportBackend r0 = new com.google.android.datatransport.cct.CctTransportBackend
            android.content.Context r1 = r4.getApplicationContext()
            com.google.android.datatransport.runtime.time.Clock r2 = r4.getWallClock()
            com.google.android.datatransport.runtime.time.Clock r4 = r4.getMonotonicClock()
            r0.<init>(r1, r2, r4)
            return r0
    }
}
