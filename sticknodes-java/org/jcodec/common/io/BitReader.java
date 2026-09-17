package org.jcodec.common.io;

/* loaded from: classes2.dex */
public class BitReader {
    private java.nio.ByteBuffer bb;
    private int curInt;
    private int deficit;
    private int initPos;

    private BitReader(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.deficit = r0
            r1.curInt = r0
            r1.bb = r2
            int r2 = r2.position()
            r1.initPos = r2
            return
    }

    public static org.jcodec.common.io.BitReader createBitReader(java.nio.ByteBuffer r1) {
            org.jcodec.common.io.BitReader r0 = new org.jcodec.common.io.BitReader
            r0.<init>(r1)
            int r1 = r0.readInt()
            r0.curInt = r1
            r1 = 0
            r0.deficit = r1
            return r0
    }

    private int readIntSafe() {
            r2 = this;
            int r0 = r2.deficit
            java.nio.ByteBuffer r1 = r2.bb
            int r1 = r1.remaining()
            int r1 = r1 << 3
            int r0 = r0 - r1
            r2.deficit = r0
            java.nio.ByteBuffer r0 = r2.bb
            boolean r0 = r0.hasRemaining()
            r1 = 0
            if (r0 == 0) goto L1f
            java.nio.ByteBuffer r0 = r2.bb
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
        L1f:
            int r0 = r1 << 8
            java.nio.ByteBuffer r1 = r2.bb
            boolean r1 = r1.hasRemaining()
            if (r1 == 0) goto L32
            java.nio.ByteBuffer r1 = r2.bb
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
        L32:
            int r0 = r0 << 8
            java.nio.ByteBuffer r1 = r2.bb
            boolean r1 = r1.hasRemaining()
            if (r1 == 0) goto L45
            java.nio.ByteBuffer r1 = r2.bb
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
        L45:
            int r0 = r0 << 8
            java.nio.ByteBuffer r1 = r2.bb
            boolean r1 = r1.hasRemaining()
            if (r1 == 0) goto L58
            java.nio.ByteBuffer r1 = r2.bb
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
        L58:
            return r0
    }

    public int read1Bit() {
            r3 = this;
            int r0 = r3.curInt
            int r1 = r0 >>> 31
            int r0 = r0 << 1
            r3.curInt = r0
            int r0 = r3.deficit
            int r0 = r0 + 1
            r3.deficit = r0
            r2 = 32
            if (r0 != r2) goto L18
            int r0 = r3.readInt()
            r3.curInt = r0
        L18:
            return r1
    }

    public final int readInt() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r0 = r0.remaining()
            r1 = 4
            if (r0 < r1) goto L39
            int r0 = r2.deficit
            int r0 = r0 + (-32)
            r2.deficit = r0
            java.nio.ByteBuffer r0 = r2.bb
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            java.nio.ByteBuffer r1 = r2.bb
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            java.nio.ByteBuffer r1 = r2.bb
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            java.nio.ByteBuffer r1 = r2.bb
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
        L39:
            int r0 = r2.readIntSafe()
            return r0
    }

    public int readNBit(int r6) {
            r5 = this;
            r0 = 32
            if (r6 > r0) goto L2f
            r1 = 0
            int r2 = r5.deficit
            int r3 = r6 + r2
            r4 = 31
            if (r3 <= r4) goto L1d
            int r3 = r5.curInt
            int r3 = r3 >>> r2
            r1 = r1 | r3
            int r2 = 32 - r2
            int r6 = r6 - r2
            int r1 = r1 << r6
            r5.deficit = r0
            int r0 = r5.readInt()
            r5.curInt = r0
        L1d:
            if (r6 == 0) goto L2e
            int r0 = r5.curInt
            int r2 = 32 - r6
            int r2 = r0 >>> r2
            r1 = r1 | r2
            int r0 = r0 << r6
            r5.curInt = r0
            int r0 = r5.deficit
            int r0 = r0 + r6
            r5.deficit = r0
        L2e:
            return r1
        L2f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can not read more then 32 bit"
            r6.<init>(r0)
            throw r6
    }
}
