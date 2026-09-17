package org.jcodec.common.io;

/* loaded from: classes2.dex */
public class VLC {
    private int[] codeSizes;
    private int[] codes;
    private int[] valueSizes;
    private int[] values;

    public VLC(int[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.codes = r1
            r0.codeSizes = r2
            r0._invert()
            return
    }

    private void _invert() {
            r8 = this;
            org.jcodec.common.IntArrayList r6 = org.jcodec.common.IntArrayList.createIntArrayList()
            org.jcodec.common.IntArrayList r7 = org.jcodec.common.IntArrayList.createIntArrayList()
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r8
            r4 = r6
            r5 = r7
            r0.invert(r1, r2, r3, r4, r5)
            int[] r0 = r6.toArray()
            r8.values = r0
            int[] r0 = r7.toArray()
            r8.valueSizes = r0
            return
    }

    private int invert(int r11, int r12, int r13, org.jcodec.common.IntArrayList r14, org.jcodec.common.IntArrayList r15) {
            r10 = this;
            int r0 = r11 + 256
            r1 = -1
            r14.fill(r11, r0, r1)
            r2 = 0
            r15.fill(r11, r0, r2)
            int r3 = r12 << 3
            r5 = r0
            r0 = 0
        Le:
            int[] r4 = r10.codeSizes
            int r6 = r4.length
            if (r0 >= r6) goto L60
            r6 = r4[r0]
            if (r6 <= r3) goto L5d
            if (r12 <= 0) goto L23
            int[] r6 = r10.codes
            r6 = r6[r0]
            int r7 = 32 - r3
            int r6 = r6 >>> r7
            if (r6 == r13) goto L23
            goto L5d
        L23:
            int[] r6 = r10.codes
            r6 = r6[r0]
            int r7 = 32 - r3
            r8 = 8
            int r7 = r7 - r8
            int r7 = r6 >>> r7
            r6 = r7 & 255(0xff, float:3.57E-43)
            r4 = r4[r0]
            int r4 = r4 - r3
            if (r4 > r8) goto L49
            r7 = 0
        L36:
            int r8 = 8 - r4
            r9 = 1
            int r8 = r9 << r8
            if (r7 >= r8) goto L5d
            int r8 = r11 + r6
            int r8 = r8 + r7
            r14.set(r8, r0)
            r15.set(r8, r4)
            int r7 = r7 + 1
            goto L36
        L49:
            int r6 = r6 + r11
            int r4 = r14.get(r6)
            if (r4 != r1) goto L5d
            r14.set(r6, r5)
            int r6 = r12 + 1
            r4 = r10
            r8 = r14
            r9 = r15
            int r4 = r4.invert(r5, r6, r7, r8, r9)
            r5 = r4
        L5d:
            int r0 = r0 + 1
            goto Le
        L60:
            return r5
    }

    public void writeVLC(org.jcodec.common.io.BitWriter r4, int r5) {
            r3 = this;
            int[] r0 = r3.codes
            r0 = r0[r5]
            int[] r1 = r3.codeSizes
            r2 = r1[r5]
            int r2 = 32 - r2
            int r0 = r0 >>> r2
            r5 = r1[r5]
            r4.writeNBit(r0, r5)
            return
    }
}
