package org.jcodec.common.io;

/* loaded from: classes2.dex */
public class NIOUtils {
    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.close()     // Catch: java.io.IOException -> L6
        L6:
            return
    }

    public static java.nio.ByteBuffer duplicate(java.nio.ByteBuffer r1) {
            int r0 = r1.remaining()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r1 = r1.duplicate()
            r0.put(r1)
            java.nio.Buffer r1 = r0.flip()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            return r0
    }

    public static final java.nio.ByteBuffer read(java.nio.ByteBuffer r2, int r3) {
            java.nio.ByteBuffer r0 = r2.duplicate()
            int r1 = r2.position()
            int r1 = r1 + r3
            java.nio.Buffer r3 = r0.limit(r1)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            java.nio.Buffer r2 = r2.position(r1)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            return r0
    }

    public static java.lang.String readNullTermString(java.nio.ByteBuffer r1) {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = readNullTermStringCharset(r1, r0)
            return r1
    }

    public static java.lang.String readNullTermStringCharset(java.nio.ByteBuffer r2, java.nio.charset.Charset r3) {
            java.nio.ByteBuffer r0 = r2.duplicate()
        L4:
            boolean r1 = r2.hasRemaining()
            if (r1 == 0) goto L11
            byte r1 = r2.get()
            if (r1 == 0) goto L11
            goto L4
        L11:
            boolean r1 = r2.hasRemaining()
            if (r1 == 0) goto L23
            int r2 = r2.position()
            int r2 = r2 + (-1)
            java.nio.Buffer r2 = r0.limit(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
        L23:
            byte[] r2 = toArray(r0)
            java.lang.String r2 = org.jcodec.platform.Platform.stringFromCharset(r2, r3)
            return r2
    }

    public static java.lang.String readPascalString(java.nio.ByteBuffer r1) {
            byte r0 = r1.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = readString(r1, r0)
            return r1
    }

    public static java.lang.String readPascalStringL(java.nio.ByteBuffer r2, int r3) {
            int r0 = r3 + 1
            java.nio.ByteBuffer r2 = read(r2, r0)
            java.lang.String r0 = new java.lang.String
            byte r1 = r2.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = java.lang.Math.min(r1, r3)
            java.nio.ByteBuffer r2 = read(r2, r3)
            byte[] r2 = toArray(r2)
            r0.<init>(r2)
            return r0
    }

    public static java.lang.String readString(java.nio.ByteBuffer r1, int r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.ByteBuffer r1 = read(r1, r2)
            byte[] r1 = toArray(r1)
            r0.<init>(r1)
            return r0
    }

    public static int skip(java.nio.ByteBuffer r1, int r2) {
            int r0 = r1.remaining()
            int r2 = java.lang.Math.min(r0, r2)
            int r0 = r1.position()
            int r0 = r0 + r2
            java.nio.Buffer r1 = r1.position(r0)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            return r2
    }

    public static byte[] toArray(java.nio.ByteBuffer r1) {
            int r0 = r1.remaining()
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = r1.duplicate()
            r1.get(r0)
            return r0
    }

    public static byte[] toArrayL(java.nio.ByteBuffer r1, int r2) {
            int r0 = r1.remaining()
            int r2 = java.lang.Math.min(r0, r2)
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r1 = r1.duplicate()
            r1.get(r2)
            return r2
    }

    public static org.jcodec.common.io.FileChannelWrapper writableChannel(java.io.File r2) throws java.io.FileNotFoundException {
            org.jcodec.common.io.FileChannelWrapper r0 = new org.jcodec.common.io.FileChannelWrapper
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            java.nio.channels.FileChannel r2 = r1.getChannel()
            r0.<init>(r2)
            return r0
    }

    public static void write(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4) {
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L23
            byte[] r0 = r4.array()
            int r1 = r4.arrayOffset()
            int r2 = r4.position()
            int r1 = r1 + r2
            int r2 = r3.remaining()
            int r4 = r4.remaining()
            int r4 = java.lang.Math.min(r2, r4)
            r3.put(r0, r1, r4)
            goto L2e
        L23:
            int r0 = r3.remaining()
            byte[] r4 = toArrayL(r4, r0)
            r3.put(r4)
        L2e:
            return
    }

    public static void writeLong(java.nio.channels.WritableByteChannel r1, long r2) throws java.io.IOException {
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r2 = r0.putLong(r2)
            java.nio.Buffer r2 = r2.flip()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.write(r2)
            return
    }

    public static void writePascalString(java.nio.ByteBuffer r1, java.lang.String r2) {
            int r0 = r2.length()
            byte r0 = (byte) r0
            r1.put(r0)
            byte[] r2 = org.jcodec.common.JCodecUtil.asciiString(r2)
            r1.put(r2)
            return
    }

    public static void writePascalStringL(java.nio.ByteBuffer r1, java.lang.String r2, int r3) {
            int r0 = r2.length()
            byte r0 = (byte) r0
            r1.put(r0)
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r2)
            r1.put(r0)
            int r2 = r2.length()
            int r3 = r3 - r2
            skip(r1, r3)
            return
    }
}
