package com.google.firebase.events;

/* loaded from: classes2.dex */
public class Event<T> {
    private final T payload;
    private final java.lang.Class<T> type;

    public T getPayload() {
            r1 = this;
            T r0 = r1.payload
            return r0
    }

    public java.lang.Class<T> getType() {
            r1 = this;
            java.lang.Class<T> r0 = r1.type
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Class<T> r1 = r3.type
            r2 = 0
            r0[r2] = r1
            T r1 = r3.payload
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Event{type: %s, payload: %s}"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
