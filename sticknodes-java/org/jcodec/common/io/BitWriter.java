package org.jcodec.common.io;

/* loaded from: classes2.dex */
public class BitWriter {
    private int _curBit;
    private final java.nio.ByteBuffer buf;
    private int curInt;
    private int initPos;

    public BitWriter(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            r0.buf = r1
            int r1 = r1.position()
            r0.initPos = r1
            return
    }

    private final void putInt(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buf
            int r1 = r3 >>> 24
            byte r1 = (byte) r1
            r0.put(r1)
            java.nio.ByteBuffer r0 = r2.buf
            int r1 = r3 >> 16
            byte r1 = (byte) r1
            r0.put(r1)
            java.nio.ByteBuffer r0 = r2.buf
            int r1 = r3 >> 8
            byte r1 = (byte) r1
            r0.put(r1)
            java.nio.ByteBuffer r0 = r2.buf
            byte r3 = (byte) r3
            r0.put(r3)
            return
    }

    public void flush() {
            r4 = this;
            int r0 = r4._curBit
            int r0 = r0 + 7
            int r0 = r0 >> 3
            r1 = 0
        L7:
            if (r1 >= r0) goto L1c
            java.nio.ByteBuffer r2 = r4.buf
            int r3 = r4.curInt
            int r3 = r3 >>> 24
            byte r3 = (byte) r3
            r2.put(r3)
            int r2 = r4.curInt
            int r2 = r2 << 8
            r4.curInt = r2
            int r1 = r1 + 1
            goto L7
        L1c:
            return
    }

    public org.jcodec.common.io.BitWriter fork() {
            r2 = this;
            org.jcodec.common.io.BitWriter r0 = new org.jcodec.common.io.BitWriter
            java.nio.ByteBuffer r1 = r2.buf
            java.nio.ByteBuffer r1 = r1.duplicate()
            r0.<init>(r1)
            int r1 = r2._curBit
            r0._curBit = r1
            int r1 = r2.curInt
            r0.curInt = r1
            int r1 = r2.initPos
            r0.initPos = r1
            return r0
    }

    public java.nio.ByteBuffer getBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            return r0
    }

    public int position() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buf
            int r0 = r0.position()
            int r1 = r2.initPos
            int r0 = r0 - r1
            int r0 = r0 << 3
            int r1 = r2._curBit
            int r0 = r0 + r1
            return r0
    }

    public void write1Bit(int r4) {
            r3 = this;
            int r0 = r3.curInt
            int r1 = r3._curBit
            int r2 = 32 - r1
            int r2 = r2 + (-1)
            int r4 = r4 << r2
            r4 = r4 | r0
            r3.curInt = r4
            int r1 = r1 + 1
            r3._curBit = r1
            r0 = 32
            if (r1 != r0) goto L1c
            r3.putInt(r4)
            r4 = 0
            r3._curBit = r4
            r3.curInt = r4
        L1c:
            return
    }

    public final void writeNBit(int r5, int r6) {
            r4 = this;
            r0 = 32
            if (r6 > r0) goto L3d
            if (r6 != 0) goto L7
            return
        L7:
            r1 = -1
            int r2 = 32 - r6
            int r1 = r1 >>> r2
            r5 = r5 & r1
            int r1 = r4._curBit
            int r2 = 32 - r1
            if (r2 < r6) goto L29
            int r2 = r4.curInt
            int r3 = 32 - r1
            int r3 = r3 - r6
            int r5 = r5 << r3
            r5 = r5 | r2
            r4.curInt = r5
            int r1 = r1 + r6
            r4._curBit = r1
            if (r1 != r0) goto L3c
            r4.putInt(r5)
            r5 = 0
            r4._curBit = r5
            r4.curInt = r5
            goto L3c
        L29:
            int r0 = r0 - r1
            int r6 = r6 - r0
            int r0 = r4.curInt
            int r1 = r5 >>> r6
            r0 = r0 | r1
            r4.curInt = r0
            r4.putInt(r0)
            int r0 = 32 - r6
            int r5 = r5 << r0
            r4.curInt = r5
            r4._curBit = r6
        L3c:
            return
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Max 32 bit to write"
            r5.<init>(r6)
            throw r5
    }
}
