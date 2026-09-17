package org.fortheloss.sticknodes.gifencoder;

/* loaded from: classes2.dex */
final class SubblockOutputStream extends java.io.OutputStream {
    private byte[] buffer;
    private int bufferLen;
    private java.io.OutputStream output;

    public SubblockOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.output = r1
            r1 = 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r1]
            r0.buffer = r1
            r1 = 0
            r0.bufferLen = r1
            return
    }

    public void detach() throws java.io.IOException {
            r2 = this;
            r2.flush()
            java.io.OutputStream r0 = r2.output
            r1 = 0
            r0.write(r1)
            r0 = 0
            r2.output = r0
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r4 = this;
            int r0 = r4.bufferLen
            if (r0 <= 0) goto L1a
            java.io.OutputStream r1 = r4.output
            r1.write(r0)
            java.io.OutputStream r0 = r4.output
            byte[] r1 = r4.buffer
            int r2 = r4.bufferLen
            r3 = 0
            r0.write(r1, r3, r2)
            java.io.OutputStream r0 = r4.output
            r0.flush()
            r4.bufferLen = r3
        L1a:
            return
    }

    @Override // java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.bufferLen
            byte[] r1 = r2.buffer
            int r1 = r1.length
            if (r0 != r1) goto La
            r2.flush()
        La:
            byte[] r0 = r2.buffer
            int r1 = r2.bufferLen
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r1 + 1
            r2.bufferLen = r1
            return
    }
}
