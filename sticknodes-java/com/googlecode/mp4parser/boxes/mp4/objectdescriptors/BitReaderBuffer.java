package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

/* loaded from: classes2.dex */
public class BitReaderBuffer {
    private java.nio.ByteBuffer buffer;
    int initialPos;
    int position;

    public BitReaderBuffer(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            int r1 = r1.position()
            r0.initialPos = r1
            return
    }

    public int byteSync() {
            r2 = this;
            int r0 = r2.position
            r1 = 8
            int r0 = r0 % r1
            int r0 = 8 - r0
            if (r0 != r1) goto La
            r0 = 0
        La:
            r2.readBits(r0)
            return r0
    }

    public int getPosition() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    public int readBits(int r7) {
            r6 = this;
            java.nio.ByteBuffer r0 = r6.buffer
            int r1 = r6.initialPos
            int r2 = r6.position
            int r2 = r2 / 8
            int r1 = r1 + r2
            byte r0 = r0.get(r1)
            if (r0 >= 0) goto L11
            int r0 = r0 + 256
        L11:
            int r1 = r6.position
            int r2 = r1 % 8
            int r2 = 8 - r2
            if (r7 > r2) goto L27
            int r3 = r1 % 8
            int r0 = r0 << r3
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r1 % 8
            int r2 = r2 - r7
            int r3 = r3 + r2
            int r0 = r0 >> r3
            int r1 = r1 + r7
            r6.position = r1
            goto L32
        L27:
            int r7 = r7 - r2
            int r0 = r6.readBits(r2)
            int r0 = r0 << r7
            int r7 = r6.readBits(r7)
            int r0 = r0 + r7
        L32:
            java.nio.ByteBuffer r7 = r6.buffer
            int r1 = r6.initialPos
            int r2 = r6.position
            double r2 = (double) r2
            r4 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r1 = r1 + r2
            r7.position(r1)
            return r0
    }

    public boolean readBool() {
            r2 = this;
            r0 = 1
            int r1 = r2.readBits(r0)
            if (r1 != r0) goto L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    public int remainingBits() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            int r0 = r0.limit()
            int r0 = r0 * 8
            int r1 = r2.position
            int r0 = r0 - r1
            return r0
    }
}
