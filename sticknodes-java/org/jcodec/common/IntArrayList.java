package org.jcodec.common;

/* loaded from: classes2.dex */
public class IntArrayList {
    private int _size;
    private int growAmount;
    private int[] storage;

    public IntArrayList(int r1) {
            r0 = this;
            r0.<init>()
            r0.growAmount = r1
            int[] r1 = new int[r1]
            r0.storage = r1
            return
    }

    public static org.jcodec.common.IntArrayList createIntArrayList() {
            org.jcodec.common.IntArrayList r0 = new org.jcodec.common.IntArrayList
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            return r0
    }

    public void add(int r5) {
            r4 = this;
            int r0 = r4._size
            int[] r1 = r4.storage
            int r2 = r1.length
            if (r0 < r2) goto L14
            int r0 = r1.length
            int r2 = r4.growAmount
            int r0 = r0 + r2
            int[] r0 = new int[r0]
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.storage = r0
        L14:
            int[] r0 = r4.storage
            int r1 = r4._size
            int r2 = r1 + 1
            r4._size = r2
            r0[r1] = r5
            return
    }

    public boolean contains(int r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3._size
            if (r1 >= r2) goto L11
            int[] r2 = r3.storage
            r2 = r2[r1]
            if (r2 != r4) goto Le
            r4 = 1
            return r4
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            return r0
    }

    public void fill(int r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.storage
            int r1 = r0.length
            if (r6 <= r1) goto L11
            int r1 = r4.growAmount
            int r1 = r1 + r6
            int[] r1 = new int[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r4.storage = r1
        L11:
            int[] r0 = r4.storage
            java.util.Arrays.fill(r0, r5, r6, r7)
            int r5 = r4._size
            int r5 = java.lang.Math.max(r5, r6)
            r4._size = r5
            return
    }

    public int get(int r2) {
            r1 = this;
            int[] r0 = r1.storage
            r2 = r0[r2]
            return r2
    }

    public void pop() {
            r1 = this;
            int r0 = r1._size
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0 + (-1)
            r1._size = r0
            return
    }

    public void push(int r1) {
            r0 = this;
            r0.add(r1)
            return
    }

    public void set(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.storage
            r0[r2] = r3
            return
    }

    public int size() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public int[] toArray() {
            r4 = this;
            int r0 = r4._size
            int[] r1 = new int[r0]
            int[] r2 = r4.storage
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }
}
