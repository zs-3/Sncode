package com.badlogic.gdx.utils.async;

/* loaded from: classes.dex */
public class AsyncResult<T> {
    private final java.util.concurrent.Future<T> future;

    AsyncResult(java.util.concurrent.Future<T> r1) {
            r0 = this;
            r0.<init>()
            r0.future = r1
            return
    }

    public T get() {
            r2 = this;
            java.util.concurrent.Future<T> r0 = r2.future     // Catch: java.util.concurrent.ExecutionException -> L7 java.lang.InterruptedException -> L12
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L7 java.lang.InterruptedException -> L12
            return r0
        L7:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            throw r1
        L12:
            r0 = 0
            return r0
    }

    public boolean isDone() {
            r1 = this;
            java.util.concurrent.Future<T> r0 = r1.future
            boolean r0 = r0.isDone()
            return r0
    }
}
