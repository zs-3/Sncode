package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class UnmodifiableIterator<E> implements java.util.Iterator<E> {
    protected UnmodifiableIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    @java.lang.Deprecated
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
