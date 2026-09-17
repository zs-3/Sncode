package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public interface Sample {
    java.nio.ByteBuffer asByteBuffer();

    long getSize();

    void writeTo(java.nio.channels.WritableByteChannel r1) throws java.io.IOException;
}
