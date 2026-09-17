package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public class DirectFileReadDataSource implements com.googlecode.mp4parser.DataSource {
    private static final int TRANSFER_SIZE = 8192;
    private java.lang.String filename;
    private java.io.RandomAccessFile raf;

    public DirectFileReadDataSource(java.io.File r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r2.raf = r0
            java.lang.String r3 = r3.getName()
            r2.filename = r3
            return
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.raf
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.DataSource
    public java.nio.ByteBuffer map(long r2, long r4) throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.raf
            r0.seek(r2)
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            byte[] r2 = new byte[r2]
            java.io.RandomAccessFile r3 = r1.raf
            r3.readFully(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            return r2
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long position() throws java.io.IOException {
            r2 = this;
            java.io.RandomAccessFile r0 = r2.raf
            long r0 = r0.getFilePointer()
            return r0
    }

    @Override // com.googlecode.mp4parser.DataSource
    public void position(long r2) throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.raf
            r0.seek(r2)
            return
    }

    @Override // com.googlecode.mp4parser.DataSource
    public int read(java.nio.ByteBuffer r8) throws java.io.IOException {
            r7 = this;
            int r0 = r8.remaining()
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 0
            r5 = 0
        Lb:
            if (r4 < r0) goto Le
            goto L1c
        Le:
            int r5 = r0 - r4
            int r5 = java.lang.Math.min(r5, r1)
            java.io.RandomAccessFile r6 = r7.raf
            int r5 = r6.read(r2, r3, r5)
            if (r5 >= 0) goto L22
        L1c:
            if (r5 >= 0) goto L21
            if (r4 != 0) goto L21
            r4 = -1
        L21:
            return r4
        L22:
            int r4 = r4 + r5
            r8.put(r2, r3, r5)
            goto Lb
    }

    public int readAllInOnce(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            int r0 = r4.remaining()
            byte[] r0 = new byte[r0]
            java.io.RandomAccessFile r1 = r3.raf
            int r1 = r1.read(r0)
            r2 = 0
            r4.put(r0, r2, r1)
            return r1
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long size() throws java.io.IOException {
            r2 = this;
            java.io.RandomAccessFile r0 = r2.raf
            long r0 = r0.length()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.filename
            return r0
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long transferTo(long r1, long r3, java.nio.channels.WritableByteChannel r5) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.map(r1, r3)
            int r1 = r5.write(r1)
            long r1 = (long) r1
            return r1
    }
}
