package com.google.common.collect;

/* loaded from: classes2.dex */
public final class Lists {
    static boolean equalsImpl(java.util.List<?> r6, java.lang.Object r7) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r6)
            r1 = 1
            if (r7 != r0) goto L8
            return r1
        L8:
            boolean r0 = r7 instanceof java.util.List
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            java.util.List r7 = (java.util.List) r7
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L1b
            return r2
        L1b:
            boolean r3 = r6 instanceof java.util.RandomAccess
            if (r3 == 0) goto L39
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L39
            r3 = 0
        L24:
            if (r3 >= r0) goto L38
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.common.base.Objects.equal(r4, r5)
            if (r4 != 0) goto L35
            return r2
        L35:
            int r3 = r3 + 1
            goto L24
        L38:
            return r1
        L39:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            boolean r6 = com.google.common.collect.Iterators.elementsEqual(r6, r7)
            return r6
    }

    static int indexOfImpl(java.util.List<?> r1, java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L9
            int r1 = indexOfRandomAccess(r1, r2)
            return r1
        L9:
            java.util.ListIterator r1 = r1.listIterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            boolean r0 = com.google.common.base.Objects.equal(r2, r0)
            if (r0 == 0) goto Ld
            int r1 = r1.previousIndex()
            return r1
        L22:
            r1 = -1
            return r1
    }

    private static int indexOfRandomAccess(java.util.List<?> r3, java.lang.Object r4) {
            int r0 = r3.size()
            r1 = 0
            if (r4 != 0) goto L13
        L7:
            if (r1 >= r0) goto L23
            java.lang.Object r4 = r3.get(r1)
            if (r4 != 0) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            if (r1 >= r0) goto L23
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L20
            return r1
        L20:
            int r1 = r1 + 1
            goto L13
        L23:
            r3 = -1
            return r3
    }

    static int lastIndexOfImpl(java.util.List<?> r1, java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L9
            int r1 = lastIndexOfRandomAccess(r1, r2)
            return r1
        L9:
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L11:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.previous()
            boolean r0 = com.google.common.base.Objects.equal(r2, r0)
            if (r0 == 0) goto L11
            int r1 = r1.nextIndex()
            return r1
        L26:
            r1 = -1
            return r1
    }

    private static int lastIndexOfRandomAccess(java.util.List<?> r2, java.lang.Object r3) {
            if (r3 != 0) goto L14
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L8:
            if (r3 < 0) goto L2a
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + (-1)
            goto L8
        L14:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.lang.Object r1 = r2.get(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L27
            return r0
        L27:
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            r2 = -1
            return r2
    }
}
