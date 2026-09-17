package com.google.firebase.events;

/* loaded from: classes2.dex */
public interface Subscriber {
    <T> void subscribe(java.lang.Class<T> r1, java.util.concurrent.Executor r2, com.google.firebase.events.EventHandler<? super T> r3);
}
