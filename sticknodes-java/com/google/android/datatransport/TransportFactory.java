package com.google.android.datatransport;

/* loaded from: classes.dex */
public interface TransportFactory {
    <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String r1, java.lang.Class<T> r2, com.google.android.datatransport.Encoding r3, com.google.android.datatransport.Transformer<T, byte[]> r4);

    @java.lang.Deprecated
    <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String r1, java.lang.Class<T> r2, com.google.android.datatransport.Transformer<T, byte[]> r3);
}
