package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public interface DataSource extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws java.io.IOException;

    java.nio.ByteBuffer map(long r1, long r3) throws java.io.IOException;

    long position() throws java.io.IOException;

    void position(long r1) throws java.io.IOException;

    int read(java.nio.ByteBuffer r1) throws java.io.IOException;

    long size() throws java.io.IOException;

    long transferTo(long r1, long r3, java.nio.channels.WritableByteChannel r5) throws java.io.IOException;
}
