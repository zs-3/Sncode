package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class Ordering<T> implements java.util.Comparator<T> {
    protected Ordering() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.google.common.collect.Ordering<T> from(java.util.Comparator<T> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Ordering
            if (r0 == 0) goto L7
            com.google.common.collect.Ordering r1 = (com.google.common.collect.Ordering) r1
            goto Ld
        L7:
            com.google.common.collect.ComparatorOrdering r0 = new com.google.common.collect.ComparatorOrdering
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    @Override // java.util.Comparator
    public abstract int compare(T r1, T r2);

    public <F> com.google.common.collect.Ordering<F> onResultOf(com.google.common.base.Function<F, ? extends T> r2) {
            r1 = this;
            com.google.common.collect.ByFunctionOrdering r0 = new com.google.common.collect.ByFunctionOrdering
            r0.<init>(r2, r1)
            return r0
    }
}
