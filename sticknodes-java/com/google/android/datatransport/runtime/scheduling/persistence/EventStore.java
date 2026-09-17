package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes.dex */
public interface EventStore extends java.io.Closeable {
    int cleanUp();

    long getNextCallTime(com.google.android.datatransport.runtime.TransportContext r1);

    boolean hasPendingEventsFor(com.google.android.datatransport.runtime.TransportContext r1);

    java.lang.Iterable<com.google.android.datatransport.runtime.TransportContext> loadActiveContexts();

    java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadBatch(com.google.android.datatransport.runtime.TransportContext r1);

    com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent persist(com.google.android.datatransport.runtime.TransportContext r1, com.google.android.datatransport.runtime.EventInternal r2);

    void recordFailure(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r1);

    void recordNextCallTime(com.google.android.datatransport.runtime.TransportContext r1, long r2);

    void recordSuccess(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r1);
}
