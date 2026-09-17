package com.google.android.datatransport;

/* loaded from: classes.dex */
public interface Transport<T> {
    void schedule(com.google.android.datatransport.Event<T> r1, com.google.android.datatransport.TransportScheduleCallback r2);

    void send(com.google.android.datatransport.Event<T> r1);
}
