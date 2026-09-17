package org.fortheloss.sticknodes.gifencoder;

/* compiled from: BitOutputStream.java */
/* loaded from: classes2.dex */
final class ByteBitOutputStream extends org.fortheloss.sticknodes.gifencoder.BitOutputStream {
    private int bitBuffer;
    private int bitBufferLen;
    private java.io.OutputStream output;

    public ByteBitOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.output = r1
            r1 = 0
            r0.bitBuffer = r1
            r0.bitBufferLen = r1
            return
    }

    public void detach() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.output
            if (r0 == 0) goto L11
            int r1 = r2.bitBufferLen
            if (r1 <= 0) goto Ld
            int r1 = r2.bitBuffer
            r0.write(r1)
        Ld:
            r0 = 0
            r2.output = r0
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // org.fortheloss.sticknodes.gifencoder.BitOutputStream
    public void writeBits(int r3, int r4) throws java.io.IOException {
            r2 = this;
            if (r4 < 0) goto L2e
            r0 = 24
            if (r4 > r0) goto L2e
            int r0 = r3 >>> r4
            if (r0 != 0) goto L2e
            int r0 = r2.bitBuffer
            int r1 = r2.bitBufferLen
            int r3 = r3 << r1
            r3 = r3 | r0
            r2.bitBuffer = r3
            int r1 = r1 + r4
            r2.bitBufferLen = r1
        L15:
            int r3 = r2.bitBufferLen
            r4 = 8
            if (r3 < r4) goto L2d
            java.io.OutputStream r3 = r2.output
            int r0 = r2.bitBuffer
            r3.write(r0)
            int r3 = r2.bitBuffer
            int r3 = r3 >>> r4
            r2.bitBuffer = r3
            int r3 = r2.bitBufferLen
            int r3 = r3 - r4
            r2.bitBufferLen = r3
            goto L15
        L2d:
            return
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }
}
