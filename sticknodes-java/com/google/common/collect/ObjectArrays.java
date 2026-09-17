package com.google.common.collect;

/* loaded from: classes2.dex */
public final class ObjectArrays {
    static java.lang.Object checkElementNotNull(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L3
            return r2
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r0 = 20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "at index "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
    }

    static java.lang.Object[] checkElementsNotNull(java.lang.Object... r1) {
            int r0 = r1.length
            checkElementsNotNull(r1, r0)
            return r1
    }

    static java.lang.Object[] checkElementsNotNull(java.lang.Object[] r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto Lb
            r1 = r2[r0]
            checkElementNotNull(r1, r0)
            int r0 = r0 + 1
            goto L1
        Lb:
            return r2
    }

    public static <T> T[] newArray(T[] r0, int r1) {
            java.lang.Object[] r0 = com.google.common.collect.Platform.newArray(r0, r1)
            return r0
    }
}
