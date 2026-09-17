package com.google.android.datatransport.runtime.backends;

/* loaded from: classes.dex */
public interface TransportBackend {
    com.google.android.datatransport.runtime.EventInternal decorate(com.google.android.datatransport.runtime.EventInternal r1);

    com.google.android.datatransport.runtime.backends.BackendResponse send(com.google.android.datatransport.runtime.backends.BackendRequest r1);
}
