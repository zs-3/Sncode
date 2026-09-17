package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class ByteBufferByteChannel implements java.nio.channels.ByteChannel {
    java.nio.ByteBuffer byteBuffer;

    public ByteBufferByteChannel(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            r0.byteBuffer = r1
            return
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r5) throws java.io.IOException {
            r4 = this;
            int r0 = r5.remaining()
            java.nio.ByteBuffer r1 = r4.byteBuffer
            int r1 = r1.remaining()
            if (r1 > 0) goto Le
            r5 = -1
            return r5
        Le:
            java.nio.ByteBuffer r1 = r4.byteBuffer
            java.nio.ByteBuffer r1 = r1.duplicate()
            java.nio.ByteBuffer r2 = r4.byteBuffer
            int r2 = r2.position()
            int r3 = r5.remaining()
            int r2 = r2 + r3
            java.nio.Buffer r1 = r1.limit(r2)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r5.put(r1)
            java.nio.ByteBuffer r5 = r4.byteBuffer
            int r1 = r5.position()
            int r1 = r1 + r0
            r5.position(r1)
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.remaining()
            java.nio.ByteBuffer r1 = r2.byteBuffer
            r1.put(r3)
            return r0
    }
}
