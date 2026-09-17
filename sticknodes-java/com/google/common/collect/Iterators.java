package com.google.common.collect;

/* loaded from: classes2.dex */
public final class Iterators {


    public static boolean elementsEqual(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(T r1) {
            com.google.common.collect.Iterators$9 r0 = new com.google.common.collect.Iterators$9
            r0.<init>(r1)
            return r0
    }
}
