package com.mp4parser.streaming;

/* loaded from: classes2.dex */
public interface StreamingMp4Writer extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws java.io.IOException;

    void write() throws java.io.IOException;
}
