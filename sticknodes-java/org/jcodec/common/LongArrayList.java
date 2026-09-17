package org.jcodec.common;

/* loaded from: classes2.dex */
public class LongArrayList {
    private int _size;
    private int growAmount;
    private long[] storage;

    public LongArrayList(int r1) {
            r0 = this;
            r0.<init>()
            r0.growAmount = r1
            long[] r1 = new long[r1]
            r0.storage = r1
            return
    }

    public static org.jcodec.common.LongArrayList createLongArrayList() {
            org.jcodec.common.LongArrayList r0 = new org.jcodec.common.LongArrayList
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            return r0
    }

    public void add(long r5) {
            r4 = this;
            int r0 = r4._size
            long[] r1 = r4.storage
            int r2 = r1.length
            if (r0 < r2) goto L14
            int r0 = r1.length
            int r2 = r4.growAmount
            int r0 = r0 + r2
            long[] r0 = new long[r0]
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.storage = r0
        L14:
            long[] r0 = r4.storage
            int r1 = r4._size
            int r2 = r1 + 1
            r4._size = r2
            r0[r1] = r5
            return
    }

    public long[] toArray() {
            r4 = this;
            int r0 = r4._size
            long[] r1 = new long[r0]
            long[] r2 = r4.storage
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }
}
