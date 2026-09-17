package org.apache.commons.lang3.concurrent;

/* loaded from: classes2.dex */
public abstract class AtomicSafeInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private final java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AtomicSafeInitializer<T>> factory;
    private final java.util.concurrent.atomic.AtomicReference<T> reference;

    public AtomicSafeInitializer() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.factory = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.reference = r0
            return
    }

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public final T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<T> r0 = r2.reference
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1b
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AtomicSafeInitializer<T>> r0 = r2.factory
            r1 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReference<T> r0 = r2.reference
            java.lang.Object r1 = r2.initialize()
            r0.set(r1)
            goto L0
        L1b:
            return r0
    }

    protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;
}
