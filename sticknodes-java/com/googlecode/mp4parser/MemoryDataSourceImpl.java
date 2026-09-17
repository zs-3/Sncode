package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public class MemoryDataSourceImpl implements com.googlecode.mp4parser.DataSource {
    java.nio.ByteBuffer data;

    public MemoryDataSourceImpl(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    public MemoryDataSourceImpl(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r0.data = r1
            return
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.googlecode.mp4parser.DataSource
    public java.nio.ByteBuffer map(long r3, long r5) throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.data
            int r0 = r0.position()
            java.nio.ByteBuffer r1 = r2.data
            int r3 = com.googlecode.mp4parser.util.CastUtils.l2i(r3)
            r1.position(r3)
            java.nio.ByteBuffer r3 = r2.data
            java.nio.ByteBuffer r3 = r3.slice()
            int r4 = com.googlecode.mp4parser.util.CastUtils.l2i(r5)
            r3.limit(r4)
            java.nio.ByteBuffer r4 = r2.data
            r4.position(r0)
            return r3
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long position() throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.data
            int r0 = r0.position()
            long r0 = (long) r0
            return r0
    }

    @Override // com.googlecode.mp4parser.DataSource
    public void position(long r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r2)
            r0.position(r2)
            return
    }

    @Override // com.googlecode.mp4parser.DataSource
    public int read(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.data
            int r0 = r0.remaining()
            if (r0 != 0) goto L10
            int r0 = r4.remaining()
            if (r0 == 0) goto L10
            r4 = -1
            return r4
        L10:
            int r0 = r4.remaining()
            java.nio.ByteBuffer r1 = r3.data
            int r1 = r1.remaining()
            int r0 = java.lang.Math.min(r0, r1)
            boolean r1 = r4.hasArray()
            if (r1 == 0) goto L3e
            java.nio.ByteBuffer r1 = r3.data
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r2 = r3.data
            int r2 = r2.position()
            r4.put(r1, r2, r0)
            java.nio.ByteBuffer r4 = r3.data
            int r1 = r4.position()
            int r1 = r1 + r0
            r4.position(r1)
            goto L48
        L3e:
            byte[] r1 = new byte[r0]
            java.nio.ByteBuffer r2 = r3.data
            r2.get(r1)
            r4.put(r1)
        L48:
            return r0
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long size() throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.data
            int r0 = r0.capacity()
            long r0 = (long) r0
            return r0
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long transferTo(long r2, long r4, java.nio.channels.WritableByteChannel r6) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r2)
            java.nio.Buffer r2 = r0.position(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            java.nio.ByteBuffer r2 = r2.slice()
            int r3 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            java.nio.Buffer r2 = r2.limit(r3)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r6.write(r2)
            long r2 = (long) r2
            return r2
    }
}
