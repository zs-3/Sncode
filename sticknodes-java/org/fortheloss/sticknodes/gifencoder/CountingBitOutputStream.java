package org.fortheloss.sticknodes.gifencoder;

/* compiled from: BitOutputStream.java */
/* loaded from: classes2.dex */
final class CountingBitOutputStream extends org.fortheloss.sticknodes.gifencoder.BitOutputStream {
    public long length;

    public CountingBitOutputStream() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.length = r0
            return
    }

    @Override // org.fortheloss.sticknodes.gifencoder.BitOutputStream
    public void writeBits(int r3, int r4) {
            r2 = this;
            long r0 = r2.length
            long r3 = (long) r4
            long r0 = r0 + r3
            r2.length = r0
            return
    }
}
