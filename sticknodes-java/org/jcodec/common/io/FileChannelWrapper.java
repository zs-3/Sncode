package org.jcodec.common.io;

/* loaded from: classes2.dex */
public class FileChannelWrapper implements org.jcodec.common.io.SeekableByteChannel {
    private java.nio.channels.FileChannel ch;

    public FileChannelWrapper(java.nio.channels.FileChannel r1) throws java.io.FileNotFoundException {
            r0 = this;
            r0.<init>()
            r0.ch = r1
            return
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.ch
            r0.close()
            return
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.ch
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // org.jcodec.common.io.SeekableByteChannel
    public long position() throws java.io.IOException {
            r2 = this;
            java.nio.channels.FileChannel r0 = r2.ch
            long r0 = r0.position()
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.ch
            int r2 = r0.read(r2)
            return r2
    }

    @Override // org.jcodec.common.io.SeekableByteChannel
    public org.jcodec.common.io.SeekableByteChannel setPosition(long r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.ch
            r0.position(r2)
            return r1
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.ch
            int r2 = r0.write(r2)
            return r2
    }
}
