package com.google.firebase.inject;

/* loaded from: classes2.dex */
public interface Deferred<T> {

    public interface DeferredHandler<T> {
        void handle(com.google.firebase.inject.Provider<T> r1);
    }

    void whenAvailable(com.google.firebase.inject.Deferred.DeferredHandler<T> r1);
}
