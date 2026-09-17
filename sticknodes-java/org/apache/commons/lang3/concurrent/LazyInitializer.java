package org.apache.commons.lang3.concurrent;

/* loaded from: classes2.dex */
public abstract class LazyInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private static final java.lang.Object NO_INIT = null;
    private volatile T object;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            org.apache.commons.lang3.concurrent.LazyInitializer.NO_INIT = r0
            return
    }

    public LazyInitializer() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = org.apache.commons.lang3.concurrent.LazyInitializer.NO_INIT
            r1.object = r0
            return
    }

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r2 = this;
            T r0 = r2.object
            java.lang.Object r1 = org.apache.commons.lang3.concurrent.LazyInitializer.NO_INIT
            if (r0 != r1) goto L16
            monitor-enter(r2)
            T r0 = r2.object     // Catch: java.lang.Throwable -> L13
            if (r0 != r1) goto L11
            java.lang.Object r0 = r2.initialize()     // Catch: java.lang.Throwable -> L13
            r2.object = r0     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
        L16:
            return r0
    }

    protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;
}
