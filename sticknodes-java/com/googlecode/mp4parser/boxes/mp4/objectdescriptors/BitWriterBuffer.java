package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

/* loaded from: classes2.dex */
public class BitWriterBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private java.nio.ByteBuffer buffer;
    int initialPos;
    int position;

    static {
            return
    }

    public BitWriterBuffer(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.position = r0
            r1.buffer = r2
            int r2 = r2.position()
            r1.initialPos = r2
            return
    }

    public void writeBits(int r6, int r7) {
            r5 = this;
            int r0 = r5.position
            int r1 = r0 % 8
            int r1 = 8 - r1
            r2 = 1
            if (r7 > r1) goto L34
            java.nio.ByteBuffer r3 = r5.buffer
            int r4 = r5.initialPos
            int r0 = r0 / 8
            int r4 = r4 + r0
            byte r0 = r3.get(r4)
            if (r0 >= 0) goto L18
            int r0 = r0 + 256
        L18:
            int r1 = r1 - r7
            int r6 = r6 << r1
            int r0 = r0 + r6
            java.nio.ByteBuffer r6 = r5.buffer
            int r1 = r5.initialPos
            int r3 = r5.position
            int r3 = r3 / 8
            int r1 = r1 + r3
            r3 = 127(0x7f, float:1.78E-43)
            if (r0 <= r3) goto L2a
            int r0 = r0 + (-256)
        L2a:
            byte r0 = (byte) r0
            r6.put(r1, r0)
            int r6 = r5.position
            int r6 = r6 + r7
            r5.position = r6
            goto L41
        L34:
            int r7 = r7 - r1
            int r0 = r6 >> r7
            r5.writeBits(r0, r1)
            int r0 = r2 << r7
            int r0 = r0 - r2
            r6 = r6 & r0
            r5.writeBits(r6, r7)
        L41:
            java.nio.ByteBuffer r6 = r5.buffer
            int r7 = r5.initialPos
            int r0 = r5.position
            int r1 = r0 / 8
            int r7 = r7 + r1
            int r0 = r0 % 8
            if (r0 <= 0) goto L4f
            goto L50
        L4f:
            r2 = 0
        L50:
            int r7 = r7 + r2
            r6.position(r7)
            return
    }

    public void writeBool(boolean r2) {
            r1 = this;
            r0 = 1
            r1.writeBits(r2, r0)
            return
    }
}
