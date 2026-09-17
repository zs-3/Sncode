package org.fortheloss.framework;

/* loaded from: classes2.dex */
public final class LittleEndianDataInputStream extends java.io.InputStream {
    private final java.io.InputStream in;
    private byte[] readBuffer;

    public LittleEndianDataInputStream(java.io.InputStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 8
            byte[] r0 = new byte[r0]
            r1.readBuffer = r0
            r1.in = r2
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            r0.close()
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.io.InputStream r0 = r1.in
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.io.InputStream
    public void mark(int r2) {
            r1 = this;
            java.io.InputStream r0 = r1.in
            r0.mark(r2)
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.in
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r2 = r0.read(r2)
            return r2
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    public final double readDouble() throws java.io.IOException {
            r2 = this;
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public final float readFloat() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readInt()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public final void readFully(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            if (r7 < 0) goto L1a
            r0 = 0
        L3:
            if (r0 >= r7) goto L19
            java.io.InputStream r1 = r4.in
            int r2 = r6 + r0
            int r3 = r7 - r0
            int r1 = r1.read(r5, r2, r3)
            if (r1 < 0) goto L13
            int r0 = r0 + r1
            goto L3
        L13:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L19:
            return
        L1a:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    public final int readInt() throws java.io.IOException {
            r5 = this;
            java.io.InputStream r0 = r5.in
            int r0 = r0.read()
            java.io.InputStream r1 = r5.in
            int r1 = r1.read()
            java.io.InputStream r2 = r5.in
            int r2 = r2.read()
            java.io.InputStream r3 = r5.in
            int r3 = r3.read()
            r4 = r3 | r2
            r4 = r4 | r1
            r4 = r4 | r0
            if (r4 < 0) goto L2a
            int r3 = r3 << 24
            int r2 = r2 << 16
            int r3 = r3 + r2
            int r1 = r1 << 8
            int r3 = r3 + r1
            int r0 = r0 << 0
            int r3 = r3 + r0
            return r3
        L2a:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public final long readLong() throws java.io.IOException {
            r8 = this;
            byte[] r0 = r8.readBuffer
            r1 = 0
            r2 = 8
            r8.readFully(r0, r1, r2)
            byte[] r0 = r8.readBuffer
            r3 = 7
            r3 = r0[r3]
            long r3 = (long) r3
            r5 = 56
            long r3 = r3 << r5
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 48
            long r5 = r5 << r7
            long r3 = r3 + r5
            r5 = 5
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 40
            long r5 = r5 << r7
            long r3 = r3 + r5
            r5 = 4
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 32
            long r5 = r5 << r7
            long r3 = r3 + r5
            r5 = 3
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 24
            long r5 = r5 << r7
            long r3 = r3 + r5
            r5 = 2
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            long r5 = (long) r5
            long r3 = r3 + r5
            r5 = 1
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r5 << 8
            long r5 = (long) r2
            long r3 = r3 + r5
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r1
            long r0 = (long) r0
            long r3 = r3 + r0
            return r3
    }

    public final short readShort() throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            int r0 = r0.read()
            java.io.InputStream r1 = r3.in
            int r1 = r1.read()
            r2 = r1 | r0
            if (r2 < 0) goto L17
            int r1 = r1 << 8
            int r0 = r0 << 0
            int r1 = r1 + r0
            short r0 = (short) r1
            return r0
        L17:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            r0.reset()
            return
    }

    @Override // java.io.InputStream
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            long r2 = r0.skip(r2)
            return r2
    }
}
