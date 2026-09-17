package com.coremedia.iso;

/* loaded from: classes.dex */
public final class IsoTypeReader {
    public IsoTypeReader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int byte2int(byte r0) {
            if (r0 >= 0) goto L4
            int r0 = r0 + 256
        L4:
            return r0
    }

    public static java.lang.String read4cc(java.nio.ByteBuffer r2) {
            r0 = 4
            byte[] r0 = new byte[r0]
            r2.get(r0)
            java.lang.String r2 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Le
            java.lang.String r1 = "ISO-8859-1"
            r2.<init>(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> Le
            return r2
        Le:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    public static double readFixedPoint0230(java.nio.ByteBuffer r4) {
            r0 = 4
            byte[] r0 = new byte[r0]
            r4.get(r0)
            r4 = 0
            r1 = r0[r4]
            int r1 = r1 << 24
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r2
            r4 = r4 | r1
            r1 = 1
            r1 = r0[r1]
            int r1 = r1 << 16
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            r4 = r4 | r1
            r1 = 2
            r1 = r0[r1]
            int r1 = r1 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r4 = r4 | r1
            r1 = 3
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            double r0 = (double) r4
            r2 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            double r0 = r0 / r2
            return r0
    }

    public static double readFixedPoint1616(java.nio.ByteBuffer r4) {
            r0 = 4
            byte[] r0 = new byte[r0]
            r4.get(r0)
            r4 = 0
            r1 = r0[r4]
            int r1 = r1 << 24
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r2
            r4 = r4 | r1
            r1 = 1
            r1 = r0[r1]
            int r1 = r1 << 16
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            r4 = r4 | r1
            r1 = 2
            r1 = r0[r1]
            int r1 = r1 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r4 = r4 | r1
            r1 = 3
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            double r0 = (double) r4
            r2 = 4679240012837945344(0x40f0000000000000, double:65536.0)
            double r0 = r0 / r2
            return r0
    }

    public static float readFixedPoint88(java.nio.ByteBuffer r3) {
            r0 = 2
            byte[] r0 = new byte[r0]
            r3.get(r0)
            r3 = 0
            r1 = r0[r3]
            int r1 = r1 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r3 = r3 | r1
            short r3 = (short) r3
            r1 = 1
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = r3 | r0
            short r3 = (short) r3
            float r3 = (float) r3
            r0 = 1132462080(0x43800000, float:256.0)
            float r3 = r3 / r0
            return r3
    }

    public static java.lang.String readIso639(java.nio.ByteBuffer r3) {
            int r3 = readUInt16(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        La:
            r2 = 3
            if (r1 < r2) goto L12
            java.lang.String r3 = r0.toString()
            return r3
        L12:
            int r2 = 2 - r1
            int r2 = r2 * 5
            int r2 = r3 >> r2
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r0.append(r2)
            int r1 = r1 + 1
            goto La
    }

    public static java.lang.String readString(java.nio.ByteBuffer r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
        L5:
            byte r1 = r2.get()
            if (r1 != 0) goto L14
            byte[] r2 = r0.toByteArray()
            java.lang.String r2 = com.coremedia.iso.Utf8.convert(r2)
            return r2
        L14:
            r0.write(r1)
            goto L5
    }

    public static java.lang.String readString(java.nio.ByteBuffer r0, int r1) {
            byte[] r1 = new byte[r1]
            r0.get(r1)
            java.lang.String r0 = com.coremedia.iso.Utf8.convert(r1)
            return r0
    }

    public static int readUInt16(java.nio.ByteBuffer r1) {
            byte r0 = r1.get()
            int r0 = byte2int(r0)
            int r0 = r0 << 8
            int r0 = r0 + 0
            byte r1 = r1.get()
            int r1 = byte2int(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int readUInt16BE(java.nio.ByteBuffer r1) {
            byte r0 = r1.get()
            int r0 = byte2int(r0)
            int r0 = r0 + 0
            byte r1 = r1.get()
            int r1 = byte2int(r1)
            int r1 = r1 << 8
            int r0 = r0 + r1
            return r0
    }

    public static int readUInt24(java.nio.ByteBuffer r1) {
            int r0 = readUInt16(r1)
            int r0 = r0 << 8
            int r0 = r0 + 0
            byte r1 = r1.get()
            int r1 = byte2int(r1)
            int r0 = r0 + r1
            return r0
    }

    public static long readUInt32(java.nio.ByteBuffer r4) {
            int r4 = r4.getInt()
            long r0 = (long) r4
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L11
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 + r2
        L11:
            return r0
    }

    public static long readUInt32BE(java.nio.ByteBuffer r8) {
            int r0 = readUInt8(r8)
            long r0 = (long) r0
            int r2 = readUInt8(r8)
            long r2 = (long) r2
            int r4 = readUInt8(r8)
            long r4 = (long) r4
            int r8 = readUInt8(r8)
            long r6 = (long) r8
            r8 = 24
            long r6 = r6 << r8
            r8 = 16
            long r4 = r4 << r8
            long r6 = r6 + r4
            r8 = 8
            long r2 = r2 << r8
            long r6 = r6 + r2
            r8 = 0
            long r0 = r0 << r8
            long r6 = r6 + r0
            return r6
    }

    public static long readUInt48(java.nio.ByteBuffer r5) {
            int r0 = readUInt16(r5)
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L14
            long r2 = readUInt32(r5)
            long r0 = r0 + r2
            return r0
        L14:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt"
            r5.<init>(r0)
            throw r5
    }

    public static long readUInt64(java.nio.ByteBuffer r5) {
            long r0 = readUInt32(r5)
            r2 = 32
            long r0 = r0 << r2
            r2 = 0
            long r0 = r0 + r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L14
            long r2 = readUInt32(r5)
            long r0 = r0 + r2
            return r0
        L14:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt"
            r5.<init>(r0)
            throw r5
    }

    public static int readUInt8(java.nio.ByteBuffer r0) {
            byte r0 = r0.get()
            int r0 = byte2int(r0)
            return r0
    }
}
