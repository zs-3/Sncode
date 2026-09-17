package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public final class Mp4Arrays {
    private Mp4Arrays() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int[] copyOfAndAppend(int[] r3, int... r4) {
            r0 = 0
            if (r3 != 0) goto L5
            int[] r3 = new int[r0]
        L5:
            if (r4 != 0) goto L9
            int[] r4 = new int[r0]
        L9:
            int r1 = r3.length
            int r2 = r4.length
            int r1 = r1 + r2
            int[] r1 = new int[r1]
            int r2 = r3.length
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)
            int r3 = r3.length
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r0, r1, r3, r2)
            return r1
    }

    public static long[] copyOfAndAppend(long[] r3, long... r4) {
            r0 = 0
            if (r3 != 0) goto L5
            long[] r3 = new long[r0]
        L5:
            if (r4 != 0) goto L9
            long[] r4 = new long[r0]
        L9:
            int r1 = r3.length
            int r2 = r4.length
            int r1 = r1 + r2
            long[] r1 = new long[r1]
            int r2 = r3.length
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)
            int r3 = r3.length
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r0, r1, r3, r2)
            return r1
    }
}
