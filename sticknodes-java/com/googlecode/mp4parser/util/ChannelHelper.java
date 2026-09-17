package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class ChannelHelper {
    private static java.nio.ByteBuffer empty;

    static {
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            com.googlecode.mp4parser.util.ChannelHelper.empty = r0
            return
    }

    public ChannelHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int readFully(java.nio.channels.ReadableByteChannel r3, java.nio.ByteBuffer r4, int r5) throws java.io.IOException {
            r0 = 0
        L1:
            int r1 = r3.read(r4)
            r2 = -1
            if (r2 != r1) goto L9
            goto Lc
        L9:
            int r0 = r0 + r1
            if (r0 != r5) goto L1
        Lc:
            if (r1 == r2) goto Lf
            return r0
        Lf:
            java.io.EOFException r3 = new java.io.EOFException
            java.lang.String r4 = "End of file. No more boxes."
            r3.<init>(r4)
            throw r3
    }

    public static void readFully(java.nio.channels.ReadableByteChannel r1, java.nio.ByteBuffer r2) throws java.io.IOException {
            int r0 = r2.remaining()
            readFully(r1, r2, r0)
            return
    }
}
