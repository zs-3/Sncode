package org.jcodec.common;

/* loaded from: classes2.dex */
public class Assert {
    public static void assertEquals(int r0, int r1) {
            if (r0 != r1) goto L3
            return
        L3:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public static void assertEquals(long r2, int r4) {
            long r0 = (long) r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L6
            return
        L6:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
    }

    public static void assertTrue(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }
}
