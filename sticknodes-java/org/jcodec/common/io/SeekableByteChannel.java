package org.jcodec.common.io;

/* loaded from: classes2.dex */
public interface SeekableByteChannel extends java.nio.channels.ByteChannel, java.nio.channels.Channel, java.io.Closeable, java.nio.channels.ReadableByteChannel, java.nio.channels.WritableByteChannel {
    long position() throws java.io.IOException;

    org.jcodec.common.io.SeekableByteChannel setPosition(long r1) throws java.io.IOException;
}
