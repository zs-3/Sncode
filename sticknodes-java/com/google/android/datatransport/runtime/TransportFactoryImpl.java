package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
final class TransportFactoryImpl implements com.google.android.datatransport.TransportFactory {
    private final java.util.Set<com.google.android.datatransport.Encoding> supportedPayloadEncodings;
    private final com.google.android.datatransport.runtime.TransportContext transportContext;
    private final com.google.android.datatransport.runtime.TransportInternal transportInternal;

    TransportFactoryImpl(java.util.Set<com.google.android.datatransport.Encoding> r1, com.google.android.datatransport.runtime.TransportContext r2, com.google.android.datatransport.runtime.TransportInternal r3) {
            r0 = this;
            r0.<init>()
            r0.supportedPayloadEncodings = r1
            r0.transportContext = r2
            r0.transportInternal = r3
            return
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String r7, java.lang.Class<T> r8, com.google.android.datatransport.Encoding r9, com.google.android.datatransport.Transformer<T, byte[]> r10) {
            r6 = this;
            java.util.Set<com.google.android.datatransport.Encoding> r8 = r6.supportedPayloadEncodings
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L16
            com.google.android.datatransport.runtime.TransportImpl r8 = new com.google.android.datatransport.runtime.TransportImpl
            com.google.android.datatransport.runtime.TransportContext r1 = r6.transportContext
            com.google.android.datatransport.runtime.TransportInternal r5 = r6.transportInternal
            r0 = r8
            r2 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L16:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r10 = 0
            r8[r10] = r9
            r9 = 1
            java.util.Set<com.google.android.datatransport.Encoding> r10 = r6.supportedPayloadEncodings
            r8[r9] = r10
            java.lang.String r9 = "%s is not supported byt this factory. Supported encodings are: %s."
            java.lang.String r8 = java.lang.String.format(r9, r8)
            r7.<init>(r8)
            throw r7
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String r2, java.lang.Class<T> r3, com.google.android.datatransport.Transformer<T, byte[]> r4) {
            r1 = this;
            java.lang.String r0 = "proto"
            com.google.android.datatransport.Encoding r0 = com.google.android.datatransport.Encoding.of(r0)
            com.google.android.datatransport.Transport r2 = r1.getTransport(r2, r3, r0, r4)
            return r2
    }
}
