package org.apache.commons.lang3.concurrent;

/* loaded from: classes2.dex */
public abstract class AtomicInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private final java.util.concurrent.atomic.AtomicReference<T> reference;

    public AtomicInitializer() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.reference = r0
            return
    }

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<T> r0 = r3.reference
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r3.initialize()
            java.util.concurrent.atomic.AtomicReference<T> r1 = r3.reference
            r2 = 0
            boolean r1 = r1.compareAndSet(r2, r0)
            if (r1 != 0) goto L1b
            java.util.concurrent.atomic.AtomicReference<T> r0 = r3.reference
            java.lang.Object r0 = r0.get()
        L1b:
            return r0
    }

    protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;
}
