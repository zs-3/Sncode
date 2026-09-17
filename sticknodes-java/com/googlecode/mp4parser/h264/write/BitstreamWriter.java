package com.googlecode.mp4parser.h264.write;

/* loaded from: classes2.dex */
public class BitstreamWriter {
    private int curBit;
    private int[] curByte;
    private final java.io.OutputStream os;

    public BitstreamWriter(java.io.OutputStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 8
            int[] r0 = new int[r0]
            r1.curByte = r0
            r1.os = r2
            return
    }

    private void writeCurByte() throws java.io.IOException {
            r10 = this;
            int[] r0 = r10.curByte
            r1 = 0
            r1 = r0[r1]
            r2 = 7
            int r1 = r1 << r2
            r3 = 1
            r4 = r0[r3]
            r5 = 6
            int r4 = r4 << r5
            r1 = r1 | r4
            r4 = 2
            r6 = r0[r4]
            r7 = 5
            int r6 = r6 << r7
            r1 = r1 | r6
            r6 = 3
            r8 = r0[r6]
            r9 = 4
            int r8 = r8 << r9
            r1 = r1 | r8
            r8 = r0[r9]
            int r6 = r8 << 3
            r1 = r1 | r6
            r6 = r0[r7]
            int r4 = r6 << 2
            r1 = r1 | r4
            r4 = r0[r5]
            int r3 = r4 << 1
            r1 = r1 | r3
            r0 = r0[r2]
            r0 = r0 | r1
            java.io.OutputStream r1 = r10.os
            r1.write(r0)
            return
    }

    public void flush() throws java.io.IOException {
            r3 = this;
            int r0 = r3.curBit
        L2:
            r1 = 8
            r2 = 0
            if (r0 < r1) goto Ld
            r3.curBit = r2
            r3.writeCurByte()
            return
        Ld:
            int[] r1 = r3.curByte
            r1[r0] = r2
            int r0 = r0 + 1
            goto L2
    }

    public void write1Bit(int r4) throws java.io.IOException {
            r3 = this;
            com.googlecode.mp4parser.h264.Debug.print(r4)
            int r0 = r3.curBit
            r1 = 8
            if (r0 != r1) goto Lf
            r0 = 0
            r3.curBit = r0
            r3.writeCurByte()
        Lf:
            int[] r0 = r3.curByte
            int r1 = r3.curBit
            int r2 = r1 + 1
            r3.curBit = r2
            r0[r1] = r4
            return
    }

    public void writeByte(int r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.os
            r0.write(r2)
            return
    }

    public void writeNBit(long r4, int r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            if (r0 < r6) goto L4
            return
        L4:
            int r1 = r6 - r0
            int r1 = r1 + (-1)
            long r1 = r4 >> r1
            int r2 = (int) r1
            r1 = r2 & 1
            r3.write1Bit(r1)
            int r0 = r0 + 1
            goto L1
    }

    public void writeRemainingZero() throws java.io.IOException {
            r3 = this;
            int r0 = r3.curBit
            int r0 = 8 - r0
            r1 = 0
            r3.writeNBit(r1, r0)
            return
    }
}
