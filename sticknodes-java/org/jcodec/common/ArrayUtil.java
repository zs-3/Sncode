package org.jcodec.common;

/* loaded from: classes2.dex */
public class ArrayUtil {
    public static <T> void shiftLeft1(T[] r3) {
            r0 = 0
        L1:
            int r1 = r3.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto Le
            int r1 = r0 + 1
            r2 = r3[r1]
            r3[r0] = r2
            r0 = r1
            goto L1
        Le:
            int r0 = r3.length
            int r0 = r0 + (-1)
            r1 = 0
            r3[r0] = r1
            return
    }

    public static final int sumByte(byte[] r3) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.length
            if (r0 >= r2) goto Lb
            r2 = r3[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        Lb:
            return r1
    }

    public static int sumByte3(byte[] r3, int r4, int r5) {
            r0 = 0
            r1 = r4
        L2:
            int r2 = r4 + r5
            if (r1 >= r2) goto Lc
            r2 = r3[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        Lc:
            return r0
    }

    public static final void swap(int[] r2, int r3, int r4) {
            r0 = r2[r3]
            r1 = r2[r4]
            r2[r3] = r1
            r2[r4] = r0
            return
    }
}
