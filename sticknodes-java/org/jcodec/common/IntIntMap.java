package org.jcodec.common;

/* loaded from: classes2.dex */
public class IntIntMap {
    private int _size;
    private int[] storage;

    public IntIntMap() {
            r2 = this;
            r2.<init>()
            r0 = 128(0x80, float:1.794E-43)
            int[] r0 = r2.createArray(r0)
            r2.storage = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            java.util.Arrays.fill(r0, r1)
            return
    }

    private int[] createArray(int r1) {
            r0 = this;
            int[] r1 = new int[r1]
            return r1
    }

    public int get(int r3) {
            r2 = this;
            int[] r0 = r2.storage
            int r1 = r0.length
            if (r3 < r1) goto L8
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto La
        L8:
            r3 = r0[r3]
        La:
            return r3
    }

    public void put(int r6, int r7) {
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L2e
            int[] r1 = r5.storage
            int r1 = r1.length
            if (r1 > r6) goto L1f
            int r1 = r6 + 128
            int[] r1 = r5.createArray(r1)
            int[] r2 = r5.storage
            int r3 = r2.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r4, r3)
            int[] r2 = r5.storage
            int r2 = r2.length
            int r3 = r1.length
            java.util.Arrays.fill(r1, r2, r3, r0)
            r5.storage = r1
        L1f:
            int[] r1 = r5.storage
            r2 = r1[r6]
            if (r2 != r0) goto L2b
            int r0 = r5._size
            int r0 = r0 + 1
            r5._size = r0
        L2b:
            r1[r6] = r7
            return
        L2e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "This implementation can not store -2147483648"
            r6.<init>(r7)
            throw r6
    }
}
